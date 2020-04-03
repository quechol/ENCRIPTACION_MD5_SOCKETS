import java.util.*;
import java.io.*;

//escritura
class encriptado {
    String cadena ="";
    String encriptadocad;
    
    public encriptado (String cadena)
    {
        
        BufferedWriter bw = null;
		FileWriter fw = null;
		char array[]= cadena.toCharArray();
		
		for(int i =0; i<array.length; i++)
		{
			array[i]=(char)(array[i]+(char)5);
		}
		
		encriptadocad = String.valueOf(array);
		
		//Introduccion a archivo
		
		try {
			//String data = "Hola stackoverflow.com...";
			File file = new File("encriptado.txt");
			// Si el archivo no existe, se crea!
			if (!file.exists()) {
			    file.createNewFile();
			}
			// flag true, indica adjuntar información al archivo.
			//fw = new FileWriter(file.getAbsoluteFile(), true);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(encriptadocad);
			//bw.newLine();
			//bw.write("\n");
			//System.out.println("información agregada!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			                //Cierra instancias de FileWriter y BufferedWriter
			    if (bw != null)
			        bw.close();
			    if (fw != null)
			        fw.close();
			} catch (IOException ex) {
			    ex.printStackTrace();
			}
		}
	}
	
	
}
