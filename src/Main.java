import java.util.Scanner; //Scanner class comes within the utility package, so make sure to import this inorder to use Scanner
import javax.swing.JOptionPane; //JOptionPane class comes within the swing package

public class Main {
    public static void main(String[] args) {
        //using GUI
        String yourName = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+yourName);

        float favNumber = 0;
        boolean validInput = false;

        do {
            try {
                String favNumberInput = JOptionPane.showInputDialog("Enter your Favorite Number");
                favNumber = Float.parseFloat(favNumberInput);
                validInput = true;
                //exception when you try to convert a string to a numeric type, but the string does not represent a valid number
                //'e' reference to the exception object
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid number");
            }
        } while (!validInput);

        JOptionPane.showMessageDialog(null, "So " + favNumber + " is your Favorite Number?");

        String greetings = "Hey! How are you doing?\n";
        System.out.println("Hello world!"); //this is a basic print method used in java
        System.out.println("Checking the sout+tab shortcut.");
        float valueOfPie = 3.14f; //this 'f' is needed to be used to define it as a float value
        System.out.println("The value of Pie is: "+valueOfPie);

        Scanner fetchingInput = new Scanner(System.in);
        System.out.print(greetings);
        fetchingInput.nextLine(); //here the nextLine() method checks the next line for the String input

        System.out.println("What's your age?");
        int age = fetchingInput.nextInt();
        System.out.println("So your age is "+age);
        fetchingInput.nextLine(); //this should be redeclared after using it for once to clear it for the next input use

        System.out.println("What are you doing these days?");
        fetchingInput.nextLine();
        System.out.println("Ohh that's cool!");
    }
}