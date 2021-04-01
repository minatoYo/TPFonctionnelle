package formation.fonctionnelle;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		int nbr=r.nextInt(9);
		int saisi =0;
		
		int  i=0;
		
		do 
		{
			//System.out.println(nbr1+"\n"+nbr2+"\n"+nbr3);
			System.out.println("veuillez saisir un nombre ");
			saisi = input.nextInt();
			if(saisi>nbr)
				System.out.println("trop grand");
			else if (saisi<nbr)
				System.out.println("trop peti");
			else
				System.out.println("gagné");
			
			i++;
		}while(saisi !=nbr );
		
		System.out.println("le nombre d'essaie est de "+i);


	}

}
