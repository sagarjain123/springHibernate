package com.sai.om.test;

import com.sai.om.dao.CarDAO;
import com.sai.om.dto.CarDTO;

public class Tester {
	
	public static void main(String[] nargs)
	{
		CarDTO dto=new CarDTO();
		dto.setCarid(1);
		dto.setCarname("jaguar");
		dto.setCarcost(90000.00);
		
		CarDTO dto1=new CarDTO();
		dto1.setCarid(1);
		dto1.setCarname("innova");
		dto1.setCarcost(65000.00);
		
		CarDAO dao=new CarDAO();
	//ss	dao.SaveCar(dto1);
		//dao.updateCar(dto1);
		CarDTO dto2=dao.getCar(dto1);
		System.out.println(dto2.getCarid());
		System.out.println(dto2.getCarname());
		System.out.println(dto2.getCarcost());
		System.out.println("data save");
	}

}
