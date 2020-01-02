package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Goods;
import com.example.demo.entity.Warehouse;

public interface GoodsRepository extends CrudRepository<Goods, Long> {

	List<Goods> findByOrdercode(String ordercode);
	List<Goods> findByType(String type);
	List<Goods> findByOrdercodeAndType(String ordercode, String type);
	List<Goods> findByWarehouse(Warehouse warehouse);
}
