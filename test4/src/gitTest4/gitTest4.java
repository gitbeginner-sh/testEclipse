package gitTest4;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class gitTest4{

	static JButton button;
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello Git");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(300,200);
		Container contentsPane = frame.getContentPane();
		JPanel panel = new JPanel();
		button = new JButton("にゃあ");
		button.addActionListener(a);
		panel.add(button);
		contentsPane.add(panel);

		frame.setVisible(true);
	}

	static ActionListener a = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("🐈");
			button.setText("にゃにゃ！？");
		}
	};
}
