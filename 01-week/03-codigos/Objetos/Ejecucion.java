
import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Objeto lógica
        Logica objLogica = new Logica("","",
                0, false, 0);
        //Objeto Operaciones
        Operaciones objOperacion = new Operaciones();

        int opcion=0;

        do{
            System.out.println("Bienvenido al Menú Principal...\n" +
                    "1. Cargar datos básicos\n" +
                    "2. Realizar Operaciones\n" +
                    "3. Mostrar resultados\n" +
                    "4. Salir .......");
            opcion= sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Digite el nombre de la persona");
                    objLogica.setNombre(sc.next());
                    System.out.println("Digite el apellido");
                    objLogica.setApellidos(sc.next());
                    System.out.println("Digite la edad de la persona");
                    objLogica.setEdad(sc.nextInt());
                    System.out.println("Digite el género de la persona true para M " +
                            "y false para femenino");
                    objLogica.setGenero(sc.nextBoolean());
                    break;
                case 2:
                    System.out.println("El genero de la persona " +
                            "es:"+objOperacion.CambiarGenero(objLogica.isGenero()));
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Saliendo...... :)");
                    break;
                default:
                    System.out.println("Error opción incorrecta");
                    break;
            }

        }while (opcion!=4);

    }
}
