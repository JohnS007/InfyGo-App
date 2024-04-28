/**
 * 
 */
package com.infy.irs.userservice.service;

import com.infy.irs.userservice.entity.Customer;
import com.infy.irs.userservice.exception.InfyGoServiceException;
import com.infy.irs.userservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class AadharService.
 */
@Service
public class RegistrationService {

	@Autowired
	private CustomerRepository customerRepository;

	public Boolean insertUser(Customer customer) throws InfyGoServiceException {

		Customer cust = customerRepository.saveAndFlush(customer);

		if (cust == null) {
			throw new InfyGoServiceException("User record not found");
		} else {
			return true;
		}

	}

}
