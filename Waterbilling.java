import java.io.*;
import java.util.*;
import java.lang.*;
import java.io.File;

class Consumer
{
		int[] cons_id={1,2,3,4,5,6,7,8,9,10};
		String[] cons_name= new String[]{"William","James","Noah","Trever","John","Chandler","Richard","Logan","Katy","Lauren"};
		String[] cons_add=new String[]{"Goa", "Delhi", "UP", "Tamil Nadu", "Rajasthan", "Gujarat", "Maharastra", "UK", "Karnataka", "Punjab"};
		int index;
		Consumer(){}
		Consumer(int id)
		{
			index=id;
		}
		public void get_cons_info()
		{
			
		}
		public void  display_cons() 
		{
			//get_cons_info();
      		System.out.println("User id : " + this.cons_id[index]);
      		System.out.println("Name : " + this.cons_name[index]);
      		System.out.println("Address : " + this.cons_add[index]);
		}
		public void  display_cons(int index) 
		 {
			  //get_cons_info();
				System.out.println("User id : " + this.cons_id[index]);
				System.out.println("Name : " + this.cons_name[index]);
				System.out.println("Address : " + this.cons_add[index]);
		}
		
}
class Change_cons_details extends Consumer
{
	
	Change_cons_details(int id, String name )
	{
		index=id;
		cons_name[index]=name;	
		display_cons(index);
	}
	Change_cons_details(int id, String name, String address )
	{
		index=id;
		cons_name[index]=name;	
		cons_add[index]=address;
		display_cons(index);
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
	public void ind(int cons){}
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
		System.out.println("To change consumer information enter 3");
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
				Consumer obj=new Consumer(id);
				obj.display_cons();
				break;
			case 3:
				System.out.println("To change only name press 1");
				System.out.println("To change name and address press 2");
				int choice_2=in.nextInt();
				
				System.out.println("Enter the consumer id : ");
				int id1=in.nextInt();
				String temp=in.nextLine();
							
				System.out.println("Enter new name : ");
				String name=in.nextLine();
				
				if (choice_2==1)
				{
					Change_cons_details obj1= new Change_cons_details(id1,name);
				}
				else if (choice_2==2)
				{
					System.out.println("Enter new address : ");
					String address=in.nextLine();
					Change_cons_details obj1= new Change_cons_details(id1,name,address);
				}
				break;
		}
		
		
	}
	
}
