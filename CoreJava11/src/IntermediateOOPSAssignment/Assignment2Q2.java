package IntermediateOOPSAssignment;
import java.util.ArrayList;
/*class Employee{
	
}*/
class Manager extends Assignment2Q2
{ public int getSalary(int salary)
	{ int incentive =5000;
	int totals=incentive+salary;
	return totals;
	}}
class Labour extends Assignment2Q2
{
	public int getSalary(int salary)
	{ int overtime=500;
	int totals=salary+overtime;
		return totals;
	}
}
	

public class Assignment2Q2 {

	int salary = 10000;
    public int getSalary(int salary){
   	this.salary=salary;
   	return salary;
   }
  public int totalEmployeesSalary(ArrayList<Integer> employeesalaries)
   {
		int totals=0;
		for(int i:employeesalaries)
		{
			totals+=i;
		}
		return totals;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2Q2 q=new Assignment2Q2 ();
		Manager m=new Manager();
		int ms=m.getSalary(q.salary);
		Labour l=new Labour();
		int ls=l.getSalary(q.salary);
		ArrayList<Integer> employeesalariesList=new ArrayList<>();
		employeesalariesList.add(ms);
		employeesalariesList.add(ls);
		int total=q.totalEmployeesSalary(employeesalariesList);
		System.out.println(total);
	}

}