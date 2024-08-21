import java.util.Scanner;
public class IT24100881Lab5Q1{
public static void main(String[] args){
Scanner input=new Scanner(System.in);

System.out.println("Enter the first integer: ");
int number1=input.nextInt();

System.out.println("Enter the second number: ");
int number2=input.nextInt();

System.out.println("Enter the third number: ");
int number3=input.nextInt();

System.out.println("User entered numbers are:"+number1+" "+number2+" "+number3);

int smallest=number1;
int largest=number1;

if(number2<smallest){
smallest=number2;
}

if(number3<smallest){
smallest=number3;
}

if(number2>largest){
largest=number2;
}
if(number3>largest){
largest=number3;
}
System.out.println("The smallest number is: "+ smallest);
System.out.println("The largest number is: "+largest);
   }
}