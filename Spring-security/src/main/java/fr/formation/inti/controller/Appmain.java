package fr.formation.inti.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.inti.config.AppConfiguration;
import fr.formation.inti.entity.Employee;
import fr.formation.inti.service.EmployeeService;
import fr.formation.inti.service.IEmployeeService;

public class Appmain {

	private static final Log log = LogFactory.getLog(Appmain.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		IEmployeeService service = context.getBean("employeeService", EmployeeService.class);
//
//		List<Employee> employees = service.findAll();
//
//		for (Employee e : employees)
//			log.info("--------------------------" + e);
		
		context.close();

	}

}
