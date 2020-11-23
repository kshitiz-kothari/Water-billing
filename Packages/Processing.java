package Packages;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.io.File;


public class Processing extends Waterbill_processing implements Runnable{
	static String location = new String();
	static StringBuffer month = new StringBuffer();
        
        static String[] month_list={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        public void run()
        {
            try{
                Consumer obj=new Consumer();
                System.out.println("Name\t\t\tAmount\t Connection Type");
                for (int index=0;index<obj.cons_id.length;index++)
                {
                    if (obj.conn_type[index].equals("DM")){
                            System.out.println(obj.cons_name[index]+"\t\t\t"+dm(obj.consumption[index])+"\t\tDM");
                    }
                    else if (obj.conn_type[index].equals("ND")){
                            System.out.println(obj.cons_name[index]+"\t\t\t"+nd(obj.consumption[index])+"\t\tND");
                    }
                    else if (obj.conn_type[index].equals("IND")){
                            System.out.println(obj.cons_name[index]+"\t\t\t"+ind(obj.consumption[index])+"\t\tIND");
                    }
                }
                }
                catch(Exception e){
                System.out.println(e);
                System.out.println("Exception ia caught");
                }
        }
        
	public static void confirm_print_loc(String loc)
	{		
		location=loc;
		System.out.println("Location to be printed "+location);
	}
	public static boolean confirm_month()
	{
		Scanner in=new Scanner(System.in);
                month.replace(0,month.length(),"");
		System.out.println("Enter the month to be printed : ");
		month.append(in.nextLine());
		month.reverse();
		month.reverse();
                try
                { 
                    if(!Arrays.asList(month_list).contains(month.toString())){
                    
                        throw new WaterbillingException("Wrong month entered"); 
                    }
                    else{
                        System.out.println("Bill for "+month);
                        return true;
                    }
                } 
                catch (WaterbillingException ex) 
                { 
                    
                    System.out.println(ex.getMessage());
                    return false;
                }
		
		
	}

	final public double dm(int consumption){
		return consumption*0.25;
	}
	final public double nd(int consumption){
		return consumption*0.30;
	}
	final public double ind(int consumption){
		return consumption*0.50;
	}
}