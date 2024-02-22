package com.example.demo.LaptopRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer>{

}
