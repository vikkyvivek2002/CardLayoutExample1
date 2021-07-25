import java.awt.*;
import java.awt.event.*;
public class CardLayoutExample1 implements ActionListener {
    public static void main(String args[]) {
 
    Frame frame=new Frame("card Layout");
    Panel pane1, pane2, pane3, cardPane;
    CardLayout card;
       frame.setSize(500, 400);
        pane1 = new Panel();
        pane2 = new Panel();        pane3 = new Panel();
        cardPane = new Panel();
        pane1.setBackground(Color.BLACK);
        pane2.setBackground(Color.BLUE);
        pane3.setBackground(Color.GREEN);
        Button button1 = new Button("Click me to change panel");
        button1.addActionListener(this);
        pane1.add(button1);
           Button button2 = new Button("Click me to change panel");
        button2.addActionListener(this);
        pane2.add(button2);
        Button button3 = new Button("Click me to change panel");
        button3.addActionListener(this);
        pane3.add(button3);
         
        card = new CardLayout();
         
        cardPane.setLayout(card);
        cardPane.add(pane1, "First Pane");
        cardPane.add(pane2, "Second Pane");
        cardPane.add(pane3, "Third Pane");
         
        frame.add(cardPane);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        card.next(cardPane);
    }
    
}