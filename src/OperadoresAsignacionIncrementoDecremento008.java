public class OperadoresAsignacionIncrementoDecremento008 {
    public static void main(String[] args) {
        int number = 1;
        var datos = 3;


        int vidas = 5;
        int regalo = 100 + vidas++;

        System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
// Regalo: 105, vidas: 6

// Incremento prefijo:
        vidas = 5;
        regalo = 100 + ++vidas;

        System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
// Regalo: 106, vidas: 6
    }
     /*
     Operadores de asignacion
    +=: a += b es equivalente a a = a + b.
    -=: a -= b es equivalente a a = a - b.
    *=: a *= b es equivalente a a = a * b.
    /=: a /= b es equivalente a a = a / b.
    %=: a %= b es equivalente a a = a % b.

    Operadores de incremento:

    ++: i++ es equivalente a i = i + 1.
    --: i-- es equivalente a i = i - 1

    Podemos usar estos operadores de forma prefija (++i) te regrada el dato ya sumado  o postfija (i++)
    te trae el dato original y luego lo suma. La diferencia está en qué operación se ejecuta primero
n

*/

}
