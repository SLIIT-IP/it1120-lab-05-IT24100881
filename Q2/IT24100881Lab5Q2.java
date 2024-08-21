import java.util.Scanner;
public class IT24100881Lab5Q2{
public static void main(String[] args){
Scanner input=new Scanner(System.in);

System.out.println("Enter the number of new members introduced: ");
int members=input.nextInt();
String prize;

	//validate the entered number

	if(members<0){
System.out.println("input must be a number between 0 or greater");
prize="No prize";
}
else{

	switch(members){

case 0:
prize= "No prize";
break;

	case 1:
	prize= "pen";
	break;

	case 2:
	prize= "Umbrella";
	break;

	case 3:
	prize= "Bag";
	break;

	case 4:
	prize= "Travelling chair";
	break;

	default:
	prize= "Headphone";
	break;

  }
}
System.out.println("prize is: "+prize);
  }
}

