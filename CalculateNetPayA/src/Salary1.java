public class Salary1 {
        private double basic_salary;
        private double tax_relief;
        Salary1 (double basic,double tax){
            basic_salary  = basic;
            tax_relief = tax;

        }

        public void display(){
            System.out.println("This is my basic salary " + basic_salary);
            System.out.println("This is my tax relief " + tax_relief);

        }
    }


