import java.io.File;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {

        //EJERCICIOS:
        //ejercicioUNo();
        //ejercicioDos();
        ejercicioTres();


        }

    //1. Obetener todos los nombres de los ficheros del directorio llamado directorio
    public static void ejercicioUNo(){
        File directorio = new File("src/resources/directorio");
        File [] arrayEjercicioUno = directorio.listFiles();
        for(File fichero : arrayEjercicioUno){
            System.out.println(fichero.getName());
        }
    }


    //2. Crear una subcarpeta dentro de la carpeta directorio. Dentro de dicha sub crear un fichero.
    //   Obetener todos los nombres de los ficheros del directorio llamado directorio, y el subdirectorio creado.
    public static void ejercicioDos(){
        File directorio = new File("src/resources/directorio");
        File [] arrayEjercicioDos = directorio.listFiles();

        for(File fichero : arrayEjercicioDos){
                 System.out.println(fichero.getName());
        }

    }


    //3. Listar el nombre de todos los ficheros del SISTEMA ( C:\ )
    public static void ejercicioTres(){
        File ficheroSistema = new File("C:\\Users\\00ale\\Desktop\\DAM\\SEGUNDO_CURSO\\ACCESO A DATOS\\Primer Trimestre\\T1\\Fichero");
        File [] listaFicheros = ficheroSistema.listFiles();
        for(File fichero:listaFicheros){

            System.out.println(fichero.getName());
        }
    }



    }


