package com.pra;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import com.pra.entity.Employee;
import com.pra.repository.EmployeeRepository;

@SpringBootApplication
public class Application {
	private Map<String,Object> cache = new HashMap<String,Object>();

	public static void main(String[] args) {
		int a= 10;
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);

		System.out.println("Employee Repo Impl Class :: " + employeeRepository.getClass().getName());

		//List<Employee> findAll = employeeRepository.findAll();
		//findAll.forEach(System.out::println);
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.print("Enter Page Number: "); int pageNum = scan.nextInt();
		 * 
		 * int pageSize = 3;
		 * 
		 * PageRequest of = PageRequest.of(pageNum-1, pageSize); Page<Employee> findAll2
		 * = employeeRepository.findAll(of); List<Employee> EmpContent =
		 * findAll2.getContent(); EmpContent.forEach(System.out::println);
		 */
		
		/*
		 * List<Employee> findAll = employeeRepository.findAll(Sort.by("name"));
		 * findAll.forEach(System.out::println);
		 */
		
		Employee emp = new Employee();
		//emp.setGender("Male");
		//emp.setPhoneNum(5172021328l);
		
		Example<Employee> of = Example.of(emp);
		List<Employee> findAll = employeeRepository.findAll(of);
		findAll.forEach(System.out::println);
		
		
		// Save or Update employee And Save list of Employess
		/*
		 * List<Employee> employeeList = new ArrayList<Employee>(); Employee employee1 =
		 * new Employee(); employee1.setId(109); employee1.setName("Pram");
		 * employee1.setPhoneNum(5172022228L); employee1.setGender("Male");
		 * employeeList.add(employee1);
		 * 
		 * Employee employee2 = new Employee(); employee2.setId(110);
		 * employee2.setName("Boomi"); employee2.setPhoneNum(5172111676L);
		 * employee2.setGender("FeMale"); employeeList.add(employee2);
		 * 
		 * Employee employee3 = new Employee(); employee3.setId(111);
		 * employee3.setName("Deva"); employee3.setPhoneNum(5178887868L);
		 * employee3.setGender("Male"); employeeList.add(employee3);
		 */
		  
		  
		  
		  // employeeRepository.save(employee);
		  
		 // employeeRepository.saveAll(employeeList);
		 

		// FInd Employee by ID
		/*
		 * Optional<Employee> findById = employeeRepository.findById(102);
		 * 
		 * if(findById.isPresent()) { System.out.println(findById.get()); }
		 */

		// Find All employees
		/*
		 * List<Employee> findAll = employeeRepository.findAll();
		 * 
		 * findAll.forEach(System.out::println);
		 * 
		 * findAll.forEach(s -> System.out.println(s));
		 */

		// Delete Employee by ID
		/*
		 * if(employeeRepository.existsById(503)) { employeeRepository.deleteById(503);
		 * System.out.println("Employee 503 deleted...."); }else {
		 * System.out.println("Employee 503 not available to deleted...."); }
		 */

		// Get Number of EMployees in DB
		/*
		 * long count = employeeRepository.count();
		 * System.out.println("Employees Count :: "+ count);
		 * 
		 * // Find multiple Employees
		 * 
		 * 
		 * List<Integer> list = new ArrayList<Integer>(); list.add(101); list.add(102);
		 * List<Employee> findAllById = employeeRepository.findAllById(list);
		 * 
		 * System.out.println(findAllById);
		 * 
		 * 
		 * 
		 * employeeRepository.deleteAllById(list);
		 * 
		 * 
		 * System.out.println("Current Emp Count :: "+employeeRepository.count());
		 */
		
		/*
		 * List<Employee> maleEMployeesList = employeeRepository.findByGender("Male");
		 * 
		 * maleEMployeesList.forEach(System.out::println);
		 */

	}

	public void doProcess(){
	}

	// HIS-301 changes
	public void loadData(){
	}

}
