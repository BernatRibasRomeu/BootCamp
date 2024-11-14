package database;

import java.sql.*;
import java.util.Scanner;

public class mainCRUD {
    
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n--- Menú CRUD ---");
            System.out.println("1. Ver Usuarios");
            System.out.println("2. Agregar Usuario");
            System.out.println("3. Actualizar Usuario");
            System.out.println("4. Eliminar Usuario");
            System.out.println("5. Ingresa tu consulta SQL");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    verUsuarios();
                    break;
                case 2:
                    agregarUsuario(scanner);
                    break;
                case 3:
                    actualizarUsuario(scanner);
                    break;
                case 4:
                    eliminarUsuario(scanner);
                    break;
                case 5:
                    ejecutarConsultaPersonalizada(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
        
        scanner.close();
    }
    
    // Método para conectar a la base de datos
    public static Connection conectar() throws SQLException {
    	// Datos de conexión
        final String url = "jdbc:mysql://localhost:3306/db_test";
		final String user = "root";
		final String pass = "admin";
        return DriverManager.getConnection(url, user, pass);
    }
    
    // Método para ver usuarios
    public static void verUsuarios() {
        try (Connection conn = conectar()) {
            String sql = "SELECT * FROM Usuarios";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_usuarios") + ", Nombre: " + rs.getString("nombre") + ", Edad: " + rs.getInt("edad")  + ", Nacionalidad: " + rs.getString("nacionalidad"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Método para agregar usuario
    public static void agregarUsuario(Scanner scanner) {
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.next();
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese la nacionalidad: ");
        String nacionalidad = scanner.next();
        
        try (Connection conn = conectar()) {
            String sql = "INSERT INTO Usuarios (nombre, edad, nacionalidad) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nombre);
            pstmt.setInt(2, edad);
            pstmt.setString(3, nacionalidad);
            pstmt.executeUpdate();
            System.out.println("Usuario agregado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Método para actualizar usuario
    public static void actualizarUsuario(Scanner scanner) {
        System.out.print("Ingrese el ID del usuario a actualizar: ");
        int id = scanner.nextInt();
        System.out.print("Ingrese el nuevo nombre: ");
        String nombre = scanner.next();
        System.out.print("Ingrese la nueva edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese la nueva nacionalidad: ");
        String nacionalidad = scanner.next();
        
        try (Connection conn = conectar()) {
            String sql = "UPDATE usuarios SET nombre = ?, edad = ?, nacionalidad = ? WHERE id_usuarios = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nombre);
            pstmt.setInt(2, edad);
            pstmt.setString(3, nacionalidad);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
            System.out.println("Usuario actualizado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Método para eliminar usuario
    public static void eliminarUsuario(Scanner scanner) {
        System.out.print("Ingrese el ID del usuario a eliminar: ");
        int id = scanner.nextInt();
        
        try (Connection conn = conectar()) {
            String sql = "DELETE FROM usuarios WHERE id_usuarios = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Usuario eliminado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
 // Método para ejecutar una consulta SQL personalizada
    public static void ejecutarConsultaPersonalizada(Scanner scanner) {
        System.out.print("Ingrese la consulta SQL: ");
        scanner.nextLine(); // Limpiar el buffer
        String sql = scanner.nextLine(); // Leer la consulta completa

        try (Connection conn = conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            // Obtener y mostrar los nombres de las columnas
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();

            // Mostrar los resultados de la consulta
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
            
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

}
