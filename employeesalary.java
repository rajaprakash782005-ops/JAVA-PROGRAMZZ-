class employeesalary{
private int salary;
public void setSalary(int salary){
this.salary = salary;
}
public int getSalary(){
return salary;
}
public static void main(String[] args){
employeesalary e = new employeesalary();
e.setSalary(5000);
System.out.println(e.getSalary());
}
}