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
        String name = con.readLine("\nWhat is your name?\n");

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

		String input = con.readLine("\nWhat is your hobby?\n");
		input.trim(); // "    swim      " ---> "swim"

		if (input.equals("swim")) {
			System.out.println("The nearest swimming pool is clementi if you fancy a " + input);
		} else if (input.equals("jog")) {
			System.out.println("The nearest park you can go for a run is at Bishan park");				
		} else if (input.equals("cycle")) {
			System.out.println("You could cycle at the park connector");
		} else {
			System.out.println("Tell me more about this hobby of yours.");


		}

		// Slide 18
		// Switch statement

		switch (input) {
			case "swim":
				System.out.println("The nearest swimming pool is clementi if you fancy a " + input);
				break;
			case "jog":
				System.out.println("The nearest park you can go for a run is at Bishan park");
				break;
			case "cycle":
				System.out.println("You could cycle at the park connector");
				break;
			default: 
				System.out.println("Tell me more about this hobby of yours.");
				break;
		}


		// Slide 19
		Integer myAge =0;
		String inputAge = con.readLine("What is your age?");

		myAge = Integer.parseInt(inputAge);

		if (myAge >=0 && myAge <= 2) {
			System.out.println("you are a baby");
		} else if (myAge > 2 && myAge <= 4) {
			System.out.println("You are a toddler");
		} else if (myAge > 4 && myAge <= 12) {
			System.out.println("You are a child");
		} else if (myAge > 12 && myAge <= 19) {
			System.out.println("You are a teenager");
		} else if (myAge > 19 && myAge <= 50) {
			System.out.println("You are an adult");
		} else {
			System.out.println("You are a senior citizen");
		}
    }
}
