import java.util.Scanner;

public class IfElse
{
  public static void main(String []args)
    {
    
         Scanner sc=new Scanner(System.in);
         System.out.println("Unesite broj: ");
         int num=sc.nextInt();
        if( num < 1000 )
        {
            System.out.println("Uneseni broj je manji od 1000.");
            if(num > 500)
            {
              System.out.println("Uneseni broj je veci od 500.");
            }
        }
        else
        {
            System.out.println("Uneseni broj je veci od 1000.");
        }
    }
}
