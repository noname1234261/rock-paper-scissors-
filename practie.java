package practie ;
import java.util.Scanner;
import java.util.Random;
 public class practie {
	 public static void main(String[]args) {
		 char[] Choices= {'R','S','P'};
		 int player1hearts = 3;
		 int player2hearts =3;
		Displaygame();
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int choice = scanner.nextInt();
		
		while (choice < 0 || choice> 2 ) {
			System.out.println("incorrect number");
			choice = scanner.nextInt();
		}
		
		if(choice ==1 ) {
			Rules();
			while(player1hearts >0 && player2hearts>0) {
			int randomchoice = random.nextInt(3);
			char computerchoice = Choices[randomchoice];
			String userChoice = scanner.next();
			String user = userChoice.toUpperCase();
			char upperletter = user.charAt(0);
			//player vs computer
			 if (upperletter == computerchoice) {
	                System.out.println("It's a draw!");
	            } else if( (upperletter == 'R' && computerchoice == 'S') ||
             (upperletter == 'P' && computerchoice == 'R') ||
             (upperletter == 'S' && computerchoice == 'P')) {
	                System.out.println("You wins!");
	                System.out.println("this is the computer choice :"+computerchoice);
	                player1hearts -=1;
	                System.out.println("computer's hearts :"+player1hearts);
	            } else {
	                System.out.println("Computer win!");
	                System.out.println("this is the computer choice :"+computerchoice);
	               player2hearts -= 1 ;
	               System.out.println("your heart :"+player2hearts);
	            }
			}
			if (player1hearts == 0) {
				System.out.println("you are the winner !!!");
			}else {
				System.out.println("you lost ");
			}
			// player vs player
		}else {
		Rules();
		while(player1hearts >0 && player2hearts>0) {
		int randomchoice = random.nextInt(3);
		System.out.println("");
		System.out.println("you are player 2");
		System.out.println("enter your choice");
		String player2 = scanner.next();
		String player2upper = player2.toUpperCase();
		char playerchoice = player2upper.charAt(0);
		
		System.out.println("you are player 1");
		System.out.println("enter your choice");
		String player1 = scanner.next();
		String user1 = player1.toUpperCase();
		char upperletter = user1.charAt(0);
		
		 if (upperletter == playerchoice) {
                System.out.println("It's a draw!");
            } else if( (upperletter == 'R' && playerchoice == 'S') ||
         (upperletter == 'S' && playerchoice == 'R') ||
         (upperletter == 'R' && playerchoice == 'P')) {
                System.out.println("Player 2 wins!");
                System.out.println("this is the player 1 choice :"+player1);
                player1hearts -=1;
                System.out.println("player 1 hearts :"+player1hearts);
            } else {
                System.out.println("Player 1 win!");
                System.out.println("this is the player 2 choice :"+player2);
               player2hearts -= 1 ;
               System.out.println("player 2 heart :"+player2hearts);
            }
		}
		if (player1hearts == 0) {
			System.out.println("Player 2 is the winner !!!");
		}
		if(player2hearts ==0 ) {
			System.out.println("Player 1 is the winner!!");
			
		}
		}
		 
		 
		 
		 
		 
	 } 
	 public static void Displaygame() {
		 System.out.println("Rock Paper Scissors game ");
		 System.out.println("choose wheter to play against a computer or a player ");
		 System.out.println("to play with a computer press 1");
		 System.out.println("to play against a player press 2");
		 
	 }
	 public static void Rules() {
		 System.out.println("rock paper scissor rules ");
		 System.out.println("use R for rock");
		 System.out.println("use P for paper");
		 System.out.println("use S for scissors ");
		 System.out.println("you have 3 hearts");
		 System.out.println("you lose when you have lost all of your hearts ");
		 System.out.println("you win when you succeed in depleting your opponents hearts");
		 
		 
	 }
}

 