
package suma;
import java.util.Scanner;

public class SumaMain {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame el primer valor ");
        int valor1 = entrada.nextInt();
        
        System.out.println("Dame el valor segundo valor");
        int valor2 = entrada.nextInt();
        
        //Poner el nombre de la clase con la que queremos comunicarnos:
        //Colocar las variables que queremos mandar dentro de los parentesis:
        Suma valores = new Suma(valor1, valor2);
        
        valores.Imprimir();
        
        
        
        
        
       
        
        
                
                
    }
    
}
