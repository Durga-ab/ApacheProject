package actiTimePageFactory;

public interface LoginPage 
{
	
	
	public static void welcome()
	{
		System.out.println("Welcome to ActiTime World");
	}
    
	void usename();
	void password();
	void login();
     
	public static void thankyou()
	{
		System.out.println("Thank You");
	}
}
