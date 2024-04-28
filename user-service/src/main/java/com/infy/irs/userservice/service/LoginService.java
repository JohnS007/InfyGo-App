/**
 * 
 */
package com.infy.irs.userservice.service;

import com.infy.irs.userservice.dto.LoginDetails;
import com.infy.irs.userservice.entity.Customer;
import com.infy.irs.userservice.exception.ExceptionConstants;
import com.infy.irs.userservice.exception.InfyGoServiceException;
import com.infy.irs.userservice.repository.CustomerRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class AadharService.
 */
@Service
public class LoginService {

	@Autowired
	private CustomerRepository customerRepository;

	public boolean isUserValid(@Valid LoginDetails customerLogin) throws InfyGoServiceException {

		Customer customer = customerRepository.findById(customerLogin.getUserId()).get();

		if (customer == null) {
			throw new InfyGoServiceException(ExceptionConstants.USER_NOT_FOUND.toString(), "User record not found");
		} else if (!(customer.getPassword().equals(customerLogin.getPassword()))) {
			throw new InfyGoServiceException(ExceptionConstants.USER_INVALID.toString(), "Invalid credentials");
		}
		return true;

	}

}
