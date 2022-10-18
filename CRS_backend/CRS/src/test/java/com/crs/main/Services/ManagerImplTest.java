package com.crs.main.Services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.Manager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import com.crs.main.model.Managers;
import com.crs.main.repository.ManagerRepository;





@SpringBootTest
class ManagerImplTest {
	@Autowired
	ApplicationContext context;
	
	@Test
	void contextLoads() {
	}

	
		
	
	@Test
	void saveManager() {
		ManagerRepository	 managerRepo = context.getBean(ManagerRepository.class);
		
		Managers manager = new Managers();
		
		manager.setManagerEmail("ashok@gmail.com");
		manager.setManagerPassword("reddy123");
		manager.setManagerName("Ashok");
		manager.setManagerPincode("516126");
		
			managerRepo.save(manager);
		
}
	@Test
	void findByName() {
		
		ManagerRepository	 managerRepo = context.getBean(ManagerRepository.class);
		List<Managers> manager = managerRepo.findBymanagerEmail("rohit@gmail.com");
		System.out.println(manager);
	}
	@Test
	void findManagers() {
		
		ManagerRepository	 managerRepo = context.getBean(ManagerRepository.class);
		List<Managers> manager = (List<Managers>) managerRepo.findAll();
		System.out.println(manager);
	}
	
	@Test
	void updateManager() {
		ManagerRepository managerRepo = context.getBean(ManagerRepository.class);
		Managers manager=null;
		Optional<Managers> optionalManager =managerRepo.findBymanagerName("Ashok");
		System.out.println(optionalManager);
		if (optionalManager.isPresent()) {
			 manager = optionalManager.get();
//			System.out.println(manager);
		}
		if(manager!=null) {
			manager.setManagerPincode("516516");
			managerRepo.save(manager);
		}
	}

	
		
	}
