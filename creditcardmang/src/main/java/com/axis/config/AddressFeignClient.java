package com.axis.config;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.axis.dto.UserDto;

@FeignClient(name = "addressclient" ,url="http://localhost:8096/api/v1")
public interface AddressFeignClient {

	@GetMapping("/address")
	List<UserDto> getAllUser();
	
	@GetMapping("/address/{id}")
	UserDto getTrainById(@PathVariable int id);
}

