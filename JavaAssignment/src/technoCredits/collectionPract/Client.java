package technoCredits.collectionPract;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		EmployeeDetails e1 = new EmployeeDetails("Anuj",16);
		EmployeeDetails e2 = new EmployeeDetails("Vedika",18);
		EmployeeDetails e3 = new EmployeeDetails("Saket",11);
		
		ArrayList<EmployeeDetails> al = new ArrayList<EmployeeDetails>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		printAllData(al);
	}
	
	static void printAllData(ArrayList<EmployeeDetails> al)
	{
		int minage = al.get(0).age;
		String empname = al.get(0).name;
		
		for(EmployeeDetails emp : al)
		{
			if(minage>emp.age)
			{
				minage = emp.age;
				empname = emp.name;
			}
			//System.out.println(emp.age + ":" + emp.name);
		}
		System.out.println(minage + ":" + empname);
	}
}
