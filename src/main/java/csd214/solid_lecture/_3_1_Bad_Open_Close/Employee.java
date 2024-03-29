/*
 * based on https://twitter.com/vikasrajputin/status/1593460509210075136
 * see lecture https://docs.google.com/document/d/134NBLjclZXqPRI0jGHiYz9Q4-JswxOcaI-C9YYFpYws/edit?usp=sharing
 */
package csd214.solid_lecture._3_1_Bad_Open_Close;

import java.util.Objects;

/**
 *
 * @author fcarella
 */
public class Employee {

    private String fullname;
    private String dateOfJoining;
    private String annualSalaryPackage;
    private String type;

    private EmployeeSalary employeeSalary;

    public EmployeeSalary getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(EmployeeSalary employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
// setters and getters
    /**
     * @return the fullname
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * @param fullname the fullname to set
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * @return the dateOfJoining
     */
    public String getDateOfJoining() {
        return dateOfJoining;
    }

    /**
     * @param dateOfJoining the dateOfJoining to set
     */
    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    /**
     * @return the annualSalaryPackage
     */
    public String getAnnualSalaryPackage() {
        return annualSalaryPackage;
    }

    /**
     * @param annualSalaryPackage the annualSalaryPackage to set
     */
    public void setAnnualSalaryPackage(String annualSalaryPackage) {
        this.annualSalaryPackage = annualSalaryPackage;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public Employee(String fullname, String dateOfJoining, String annualSalaryPackage) {
        this.fullname = fullname;
        this.dateOfJoining = dateOfJoining;
        this.annualSalaryPackage = annualSalaryPackage;
    }

    public Employee() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(fullname, employee.fullname) && Objects.equals(dateOfJoining, employee.dateOfJoining) && Objects.equals(annualSalaryPackage, employee.annualSalaryPackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, dateOfJoining, annualSalaryPackage);
    }
}
