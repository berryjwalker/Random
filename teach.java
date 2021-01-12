import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class teach implements ActionListener {
    static int count = 0;
    JLabel label;
    JFrame mainFrame;
    JPanel controlPanel;
    JButton button;

    public teach() {
        label = new JLabel("Number counter:0");

        mainFrame = new JFrame("Huynh Realities");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        

        

        button = new JButton("Click here.");
        button.addActionListener(this);
    }

   public static void main(String[] args) {
        new teach();
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("Number counter: " + count);

    }
}
