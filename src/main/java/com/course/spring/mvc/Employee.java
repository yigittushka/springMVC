package com.course.spring.mvc;




import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;


public class Employee {


    @Size(min = 2, message = "Too short name, min > 1 ")
    private String name;

    @NotBlank(message = "Surname not will be empty ")
    private String surname;
    private int salary;
    private String department;

    private Map<String, String> departments;
    private String carBrend;
    private Map<String, String> carBrends;

    private String[] languages;

    private Map<String, String> languagesMap;

    @Pattern(regexp = "\\d{11}", message = "use 11 (eleven) numbers")
    private String phoneNumber;



    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("SL", "Sales");

        carBrends = new HashMap<>();
        carBrends.put("BMW", "BMW");
        carBrends.put("MD", "MD");
        carBrends.put("Audi", "Audi");

        languagesMap = new HashMap<>();
        languagesMap.put("EN", "Eng");
        languagesMap.put("FR", "Frn");
        languagesMap.put("RU", "Rus");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrend() {
        return carBrend;
    }

    public void setCarBrend(String carBrend) {
        this.carBrend = carBrend;
    }

    public Map<String, String> getCarBrends() {
        return carBrends;
    }

    public void setCarBrends(Map<String, String> carBrends) {
        this.carBrends = carBrends;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesMap() {
        return languagesMap;
    }

    public void setLanguagesMap(Map<String, String> languagesMap) {
        this.languagesMap = languagesMap;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
