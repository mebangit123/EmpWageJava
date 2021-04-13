public class EmpWage
{
	public static void main(String args[])
	{
		int is_FullTime = 1;
		int is_PartTime = 2;
		int wage_per_hr = 20;
		int part_time_hr = 8;
		int full_day_hr = 8;
		int emp_work_hrs = 0;
		int daily_wage = 0;

			while(emp_work_hrs < full_day_hr)
				{
					double empCheck = Math.floor(Math.random() * 10) % 3;

					switch(empCheck)
					{
						case 1:
							daily_wage = emp_work_hrs * wage_per_hr;
							break;
						case 2:
							daily_wage = emp_work_hrs * part_time_hr;
							break;
						default:
							daily_wage += 0;
					}
					emp_work_hrs++;
				}
		System.out.println(daily_wage);
	}
}
