package com.axis.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.dto.BookingDto;
import com.axis.entity.Booking;
import com.axis.exception.InValidPriceException;
import com.axis.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingRepository bookingRepository;
	
	@Override
	public BookingDto addNewBooking(BookingDto bookingDto) {
		
	
		
		return  convertToDto(bookingRepository.save(convertToEntity(bookingDto)));
	}

	@Override
	public List<BookingDto> getAllBooking() {
		return null;
	}

	
	private BookingDto convertToDto(Booking booking)
	{
		
		BookingDto bookingDto = new BookingDto();
		
		bookingDto.setId(booking.getId());
		bookingDto.setPrice(booking.getPrice());
		bookingDto.setDestination(booking.getDestination());
		bookingDto.setBookedDate(booking.getBookedDate());
		bookingDto.setSource(booking.getSource());
		bookingDto.setTrainName(booking.getTrainName());
		bookingDto.setJourneyDate(booking.getJourneyDate());
		
		
		return bookingDto;
	}
	
	private Booking convertToEntity(BookingDto bookingDto)
	{
		
		Booking booking = new Booking();
		    if(bookingDto.getPrice()<=0)
		    	throw new InValidPriceException("invalid price");
		booking.setPrice(bookingDto.getPrice());
		booking.setDestination(bookingDto.getDestination());
		booking.setBookedDate(bookingDto.getBookedDate());
		booking.setSource(bookingDto.getSource());
		booking.setTrainName(bookingDto.getTrainName());
		booking.setJourneyDate(bookingDto.getJourneyDate());
		
		
		return booking;
	}
	
	
}
