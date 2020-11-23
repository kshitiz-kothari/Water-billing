
import java.io.*;
import java.util.*;
import java.lang.*;
import java.io.File;
import java.util.concurrent.TimeUnit;

import Packages.*;


public class main extends Processing
{
	
	static{
			System.out.println("-------Starting Water Billing Program---------");
	}
	
	static class StaticClass {
      StaticClass() {
			System.out.println("This is from static class");
     }
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		/*System.out.println("Enter the source file name : ");
		String file_name = in.nextLine();
		File input_file = new File (file_name);*/
		main.StaticClass nes = new main.StaticClass();
		int rates[];
		int meter_rent=40;
		int[] fixed_charges={50,100,200};
		int[] min={100,200,300};
		//String[] conn_type={"DM","ND","IND"};
		while(true){
			System.out.println("\nTo process single  bill enter 1");
                        System.out.println("To process all bill enter 2");
			System.out.println("To display consumer information enter 3");
			System.out.println("To change consumer information enter 4");
			System.out.println("To exit enter 5");
			int choice= in.nextInt();
			switch(choice)
			{
				case 1:
                                        try{
                                                confirm_print_loc(args[0]);
                                        }
                                        catch(ArrayIndexOutOfBoundsException e){
                                                System.out.println("You have not put the command line argument");
                                                break;
                                        }
                                        if(!confirm_month())
                                        break;
                                        System.out.println("Enter id of customer ");
					int id=in.nextInt();
					int index=id-1;
					Processing p=new Processing();
					Consumer obj=new Consumer();
					if (obj.conn_type[index].equals("DM")){
						System.out.println("The amount is "+p.dm(obj.consumption[index])+" and the connection type is DM");
					}
					else if (obj.conn_type[index].equals("ND")){
						System.out.println("The amount is "+p.nd(obj.consumption[index])+" and the connection type is ND");
					}
					else if (obj.conn_type[index].equals("IND")){
						System.out.println("The amount is "+p.ind(obj.consumption[index])+" and the connection type is IND");
					}
					break;
                                        
                                case 2:
                                        Thread p_all=new Thread(new Processing());
                                        p_all.start();
                                        try
                                        {
                                            Thread.sleep(500);
                                        }
                                        catch(InterruptedException ex)
                                        {
                                            Thread.currentThread().interrupt();
                                        }
                                        break;
				case 3:
					System.out.println("Enter the consumer id : ");
					int id2=in.nextInt();
					Consumer c=new Consumer(id2);
					c.display_cons();
					break;
				case 4:
					System.out.println("To change name press 1");
					System.out.println("To change address press 2");
					int choice_2=in.nextInt();
					
					System.out.println("Enter the consumer id : ");
					int id1=in.nextInt();
					String temp=in.nextLine();
					String name,address;
					
					
					if (choice_2==1)
					{
						System.out.println("Enter new name : ");
						name=in.nextLine();
						Change_cons_details obj1= new Change_cons_details(id1,name);
					}
					else if (choice_2==2)
					{
						System.out.println("Enter name : ");
						name=in.nextLine();
						System.out.println("Enter new address : ");
						address=in.nextLine();
						Change_cons_details obj1= new Change_cons_details(id1,name,address);
					}
					break;
					
				default :
						System.exit(0);
			}
		}
		
	}
	
	
}
