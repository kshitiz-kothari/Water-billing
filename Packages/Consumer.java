package Packages;

public class Consumer implements c
{
		public static int[] cons_id={1,2,3,4,5,6,7,8,9,10};
		public static String[] cons_name= new String[]{"William","James","Noah","Trever","John","Chandler","Richard","Logan","Katy","Lauren"};
		public static String[] cons_add=new String[]{"Goa", "Delhi", "UP", "Tamil Nadu", "Rajasthan", "Gujarat", "Maharastra", "UK", "Karnataka", "Punjab"};
		public static String[] conn_type=new String[]{"DM","ND","IND","ND","ND","IND","DM","ND","IND","DM"};
		public static int[] consumption={15000,20000,14000,13000,50000,24000,22000,8000,23000,40000};
		int index;
		public Consumer(){}
		public Consumer(int id)
		{
			index=id-1;
		}
		public void get_cons_info()
		{
			
		}
		public void display_cons() 		//Function Overloading
		{
			//get_cons_info();
      		System.out.println("User id : " + this.cons_id[index]);
      		System.out.println("Name : " + this.cons_name[index]);
      		System.out.println("Address : " + this.cons_add[index]);
		}
		public void display_cons(int index) 
		{
		    //get_cons_info();
			System.out.println("User id : " + this.cons_id[index]);
			System.out.println("Name : " + this.cons_name[index]);
			System.out.println("Address : " + this.cons_add[index]);
		}
		
}