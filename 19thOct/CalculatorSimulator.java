class CountryNotValidException extends Exception { // Creating CountryNotValidException by extending Exception class
    public CountryNotValidException(String msg) { // constructor
        super(msg); // passing msg to super class
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String msg) {
        super(msg);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String msg) {
        super(msg);
    }
}

class TaxCalculator { // creating tax calculator class
    public void calculateTax(String empName, boolean isIndian, double empSal) throws Exception {
        if (isIndian == false) { // checking condition
            try { // code here throws exception
                throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
            } catch (CountryNotValidException ex) { // for catch and handel the exception
                System.out.println(ex.getMessage());
            }
        } else if (empName == null) {
            try {
                throw new EmployeeNameInvalidException("The employee name cannot be empty");
            } catch (EmployeeNameInvalidException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (empSal > 100000 && isIndian == true) {
            System.out.println(empSal * 8 / 100);
        } else if (empSal > 50000 && empSal < 100000 && isIndian == true) {
            System.out.println((empSal * 6) / 100);
        } else if (empSal > 30000 && empSal < 50000 && isIndian == true) {
            System.out.println((empSal * 5) / 100);
        } else if (empSal > 10000 && empSal < 300000 && isIndian == true) {
            System.out.println((empSal * 4) / 100);
        } else {
            try {
                throw new TaxNotEligibleException("The employee does not need to pay tax :)");
            } catch (TaxNotEligibleException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

public class CalculatorSimulator { // Main class
    public static void main(String[] args) throws Exception { // main method
        TaxCalculator taxCalculator = new TaxCalculator(); // creating calculator object
        taxCalculator.calculateTax("Ron", false, 3400); // calling calculate tax method
        taxCalculator.calculateTax("Tim", true, 1000);
        taxCalculator.calculateTax("Jack", true, 55000);
        taxCalculator.calculateTax(null, true, 30000);
    }
}
