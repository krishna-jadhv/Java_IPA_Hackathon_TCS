import java.util.*;

class Employee{
    private int employeeId;
    private String employName;
    private int age;
    private char gender;
    private double salary;

    Employee(int employeeId, String employName, int age, char gender, double salary){
        this.employName=employName;
        this.employeeId=employeeId;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeID(int employeeId){
        this.employeeId=employeeId;
    }

    public String getEmployeeName(){
        return employName;
    }
    public void setEmployeeName(String employName){
        this.employName=employName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setGender(char gender){
        this.gender=gender;
    }

    public char getgender(){
        return gender;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }
}


public class solution {

    public static int countEmployeesBasedOnAge(Employee[] employee, int age){
        int count=0;
        for(int i=0; i<employee.length; i++){
            if(employee[i].getAge()==age){
                count++;
            }
        }
        return count;
    }

    public static Employee getEmployeeWithSecondLowestSalary(Employee[] employee){
        if(employee.length<2){
            return null;
        }
        Arrays.sort(employee, Comparator.comparingDouble(Employee::getSalary));

        double LowestSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if(employee[i].getSalary()>LowestSalary){
                return employee[i];
            }
        } 

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfemployee=sc.nextInt();
        Employee[] employee = new Employee[numberOfemployee];
        for(int i=0; i<numberOfemployee; i++){
            // System.out.println("Enter employee "+i+" ID : ");
            int employeeId=sc.nextInt();sc.nextLine();

            // System.out.println("Enter employee name : ");
            String employeeName=sc.next();sc.nextLine();

            // System.out.println("Enter age : ");
            int age = sc.nextInt();sc.nextLine();

            // System.out.println("enter gender:");
            char gender = sc.next().charAt(0);sc.nextLine();

            // System.out.println("enter salary : ");
            double salary =sc.nextDouble();sc.nextLine();
            employee[i]= new Employee(employeeId, employeeName, age, gender, salary);
        }

        int ageToSearch = sc.nextInt();

        Employee SecondLowestSal = getEmployeeWithSecondLowestSalary(employee);
        if(SecondLowestSal != null){
            System.out.println(SecondLowestSal.getEmployeeId()+"#"+SecondLowestSal.getEmployeeName());
        }else{
            System.out.println("Null");
        }

        int countEmployee = countEmployeesBasedOnAge(employee, ageToSearch);
        if(countEmployee==0){
            System.out.println("No employee found for the given age");
        }else{
            System.out.println(countEmployee);
        }

        
    }
}