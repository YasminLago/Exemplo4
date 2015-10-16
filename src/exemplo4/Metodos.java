package exemplo4;
 //@author ylagorebollar
import javax.swing.JOptionPane;


public class Metodos {
    public float pedirFloat(){
        //return Float.parseFloat(JOptionPane.showInputDialog("Teclea dato"));
        String dato=JOptionPane.showInputDialog("Teclea dato");
            return(Float.parseFloat(dato));
    }
}
