// Payroll.java file from Clean Code book

public Money calculatePay(Employee e) throws InvalidEmployeeType{
  switch (e.type) {
    case COMISSIONED:
      return calculateCommissionedPay(e)
      break;
    
    case HOURLY:
    return calculateHourlyPay(e)
    break;

    case SALARIED:
      return calculateSalariedPay(e)
      break;
      
    default:
      break;
  }
}