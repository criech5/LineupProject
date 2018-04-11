package lineup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lineup extends Sort{
	
	private static ArrayList<Player> catcher = new ArrayList<Player>();
	private static ArrayList<Player> firstbase = new ArrayList<Player>();
	private static ArrayList<Player> secondbase = new ArrayList<Player>();
	private static ArrayList<Player> thirdbase = new ArrayList<Player>();
	private static ArrayList<Player> shortstop = new ArrayList<Player>();
	private static ArrayList<Player> leftfield = new ArrayList<Player>();
	private static ArrayList<Player> centerfield = new ArrayList<Player>();
	private static ArrayList<Player> rightfield = new ArrayList<Player>();
	
	
	static void loadTable(String filename) throws FileNotFoundException {
		if (filename.equals("resources/c.csv")) {
			File inFile = new File(filename);
   		 Scanner scnr = new Scanner(inFile);
   		 scnr.useDelimiter(",");

   		 scnr.nextLine();
   		 
   		 while (scnr.hasNextLine()) {
   			 scnr.next();
   			 catcher.add(new Player(scnr.next(), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), scnr.next(), scnr.next(),Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next()), 
   					 Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next())));
   			 scnr.nextLine();
   		 }
   		 
   		 for (int i = 0; i < catcher.size(); i++) {
   			 if (catcher.get(i).team.equals("TOT")) {
   				 catcher.get(i).team = "multiple teams";
   			 }
   		 }
   		 
   		 scnr.close();
			
    	}
		if (filename.equals("resources/1b.csv")) {
			File inFile = new File(filename);
   		 Scanner scnr = new Scanner(inFile);
   		 scnr.useDelimiter(",");

   		 scnr.nextLine();
   		 
   		 while (scnr.hasNextLine()) {
   			 scnr.next();
   			 firstbase.add(new Player(scnr.next(), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), scnr.next(), scnr.next(),Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next()), 
   					 Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next())));
   			 scnr.nextLine();
   		 }
   		 
   		 for (int i = 0; i < firstbase.size(); i++) {
   			 if (firstbase.get(i).team.equals("TOT")) {
   				 firstbase.get(i).team = "multiple teams";
   			 }
   		 }
   		 
   		 scnr.close();
			
    	}
		
		if (filename.equals("resources/2b.csv")) {
			File inFile = new File(filename);
   		 Scanner scnr = new Scanner(inFile);
   		 scnr.useDelimiter(",");

   		 scnr.nextLine();
   		 
   		 while (scnr.hasNextLine()) {
   			 scnr.next();
   			 secondbase.add(new Player(scnr.next(), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), scnr.next(), scnr.next(),Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next()), 
   					 Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next())));
   			 scnr.nextLine();
   		 }
   		 
   		 for (int i = 0; i < secondbase.size(); i++) {
   			 if (secondbase.get(i).team.equals("TOT")) {
   				 secondbase.get(i).team = "multiple teams";
   			 }
   		 }
   		 
   		 scnr.close();
			
    	}
		
		if (filename.equals("resources/3b.csv")) {
			File inFile = new File(filename);
   		 Scanner scnr = new Scanner(inFile);
   		 scnr.useDelimiter(",");

   		 scnr.nextLine();
   		 
   		 while (scnr.hasNextLine()) {
   			 scnr.next();
   			 thirdbase.add(new Player(scnr.next(), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), scnr.next(), scnr.next(),Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next()), 
   					 Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next())));
   			 scnr.nextLine();
   		 }
   		 
   		 for (int i = 0; i < thirdbase.size(); i++) {
   			 if (thirdbase.get(i).team.equals("TOT")) {
   				 thirdbase.get(i).team = "multiple teams";
   			 }
   		 }
   		 
   		 scnr.close();
			
    	}
		
		if (filename.equals("resources/ss.csv")) {
			File inFile = new File(filename);
   		 Scanner scnr = new Scanner(inFile);
   		 scnr.useDelimiter(",");

   		 scnr.nextLine();
   		 
   		 while (scnr.hasNextLine()) {
   			 scnr.next();
   			 shortstop.add(new Player(scnr.next(), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), scnr.next(), scnr.next(),Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next()), 
   					 Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next())));
   			 scnr.nextLine();
   		 }
   		 
   		 for (int i = 0; i < shortstop.size(); i++) {
   			 if (shortstop.get(i).team.equals("TOT")) {
   				 shortstop.get(i).team = "multiple teams";
   			 }
   		 }
   		 
   		 scnr.close();
			
    	}
		
		if (filename.equals("resources/lf.csv")) {
			File inFile = new File(filename);
   		 Scanner scnr = new Scanner(inFile);
   		 scnr.useDelimiter(",");

   		 scnr.nextLine();
   		 
   		 while (scnr.hasNextLine()) {
   			 scnr.next();
   			 leftfield.add(new Player(scnr.next(), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), scnr.next(), scnr.next(),Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next()), 
   					 Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next())));
   			 scnr.nextLine();
   		 }
   		 
   		 for (int i = 0; i < leftfield.size(); i++) {
   			 if (leftfield.get(i).team.equals("TOT")) {
   				 leftfield.get(i).team = "multiple teams";
   			 }
   		 }
   		 
   		 scnr.close();
			
    	}
		
		if (filename.equals("resources/cf.csv")) {
			File inFile = new File(filename);
   		 Scanner scnr = new Scanner(inFile);
   		 scnr.useDelimiter(",");

   		 scnr.nextLine();
   		 
   		 while (scnr.hasNextLine()) {
   			 scnr.next();
   			 centerfield.add(new Player(scnr.next(), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), scnr.next(), scnr.next(),Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next()), 
   					 Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next())));
   			 scnr.nextLine();
   		 }
   		 
   		 for (int i = 0; i < centerfield.size(); i++) {
   			 if (centerfield.get(i).team.equals("TOT")) {
   				 centerfield.get(i).team = "multiple teams";
   			 }
   		 }
   		 
   		 scnr.close();
			
    	}
		
		if (filename.equals("resources/rf.csv")) {
			File inFile = new File(filename);
   		 Scanner scnr = new Scanner(inFile);
   		 scnr.useDelimiter(",");

   		 scnr.nextLine();
   		 
   		 while (scnr.hasNextLine()) {
   			 scnr.next();
   			 rightfield.add(new Player(scnr.next(), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), scnr.next(), scnr.next(),Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), Integer.parseInt(scnr.next()), 
   					 Integer.parseInt(scnr.next()), Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next()), 
   					 Double.parseDouble(scnr.next()), Double.parseDouble(scnr.next())));
   			 scnr.nextLine();
   		 }
   		 
   		 for (int i = 0; i < rightfield.size(); i++) {
   			 if (rightfield.get(i).team.equals("TOT")) {
   				 rightfield.get(i).team = "multiple teams";
   			 }
   		 }
   		 
   		 scnr.close();
			
    	}
	}
	
