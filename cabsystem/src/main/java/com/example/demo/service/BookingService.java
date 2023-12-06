package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookingData;
import com.example.demo.repository.BookingStore;

@Service
public class BookingService {
	
	@Autowired
	private BookingStore bookingService;
	
	public int bookService(BookingData bookInfo) {
		return bookingService.addBookingInfo(bookInfo);
	}

}
