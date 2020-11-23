package Packages;

public class Change_cons_details extends Consumer
{
	Consumer consumer_data;
	public Change_cons_details(int id, String name )	
	{
		super();
		index=id-1;
		cons_name[index]=name;	
		display_cons(index);
	}
	public Change_cons_details(int id, String name, String address )
	{
		super();
		index=id-1;
		if (cons_name[index].equals(name))
		{
			cons_add[index]=address;
			display_cons(index);
		}		
		else{
			System.out.println("Name and ID don't match");
		}
	}
}