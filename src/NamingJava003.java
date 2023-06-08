import java.lang.reflect.Array;

public class NamingJava003 {
    public static void main(String[] args) {
        int celphone = 93849383;
        int celPhone=celphone;
        String $countryName="Spain";
        String _backgroundColor="Green";
        String currency$ = "MXN";
        String background_color="Purple";
        final  double _PI = 3.1416;
        Object [] datos = new Object[7];
        datos[0]=celphone;
        datos[1]=celPhone;
        datos[2]=$countryName;
        datos[3]=_backgroundColor;
        datos[4]=background_color;
        datos[5]=currency$;
        datos[6]=_PI;
 for (int i =0; i<datos.length; i++){
     System.out.println(datos[i]);
 }
//        System.out.println(celphone + celPhone + $countryName + _backgroundColor + background_color + _PI);
    }
}
