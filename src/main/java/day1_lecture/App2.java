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
        input.trim();
        if (input.equals("swim")){           
                System.out.println("Swimmy yay");
        }  
            else if (input.equals("jog")){
                System.out.println("Joggy yay");

            }
            else if (input.equals("walk")){
                System.out.println("Walky yay");
                

            }
            else {
                System.out.println("boring");
            }
        }


    
}
