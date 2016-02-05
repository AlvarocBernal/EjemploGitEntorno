
public class Test {

    public static void main(String[] args) {
            System.out.println("Total:"+CuentaPalabras("Vilches","García","Ruibal","López"));
    }
    public static int CuentaPalabras(String...palabras){
    int cont=0;
    String letras;
        for (int i = 0; i < palabras.length; i++) {
            cont+=palabras[i].length();  
        }return cont;
    }
}
