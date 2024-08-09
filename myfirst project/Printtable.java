import java.util.Scanner;

class Printtable
{
    public static void main(String[] args)
    {
      
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter number: ");
    int num = sc.nextInt();
    System.out.print("Enter Range: ");
    int range = sc.nextInt();
    int i = 1; 
while (i <= range) {
    System.out.println(num + " X " + i + " = " + num * i );
    i++;
}


    }
}