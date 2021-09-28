package project;

import java.util.Scanner;

public class email 
{
	private String Firstname;
	private String Lastname;
	private String Department;
	private String email;
	private String Password;
	private int Mailboxcapacity ;
	private String AlternateEmail ;
	private String company="abc";
	private int passwordlength = 10;
	
	public email(String  Firstname,String Lastname)
	{
		this.Firstname = Firstname;
		this.Lastname = Lastname;
		//System.out.println("NAME GIVEN:"+this.Firstname+" "+this.Lastname);
		
		this.Department = setDepartment();
		//System.out.println("SELECTED DEPARTMENT :"+this.Department);
		
		email=Firstname.toLowerCase()+"."+Lastname.toLowerCase()+"."+Department.toLowerCase()+"@"+company+".com";
		System.out.println("Generated Email is:"+this.email);
		
		this.Password = randompassword(passwordlength);
		System.out.println("PASSWORD GENERATED:"+this.Password);
		
	}
	private String setDepartment()
	{
		System.out.println("ENTER DEPARTMENT: \n 1 for SALES\n 2 for DEVELPOMENT\n 3 for ACCOUNTING \n 0 for NONE");
		Scanner sc = new Scanner(System.in);
		int DeptChoice = sc.nextInt();
		if(DeptChoice==1) {return "SALES";}
		else if(DeptChoice==2) {return "DEVELOPMENT";}
		else if(DeptChoice==3) {return "ACCOUNTING";}
		else {return " ";}
		
		
	}
	
	private String randompassword(int length)
	{
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		char password[] = new char[length];
		for(int i=0;i<length;i++)
		{
			int rand=(int)(Math.random()*passwordset.length());
			password[i] = passwordset.charAt(rand);
		}
		return new String(password);
	}
	
	public int getMailboxcapacity() {
		return Mailboxcapacity;
	}
	public void setMailboxcapacity(int mailboxcapacity) {
		this.Mailboxcapacity = mailboxcapacity;
	}
	public String getAlternateEmail() {
		return AlternateEmail;
	}
	public void setAlternateEmail(String alternateEmail) {
		this.AlternateEmail = alternateEmail;
	}
	
	

}
