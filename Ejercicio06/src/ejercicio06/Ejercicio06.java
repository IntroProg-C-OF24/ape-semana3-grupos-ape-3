package ejercicio06;
public class Ejercicio06 {
    public static void main(String[] args) {
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        boolean respuesta;
        
        respuesta = (Math.sqrt(var1)+var2)/var3 == var2 && (var4>var5);
        
        System.out.println("La respuesta es " + respuesta);
     }
    
}
