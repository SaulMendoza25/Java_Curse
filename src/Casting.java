public class Casting {
    public static void main(String[] args) {
        //casteo cast
        double d = 34.3;
        int i = (int) d;
// EN un year ubique 30 perritos
//        CUANTOS PERRITOS UBIQUE AL MES
//        Estimacion
        double monthlyDogs = 30.0/12.0;
        double estimacion = (int) monthlyDogs;
        System.out.println(estimacion);

        //Exactitud
        int a = 30;
        int b =12;
        System.out.println((double) a/b);

        /*CONVERSIONES ENTRE TIPOS
    NO PERDEMOS INFORMACIÓN
        De char —> int.
        De byte —> short —> int —> long
        De int —> double
        De float —> double
    PERDEMOS INFORMACIÓN
        De int —> float
        De long —> float
        De long —> double
*/
    }
}
