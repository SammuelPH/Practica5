import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Banco[] database = new Cuenta[1];
        int i, id = 0;
        for(i=0;i<2;i++)
        {
            System.out.println("");
            System.out.println("== B A N C O  S A M T A N D E R ==");
            System.out.println("===== Menú principal =====");
            System.out.println("===== 1 Crear cuenta =====");
            System.out.println("===== 2 Entrar       =====");
            System.out.println("===== 3 SALIR        =====");
            System.out.println("");
            System.out.println("== SELECCIONA TU OPCIÓN ==");
            int opcion = CapturaEntrada.capturarEntero("Inserte su opcion");

            //System.out.println(database.length);

            if (opcion == 1)
            {
                database[database.length-1] = Banco.Registrar();
                database = Arrays.copyOf(database, database.length+1);

                i=0;
            }
            else if (opcion == 2)
            {
                Banco.Log(database);
                //System.out.println(database[1].getNombre());
                i=0;
            }
            else
            {
                i=2;
            }
        }
    }
}