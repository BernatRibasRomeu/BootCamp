package com.example.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class CRUDController {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// Create
	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody Map<String, Object> userData) {
		// Consulta SQL para insertar un nuevo usuario
		final String QUERY = "INSERT INTO users (nombre, apellidos, fechaNacimiento) VALUES (?, ?, ?)";

		try {
			// Extraemos los datos del cuerpo de la solicitud
			String name = userData.get("nombre").toString();
			String surname = userData.get("apellidos").toString();
			String birthDate = userData.get("fechaNacimiento").toString();

			// Ejecutamos la consulta usando jdbcTemplate
			jdbcTemplate.update(QUERY, name, surname, birthDate);

			// Retornamos una respuesta indicando éxito
			return ResponseEntity.status(HttpStatus.CREATED).body("Usuario creado con éxito");
		} catch (Exception e) {
			// Manejo de errores
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error al crear el usuario: " + e.getMessage());
		}
	}

	// Read all users
	@GetMapping
	public List<String> getAllUsers() {
		final String QUERY1 = "SELECT * FROM users;";

		List<Map<String, Object>> results = jdbcTemplate.queryForList(QUERY1);

		List<String> userList = new ArrayList<String>();

		for (Map<String, Object> row : results) {
			userList.add(row.toString());
		}

		return userList;
	}

	// Read user per id
	@GetMapping("/{id}")
	public List<String> getUsersPerID(@PathVariable int id) {
		final String QUERY1 = "SELECT * FROM users where id = ?;";

		List<Map<String, Object>> results = jdbcTemplate.queryForList(QUERY1, id);

		List<String> userList = new ArrayList<String>();

		for (Map<String, Object> row : results) {
			userList.add(row.toString());
		}

		return userList;
	}

	// Update
	@PatchMapping
	public ResponseEntity<String> updateUser(@RequestBody Map<String, Object> userData) {
		// Construir la base de la consulta SQL
		StringBuilder queryBuilder = new StringBuilder("UPDATE users SET ");
		List<Object> values = new ArrayList<>();

		try {
			// Iterar sobre los campos proporcionados en el cuerpo y construir la consulta
			// dinámicamente
			userData.forEach((key, value) -> {
				if (value != null) {
					queryBuilder.append(key).append(" = ?, ");
					values.add(value);
				}
			});

			// Verificar si hay campos a actualizar
			if (values.isEmpty()) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST)
						.body("No se proporcionaron campos para actualizar");
			}

			// Eliminar la última coma y espacio de la consulta
			queryBuilder.setLength(queryBuilder.length() - 2);

			// Agregar la condición WHERE para identificar el usuario (ejemplo: usando 'id')
			queryBuilder.append(" WHERE id = ?");
			values.add(userData.get("id"));

			// Ejecutar la consulta con los valores dinámicos
			jdbcTemplate.update(queryBuilder.toString(), values.toArray());

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Usuario modificado con éxito");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error al modificar el usuario: " + e.getMessage());
		}
	}

	// Delete
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable int id) {
		final String QUERY1 = "DELETE FROM users where id = ?;";

		try {
			jdbcTemplate.update(QUERY1, id);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Usuario eliminado con éxito.");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error al eliminar usuario: " + e.getMessage());
		}
	}
}