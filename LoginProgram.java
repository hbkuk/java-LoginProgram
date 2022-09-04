import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginProgram {
	public LoginProgram() {
		
		JFrame frame = new JFrame("Login Program");
		JPanel panel = new JPanel();
		JLabel idLabel = new JLabel("ID = ");
		JTextField idTxt = new JTextField(15);
		JLabel pwLabel = new JLabel("P/W = ");
		JPasswordField pwTxt = new JPasswordField(10);
		JButton logBtn = new JButton("로그인");
		
		frame.add(panel);
		
		panel.add(idLabel);
		panel.add(idTxt);
		
		panel.add(pwLabel);
		panel.add(pwTxt);
		
		panel.add(logBtn);
		
		logBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = "홍길동";
				String pw = "rkddkwl";
				
				if(id.equals(idTxt.getText())&&pw.equals(pwTxt.getText())) {
					JOptionPane.showMessageDialog(null, "You have logged in successfully");
				} else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}
			}
		});
		
	
		frame.setVisible(true);
		frame.setSize(1000,600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	}

	public static void main(String[] args) {
		new LoginProgram();
	}}
