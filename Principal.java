import java.util.Date;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Principal {
    public static void main (String[] args){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("sua tela está em:  "+d.width+ " x " +d.height+ ".");
        
    }
}