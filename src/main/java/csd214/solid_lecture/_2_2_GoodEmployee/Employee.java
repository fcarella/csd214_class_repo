/*
 * based on https://twitter.com/vikasrajputin/status/1593460509210075136
 * see lecture https://docs.google.com/document/d/134NBLjclZXqPRI0jGHiYz9Q4-JswxOcaI-C9YYFpYws/edit?usp=sharing
 */
package csd214.solid_lecture._2_2_GoodEmployee;

/**
 *
 * @author fcarella
 */
public class Employee {

    private String fullname;
    private String dateOfJoining;
    private String annualSalaryPackage;

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
    
    
}
