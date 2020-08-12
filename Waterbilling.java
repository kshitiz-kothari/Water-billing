import java.io.*;
import java.util.*;
import java.io.File;

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
		confirm_print_loc();
		confirm_month();
		int rates[];
		int meter_rent=40;
		int[] fixed_charges={50,100,200};
		int[] min={100,200,300};
		String[] conn_type={"DM","ND","IN"};
		System.out.println(location);
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