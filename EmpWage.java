public class EmpWage{
	public static void main(String args[]){

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

					if(empCheck == is_FullTime)
					{
						daily_wage = emp_work_hrs * wage_per_hr;
					}
					else if(empCheck == is_PartTime)
					{
						daily_wage = emp_work_hrs * part_time_hr;
					}
					else
					{
						daily_wage+=0;
					}
					emp_work_hrs++;
				}
		System.out.println(daily_wage);
	}
}
