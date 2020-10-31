import java.util.Scanner;
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		int enemyH=40;
		int playerH=40;
		
		System.out.println("In your travels, you encounter a strange enemy. he is clothed in all black, save for two specks of white where his eyes would be.");
		System.out.println("As you and the man stare at each other, he suddenly attacks!");
		System.out.println("You have a few plans of attack. you can:");
		System.out.println("1. do a basic slash    3. do a jump slash");
		System.out.println("2. shoot a fireball    4. do a spin attack");
		do{
		    Scanner B1=new Scanner(System.in);
		    String B1I=B1.next();
		    if (B1I.equals("1")){
		        Random enemy1 = new Random();
                        int enemy1I = enemy1.nextInt(4);
		        if (enemy1I==0){
                            Random enemy2A = new Random();
                            int enemy2AI=enemy2A.nextInt(2);
                            if(enemy2AI == 0){
                               playerH=playerH-5;
                                enemyH=enemyH-10;
                                System.out.println("");
                                System.out.println("enemy health: " + enemyH);
		        	System.out.println("your health: " + playerH); 
                            }
                            else if(enemy2AI == 1){
                                System.out.println("");     
                                System.out.println("enemy health: " + enemyH);
		        	System.out.println("your health: " + playerH);
                            }
                        }
		    
		        else if(enemy1I==1){
                            Random enemy1B=new Random();
                            int enemy1BI=enemy1B.nextInt(2);
                            if(enemy1BI==0){
                            playerH=playerH-20;
		            System.out.println("");
		            System.out.println("enemy health: " + enemyH);
		            System.out.println("your health: " + playerH);
                            }
                            else if(enemy1BI==1){
                                enemyH=enemyH-20;
                                playerH=playerH-5;
                                System.out.println("");
                            }
		        }
		        else if(enemy1I==2){
                                Random enemy1C=new Random();
                                int enemy1CI=enemy1C.nextInt(2);
                                if (enemy1CI == 0){
		        	enemyH=enemyH-30;
		        	System.out.println("");
		        	System.out.println("enemy health: " + enemyH);
		        	System.out.println("your health: " + playerH);
                                }
                                else if (enemy1CI == 1){
                                    playerH=playerH-30;
                                    enemyH=enemyH-30;
                                    System.out.println("");
                                }
		        }
		        else if(enemy1I==3) {
		        	playerH=0;
		        	System.out.println("");
		        	System.out.println("enemy health: " + enemyH);
		        	System.out.println("your health: " + playerH); 
		        }
		    }
		    else if (B1I.equals("2")){
                        Random enemy2=new Random();
                        int enemy2I=enemy2.nextInt(4);
		        enemyH = enemyH - 40;
		        playerH = playerH - 10;
		        System.out.println("");
		    }
		    else if (B1I.equals("3")){
		        playerH = playerH - 20;
		        System.out.println("");
		    }
		    else if (B1I.equals("4")){
		        enemyH = 0;
		        System.out.println("");
		        playerH=0;
		    }
                    else if (B1I.equals("5")){
                        break;
                    }
                    else if (B1I.equals("6")){
                        playerH=0;
                    }
                    else if (B1I.equals("7")){
                        enemyH=0;
                    }
                    else{
                        System.out.println("Not a valid input.");
                    }
		    if (playerH<=0){
		        System.out.println("You died.");
		        break;
		    }
		    else if (enemyH<=0){
		        System.out.println("You have defeated the enemy. you are victorious!");
                        System.out.println("\\        /\\        /"); 
                        System.out.println(" \\      /  \\      /");
                        System.out.println("  \\    /    \\    /");
                        System.out.println("   \\  /      \\  /");
                        System.out.println("    \\/        \\/");
		        break;
		    }
	}while(playerH>0 || enemyH>0);            
  }
}
