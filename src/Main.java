import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * Assignment 5 E6.10 This program writes word in reverse
 * @author Sergei Chekhonin
 */
public class Main {

    public static void main(String[] args) {
        //This block initialize printWriter and dateFormatter
        PrintWriter out = null;
        try {
            out = new PrintWriter("Assignment5_E6.10output.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        final JFrame frame = new JFrame();

        //initialisation of input dialog window
        String input = JOptionPane.showInputDialog("Enter your word:");
        out.println("Enter your word:");
        out.println(input);
        //Convert String input into Array
        String[] strChars = input.split("");

        //Creating new String Array object
        String[] newStrChars = new String[strChars.length];
        int j = 0;// variable

        //Set the last item in Old array to first place in new array
        for (int i=strChars.length-1; i>=0;i--)
        {
            newStrChars[j] = strChars[i];
            j++;
        }

        //using StringBuffer object to append chars to a new String object
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < newStrChars.length; i++) {
            sb.append(newStrChars[i]);
        }
        //print out output
        out.println("Reverse word is:");
        out.println(sb.toString());
        out.close();
        System.exit(0);

    }
}
