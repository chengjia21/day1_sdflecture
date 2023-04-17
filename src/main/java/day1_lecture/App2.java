package day1_lecture;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Console con = System.console();
        String name = con.readLine("What is your name?\n");
        // String name = con.readLine(fmt: "What is your name?");

        if (name.length() > 0) {
            System.out.printf("Hello %s.", name);
            System.out.printf("\nNice to meet you, %s. ", name);
        } else {
            System.err.println("You have not told me your name.");
        }
    
        String input = con.readLine("What is your hobby? \n");
        input = input.trim();
        if (input.equals("swim")){           
                System.out.println("Swimmy yay");
        }  
            else if (input.equals("jog")){
                System.out.println("Joggy yay");

            }
            else if (input.equals("cycle")){
                System.out.println("Cycley yay");
                

            }
            else {
                System.out.println("boring! ");
            }
        


        // Switch statement
        switch(input) {
            case "swim":
                System.out.println("The nearest swimming pool is Clementi. ");
            break;

            case "jog":
            System.out.println("The nearest park is West Coast Park. ");
            break;

            case "cycle":
            System.out.println("You could cycle along the PCN. ");
            break;

            default:
            System.out.println("Sounds like you are a boring person without a hobby. ");
            break;

        }

        Integer myAge = 0;
        String inputAge = con.readLine("What is your age?");

        myAge = Integer.parseInt(inputAge);

        if (myAge >= 0 && myAge <= 2) {
            System.out.println("You are a baby. ");
        }
        else if (myAge >= 2 && myAge <= 4) {
            System.out.println("You are a toddler. ");
        }
        else if (myAge >= 4 && myAge <= 12) {
            System.out.println("You are a child. ");
        }
        else if (myAge >= 12 && myAge <= 19) {
            System.out.println("You are a teen. ");
        }
        else {
            System.out.println("You are an adult. ");
        }

}

}
