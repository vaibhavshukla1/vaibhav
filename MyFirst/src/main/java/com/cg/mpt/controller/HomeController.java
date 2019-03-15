package com.cg.mpt.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Customer;
import com.cg.service.ICustomerService;



@RestController
public class HomeController {
	@Autowired
	ICustomerService service;

	public ICustomerService getservice() {
		return service;
	}

	public void setService(ICustomerService service) {
		this.service = service;
	}
	
	@RequestMapping(value = "/addCustomer",consumes="application/json", produces="application/json",
			method = RequestMethod.POST)
	public Customer addCustomer(@RequestBody Customer customer)
	{
		customer=service.addCustomer(customer);
		return customer;
	}
	@RequestMapping(value = "/updateCustomer",consumes="application/json",
			produces="application/json",
			method = RequestMethod.POST)
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		customer=service.updateCustomer(customer);
		return customer;
	}
	@RequestMapping(value ="/removeCustomer/{custid}",produces="application/json")
		
	public Customer deleteCustomer(@PathVariable int custid)
	{
		Customer customer=service.removeCustomer(custid);
		return customer;
	}
	@RequestMapping(value ="/getCustomerList",produces="application/json")
	public List<Customer> getCustomerList(){
		List<Customer> list = service.getCustomerList();
		return list;
	}
	@RequestMapping(value ="/getCustomer/{custid}",produces="application/json")
	public Customer findCustomer(@PathVariable int custid) {
		Customer customer= service.findCustomer(custid);
		return customer;
	}
	
	
	/*@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public Customer addCustomer(@RequestParam("fname") String firstname, @RequestParam("lname") String lastname,
			@RequestParam("mobno") String mobno, @RequestParam("email") String email, @RequestParam("city") String city,
			@RequestParam("age") int age) {
		Customer customer = new Customer();
		customer.setFirstName(firstname);
		customer.setLastName(lastname);
		customer.setEmail(email);
		customer.setMobileNo(mobno);
		customer.setCity(city);
		customer.setAge(age);
		customer = service.addCustomer(customer);
		return customer;
	}
	@RequestMapping(value="/getCustomer/{custid}", produces="application/json")
	public Customer findCustomer(@PathVariable int custid) {
		Customer customer = service.findCustomer(custid);
		return customer;
	}
	

	@RequestMapping(value = "/showCustomer", method = RequestMethod.POST)
	public ArrayList<Customer> showCustomerList() {
		ArrayList<Customer> CustomerList = (ArrayList<Customer>) service.getCustomerList();
		return CustomerList;

	}*/
}
