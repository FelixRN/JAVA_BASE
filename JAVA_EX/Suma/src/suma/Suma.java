
package suma;


public class Suma {
    //Crear el espacio en memoria para recibir las variables ->
    private int v1, v2, Resultado;
    
   //Crear constructor con el nombre indicado
    public Suma(int valor1, int valor2){
        //Guardarlo en nuevas variables ->
        //Usar This para traer las variables de la clase
        this.v1 = valor1;
        this.v2 = valor2;  
    }
    public void Operacion(){
        Resultado = v1 + v2;
    }
    public void Imprimir(){
        //Llamar al método que tiene el resultado ->
        Operacion();
        System.out.println("El resultado de la suma es: " + Resultado);
    }
}
