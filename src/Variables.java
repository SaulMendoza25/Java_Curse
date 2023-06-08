import java.util.Scanner;

public class Variables
{
    public static void main(String[] args) {
        String cadena="definiendo nuestra variable";
        Scanner tomar = new Scanner(System.in);
        System.out.println("Escribe el primer numero");
        double decimales=tomar.nextDouble();
        System.out.println("Escribe el segundo numero");
        double numero= tomar.nextDouble();
        System.out.println(cadena+"\n"+ suma(numero,decimales));
    }
    public static double suma (double a,double b){
        return a+b;
    }
}
