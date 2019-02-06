package com.epiclanka.supportTest;

import com.epiclanka.supportTest.model.Company;
import com.epiclanka.supportTest.model.Department;
import com.epiclanka.supportTest.model.Module;
import com.epiclanka.supportTest.model.Product;
import com.epiclanka.supportTest.repository.CompanyRepository;
import com.epiclanka.supportTest.repository.DepartmentRepository;
import com.epiclanka.supportTest.repository.ModuleRepository;
import com.epiclanka.supportTest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class SupportTestApplication  implements CommandLineRunner {

	@Autowired
	private DepartmentRepository departmentRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private ModuleRepository moduleRepository;


	public static void main(String[] args) {
		SpringApplication.run(SupportTestApplication.class, args);
	}

	@Bean
	public CorsFilter corsFilter(){
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		final CorsConfiguration config  = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedHeader("*");
		config.addAllowedOrigin("*");
		config.addAllowedMethod("OPTIONS");
		config.addAllowedMethod("POST");
		config.addAllowedMethod("GET");
		config.addAllowedMethod("PUT");
		config.addAllowedMethod("DELETE");
		source.registerCorsConfiguration("/**",config);
		return new CorsFilter(source);
	}


	@Override
	public void run(String... args) throws Exception {
		Department d1 = new Department();
		d1.setDepartmentName("Support");
		departmentRepository.save(d1);

		Department d2 = new Department();
		d2.setDepartmentName("Development");
		departmentRepository.save(d2);


		//Products
		Product p1 = new Product();
		p1.setProductName("Branchless Banking");
		p1.setType("SOFTWARE");
		//productRepository.save(p1);

		Product p2 = new Product();
		p2.setProductName("Mobile Wallet");
		p2.setType("SOFTWARE");
		//productRepository.save(p2);

		Product p3 = new Product();
		p3.setProductName("SMS Banking");
		p3.setType("SOFTWARE");
		//productRepository.save(p3);

		Product p4 = new Product();
		p4.setProductName("SMS Alert/OTP");
		p4.setType("SOFTWARE");
		//productRepository.save(p4);

		Product p5 = new Product();
		p5.setProductName("ACS");
		p5.setType("SOFTWARE");
		//productRepository.save(p5);

		Product p6 = new Product();
		p6.setProductName("ACS");
		p6.setType("HARDWARE");
		//productRepository.save(p6);

		Product p7 = new Product();
		p7.setProductName("CMS");
		p7.setType("SOFTWARE");
		//productRepository.save(p7);

		Product p8 = new Product();
		p8.setProductName("DMS");
		p8.setType("SOFTWARE");
		//productRepository.save(p8);

		//Clients
		Company c1 = new Company();
		c1.setCompanyName("NSB");
		companyRepository.save(c1);

		Company c2 = new Company();
		c2.setCompanyName("NTB");
		companyRepository.save(c1);

		Company c3 = new Company();
		c3.setCompanyName("RDB");
		companyRepository.save(c3);

		Company c4 = new Company();
		c4.setCompanyName("Com Credit");
		companyRepository.save(c4);

		Company c5 = new Company();
		c5.setCompanyName("PLC");
		companyRepository.save(c5);

		Company c6 = new Company();
		c6.setCompanyName("BIMPUTH");
		companyRepository.save(c6);

		//Module
		Module m1 = new Module();
		m1.setModuleName("eSwitch");
		m1.setType("SOFTWARE");
		//moduleRepository.save(m1);

		Module m2 = new Module();
		m2.setModuleName("Admin");
		m2.setType("SOFTWARE");
		//moduleRepository.save(m2);

		Module m3 = new Module();
		m3.setModuleName("Middleware");
		m3.setType("SOFTWARE");
		//moduleRepository.save(m3);

		Module m4 = new Module();
		m4.setModuleName("DB");
		m4.setType("SOFTWARE");
		//moduleRepository.save(m4);

		Module m5 = new Module();
		m5.setModuleName("DB");
		m5.setType("SOFTWARE");
		//moduleRepository.save(m5);

		Module m6 = new Module();
		m6.setModuleName("M-Server");
		m6.setType("SOFTWARE");
		//moduleRepository.save(m6);

		Module m7 = new Module();
		m7.setModuleName("WAM");
		m7.setType("SOFTWARE");
		//moduleRepository.save(m7);

//		p1.getModules().add(m1);
//		p1.getModules().add(m2);
//
//		productRepository.save(p1);

		moduleRepository.saveAll(Arrays.asList(m1,m2,m3,m4,m5,m6,m7));



	}
}

