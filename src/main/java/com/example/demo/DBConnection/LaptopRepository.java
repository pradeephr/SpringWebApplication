package com.example.demo.DBConnection;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Laptops;

public interface LaptopRepository extends CrudRepository<Laptops,Long>{

}
