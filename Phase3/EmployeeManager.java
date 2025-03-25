package Phase3;

import java.util.*;

public class EmployeeManager implements EmployeeManagerInterface{
    private static HashMap<String,Employee> hashMap= new HashMap<>();

    public static HashMap<String, Employee> getHashMap() {
        return hashMap;
    }
    public static void operations(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Add employee\n2.Remove Employee\n3.Search Employee\n4.Sort employees\n5.Exit");
            int inp=sc.nextInt();
            EmployeeManager manager=new EmployeeManager();
            switch(inp){
                case 1:
                    manager.addEmployee();
                    break;
                case 2:
                    manager.removeEmployee();
                    break;
                case 3:
                    manager.searchEmployee();
                    break;
                case 4:
                    manager.sortEmployee();
                case 5:
                    System.exit(0);
            }
        }
    }
    @Override
    public void addEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee name:");
        String empName=sc.next();
        String id;
        while(true){
            System.out.print("Enter the employee id:");
            id= sc.next();
            if(EmployeeManager.getHashMap().containsKey(id)){
                System.out.println("Employee id already exists...");
            }
            else{
                System.out.print("Enter the salary:");
                int salary =sc.nextInt();
                System.out.print("Enter the department:");
                String dept=sc.next();
                EmployeeManager.getHashMap().put(id,new Employee(id,empName,dept,salary));
                break;
            }
        }
    }

    @Override
    public void searchEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee id to search:");
        String id = sc.next();
        try{
            if (EmployeeManager.getHashMap().containsKey(id)) {
                System.out.println(id+" exists...");
                Employee info=EmployeeManager.getHashMap().get(id);
                System.out.println("Name: "+info.employeeName+"\nID: "+info.employeeId+"\nDepartment: "+info.department+"\nSalary: "+String.format("%,d",info.salary));
            }
        } catch (Exception e) {
            System.out.println("ID not found");
        }
    }
    @Override
    public void removeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee id to remove:");
        String id= sc.next();
        if(EmployeeManager.getHashMap().containsKey(id)){
            EmployeeManager.getHashMap().remove(id);
        }
        else{
            System.out.println("ID doesn't exist");
        }
    }

    @Override
    public void sortEmployee() {
        ArrayList<Employee> employeesArrayList =new ArrayList<>();
        for(String employee:EmployeeManager.getHashMap().keySet()){
            employeesArrayList.add(EmployeeManager.getHashMap().get(employee));
        }
        for(Employee emp:employeesArrayList){
            System.out.println(emp.employeeName + "\n"+emp.employeeId+"\n"+emp.salary);

        }
        Comparator<Employee> comparator= new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
               if(o1.salary==o2.salary){
                   return o1.employeeName.compareTo(o2.employeeName);
               }
               else {
                   return Integer.compare(o1.salary,o2.salary);
               }
            }
        };
        Collections.sort(employeesArrayList,comparator);

    }
}
