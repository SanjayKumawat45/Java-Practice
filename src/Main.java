import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int age = 20;
//        int year = 2025;
//        int month = 6;
//
//        System.out.println("Age: "+age+" Year: "+year+" Month: "+month);
//
//        double price = 200.5;
//        double gpa = 9;
//
//        char grade = 'A';

        Boolean isStudent = true;
//
//
//        System.out.println("GPA: "+gpa+" isStudent: "+isStudent);


//        if(isStudent){
//            System.out.println("You are a student");
//        }
//        else{
//            System.out.println("You are not a student");
//        }
//
//        String name = "Sanjay";
//
//        System.out.println("Hello " + name);


        Scanner input = new Scanner(System.in);

//        System.out.print("Enter Your Name: ");
//        String name =  input.nextLine();
//
//        System.out.print("Enter Your Age: ");
//        int age = input.nextInt();
//
//        System.out.println("Hello "+name+"!");
//        System.out.println("You are "+ age+" years old.");

// cart

//        String Item;
//        int quantity;
//        double price;
//        double total;
//
//
//        System.out.print("Enter Item Name: ");
//        Item = input.nextLine();
//
//        System.out.print("Enter Quantity: ");
//        quantity = input.nextInt();
//
//        System.out.print("Enter Price: ");
//        price = input.nextDouble();
//
//        total = price * quantity;
//
//        System.out.println("Total bill\n");
//        System.out.println("Item: " +Item+ "\nQuantity: "+quantity+"\nTotal Price: " + total);


// rock paper scissor game

        Random random = new Random();

        int number = random.nextInt(1,3);

        System.out.println(number);

        System.out.println("Enter one Rock, Paper and Scissor: ");
        String userInput = input.nextLine();
        String computerInput = "?";


        if(number == 1){
            computerInput = "rock";
        } else if (number == 2) {
            computerInput = "paper";
        }
        else if (number == 3) {
            computerInput = "scissor";
        }


        System.out.println("Battle!");
        System.out.println("Your choice vs Computer's choice");
        System.out.println(userInput+" vs "+ computerInput);




        if (Objects.equals(userInput, "Rock") || Objects.equals(userInput, "rock")){
            if (number == 1){
                System.out.println("its a draw!");

            }
            else if (number == 2){
                System.out.println("Computer won the game!");
            }
            else {System.out.println("You won the game!");}
        } else if (Objects.equals(userInput, "Paper") || Objects.equals(userInput, "paper")){

            if (number == 2){
                System.out.println("its a draw!");
                return;
            }
            else if (number == 3){
                System.out.println("Computer won the game!");
                return;
            }
            else {System.out.println("You won the game!");
            return;}

        } else{

            if (number == 3){
                System.out.println("its a draw!");
            }
            else if (number == 1){
                System.out.println("Computer won the game!");
            }
            else {System.out.println("You won the game!");}

        }



        input.close();

    }

}