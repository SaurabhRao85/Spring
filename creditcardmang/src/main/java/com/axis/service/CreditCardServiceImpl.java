package com.axis.service;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.axis.dto.CreditCardDto;
import com.axis.dto.UserDto;
import com.axis.exception.IdNotFoundException;
import com.axis.model.CreditCard;
import com.axis.model.User;
import com.axis.repository.CreditCardRepository;
import com.axis.repository.UserRepository;
import com.axis.utility.AppConstant;

@Service
public class CreditCardServiceImpl implements CreditCardService{
   
	@Autowired
	CreditCardRepository creditCardRepository;
	
	@Autowired
	UserRepository userRepository;
	
	
	
	public CreditCardServiceImpl(CreditCardRepository creditCardRepository, UserRepository userRepository) {
		super();
		this.creditCardRepository = creditCardRepository;
		this.userRepository = userRepository;
	}

	@Override
	public CreditCardDto addCreditCardDetails(CreditCardDto creditCardDto) {
		
		return convertToDto(creditCardRepository.save(convertToEntity(creditCardDto)));
	}

	@Override
	public List<CreditCardDto> getAllCreditCardDetails() {
		List<CreditCard> creditCards =(List<CreditCard>) creditCardRepository.findAll();
		List<CreditCardDto> creditCardDtos = new ArrayList<>();
		
		for(CreditCard creditCard : creditCards) {
			
			creditCardDtos.add(convertToDto(creditCard));
		}
		
		return creditCardDtos;
	}

	@Override
	public CreditCardDto getCreditCardDetailsByCreditCardId(long id) {
		CreditCard creditCard =  creditCardRepository.findById(id).
				 orElseThrow(() -> new IdNotFoundException(AppConstant.NOT_FOUND_MESSAGE +id));
		
		return convertToDto(creditCard);
	}

	@Override
	public CreditCardDto updateCreditCardDetailsByCreditCardID(long id, CreditCardDto creditCardDto) {
		CreditCard creditCard =  creditCardRepository.findById(id).
				orElseThrow(() -> new IdNotFoundException(AppConstant.NOT_FOUND_MESSAGE +"To Update With Id " +id));
		
		Set<User> users = new HashSet<>();
		
		creditCard.setCreditCardid(creditCardDto.getCreditCardid());
		creditCard.setCardNumber(creditCardDto.getCardNumber());
		creditCard.setHolderName(creditCardDto.getHolderName());
		creditCard.setCardType(creditCardDto.getCardType());
		creditCard.setCsv(creditCardDto.getCsv());
		creditCard.setConsumer(creditCardDto.getConsumer());
		creditCard.setDailyLimit(creditCardDto.getDailyLimit());
		creditCard.setExpireDate(creditCardDto.getExpireDate());
		creditCard.setStatus(creditCardDto.getStatus());
		

		Set<UserDto> userDtos = creditCardDto.getUserDto();
		

        for (UserDto userDto : userDtos) {

            User user = new User();
            user.setId(userDto.getId());
            user.setPassword(userDto.getPassword());
            user.setPhoneNumber(userDto.getPhoneNumber());
            user.setRole(userDto.getRole());
            user.setStatus(userDto.getStatus());
            user.setDate(userDto.getDate());
            user.setCreditCard(creditCard);
            users.add(user);
        }
        creditCard.setUsers(users);
        
		return convertToDto(creditCardRepository.save(creditCard));
	}

	@Override
	public void deleteCreditCardkDetailsByCreditCardId(long id) {
		CreditCard creditCard = creditCardRepository.findById(id).
				orElseThrow(() -> new IdNotFoundException(AppConstant.NOT_FOUND_MESSAGE +id));
		
		creditCardRepository.delete(creditCard);
		
	}
	
	
private CreditCardDto convertToDto(CreditCard creditCard) {
		
		CreditCardDto creditCardDto = new CreditCardDto();
		
		Set<UserDto> userDtos = new HashSet<>();
		
		creditCardDto.setCreditCardid(creditCard.getCreditCardid());
		creditCardDto.setCardNumber(creditCard.getCardNumber());
		creditCardDto.setHolderName(creditCard.getHolderName());
		creditCardDto.setCardType(creditCard.getCardType());
		creditCardDto.setCsv(creditCard.getCsv());
		creditCardDto.setConsumer(creditCard.getConsumer());
		creditCardDto.setDailyLimit(creditCard.getDailyLimit());
		creditCardDto.setExpireDate(creditCard.getExpireDate());
		creditCardDto.setStatus(creditCard.getStatus());
		
		Set<User> users = creditCard.getConsumer();
	
		
		for(User user : users) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setPassword(user.getPassword());
		userDto.setPhoneNumber(user.getPassword());
		userDto.setRole(user.getRole());
		userDto.setStatus(user.getStatus());
		userDto.setDate(user.getDate());
		
		userDtos.add(userDto);
		}
		
		creditCardDto.setUser(userDtos);
		
		 
		    
		   
		return creditCardDto;
	}
private CreditCard convertToEntity(CreditCardDto creditCardDto) {
	
	CreditCard creditCard = new CreditCard();
	Set<User> users = new HashSet<>();
	
	creditCard.setCreditCardid(creditCardDto.getCreditCardid());
	creditCard.setCardNumber(creditCardDto.getCardNumber());
	creditCard.setHolderName(creditCardDto.getHolderName());
	creditCard.setCardType(creditCardDto.getCardType());
	creditCard.setCsv(creditCardDto.getCsv());
	creditCard.setConsumer(creditCardDto.getConsumer());
	creditCard.setDailyLimit(creditCardDto.getDailyLimit());
	creditCard.setExpireDate(creditCardDto.getExpireDate());
	creditCard.setStatus(creditCardDto.getStatus());

	//Set<UserDto> userDtos = creditCardDto.getUserDto();
	Set<UserDto> userDtos = creditCardDto.getUserDto();
  
    for (UserDto userDto : userDtos) {

        User user = new User();
        user.setId(userDto.getId());
        user.setPassword(userDto.getPassword());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setRole(userDto.getRole());
        user.setStatus(userDto.getStatus());
        user.setDate(userDto.getDate());
        user.setCreditCard(creditCard);
        creditCard.add(creditCard);
    }
    creditCard.setCreditCard(creditCard);
	
	return creditCard;
}



	
	
	
	
	
	
	
	
	
}