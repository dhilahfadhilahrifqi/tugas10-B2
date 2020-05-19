import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
class EventHandling1 extends JFrame{
    
    private JButton tombol;
    private JTextArea myTextArea;
    
    public EventHandling1(){
        
        super("Hallo");
        setLayout(new BorderLayout());//Membuat objek BorderLayout
        
        myTextArea = new JTextArea();//Membuat objek tombol
        tombol = new JButton("Klik Di sini");//Membuat objek tombol
        
        //Meregistrasikan listener pada source event
        //Passing objek dengan tipe ActionListener dari anonymous class sebagai argumen
        tombol.addActionListener(new ActionListener(){  
            //Mengimplentasikan method dari interface ActionListener
            @Override
            public void actionPerformed(ActionEvent e) {
                myTextArea.append("Hai...\n");//mengatur text
            }
        });
        
        add(myTextArea, BorderLayout.CENTER);//menambahkan text area di bagian tengah
        add(tombol, BorderLayout.SOUTH);//menambahkan tombol di bagian bawah
        
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
public class EventHandling {
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() { 
            @Override
            public void run() { 
                new EventHandling1();
            } 
        });   
    }
}

/*
penjelasan:
disini terdapat JTextArea merupakan komponen yang menyediakan area untuk menampilkan banyak baris.
pada program ini ketika kita mengklik kata klik disini maka akan muncul teks berupa kata hai..
*/