package com.example.demo.LaptopService;

import java.util.List;

import com.example.demo.entity.Laptop;

public interface LaptopService {
	
	public List<Laptop> getLaptops();
	public String updateLaptop(Integer id, Laptop laptop);

}
