public class EmpWage{
	public static void main(String args[]){

		int is_Present = 1;
		int wage_per_hr=20;
		int full_day_hr=8;
		int emp_work_hrs=0;
		int daily_wage=0;

			while(emp_work_hrs < full_day_hr)
				{
					double empCheck = Math.floor(Math.random() * 10) % 2;

					if(empCheck == is_Present)
						{
							daily_wage = emp_work_hrs * wage_per_hr;
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
