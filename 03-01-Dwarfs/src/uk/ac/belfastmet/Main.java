package uk.ac.belfastmet;

import java.util.ArrayList;
import java.util.Iterator;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("What's happnin");
		
		ArrayList<String> dwarfs = new ArrayList<String>();
			dwarfs.add("Happy"   );
			dwarfs.add("Sleepy"  );
			dwarfs.add("Dopey"   );
			dwarfs.add("Bashful" );
			dwarfs.add("Sneezy"  );
			dwarfs.add("Grumpy"  );
			dwarfs.add("Doc"     );
		
		System.out.println("The Seven Dwarfs are: ");
		
		for (String dwarf: dwarfs) 
		{
			System.out.println(dwarf);
		}
		
		ArrayList<String> dwarves = new ArrayList<String>();
			dwarves.add("Thorin" );
			dwarves.add("Balin"  );
			dwarves.add("Dwalin" );
			dwarves.add("Fili"   );
			dwarves.add("Kili"   );
			dwarves.add("Dori"   );
			dwarves.add("Nori"   );
			dwarves.add("Oin"    );
			dwarves.add("Ori"    );
			dwarves.add("Gloin"  );
			dwarves.add("Bifur"  );
			dwarves.add("Bofur"  );
			dwarves.add("Bombur" );
		
		System.out.println("\nThe Dwarves in the company of Thorin are: ");
		
		for (String dwarf: dwarves) 
		{
			System.out.println(dwarf);
		}
		
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
	}

}
