import java.io.File;
import java.io.IOException;

public class Clase1 {
    public static void main(String[] args) {
        //El objeto tipo file es un fichero lógico:
        File ficheroSinPuntero = new File("src/resources/directorio/docuemento1.txt");

        //Métodos del objeto file:
        System.out.println(ficheroSinPuntero.getName()); // Devuelve el nombre del fichero.
        System.out.println(ficheroSinPuntero.getParent()); // Devuelve la ruta padre.
        System.out.println(ficheroSinPuntero.length()); // Tamaño del fichero.
        System.out.println(ficheroSinPuntero.exists()); // Pregunta sí el fichero existe (true) o no (false).
        System.out.println(ficheroSinPuntero.isDirectory()); // Pregunta sí es un directorio.
        System.out.println(ficheroSinPuntero.isFile()); // Pregunta sí es un fichero.
        // Sí no existe este fichero creado, lo creamos:
        if (!ficheroSinPuntero.exists()) {
            try {
                ficheroSinPuntero.createNewFile(); // Intenta crear el fichero.
            } catch (IOException e) {
                System.out.println("Fallo en la creación del fichero."); // En caso de dar fallo, que salga este mensaje.
            }
        }

        // listFiles()   Devuelve un array de todos los ficheros dentro del directorio:
        File directorio = new File("src/resources/directorio");
        System.out.println(directorio.listFiles());

        // list ()        Devuleve un array de las rutas de todos los ficheros que están dentro del directorio:
        System.out.println(directorio.list());


    }
}
