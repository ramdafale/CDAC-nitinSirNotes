/**
 * 
 */
package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.CustomerRepository;
import com.example.model.Customer;

/**
 * @author trainee
 *
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

	
	
	
	@Autowired
	private CustomerRepository repository;
	
	
	 @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
	   	 ;
	   	 return new ResponseEntity<Customer>(repository.save(customer), HttpStatus.OK);
	    }

	    @RequestMapping(value = "/{id}") 
	    public Optional<Customer> read(@PathVariable String id) {
	        return repository.findById(id);
	    }

	    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void update(@RequestBody Customer user) {
	    	repository.save(user);
	    }

	    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	    public void delete(@PathVariable String id) {
	    	repository.deleteById(id); 
	    }
	
	
	
}
