package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.LaptopServiceImpl.LaptopServiceImpl;
import com.example.demo.entity.Laptop;

@Controller
public class LaptopController {
	
	
	@Autowired
	LaptopServiceImpl laptopServiceImpl;
	
	
	@GetMapping(value="/laptops")
	public String getLaptops(Model model)
	{
		model.addAttribute("laptops", laptopServiceImpl.getLaptops());
		return "viewlaptops";
	}
	
	@PutMapping(value="/put/{id}")
	public String updateLaptop(@PathVariable Integer id,@RequestBody Laptop laptop)
	{
		return laptopServiceImpl.updateLaptop(id,laptop);
	}

}
