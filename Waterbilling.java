import java.io.*;
import java.util.*;
import java.io.File;
class Consumer
{
		private int cons_id;
		private String cons_name;
		private String cons_add;
		Consumer(int id)
		{
			cons_id=id;
		}
		public void get_cons_info()
		{
			
		}
		public void  display_cons() 
		{
		get_cons_info();
      		System.out.println("User id : " + this.cons_id);
      		System.out.println("Name : " + this.cons_name);
      		System.out.println("Address : " + this.cons_add);
  		}
		
}
class Waterbilling
{
	static String location;
	static String month;
	public static void confirm_print_loc()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the location to be printed : ");
		location=in.nextLine();
	}
	public static void confirm_month()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the month to be printed : ");
		month=in.nextLine();
	}

	public void dm(int cons){}
	public void nd(int cons){}
	public void in(int cons){}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the source file name : ");
		String file_name = in.nextLine();
		File input_file = new File (file_name);
		int rates[];
		int meter_rent=40;
		int[] fixed_charges={50,100,200};
		int[] min={100,200,300};
		String[] conn_type={"DM","ND","IN"};
		System.out.println(location);
		System.out.println("To process the bill enter 1");
		System.out.println("To display consumer information enter 2");
		int choice= in.nextInt();
		switch(choice)
		{
			case 1:
				confirm_print_loc();
				confirm_month();
				break;
			case 2:
				System.out.println("Enter the consumer id : ");
				int id=in.nextInt();
				/*Consumer obj=new Consumer(id);
				obj.display_cons();*/
				break;
		}
		if (input_file.exists())
		 {
			System.out.println(input_file.getName() + " exists");
			System.out.println("The file is " + input_file.length() + " bytes long");
			if (input_file.canRead())
			{
				System.out.println(" ok to read");
			}
			else
			{
				System.out.println(" not ok to read");
				System.exit(0);
			}
		}
		
	}
	
}
