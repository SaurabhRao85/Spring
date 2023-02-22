package com.axis.config;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.axis.dto.TrainDto;

@FeignClient(name = "trainclient" ,url="http://localhost:8098/api/v1")
public interface TrainFeignClient {

	@GetMapping("/trains")
	List<TrainDto> getAllTrains();
	
	@GetMapping("/train/{id}")
	TrainDto getTrainById(@PathVariable int id);
}
