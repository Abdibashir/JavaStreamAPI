package com.stream.javastream.repository;

import com.stream.javastream.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Customer,Long> {
}
