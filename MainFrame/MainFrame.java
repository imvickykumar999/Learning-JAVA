import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
public MainFrame(String title) {
super(title);
// Set layout Manager
setLayout(new BorderLayout());
//Create Swing component
JTextArea textArea = new JTextArea();
JButton button = new JButton("Click me");
//Add Swing components to content pane
Container c = getContentPane();
c.add(textArea, BorderLayout.CENTER);
c.add(button, BorderLayout.SOUTH);
//Add behavior
button.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
textArea.append("Hello");
}
});
}
}
