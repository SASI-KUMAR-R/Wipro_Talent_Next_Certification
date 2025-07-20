package Encapsulation;

public class Author 
{
	private String authorname ;
	private String email ;
	private char gender ;
	
	public Author(String authorname, String email, char gender) {
		this.authorname = authorname;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName()
	{
		return authorname ;
	}
	
	public String getEmail()
	{
		return email ;
	}
	
	public char getGender()
	{
		return gender ;
	}
	
	@Override
	public String toString() 
	{
		 return "Author[name=" + authorname + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
	
}
