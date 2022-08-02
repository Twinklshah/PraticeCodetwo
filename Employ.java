package first_java_project;

public class Employ {

	int salary;
	int hourly_rate;
	
	
	public int Calculate_wage(int extra_hours)
	{
		return salary+(hourly_rate*salary);
	}
}
