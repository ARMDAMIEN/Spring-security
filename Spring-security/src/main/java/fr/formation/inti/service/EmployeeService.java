package fr.formation.inti.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.formation.inti.dao.IEmployeeDao;
import fr.formation.inti.entity.Employee;

// @Component("empServ")
@Service("empServ")
@Transactional
public class EmployeeService implements IEmployeeService {
	private final Log log = LogFactory.getLog(EmployeeService.class);
	private String message;

	@Autowired
	@Qualifier("employeeDao") // si plusieurs implementation de l'interface
	private IEmployeeDao dao;

	public EmployeeService() {
		log.info("-----------> create new EmployeeService()");
	}
	

	public EmployeeService(IEmployeeDao dao) {
		log.info("-----------> create new EmployeeService() (constructor)");
		this.dao=dao;
	}

	@Override
	public Integer save(Employee employee) {

		return dao.save(employee);
	}

	@Override
	public void update(Employee employee) {
		dao.update(employee);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public Employee findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public List<Employee> findAll() {
		
		List<Employee> list = dao.findAll();
		
		return list;

	}
	
//	public void setDao(IEmployeeDao dao) {   // nécessaire lorsqu'on passe par le fichier xml
//		log.info("------------> set Dao");	//sinon on peut le forcer à passer par la en 
//		this.dao = dao;						//mettant autowired au dessus de la fonction
//	}
	
	public void setMessage(String message) {
		log.info(message);
		this.message = message;
	}
	
	@PostConstruct
	private void postConstruct() { //nom de la methode pas importante
		log.info("-------------------- service init : @PostConstruct -------------------");
	}
	
	@PreDestroy
	private void preDestroy() { //nom de la methode pas importante
		log.info("-------------------- service destroy : @PreDestroy  --------------------");
		if (dao!=null) {
			log.info("-------------------service : close session factory---------------------- ");
			
		}
	}
	
	
	
	
	

}
