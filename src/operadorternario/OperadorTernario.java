package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {

        //Operador ternario tiene 3 partes: una condición que se debe evaluar y en función del valor de la condición 
        //regresa uno u otro valor. Si es verdadero coge lo de después de ?, si es falso coge lo de después de : 
        var resultado = (3 > 2)  ? "verdadero" : "falso" ;  //En la parte de falso podemos regresar cualquier otro tipo de dato (no tiene por qué ser una cadena)
        System.out.println("resultado = " + resultado);
        
        var numero = 9;
        resultado = (numero % 2 == 0) ? "Numero par" : "Numero impar" ;
        System.out.println("resultado = " + resultado);      
        
        
        //Nota: El operador ternario se podría utilizar directamente en la impresión por pantalla:
        //System.out.println(numero1 > numero2 ? numero1 : numero2);
        
    }

}
