public class EmpWage{
	public static void main(String args[]){

		int is_FullTime = 1;
		int is_PartTime = 2;
		int wage_per_day=20;
		int part_time_wage = 8;
		int max_day_in_month = 20;
		int emp_work_day=0;
		int daily_wage=0;

			while(emp_work_day < max_day_in_month)
				{
					double empCheck = Math.floor(Math.random() * 10) % 3;

					if(empCheck == is_FullTime)
						{
							daily_wage = emp_work_day * wage_per_day;
						}
					else if(empCheck == is_PartTime)
						{
							daily_wage = emp_work_day * part_time_wage;
						}
					else
						{
							daily_wage+=0;
						}
					emp_work_day++;
				}
		System.out.println(daily_wage);
	}
}
