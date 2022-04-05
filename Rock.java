package Lab2;

//****************************************************************
//Rock.java
//
//Play Rock, Paper, Scissors with the user
//     
//****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Rock
{
public static void main(String[] args)
{
String personPlay;    //User's play -- "R", "P", or "S"
String computerPlay = null;  //Computer's play -- "R", "P", or "S"
int computerInt;      //Randomly generated number used to determine
                     //computer's play

Scanner scan = new Scanner(System.in);
Random generator = new Random();

//Get player's play -- note that this is stored as a string
//Make player's play uppercase for ease of comparison
//Generate computer's play (0,1,2)
//Translate computer's randomly generated play to string
System.out.println("Enter you choise (R,S,P): ");
personPlay = scan.next();

computerInt = generator.nextInt(1,4);
switch (computerInt) //or use a set of ifs
{
case 1:
	computerPlay = "R";
	break;
case 2:
	computerPlay = "S";
	break;
case 3:
	computerPlay = "P";
	break;
default:
	System.out.println("Computer failed to respond");
	break;
}
System.out.println("Computer Choose: "+computerPlay);

//Print computer's play
//See who won.  Use nested ifs instead of &&.
if (personPlay.equals(computerPlay))  
   System.out.println("It's a tie!");
else if (personPlay.equals("R"))
   if (computerPlay.equals("S"))
	   System.out.println("Rock crushes scissors.  You win!!");
   else {
	   System.out.println("Paper covers the Rock. You loose!!");
   }
else if(personPlay.equals("S")) {
	if(computerPlay.equals("P")) {
		System.out.println("Sissor cut Paper. You win!!.");
	}
	else {
		System.out.println("Rock crushes scissors. You Loose!!");
	}
}
else if(personPlay.equals("P")) {
	if(computerPlay.equals("S")) {
		System.out.println("Sissor cuts Paper. You loose!!");
	}
	else {
		System.out.println("Paper covers Rock. YOu win!!");
	}
}
}
}
