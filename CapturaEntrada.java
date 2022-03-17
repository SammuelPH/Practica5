import java.util.Scanner;

class CapturaEntrada{
    //La clase recibe de entrada un dato.
    public static int capturarEntero(String msg){ //En este caso el string msg
        Scanner sc = new Scanner(System.in);      //Scanner será la funcion que permita insertar texto
        System.out.print(""+msg+": ");            //Mostrarlo
        return (sc.nextInt());                    //Regresar el entero
    }

    public static float capturarFlotante(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextFloat());                  //Es un float
    }

    public static double capturarDoble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextDouble());                 //Es un double
    }

    public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());                  //Es un string
    }

}