
package border_layout;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
public class BorderLayoutDemo extends JFrame{
    
    private Container c;
    private JButton b1, b2, b3, b4 , b5;
    private BorderLayout bLayout;
    BorderLayoutDemo(){
        
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("demo");
        
        c = this.getContentPane();
        bLayout = new BorderLayout();
        c.setLayout(bLayout);
        
        
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        
        
        c.add(b1,BorderLayout.NORTH);
        c.add(b2,BorderLayout.WEST);
        c.add(b3,BorderLayout.CENTER);
        c.add(b4,BorderLayout.EAST);
        c.add(b5,BorderLayout.SOUTH);
    }
    
    
    
    public static void main(String[] args){
        
        
        BorderLayoutDemo frame = new BorderLayoutDemo();
        frame.setVisible(true);
        
        
        
    }

}