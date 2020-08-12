import java.io.*;
import java.util.*;
import java.io.File;

class Waterbilling
{
	public static void confirm_print_loc()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the location to be printed : ");
		String location=in.nextLine();
		
	}

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the file name : ");
		String file_name = in.nextLine();
		File input_file = new File (file_name);
		confirm_print_loc();
		//FileInputStream fis=new FileInputStream(new File("E:\\java\\waterdata.xls")); 

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