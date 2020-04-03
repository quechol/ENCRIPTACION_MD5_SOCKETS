import java.util.*;
import java.io.*;

class lectura {	//lectura

	String[] parts;
	String usuarioCad;
	String passwordCad;
	String cadena ="";
	int flag;
	
	//busqueda en la BD
   	public  lectura (String cadena)
   	{
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		int cont=0;
		//String cadena ="";
		//String usuarioCad;
		//String passwordCad;
		//int flag;
		
		boolean contiene = false;
		
		Scanner tl = new Scanner(System.in);
						
		//System.out.println("Ingresa el usuario a buscar");
		//cadena = tl.nextLine();
		//tl.skip("\n");
		
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
		    // hacer una lectura comoda (disponer del metodo readLine()).
		    archivo = new File ("BD.txt");
		    fr = new FileReader (archivo);
		    br = new BufferedReader(fr);

		    // Lectura del fichero
		    String linea;
		   	while((linea=br.readLine())!=null){
		        
		        /*System.out.println(linea);
		        
		        String[] parts = linea.split(",");
	        	String usuarioCad = parts[0];
	        	String passwordCad = parts[1];
	        	
	        	System.out.println("Usuario");
	        	System.out.println(usuarioCad);
	        	System.out.println("Contraseña");
	        	System.out.println(passwordCad);
	        	
	        	if(usuarioCad == cadena){
	        		cont=1;
	        		//System.out.println("Usuario encontrado");
	        	}*/
	        	
	        	if (linea.contains(cadena)) {   //si la línea contiene el texto buscado se muestra por pantalla
                    //System.out.println("Linea "+ linea);
                    contiene = true;
                    
                    String[]parts = linea.split(",");
	        		usuarioCad = parts[0];
	        		passwordCad = parts[1];
	        		
	        		//System.out.println("Usuario encontrado");
	        		//System.out.println(usuarioCad);
	        		//System.out.println("Password encontrado");
	        		//System.out.println(passwordCad);
	        		
                }
		    }
		    
		    if(!contiene){ //si el archivo no contienen el texto se muestra un mensaje indicándolo
				flag =0;
                //System.out.println(cadena + " no se ha encontrado en el archivo");
            }else{
            	flag=1;
            }
		    /*if(cont==1){
		    	System.out.println("Usuario encontrado");
		    }else{
		    	System.out.println("Usuario no encontrado");
		    }*/
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			// En el finally cerramos el fichero, para asegurarnos
		 	// que se cierra tanto si todo va bien como si salta 
		 	// una excepcion.
			try{                    
				if( null != fr ){   
					fr.close();     
				}                  
			}catch (Exception e2){ 
				e2.printStackTrace();
			}
		}
	}
}
