package technoCredits.collectionPract;

public class Employee implements Manager{
Manager m11 = new Employee();
	@Override
	public Manager m1() {
		return m2();
		
	}
	
	Manager m2()
	{
		return new Employee();
	}
	

}
