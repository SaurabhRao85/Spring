package com.axis.config;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.axis.dto.UserDto;

@FeignClient(name = "userclient" ,url="http://localhost:8096/api/v1")
public interface UserFeignClient {

	@GetMapping("/user")
	List<UserDto> getAllUser();
	
	@GetMapping("/user/{id}")
	UserDto getTrainById(@PathVariable int id);
}
