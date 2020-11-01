import java.util.*;

public class Main{
    public static void main(String[]args){
        int a=1;
        System.out.println("Please enter the password to continue");
        Scanner passwordSC=new Scanner(System.in);
        String passwordST=passwordSC.next();
        if(passwordST.equals("512328")){
            do {
                System.out.println("Which generation of projects do you want to access (currently 1-2)");
                Scanner gen=new Scanner(System.in);
                String genS=gen.next();
                if(genS.equals("1")){
                   System.out.println("No gen1 projects have been uploaded"); 
                }
                else if(genS.equals("2")){
                    System.out.println("The current projects that are in generation 2 are:");
                    System.out.println("1. Calculator");
                    System.out.println("2. Gambling");
                    System.out.println("Which project do you wish to run?");
                    Scanner choice2=new Scanner(System.in);
                    String choice2S=choice2.next();
                    if (choice2S.equals("Calculator")){
                        int b = 1;
                        do
                          {
                            Scanner one = new Scanner (System.in);
                            double oneD = one.nextInt ();
                            Scanner three = new Scanner (System.in);
                            String threeS = three.next ();
                            Scanner two = new Scanner (System.in);
                            double twoD = two.nextInt ();
                            if (threeS.equals ("+"))
                              {
                                System.out.println (oneD + twoD);
                                break;
                              }
                            else if (threeS.equals ("-"))
                              {
                                System.out.println (oneD - twoD);
                                break;
                              }
                            else if (threeS.equals ("/"))
                              {
                                System.out.println (oneD / twoD);
                                break;
                              }
                            else if (threeS.equals ("x"))
                              {
                                System.out.println (oneD * twoD);
                                break;
                              }
                            else
                              {
                                System.out.println ("not a valid input.");
                                b = 0;
                              }
                          }
                        while (b == 0);
                    }
                    else if(choice2S.equals("Gambling")){
                        System.out.println("Gambling not yet been uploaded");
                    } else {
                        System.out.println("Not a valid input");
                    }
                }
            } while(a==1);
        }
    }
}
