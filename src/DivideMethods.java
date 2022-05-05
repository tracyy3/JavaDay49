import java.util.Scanner;

public class DivideMethods {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number:");
        int number2 = Integer.valueOf(scanner.nextLine());

        double number3 = divide( number1, number2);

        System.out.println(number1+ " / " + number2 + " = " + number3);
}

    public static double divide (double firstnumber,  double secondnumber) {
    return (firstnumber / secondnumber);
    }
}



class MethodReturnTypes {
    public static void  main (String[] args){
    
        String s = methodString();
        System.out.println(s);

        int number = methodInt();
        System.out.println(number);

        int num1 =13;
        if(trueOrFalse(num1) == true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static String methodString() {
        return "String of text";
}

    public static int methodInt(){
        int num = 5;
            return num;
}

    public static boolean trueOrFalse(int num1){
        return (num1 % 2 == 0 );
    }
}



class AverageMethod{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number!");
        int number1 = scan.nextInt();

        System.out.println("Enter second number!");
        int number2 = scan.nextInt();
        
        System.out.println("Enter third number!");
        int number3 = scan.nextInt();

        System.out.println("The average is: " + averageofNums(number1, number2, number3));
}

    public static int sumNum( int number1, int number2, int number3){
        int sum = number1 + number2 + number3;
        return sum; 
}

    public static double averageofNums(int number1, int number2, int number3){
        double average =(int)sumNum(number1, number2, number3)/ 3.0;
        return average; 
    }
}