package com.example.demo.LaptopServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.LaptopRepository.LaptopRepository;
import com.example.demo.LaptopService.LaptopService;
import com.example.demo.entity.Laptop;

@Service
public class LaptopServiceImpl implements LaptopService{
	
	
	@Autowired
	LaptopRepository laptopRepository;

	public List<Laptop> getLaptops() {
		
		return laptopRepository.findAll();
	}

	public String updateLaptop(Integer id, Laptop laptop) {
		
		
		Optional<Laptop> existinglaptop = laptopRepository.findById(id);
		
		if(existinglaptop.isPresent())
		{
			Laptop lap = existinglaptop.get();
			lap.setName(laptop.getName());
			laptopRepository.save(lap);
			return "update success";
		}
		else
		{
			return "record not found";
		}
		
	}

	
	
	

}
