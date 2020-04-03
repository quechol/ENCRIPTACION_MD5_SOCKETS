import java.util.*;
import java.io.*;

//escritura
class CreaMensajeAleatorio {
  	
	public static void main(String[] args){
		char Caracter;
    	String MA = "";
    	String cadena ="PASSWORD";
    	Random rnd = new Random();
    		for (int i = 0; i < 2048; i++)
    		{
        		int x= (int)(rnd.nextDouble() * 26 + 65);
             	Caracter = (char)(x);
             	MA += Caracter;
    		}
    	byte[] barr=MA.getBytes();
    	
    	
    	System.out.println("Cadena:");
    	System.out.println(MA);
    	System.out.println("Tamaño:");
    	System.out.println(MA.length());
    	System.out.println("En la posicion 9 hay:");
    	System.out.println(MA.charAt(9));
    }
}
