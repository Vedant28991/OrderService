package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Order;


@Repository
public interface OrderRepo extends CrudRepository<Order, Integer>{

}
