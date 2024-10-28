import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

            //Uso de Filtros BufferReader
        FileReader lectura = new FileReader("salidaFicheto.txt"); //capturamos el fichero
        BufferedReader br = new BufferedReader(lectura); //leemos el documento. este filtro permite leer lineas completas
        String cadena = br.readLine(); //para leer una linea completa
        //System.out.println(cadena);
        while(cadena != null){
        System.out.println(cadena);
        cadena = br.readLine();

        }

        
    }
}