//	public static Player choosePlayer(ArrayList<Player> position, int pref) {
//		if (pref == 5) {
//			return sortByHomers(position).get(0);
//		}
//		if (pref == 4) {
//			return sortByHomers(position).get(position.size() / 2);
//		}
//		if (pref == 3) {
//			if (sortByHomers(position).get(position.size() / 2).hr >= 25) {
//				return sortByHomers(position).get(position.size() / 2);
//			}
//			else {
//				return sortBySteals(position).get(position.size() / 2);
//			}
//		}
//		if (pref == 2) {
//			if (sortBySteals(position).get(position.size() / 2).sb >= 25) {
//				return sortBySteals(position).get(position.size() / 2);
//			}
//			else {
//				return sortByHomers(position).get(position.size() / 2);
//			}
//		}
//		if (pref == 1) {
//			return sortBySteals(position).get(position.size() / 2);
//		}
//		if (pref == 0) {
//			return sortBySteals(position).get(0);
//		}
//		else {
//			return null;
//		}
//		
//	}
	
	
	

	
	public static void main (String args[]) throws FileNotFoundException {
		loadTable(args[0]);
		loadTable(args[1]);
		loadTable(args[2]);
		loadTable(args[3]);
		loadTable(args[4]);
		loadTable(args[5]);
		loadTable(args[6]);
		loadTable(args[7]);
		
		Sort lineup = new Sort();
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("On a scale from 0 - 5, how important is power?");
		int pref1 = Integer.parseInt(scnr.next());
		
		System.out.println("On a scale from 0 - 5, how important is overall hitting and on-base ability?");
		int pref2 = Integer.parseInt(scnr.next());
		
		System.out.println("On a scale from 0 - 5, how important is speed?");
		int pref3 = Integer.parseInt(scnr.next());
		
		System.out.println("On a scale from 0 - 5, how important is plate discipline?");
		int pref4 = Integer.parseInt(scnr.next());
		
		System.out.println("C: "+ lineup.choosePlayer(catcher, pref1, pref2, pref3, pref4).name + ".");
		System.out.println("1B: "+ lineup.choosePlayer(firstbase, pref1, pref2, pref3, pref4).name + ".");
		System.out.println("2B: "+ lineup.choosePlayer(secondbase, pref1, pref2, pref3, pref4).name + ".");
		System.out.println("3B: "+ lineup.choosePlayer(thirdbase, pref1, pref2, pref3, pref4).name + ".");
		System.out.println("SS: "+ lineup.choosePlayer(shortstop, pref1, pref2, pref3, pref4).name + ".");
		System.out.println("LF: "+ lineup.choosePlayer(leftfield, pref1, pref2, pref3, pref4).name + ".");
		System.out.println("CF: "+ lineup.choosePlayer(centerfield, pref1, pref2, pref3, pref4).name + ".");
		System.out.println("RF: "+ lineup.choosePlayer(rightfield, pref1, pref2, pref3, pref4).name + ".");
		
//		for (int i = 0; i < catcher.size(); i++) {
//			System.out.print(sortByAge(catcher).get(i).name + ", ");
//		}
//		System.out.println();
//		for (int i = 0; i < players.size(); i++) {
//			System.out.print(sortByAverage(players).get(i).name + ", ");
//		}
//		System.out.println(players.get(7).toStringAll());
//		System.out.println(players.get(19).name);
//		System.out.println(players.get(19).slashLine());

	}

}
