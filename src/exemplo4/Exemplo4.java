package exemplo4;

import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args) {
     /*Rectangulo rec1=new Rectangulo(3,5);
     System.out.println("base"+rec1.getBase());
     System.out.println("altura"+rec1.getAltura());
     System.out.println("area"+rec1.calcularArea(7, 8));
     System.out.println("perimetro"+rec1.calcularPerimetro());*/
     float base,altura;
     String resposta=JOptionPane.showInputDialog("base");
     base=Float.parseFloat(resposta);
     altura=Float.parseFloat(JOptionPane.showInputDialog("altura"));//Simplificación de código
     Rectangulo rec2=new Rectangulo(base,altura);
     JOptionPane.showMessageDialog(null,"Area"+rec2.calcularArea(base,altura));
     JOptionPane.showMessageDialog(null,"perimetro"+rec2.calcularPerimetro());
     
    }
    
}
