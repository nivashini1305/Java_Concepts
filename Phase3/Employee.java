package Phase3;

public class Employee {
      String employeeId;
      String employeeName;
      String department;
      int salary;
   public Employee(String employeeId, String employeeName, String department, int salary){
       this.employeeId=employeeId;
       this.employeeName=employeeName;
       this.department=department;
       this.salary=salary;
   }

    public String getEmployeeId() {
        return employeeId;
    }
}
