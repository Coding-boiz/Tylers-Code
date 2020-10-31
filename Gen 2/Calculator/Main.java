import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    int n = 1;
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
	    n = 0;
	  }
      }
    while (n == 0);
  }
}
