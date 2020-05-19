import java.awt.Frame; //membuat frame
class AWT
	{
	public static void main(String[] bowo){
		Frame frame = new Frame(" Ini AWT");
		frame.setVisible(true);
		frame.setSize(300,300); //mengatur lebar windows
		System.out.print(frame);
		//frame.show(); //menampilkan
	}
}

/*penjelasan:
pada program di atas untuk membuat frame windows. menggunakan metode setsize untuk menentukan
tinggi dan lebae dari windows yang kita buat.
*/