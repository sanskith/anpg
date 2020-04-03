package com.santosh.anpg.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santosh.anpg.bo.Manager;
import com.santosh.anpg.dto.Result;

@RestController
@RequestMapping("/phone")
public class Rest {

	@Autowired
	Manager manager;

	@GetMapping(value = "/{phoneNumber}")
	public Result getEmployees(@PathVariable("phoneNumber") String phoneNumber) {

		return manager.generate(phoneNumber);
	}

}
