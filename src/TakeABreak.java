import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("Do you want to take a break?");
            String input = scanner.nextLine();

        if (input.equals("yes")) {
        break;}
        }
    }
}


class StopAtFive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
        System.out.println("Give a number:");
        int userInput = Integer.valueOf(scanner.nextLine());
        
        if (userInput == 5) {
        System.out.println("Process finished with exit code 0");
        break;} 
        else {
        continue;
            }
        }
    }
}


class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
        System.out.println("Enter a number: ");

        int number = scanner.nextInt();

        if (number == 0) {
        System.out.println("Process finished with exit code 0!");
        break;}
        if (number < 0) {
        
        System.out.println("Number must be positive!");}
        }
    }
}


class CountToEleven {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){

    System.out.println("Enter number less than 11");
        int num =  Integer.valueOf(scanner.nextLine());
        if (num <= 11){
        for (int i = num; i <= 11; i++)

    System.out.println(i);
            }
        }
    }
}



class Multiplication {
    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);
        
    System.out.println("Input a number:");
    int num =  Integer.valueOf(scanner.nextLine());

    for (int i = 1; i <= 10; i++){
    System.out.println(num + " X " + i + " = " + num * i); 
        }
    }
}