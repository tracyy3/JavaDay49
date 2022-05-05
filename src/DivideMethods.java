import java.util.Scanner;

public class DivideMethods {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        double num3 = divide( num1, num2);

        System.out.println(num1+ " / " + num2 + " = " + num3);
    }

    public static double divide (double firstnum,  double secondnum) {
    return (firstnum / secondnum);
    }
}



class MethodReturnTypes {
    public static void  main (String[] args){
    
        String s = methodString();
        System.out.println(s);

        int number = methodInt();
        System.out.println(number);

        int num1 =13;
        if(trueOrFalse(num1)==true){
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

        System.out.println("Enter first number");
        int num1 = scan.nextInt();

        System.out.println("Enter second number");
        int num2 = scan.nextInt();
        
        System.out.println("Enter third number");
        int num3 = scan.nextInt();

        System.out.println("The average is: " + averageofNums(num1, num2, num3));

    }
    public static int sumNum( int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        return sum; 
    }
    public static double averageofNums(int num1, int num2, int num3){
        double average =(int)sumNum(num1, num2, num3)/ 3.0;
        return average; 
    }
}