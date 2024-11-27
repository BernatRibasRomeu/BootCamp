package test.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public List<CustomerEntities> findAllCustomers (){
		return customerRepository.findAll();
	}
	
	public Optional<CustomerEntities> getCustomerById (Long id){
		return customerRepository.findById(id);
	}
	
	public CustomerEntities createCustomer(CustomerEntities customer) {
        return customerRepository.save(customer);
    }
	
	public CustomerEntities updateCustomer(Long id, CustomerEntities updatedCustomer) {
        return customerRepository.findById(id)
                .map(customer -> {
                    customer.setName(updatedCustomer.getName());
                    customer.setSurname(updatedCustomer.getSurname());
                    customer.setBirtdate(updatedCustomer.getBirtdate());
                    customer.setPhone(updatedCustomer.getPhone());
                    customer.setCountry(updatedCustomer.getCountry());
                    customer.setCity(updatedCustomer.getCity());
                    customer.setDirection(updatedCustomer.getDirection());
                    customer.setPostcode(updatedCustomer.getPostcode());
                    return customerRepository.save(customer);
                })
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));
    }

	    public void deleteCustomer(Long id) {
	        customerRepository.deleteById(id);
	    }
}
