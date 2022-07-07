package com.spring.multithreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	Logger logger=LoggerFactory.getLogger(UserService.class);
	
	@Async
	public CompletableFuture<List<User>> saveUsers(MultipartFile file) throws Exception{
		
		List<User> users=parseCSVFile(file);
		
		logger.info("Saving list of users by "+Thread.currentThread().getName());
		
		users=repository.saveAll(users);
		
		return CompletableFuture.completedFuture(users);
				
	}
	
	@Async
	public CompletableFuture<List<User>> findAllUsers(){
		
		logger.info("Getting list of users by "+Thread.currentThread().getName());
		
		List<User> users=repository.findAll();
		return CompletableFuture.completedFuture(users);
	}
	
	//utility method
	 private List<User> parseCSVFile(final MultipartFile file) throws Exception {
	        final List<User> users = new ArrayList<>();
	        try {
	            try (final BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
	                String line;
	                while ((line = br.readLine()) != null) {
	                    final String[] data = line.split(",");
	                    final User user = new User();
	                    user.setName(data[0]);
	                    user.setEmail(data[1]);
	                    user.setGender(data[2]);
	                    users.add(user);
	                }
	                return users;
	            }
	        } catch (final IOException e) {
	            throw new Exception("Failed to parse CSV file {}", e);
	        }
	 
	   }

}
