public class Parent {
    private static double basicSalary, taxRelief;

    Parent(double basicSalary, double taxRelief) {
        this.basicSalary = basicSalary;
        this.taxRelief = taxRelief;
    }

//encapsulate fields

    public  double getBasicSalary() {
        return basicSalary;
    }

    public  void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public  double getTaxRelief() {
        return taxRelief;
    }

    public  void setTaxRelief(double taxRelief) {
        this.taxRelief = taxRelief;
    }

    public double taxableIncome() {
        return getBasicSalary() - getTaxRelief();
    }

    public double ssnit() {
        return 0.135 * getBasicSalary();
    }


    public double deductions() {
        double tax = 0;
//        if(taxableIncome() <= 216){
//            tax = 0;
//        } else if (taxableIncome() <= 324) {
//            tax = 0.05*108;
//        } else if (taxableIncome() <= 475) {
//            tax = (0.05*108)+(0.1*151);
//        } else if (taxableIncome()  <= 3240) {
//            tax = (0.05*108)+(0.1*151)+(0.175*2765);
//        }else if(taxableIncome() > 3240){
//            tax = (0.05*108)+(0.1*151)+(0.175*2765)+(0.25*3240);
//        }

        if (taxableIncome() <= 216) {
            tax = 0;
        } else if (taxableIncome() <= 324) {
            tax = 0.05 * (taxableIncome() - 216);
        } else if (taxableIncome() <= 475) {
            tax = 0.1 * (taxableIncome() - 324) + 0.05 * (taxableIncome() - 216);
        } else if (taxableIncome() <= 3240) {
            tax = 0.175 * (taxableIncome() - 457) + 0.1 * (taxableIncome() - 324) + 0.05 * (taxableIncome() - 216);
        } else if (taxableIncome() > 3240) {
            tax = 0.25 * (taxableIncome() - 3240) + 0.175 * (taxableIncome() - 457) + 0.1 * (taxableIncome() - 324) + 0.05 * (taxableIncome() - 216);
        }
        return tax;
    }

    public double calculateSalary() {
        return getBasicSalary() - deductions();
    }
}
