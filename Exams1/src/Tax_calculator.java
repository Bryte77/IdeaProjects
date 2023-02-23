public class Tax_calculator {
    //fields
    public double Basic_salary;
    public double Tax_relief;
//constructor
    public Tax_calculator(double basic_salary, double tax_relief) {
        Basic_salary = basic_salary;
        Tax_relief = tax_relief;
    }
//getters an setters(encapsulation)
    public double getBasic_salary() {
        return Basic_salary;
    }

    public void setBasic_salary(double basic_salary) {
        Basic_salary = basic_salary;
    }

    public double getTax_relief() {
        return Tax_relief;
    }

    public void setTax_relief(double tax_relief) {
        Tax_relief = tax_relief;
    }
//return method for taxeable income
    public double Taxeable_income() {
        return getBasic_salary() - getTax_relief();
    }
//return method for snnit+
    public double Snnit() {
        return 0.135 * getBasic_salary();
    }

    public double Calc_Tax() {
        double tax = 0;
//calculating the tax
        if (Taxeable_income() <= 216) {
            tax = 0;
        } else if (Taxeable_income() <= 324) {
            tax = 0.05 * (Taxeable_income() - 216)*0.05;
        } else if (Taxeable_income() <= 475) {
            tax = 0.1 * (Taxeable_income() - 324) * 0.01 + (Taxeable_income() - 216)*0.05;
        } else if (Taxeable_income() <= 3240) {
            tax = 0.175 * (Taxeable_income() - 457) * 0.175 + (Taxeable_income() - 324) * 0.01 + (Taxeable_income() - 216)*0.05;
        //} else if (Taxeable_income() > 3240) {
          //  tax = 0.25 * (Taxeable_income() - 3240) + 0.175 * (Taxeable_income() - 457) + 0.1 * (Taxeable_income() - 324) + 0.05 * (Taxeable_income() - 216);
        } else {
            tax = (Taxeable_income() - 3248) * 0.25;
        }
        return tax;
    }
    public double deductions(){
        return Snnit() + Calc_Tax();
    }
}
