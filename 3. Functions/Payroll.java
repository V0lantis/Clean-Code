// Payroll.java file from Clean Code book - CORRECTION

public abstract class Employee {
  public abstract boolean isPayDay();
  public abstract Money calculatePay();
  public abstract void deliverPay(Money pay);
}

// --------------------------

public interface EmployeeFactory {
  public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}

// --------------------------

public class EmployeeFactoryImpl implements EmployeeFactory {
  public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
    switch (r.type) {
      case COMISSIONED:
      return CommissionedEmployee(e)
      break;
    
      case HOURLY:
      return HourlyEmployee(e)
      break;

      case SALARIED:
        return SalariedEmployee(e)
        break;
        
      default:
        throw new InvalidEmployeeType(r.type);
    }
  }
}    
