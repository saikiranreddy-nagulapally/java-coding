
public class Employee 
{
	int empno;
	String ename;
	double salary;
	String type;
	public Employee()
	{
		empno=10;
		ename="abc";
		salary=50000;
		type="permanent";
	}
	public Employee(int empno,String ename,double salary,String type)
	{
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
		this.type=type;
	}
	public void display()
	{
		System.out.println("employee number eno:" +empno);
		System.out.println("employee name is:" +ename);
		System.out.println("employee salary is : "+salary);
		System.out.println("employee type is: "+type);
		
	}
	
	public static void main(String[]args)
	{
		Employee e1= new Employee();
		Employee e2= new Employee();
		e1.display();
		e2.display();
		Employee e4=new Employee(10,"sai",2000000,"permanent");
		Employee e3=new Employee(15,"kiran",200,"temporary");
		e4.display();
		e3.display();
	}
}

