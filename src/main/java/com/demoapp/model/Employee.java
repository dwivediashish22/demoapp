package com.demoapp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table(name ="employee")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee
{
//Defining Employee id as primary key
@Id
@GenericGenerator(name="ID" , strategy="increment")
@GeneratedValue(generator="ID")
@Column
private int id;
@Column
private String name;
@Column
private String father_name;
@Column
private int salary;
@Column
private String address;

}