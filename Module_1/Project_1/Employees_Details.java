package Module_1.Project_1;

public class Employees_Details {
	int emp_no;
	String emp_name;
	String join_Date;
	char designation_code;
	String department;
	int basic;
	int hra;
	int it;

	public Employees_Details(int emp_no, String emp_name, String join_Date, char designation_code, String department,
			int basic, int hra, int it) {
		this.emp_no = emp_no;
		this.emp_name = emp_name;
		this.join_Date = join_Date;
		this.designation_code = designation_code;
		this.department = department;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
	}
}
