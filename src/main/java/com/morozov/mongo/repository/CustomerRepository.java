package com.morozov.mongo.repository;

import com.morozov.mongo.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


/**
 * Created by Morozov on 6/8/2017.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);
}

