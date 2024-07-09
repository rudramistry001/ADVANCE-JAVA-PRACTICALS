
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;



public class Practical12 {
    // Creating frame
    Frame frame;
    // Creating text field
    TextField textField;

    // Constructor to set up GUI components
    public Practical12() {
        frame = new Frame("Calculator");
        textField = new TextField();

        // Setting the layout for the frame
        frame.setLayout(new BorderLayout());

        // Adding text field to the frame
        frame.add(textField, BorderLayout.NORTH);

        // Creating panel for buttons
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        // Adding buttons to the panel
        String buttons[] = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String text : buttons) {
            Button button = new Button(text);
            panel.add(button);
        }

        // Adding panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Setting frame properties
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Practical12();
    }
}
