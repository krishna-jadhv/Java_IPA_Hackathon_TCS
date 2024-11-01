class Employee{
    private int id;
    private String name;
    private String designation;
    private double salary;

    Employee(int id, String name, String designation, double salary){
        this.id=id;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setDesignation(String designation){
        this.designation=designation;
    }
    public String getDesignation(){
        return designation;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }
}



public class Solution {
    
}
