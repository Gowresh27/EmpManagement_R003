package com.example.demo.entity;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees_info")
public class Employee {
	@Id
	private int empId;
	private String empName;
	private int empSal;
	private String empDesg;
	private Date empDOJ;

}
