package viergewinnt;

import java.util.Scanner;

public class haupt2 {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Name1;
		String Name2;
		String Befehl;
		
		int[][] zahlen = {	{0,0,0,0,0,0,0}, 
			{0,0,0,0,0,0,0}, 
			{0,0,0,0,0,0,0}, 
			{0,0,0,0,0,0,0}, 
			{0,0,0,0,0,0,0}, 
			{0,0,0,0,0,0,0}};
		
		System.out.println("Name Spieler 1 eingeben: ");
		Name1 = scan.nextLine();
		System.out.println("Hallo " +Name1);
		System.out.println("Name Spieler 2 eingeben: ");
		Name2 = scan.nextLine();
		System.out.println("Hallo " +Name2);
		System.out.println("Um das Spiel zu starten, einfach 'Start' eingeben. ");
		Befehl = scan.nextLine();
		if(Befehl.equals("start"))
		{
			System.out.println("go");
			
			for(int y = 0; y < 6; y++) 
			{
				System.out.print("|");
				for(int x = 0; x < 7; x++)
				{
				System.out.print(zahlen[y][x] +"|");
				}
				System.out.println("");

			}
							game();
		}
		else
		{
			System.out.println("no");
		}


		
	}
	
	public static void game()
	{
		Scanner scan2 = new Scanner(System.in);
		int spieler = 1;
		int spalte;

		while(true)
		{
			if(spieler == 1)
			{
				System.out.println("Bitte Spalte (1-7) wählen: ");
				spalte = scan2.nextInt();
				spalte--;
				
				zug(spalte, 1);
				
				spieler = 0;
			}
			
			if(spieler == 0)
			{
				System.out.println("Bitte Spalte (1-7) wählen: ");
				spalte = scan2.nextInt();
				spalte--;
				
				zug(spalte, 2);
				
				spieler = 1;
				
			}
				
		}
	}
	static int[][] zahlen2 = {	{0,0,0,0,0,0,0}, 
				{0,0,0,0,0,0,0}, 
				{0,0,0,0,0,0,0}, 
				{0,0,0,0,0,0,0}, 
				{0,0,0,0,0,0,0}, 
				{0,0,0,0,0,0,0}};
	
	
	public static void zug(int spalte, int spieler)
	{
		int x = -1;
		boolean end = false;
		
		
		
		
		while(x<5 && !end)						// Der Fehler muss irgendwo hier liegen
		{			x++;
			if(zahlen2[x][spalte] == 0 && x==5)
			{
				end = true;
			}
			

			
			if(zahlen2[x][spalte] != 0 && x==5)
			{
				x--;
				end = true;
			}

			if(zahlen2[x][spalte] != 0 && x != 5)
				end = true;	
		
		}
		

		
	
			zahlen2[x][spalte] = spieler;	

		

		
		
		for(int y = 0; y < 6; y++) 
		{
			System.out.print("|");
			for(int u = 0; u < 7; u++)
			{
			System.out.print(zahlen2[y][u] +"|");
			}
			System.out.println("");
		}
	}
}
