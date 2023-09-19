package csd214.solid_lecture._3_1_Bad_Open_Close;

public class EmployeeSalary {
    private Long totalWorkingDay;
    private Long basicPay;
    private long companyBenefits;
    private long bonus;

    public EmployeeSalary(Long totalWorkingDay, Long basicPay, long companyBenefits, long bonus) {
        this.totalWorkingDay = totalWorkingDay;
        this.basicPay = basicPay;
        this.companyBenefits = companyBenefits;
        this.bonus = bonus;
    }

    public EmployeeSalary() {
    }

    public Long calculateSalary(Employee emp){
        Long salary = null;
        if(emp.getType().equals("PERMANENT")){
            salary=(totalWorkingDay * basicPay) + getCompanyBenefits() + getBonus();
        }else if(emp.getType().equals("CONTRACT")){
            salary=totalWorkingDay * basicPay;
        }
        return salary;
    }

    public long getCompanyBenefits() {
        return companyBenefits;
    }

    public void setCompanyBenefits(long companyBenefits) {
        this.companyBenefits = companyBenefits;
    }

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }
}
