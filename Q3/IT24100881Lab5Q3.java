import java.util.Scanner;
public class IT24100881Lab5Q3{
public static void main(String[] args){

//constants
final double ROOM_PER_DAY=48000.0;
final int DISCOUNT_3_4=10;
final int DISCOUNT_5_MORE=20;

Scanner input=new Scanner(System.in);

System.out.println("Enter the start date(1-31): ");
int startDate=input.nextInt();

System.out.println("Enter the end date(1-31): ");
int endDate=input.nextInt();

//validate

if(startDate<1||startDate>31||endDate<1||endDate>31){
System.out.println("Error!Days must be between 1 and 31");
return;
}

if(startDate>=endDate){
System.out.println("Error!Start days must be less than the end days");
return;
}
int daysReserved=endDate-startDate+1;

System.out.println("Room charges per day:"+ROOM_PER_DAY);
System.out.println("Number of the days reserved: "+daysReserved);

double totalAmount;

//calculation with the discount

if( daysReserved>=5)
{
totalAmount=daysReserved*ROOM_PER_DAY*80/100;
}
else if(daysReserved>=3)
{
 totalAmount=daysReserved*ROOM_PER_DAY*90/100;
}
else
{
 totalAmount=daysReserved*ROOM_PER_DAY;
}

System.out.println("Total amount to be paid: "+totalAmount);
  }
}
