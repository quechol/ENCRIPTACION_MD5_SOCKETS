import java.util.*;
import java.io.*;

class ExtraccionAleatorio {
	
	String PasswordCliente="";
	String MArecibido="";
	public ExtraccionAleatorio (String PasswordCliente, String MArecibido){
		
		String aux2=".",PasswordCliente2="";
  		int tamPassCliente=0;
  		
  		PasswordCliente2=PasswordCliente+aux2;
		tamPassCliente=PasswordCliente2.length();
		
		//BufferedWriter bw2 = null;
		//FileWriter fw2 = null;
		FileReader fr = null;
		BufferedReader br = null;
		File archivo=null;
		String linea1="";
		String Salva="";
		
		//String MArecibido;
		
		//MArecibido=MA;
		
		/*try {
			// Apertura del fichero y creacion de BufferedReader para poder
		    // hacer una lectura comoda (disponer del metodo readLine()).
		    archivo = new File ("hola.txt");
		    fr = new FileReader (archivo);
		    br = new BufferedReader(fr);

		    // Lectura del fichero
		    
		   	while((linea1=br.readLine())!=null){
		        //System.out.println(linea1);
		        Salva=linea1;
		       
	        	
		    }
		}catch(Exception e){
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
		}*/
		
		//System.out.println("Hola");
		
		
		int tamtam=0;
		tamtam=MArecibido.length();
		//System.out.println("El tamaño de la cadena que lei es:"+tamtam);
		//System.out.println(Salva);
		//tamtam=Salva.length();
		//System.out.println("El tamaño de la cadena que lei es:"+tamtam);
		
		//tamPassClien
		int num2=tamPassCliente+2;
		int numPrimos2[];
		numPrimos2=new int[tamPassCliente];
		int pos2=0,i2,n2=4,cont2=2;
		String cad0="";
		
		if(num2>2){
            cad0="2 - 3";
            while(cont2<num2){
                i2=2;
                while(i2<=n2){
                    if(i2==n2){
                    	cad0=cad0+" - "+n2;
                    	cont2=cont2+1;
                    	//System.out.println(n);
                		numPrimos2[pos2]=n2;
                		pos2++;
                    }else{
                    	if(n2 % i2==0){
                    	i2=n2;
                    	}
                    }
                    i2=i2+1;
                }
                n2=n2+1;
            }
            //System.out.println(cad);
        }else{
            if(num2>0){
            	if(num2==1){
                	//System.out.println("es primo 2");
            	}else{
            		//System.out.println("es primo 2, 3");
            	}
            }else{
            	//System.out.println("ingresa numeros positivos");
            }
        }
		String nuevoMA="";
		char auxCar;
		//System.out.println("Los nuevos numeros primos son:");
    	/*for (int xy =0; xy<tamPassCliente; xy++){
    		System.out.println(numPrimos2[xy]);
    	}*/
    	
    	
    	int pp=0;
    	char Caracter2;
    	for(int ll=0; ll<tamtam; ll++){
    		//System.out.println(Caracter=Password.charAt(j););
    		//System.out.print(MArecibido.charAt(ll));
    		if(numPrimos2[pp]==ll && pp<tamPassCliente-1){
    			//auxCar=MArecibido.charAt(ll));
    			auxCar=PasswordCliente2.charAt(pp);
    			nuevoMA += auxCar;
    			pp++;
    		}else{
    			auxCar=MArecibido.charAt(ll);
    			nuevoMA+=auxCar;
    		}
    		
    	}
    	
		//System.out.println(nuevoMA);
		
		BufferedWriter bw2 = null;
		FileWriter fw2 = null;
    	
    	
    	try {
			//String data = "Hola stackoverflow.com...";
			File file2 = new File("MA2.txt");
			// Si el archivo no existe, se crea!
			if (!file2.exists()) {
			    file2.createNewFile();
			}
			// flag true, indica adjuntar información al archivo.
			//fw = new FileWriter(file.getAbsoluteFile(), true);//no borrar nada del archivo
			fw2 = new FileWriter(file2);
			bw2 = new BufferedWriter(fw2);
			bw2.write(nuevoMA);
			//bw.newLine();
			//bw.write("\n");
			//System.out.println("información agregada!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			                //Cierra instancias de FileWriter y BufferedWriter
			    if (bw2 != null)
			        bw2.close();
			    if (fw2 != null)
			        fw2.close();
			} catch (IOException ex) {
			    ex.printStackTrace();
			}
		}

	}

}
