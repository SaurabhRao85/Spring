package com.axis.service;

import java.util.List;

import com.axis.dto.BookingDto;

public interface BookingService {

	BookingDto addNewBooking(BookingDto bookingDto);
	List<BookingDto> getAllBooking();

}
