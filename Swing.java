import javax.swing.*;

class Swing{
	public static void main(String[] args){
		JFrame frame = new JFrame("Latihan Swing");
		frame.setSize(300,150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);
		
		frame.setVisible(true); //Shows or hides this Window depending on the value of parameter b.
	}
	
	private static void placeComponents(JPanel panel){
		panel.setLayout(null);
		
		JLabel user = new JLabel("User");
		user.setBounds(10, 10, 80, 25); // mengubah ukuran komponen ini agar sesuai dengan persegi panjang 
		panel.add(user);
		
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);
		
		JLabel password = new JLabel("Password");
		password.setBounds(10, 40, 80, 25);
		panel.add(password);
		
		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);
		
		JButton login = new JButton("Login");
		login.setBounds(10, 80, 80, 25);
		panel.add(login);
		
		JButton registrasi = new JButton("Registrasi");
		registrasi.setBounds(180, 80, 80, 25);
		panel.add(registrasi);
	}
}

/*
penjelasan:
membuat form sederhana yang terdiri dari pengisian nama dan juga password.
Jframe, class untuk membuat frame. JPanel, class untuk membuat Panel,
JLabel, class untuk membuat label pada form yang kita buat. seperti
user dan password. kemudian Komponen button hanya dapat memicu action event.
dan terdapat 2  yaitu JButton(Login) dan JButton(Registrasi)untuk
mengkonstruksi obyek button dengan text login dan registrasi.
*/