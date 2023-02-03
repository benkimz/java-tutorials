/**
 *
 * @author benkimz
 */

import java.awt.*;
import java.awt.event.*;

public class GUIApproach extends Frame implements MouseListener{    
    /*
        STEPS
        ---------------------
        1). Create the textfields and their labels
        2). Set a suitable bounding rectangle (Position on canvas) for each.
        3). Add the above controls to the Frame object
        4). Take the user's input
        5). Perform operations
    */
    
    // `username` input controls
    TextField username = new TextField(255);
    Label usernameLabel = new Label("Enter username: ");
   
    // `age` input controls
    TextField age = new TextField(3);
    Label ageLabel = new Label("Enter age: "); 
    
    // `button` control
    Button button = new Button("done");
    
    // Method to be invoked when button is clicked
    @Override
    public void mouseClicked(MouseEvent e) {
        // initialize value holders
        String usernameValue; int ageValue;
        // get the value for `username`
        usernameValue = username.getText();
        // get the value for `age` and parse to be of [int] data-type
        ageValue = Integer.parseInt(age.getText());
        System.out.println("Welcome, " + usernameValue + ".");
        System.out.println("Age received: " + ageValue + ", have a great day!");
    }    
    
    // constructor method
    public GUIApproach(String arg){
        // call the parent class constructor method (Frame class constructor)
        super(arg);
        setLayout(null); //let's use a null layout for now
        // set the bounding rectangle for username input controls
        usernameLabel.setBounds(20,50,100,30);
        username.setBounds(150,50,100,30);
        // Add the controls to the Frame object
        add(usernameLabel, 0);
        add(username, 1);
        // set the bounding rectangle for age input controls
        ageLabel.setBounds(20,90,100,30);
        age.setBounds(150,90,100,30);
        // Add the controls to the Frame object
        add(ageLabel, 2);
        add(age, 3);
        //Add a button
        button.setBounds(150,150,100,30);
        //Add an event listener to the button
        button.addMouseListener(this);
        add(button);
        /*
            The code for the close button
        */
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event){
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        
        /*
            We want a simple form with a title: `User Input-Form`
            STEPS
            ---------------------------
            1). create an instance of the `GUIApproach class (extends Frame)
            2). set the width and height to display on screen
            3). set visibility to [true]
        */
        
        GUIApproach gui = new GUIApproach("User Input-Form");
        gui.setSize(450, 250);
        gui.setVisible(true);
    }
    
    // consume these methods of the MouseListener interface because we
    // don't really need them
    @Override
    public void mousePressed(MouseEvent e) {
        e.consume();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        e.consume();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        e.consume();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        e.consume();
    }     
}