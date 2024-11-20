package com.example.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersControllers {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<String> getAllUsers() {
		final String QUERY1 = "SELECT * FROM users;";

		List<Map<String, Object>> results = jdbcTemplate.queryForList(QUERY1);

		List<String> userList = new ArrayList<String>();

		for (Map<String, Object> row : results) {
			userList.add(row.toString());
		}

		return userList;
	}
}