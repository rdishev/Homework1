package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Fabric;
import com.example.demo.entity.Warehouse;

@Repository
public interface FabricRepository extends CrudRepository<Fabric, Long> {

	List<Fabric> findByBrand(String brand);
	List<Fabric> findByBrandAndColour(String brand, String colour);
	List<Fabric> findByWarehouse(Warehouse warehouse);
}
