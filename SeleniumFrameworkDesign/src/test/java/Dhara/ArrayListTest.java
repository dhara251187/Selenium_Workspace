package Dhara;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> tools= new ArrayList<String>();
		tools.add("Selenium");
		tools.add("TestLink");
		tools.add("TestRail");
		tools.add("Zephyr");
		
		System.out.println(tools.size());
		
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		
		System.out.println("---------");
		
		tools.remove(2);
		System.out.println(tools.size());
		System.out.println(tools.get(2));
		
		System.out.println("---------------");
		tools.add("BugZilla");
		System.out.println(tools.size());
		
		System.out.println("-----------------");
		
		//for loop
		for(int i=0; i<tools.size(); i++)
		{
			System.out.println(tools.get(i));
		}
	}
	

}
