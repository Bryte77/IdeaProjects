public class Salary3{
    private double basic_salary;
    private double tax_relief;

   

    public double getBasic_salary() {
        return basic_salary;
    }

    public void setBasic_salary(double basic3) {
        basic_salary = basic3;
    }

    public double getTax_relief() {
        return tax_relief;
    }

    public void setTax_relief(double tax1) {
        tax_relief = tax1;
    }

    public void display(){
        System.out.println("This is my basic salary " + getBasic_salary());
        System.out.println("This is my tax relief " + getTax_relief());


    }


    }





