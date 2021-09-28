package project;

public class emailApp
{
	public static void main(String[] args)
	{
	email em1 = new email("neeta","sahu");
	em1.setAlternateEmail("ns@gmail.com");
	System.out.println("ALTERNATE EMAIL: "+em1.getAlternateEmail());
	em1.setMailboxcapacity(800);
	System.out.println("MAILBOX CAPACITY IS: "+em1.getMailboxcapacity());
	}

}
