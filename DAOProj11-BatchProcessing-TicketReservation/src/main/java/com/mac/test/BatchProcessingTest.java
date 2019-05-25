package com.mac.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.mac.config.AppConfig;
import com.mac.dto.PassengerDTO;
import com.mac.service.PassengerMgmtService;
import com.mac.service.PassengerMgmtServiceImpl;


public class BatchProcessingTest {
    public static void main( String[] args ) {
    	ApplicationContext ctx = null;
    	PassengerMgmtService service = null;
    	PassengerDTO dto = null;
    	List<PassengerDTO> listDTO = new ArrayList<PassengerDTO>();
    	String name=null;
    	String source = null;
    	String dest = null;
    	float price = 0.0f;
    	int count = 0;
    	Scanner sc = null;
    	//get input
    	sc = new Scanner(System.in);
    	System.out.println("Enter Source ::");
    	source = sc.next();
    	System.out.println("Enter Destination ::");
    	dest = sc.next();
    	System.out.println("Enter Passenger Count ::");
    	count = sc.nextInt();
    	System.out.println("Enter Total Price ::");
    	price = sc.nextFloat();
    	for(int i=1; i<=count; i++) {
    		System.out.println("Enter "+i+" Passenger Name :::");
    		name = sc.next();
    		dto = new PassengerDTO();
    		dto.setName(name);
    		dto.setSource(source);
    		dto.setDest(dest);
    		dto.setPrice(price);
    		listDTO.add(dto);
    	}
    	//create IOC container
    	ctx = new AnnotationConfigApplicationContext();
    	//get bean
    	service = ctx.getBean("pService", PassengerMgmtServiceImpl.class);
    	//invoke method
    	System.out.println(service.ticketBooking(listDTO));
    	//close ctx
    	sc.close();
    	((AbstractApplicationContext) ctx).close();
    }
}
