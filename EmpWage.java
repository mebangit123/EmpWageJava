class EmpWageCheck {

		int is_FullTime = 1;
		int is_PartTime = 2;

		public int getWorkingHours(double n){

			int emp_Hours=0;

				if(n == is_FullTime)
				{
					emp_Hours=3;
				}
				else if(n == is_PartTime)
				{
					emp_Hours=2;
				}
				else
				{
					emp_Hours=0;
				}
				return emp_Hours;
			}
}

public class EmpWage{
	public static void main(String args[]){

		//constant
		int max_hrs_in_month = 100;
		int emp_rate_per_hr = 15;
		int num_working_days = 20;

		int total_emp_hr = 0;
		int totalWorkingDays = 0;
		float salary = 0;

		EmpWageCheck emp = new EmpWageCheck();

		double empCheck = Math.floor(Math.random() * 10) % 3;


		while(total_emp_hr < max_hrs_in_month & totalWorkingDays < num_working_days)
			{
				int workHours = emp.getWorkingHours(empCheck);
				total_emp_hr += workHours;
				salary = total_emp_hr * emp_rate_per_hr;
				totalWorkingDays++;
			}
		System.out.println(salary);
	}
}

