class SalaryCalculationException extends Exception{}

class Person65{

        public void calculateSalary() throws SalaryCalculationException{

                //...

                throw new SalaryCalculationException();

                //...

        }

}

class Company{

        public void paySalaries(){

                new Person().calculateSalary();

        }

}