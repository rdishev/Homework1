package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Warehouse;

@Repository
public interface WarehouseRepository extends CrudRepository<Warehouse, Long>{

	List<Warehouse> findByName(String name);
}
