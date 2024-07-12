package com.ayna.krscitizen.controllerplusservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayna.krscitizen.entity.Citizen;
import com.ayna.krscitizen.repo.CitiRepo;

@RestController
@RequestMapping("/citizen")
@CrossOrigin("*")
public class CitiCtrlService {
	@Autowired
	private CitiRepo citiRepo;

	@PostMapping("/addcitizen")
	public Citizen saveOrder(@RequestBody Citizen citizen) {
		return citiRepo.save(citizen);
	}

	@GetMapping("/allcitizens")
	public List<Citizen> fetchAllOrder() {
		return citiRepo.findAll();
	}
}





