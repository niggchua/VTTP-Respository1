package sg.edu.nus.iss;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        Console con = System.console();
        String name = con.readLine("\nWhat is your name?");

        if (name.length() > 0) {
            System.out.printf("\nNice to meet you, %s", name);
            System.out.println("\nNice to meet you, " + name);
        } else {
            System.err.println("You have not told me your name");
        }
        

        Integer age = 28;

        System.out.printf("%s is %d years old.", name, age);

        String mother_name = "Aichoo";
        System.out.printf("\nMy name is %s. I am %d years old. My mothes name is %s.", name, age, mother_name);



		// Slide 17

		String input = con.readLine("What is your hobby?");
		input.trim(); // "    swim      " ---> "swim"

		if (input.equals("swim")) {
			System.out.println("The nearest swimming pool is clementi if you fancy a " + input);
		} else if (input.equals("jog")) {
			System.out.println("The nearest park you can go for a run is at Bishan park");				
		} else {
			System.out.println("seems like you are a boring person without any interesting hobbies.");


		}



    }
}
