package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf();
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		dwarfs.add(sleepy);
		
		Dwarf happy = new Dwarf();
		happy.setName("happy");
		happy.setAuthor("Disney");
		dwarfs.add(happy);
		
		Dwarf grumpy = new Dwarf();
		grumpy.setName("grumpy");
		grumpy.setAuthor("Disney");
		dwarfs.add(grumpy);
		
		Dwarf doc = new Dwarf();
		doc.setName("doc");
		doc.setAuthor("Disney");
		dwarfs.add(doc);
		
		///////////////////////////////////////////
		
		Dwarf thorin = new Dwarf();
		thorin.setName("Thorin");
		thorin.setAuthor("Tolkien");
		dwarfs.add(thorin);
		
		Dwarf balin = new Dwarf();
		balin.setName("balin");
		balin.setAuthor("Tolkien");
		dwarfs.add(balin);
		
		Dwarf dwalin = new Dwarf();
		balin.setName("dwalin");
		balin.setAuthor("Tolkien");
		dwarfs.add(dwalin);
		
		System.out.println("The dwarfs are: ");
		
		for(Dwarf dwarf:dwarfs)
		{
			System.out.println(dwarf.getName() + "	" + dwarf.getAuthor());
		}
		
		System.out.println("\nThe Disney Dwarfs are: ");
		for(Dwarf dwarf:dwarfs)
		{
			if (dwarf.getAuthor() == "Disney") 
			{
				System.out.println(dwarf.getName());
			}
		}
		
		System.out.println("\nThe Tolkien Dwarfs are: ");
		for(Dwarf dwarf:dwarfs)
		{
			if (dwarf.getAuthor() == "Tolkien") 
			{
				System.out.println(dwarf.getName());
			}
		}
		

	}

}
