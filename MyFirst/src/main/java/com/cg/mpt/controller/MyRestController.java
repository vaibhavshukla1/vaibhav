/*package com.cg.mpt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Employee;

@RestController
public class MyRestController {
@RequestMapping(value="/hello",method=RequestMethod.GET)
public String displayHello()
{
	return "Hello";
}
@RequestMapping(value="/getEmployee",method=RequestMethod.GET,produces="application/json")
public Employee getEmployeeDetails()
{
	Employee emp= new Employee();
	emp.setFirstname("Himanshu");
	emp.setLastName("Mishra");
	emp.setEmail("himanshu@gmail.com");
	emp.setMobileNo("9598526348");
	return emp;	
}
@RequestMapping(value="/addEmployee",method=RequestMethod.POST)
public String addEmployee(@RequestParam("fname")String firstname,
		@RequestParam("lname")String lastname,@RequestParam("mobno")String mobno,
		@RequestParam("email")String email)
{
	Employee emp= new Employee();
	emp.setFirstname("fname");
	emp.setLastName("lname");
	emp.setEmail("email");
	emp.setMobileNo("mobno");
	return "Employee added successfully";	
}

}
*/