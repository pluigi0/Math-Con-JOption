
package ClassMathJO;

import javax.swing.JOptionPane;

public class ClassMathJO {
    public static void main (String [] args){
        double numero, raiz;
        
        JOptionPane.showMessageDialog (null, " Mini programa pa calcular la raiz del numero que ingreses");
        
        numero = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero pa calcularle la raiz: "));
        
        raiz = Math.sqrt(numero);
        
        JOptionPane.showMessageDialog(null, "La raiz de " +numero+ " es: "+raiz);
    }
}
