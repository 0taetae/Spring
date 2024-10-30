package com.ssafy.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ssafy.ws.model.dto.Car;
import com.ssafy.ws.model.dto.User;
import com.ssafy.ws.model.service.CarService;
import com.ssafy.ws.model.service.UserService;

@RestController
@RequestMapping("/carapi")
@CrossOrigin("*")
public class CarRestController {
	@Autowired
	CarService cs;

	@Autowired
	UserService us;

	// GetMapping
	// select(READ)
	@GetMapping("/car/{vin}")
	public ResponseEntity<?> select(@PathVariable String vin) {
		try {
			Car car = cs.select(vin);
			if (car != null) {
				return new ResponseEntity<Car>(car, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			return exceptionHandling(e);
		}
		// return null; // 에러방지
	}

	@GetMapping("/car")
	public ResponseEntity<?> selectAll() {
		try {
			List<Car> cars = cs.selectAll();
			if (cars != null && cars.size() > 0) {
				return new ResponseEntity<List<Car>>(cars, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			return exceptionHandling(e);
		}

		// return null; // 에러방지
	}

	// PostMapping
	// insert(CREATE)
	@PostMapping("/car")
	public ResponseEntity<?> insert(Car car, @RequestPart(required = false) MultipartFile file) {
		try {
			int result = cs.insert(car, file);
			return new ResponseEntity<Integer>(result, HttpStatus.CREATED);
		} catch (Exception e) {
			return exceptionHandling(e);
		}
		// return null; // 에러방지
	}

	private ResponseEntity<String> exceptionHandling(Exception e) {
		e.printStackTrace();
		return new ResponseEntity<String>("sorry: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	// GetMapping
	// select(READ)
	@GetMapping("/user/{id}")
	public ResponseEntity<?> selectUser(@PathVariable String id) {
		try {
			User user = us.select(id);
			if (user != null) {
				return new ResponseEntity<User>(user,HttpStatus.OK);
			} else {
				return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			return exceptionHandling(e);
		}
		// return null; // 에러방지
	}
}
