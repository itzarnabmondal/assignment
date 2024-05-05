class CountryNotValidException extends Exception {
    public CountryNotValidException(String msg) {
        super(msg);
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

class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal) throws Exception {
        double amount = 0;
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        } else if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        } else if (empSal > 100000) {
            amount = (empSal * 8) / 100;
        } else if (empSal > 50000) {
            amount = (empSal * 6) / 100;
        } else if (empSal > 30000) {
            amount = (empSal * 5) / 100;
        } else if (empSal > 10000) {
            amount = (empSal * 4) / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax :)");
        }
        return amount;
    }
}

public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        try {
            System.out.println(taxCalculator.calculateTax("Ron", false, 3400));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(taxCalculator.calculateTax("Tim", true, 1000));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(taxCalculator.calculateTax("Jack", true, 55000));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(taxCalculator.calculateTax(null, true, 30000));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}