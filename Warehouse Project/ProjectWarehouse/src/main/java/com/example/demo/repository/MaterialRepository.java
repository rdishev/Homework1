package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Material;
import com.example.demo.entity.Warehouse;

@Repository
public interface MaterialRepository extends CrudRepository<Material, Long> {

	List<Material> findByType(String type);
	List<Material> findByWarehouse(Warehouse warehouse);
}
