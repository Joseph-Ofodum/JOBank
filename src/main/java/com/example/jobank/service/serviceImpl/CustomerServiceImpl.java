package com.example.jobank.service.serviceImpl;

import com.example.jobank.repositories.CustomerRepository;
import com.example.jobank.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

}
