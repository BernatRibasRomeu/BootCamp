package test.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@Log
@RestController
@RequestMapping(value = "/1.0.0")
public class CustomerController {
	
	@Autowired(required = false)
	CustomerService customerService;

	@RequestMapping(value = "/customers")
	public List<CustomerEntities> getCustomers() {
		log.info("Request a http://localhost:8080/1.0.0/customers (GET)");
		return customerService.findAllCustomers();
	}

	@GetMapping("/customers/{id}")
	public ResponseEntity<CustomerEntities> getCustomerById(@PathVariable Long id) {
		Optional<CustomerEntities> customer = customerService.getCustomerById(id);
		return customer.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/customers/add")
    public CustomerEntities createCustomer(@RequestBody CustomerEntities customer) {
        return customerService.createCustomer(customer);
    }
	
	 @PutMapping("/customers/update/{id}")
	    public ResponseEntity<CustomerEntities> updateCustomer(@PathVariable Long id, @RequestBody CustomerEntities customer) {
	        try {
	            CustomerEntities updatedCustomer = customerService.updateCustomer(id, customer);
	            return ResponseEntity.ok(updatedCustomer);
	        } catch (RuntimeException e) {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @DeleteMapping("/customers/delete/{id}")
	    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
	        customerService.deleteCustomer(id);
	        return ResponseEntity.noContent().build();
	    }
}