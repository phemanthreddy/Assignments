package Lambda_Assignment;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Assignment8Q4 {
	public String name;
	public static  ArrayList<String> removeOddLength(ArrayList<String> employeeList)
	{
		ArrayList<String> employeeList_filtered = employeeList.stream()
				.filter(p->p.length()%2==0)
				.collect(Collectors.toCollection(ArrayList::new));
		return employeeList_filtered;
	}

	public static void main(String[] args)
	{
		ArrayList<String> employeeList = new ArrayList<String>();
		employeeList.add("hemanth");
		employeeList.add("hemant");
		employeeList.add("heman");
		employeeList.add("nema");
		ArrayList<String> employeeList2=removeOddLength(employeeList);
		for(String a: employeeList2 )
		{
			System.out.println(a);
		}

	}

}