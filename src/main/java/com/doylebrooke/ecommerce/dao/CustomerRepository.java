package com.doylebrooke.ecommerce.dao;

import com.doylebrooke.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
