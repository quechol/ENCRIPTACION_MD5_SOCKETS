import java.util.*;
import java.io.*;

//escritura
class escritura {
    String cadena ="";
    
    public escritura (String cadena)
    {
        /*
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("hola.txt");
            pw = new PrintWriter(fichero);

            //for (int i = 0; i < 10; i++)
                pw.println(cadena);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        */
        BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			//String data = "Hola stackoverflow.com...";
			File file = new File("hola.txt");
			// Si el archivo no existe, se crea!
			if (!file.exists()) {
			    file.createNewFile();
			}
			// flag true, indica adjuntar información al archivo.
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			bw.write(cadena);
			bw.newLine();
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
