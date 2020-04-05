import java.util.*;
import java.io.*;

//escritura
class CreaMensajeAleatorio {
  	
  	String Password2 ="";
  	String MA = "";
  	//int tamPass=0;
  	int numPrimos[];
  	//char carTem;
  	int j=0;
	
	//public CreaMensajeAleatorio (String MA){
	public CreaMensajeAleatorio(String Password2){
	
		String Password="",aux=".";
		Password=Password2+aux;
				
		int tamPass=0;
		tamPass=Password.length();
		
		int flag=Password.length();
		flag--;
		
		int num=tamPass+2;
		//num++;
		
		//int numPrimos[];
    	numPrimos= new int[tamPass];
    	int pos=0,i,n=4,cont=2;
    	String cad="";
		
		char Caracter;
		
		//carTem=Password.charAt(2);;
		
		if(num>2){
            cad="2 - 3";
            while(cont<num){
                i=2;
                while(i<=n){
                    if(i==n){
                    	cad=cad+" - "+n;
                    	cont=cont+1;
                    	//System.out.println(n);
                		numPrimos[pos]=n;
                		pos++;
                    }else{
                    	if(n % i==0){
                    	i=n;
                    	}
                    }
                    i=i+1;
                }
                n=n+1;
            }
            //System.out.println(cad);
        }else{
            if(num>0){
            	if(num==1){
                	//System.out.println("es primo 2");
            	}else{
            		//System.out.println("es primo 2, 3");
            	}
            }else{
            	//System.out.println("ingresa numeros positivos");
            }
        }
        
        //incercion al Mensaje Aleatorio
		
		//int 
		j=0;
		
		Random rnd = new Random();
		for ( int ii = 0; ii < 2048; ii++)
		{
			if(numPrimos[j]==ii && j<tamPass-1){
				Caracter=Password.charAt(j);
				MA += Caracter;
				//int x= (int)(rnd.nextDouble() * 26 + 65);
		 		//Caracter = (char)(x);
		 		//MA += Caracter;
				j++;
			}else{
				int x= (int)(rnd.nextDouble() * 26 + 65);
		 		Caracter = (char)(x);
		 		MA += Caracter;
		 	}
		 	//MA += Caracter;
		}
		
		//Revision en archivo
		
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			//String data = "Hola stackoverflow.com...";
			File file = new File("MA.txt");
			// Si el archivo no existe, se crea!
			if (!file.exists()) {
			    file.createNewFile();
			}
			// flag true, indica adjuntar información al archivo.
			//fw = new FileWriter(file.getAbsoluteFile(), true);//no borrar nada del archivo
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(MA);
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
