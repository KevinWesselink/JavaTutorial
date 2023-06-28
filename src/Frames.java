import javax.swing.*;

public class Frames {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Button");

        frame.setVisible(true);
        frame.setSize(400, 500);
        frame.setLayout(null);

        button.setBounds(130, 100, 100, 40);
        frame.add(button);
    }
}
