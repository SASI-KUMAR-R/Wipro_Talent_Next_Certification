package Module_1.Project_1;

public class Main {

	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("NO EMP_ID TO FIND");
			return ; 
		}
		
		int find_empid = Integer.parseInt(args[0]) ;
		
		Employees_Details[] Employees_Details = {
				new Employees_Details(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
				new Employees_Details(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
				new Employees_Details(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
				new Employees_Details(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
				new Employees_Details(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
				new Employees_Details(1006, "Suman", "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400),
				new Employees_Details(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000) };
		
		Dearness_Allowance[] designations = {
		            new Dearness_Allowance('e', "Engineer", 20000),
		            new Dearness_Allowance('c', "Consultant", 32000),
		            new Dearness_Allowance('k', "Clerk", 12000),
		            new Dearness_Allowance('r', "Receptionist", 15000),
		            new Dearness_Allowance('m', "Manager", 40000)
		        };
		
		Employees_Details foundEmployees_Details = null ;
		for (Employees_Details employees_Details : Employees_Details) 
		{
			if(employees_Details.emp_no == find_empid)
			{
				foundEmployees_Details = employees_Details;
			}
		}
		
		String designation_name = "";
		int empDa = 0 ;
		
		for(Dearness_Allowance design : designations)
		{
			if(foundEmployees_Details.designation_code == design.designation_code)
			{
				designation_name = design.designation ;
				empDa = design.da ; 
			}
		}
		
		int salary = foundEmployees_Details.basic + foundEmployees_Details.hra + empDa - foundEmployees_Details.it ;
		System.out.println("Emp No. " + foundEmployees_Details.emp_no + 
                " | Emp Name " + foundEmployees_Details.emp_name + 
                " | Department " + foundEmployees_Details.department + 
                " | Designation " + designation_name + 
                " | Salary " + salary);
	}
}
