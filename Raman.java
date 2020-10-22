import java.util.Scanner;

public class Raman {


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("how many letters are in your name?");
    int n=sc.nextInt();
    String[] sarray=new String[n];

    for(int i=0;i<n;i++){
        System.out.println("enter the letter "+(i+1)+":");
        sarray[i]=sc.next();
    }
    System.out.print("Strings Entered by user which is his name:");

    for(String s:sarray){
        System.out.print(s);
    }
System.out.println("");
}
}
