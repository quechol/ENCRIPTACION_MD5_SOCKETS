import java.net.*;
import java.io.*;
import java.util.*;

public class Cliente{

	//https://pelisplus.me/pelicula/violet-y-finch/p001/
	
	public static void main(String[] args){
	
		final String HOST ="127.0.0.1";		
		final int PUERTO = 5000;
		
		DataInputStream in;
		DataOutputStream out;
		
		int respServer;
		
		Scanner tl = new Scanner(System.in);
		
		String cad1,cad2,cad3,cadencriptadasimple;
		
		try{
			Socket sc = new Socket(HOST, PUERTO);
			
			in = new DataInputStream(sc.getInputStream());
			out = new DataOutputStream(sc.getOutputStream());
			
			//out.writeUTF("Hola mundo desde el cliente");
			
			System.out.println("Usuario:");
			
			cad1 = tl.nextLine();
			
			//out.writeUTF(cad1);
			
			encriptado encripta = new encriptado(cad1);
			
			//System.out.println("El usuario encriptado es: ");
			
			cadencriptadasimple = encripta.encriptadocad;
			
			//System.out.println(cadencriptadasimple);
			
			out.writeUTF(cadencriptadasimple);
			
			String mensaje1 = in.readUTF();
			
			//System.out.println(mensaje1);
			
			respServer = Integer.parseInt(mensaje1);
			
			//System.out.println(respServer);
			
			if(respServer==1){
				//System.out.println("Usuario valido");
				
				//String mensaje3 = in.readUTF();
				
				//System.out.println(mensaje3);
				
				System.out.println("Contraseña: ");
			
				cad2 = tl.nextLine();
				
				out.writeUTF(cad2);
				
				String mensaje2 = in.readUTF();
				
				
				System.out.println(mensaje2);
				
				sc.close();
				
			}else if(respServer==0){
				System.out.println("Usuario no valido");
				
				
				//String mensaje2 = in.readUTF();
				sc.close();
			}
			
			
			/*System.out.println("Contraseña: ");
			
			cad2 = tl.nextLine();
			
			//cad3 =cad+","+cad2;
			
			out.writeUTF(cad2);
			
			String mensaje2 = in.readUTF();
			
			
			System.out.println(mensaje2);*/
			
			//sc.close();
			
		}catch (IOException e){
			//Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
			e.printStackTrace();
		}
	
	}
}
