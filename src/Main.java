import java.util.Scanner;

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

        System.out.print("Enter Your Name: ");
        String name =  input.nextLine();

        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        System.out.println("Hello "+name+"!");
        System.out.println("You are "+ age+" years old.");

    }

}