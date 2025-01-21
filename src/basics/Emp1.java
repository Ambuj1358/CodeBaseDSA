package basics;

class  EmployeeStatus{
	   private String name;
	   private int age;

	EmployeeStatus(){}

	EmployeeStatus(String name, int age){
	   this.name=name;
	   this.age=age;
	}

	public String getName(){

	return name;
	}
	public void setName(String name){
	  this.name=name;
	}
	public int getAge(){
	return age;
	}
	public void setAge(int age){
	this.age=age;
	}

	public String toString(){

	return "Employee [ name = " + name + ", age = " +age + " ]";
	}
	}
	public class Emp1{
	public static void main(String[] args){
	EmployeeStatus emp=new EmployeeStatus("ambuj",45);
	EmployeeStatus emp2=new EmployeeStatus("kumar",35);

	System.out.println(emp);
	System.out.println(emp2);

	}
	}
	    
