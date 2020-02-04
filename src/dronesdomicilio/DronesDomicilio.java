/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dronesdomicilio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author MAYER MONSALVE
 */
public class DronesDomicilio {

      private static int tam =0, x=0, y=0;
      private static String sentido ="Norte";
      private static FileWriter  salida = null;
      private static PrintWriter  pw = null;
      private static File archivo = null;
      private static FileReader fr = null;
      private static BufferedReader br = null;
      private static String msg="== REPORTE DE ENTREGAS ==";
      
   public static void main(String [] arg) throws IOException {
      
      
         // Se prepara el fihcero para leerlo
         String rutaEntrada =System.getProperty("user.dir") +"/src/archivos/in.txt";
         

          //Preparamos el archivo donde se mostraran los reportes
            salida = new FileWriter(System.getProperty("user.dir") +"/src/archivos/out.txt");
            pw = new PrintWriter(salida);
          
            escribirArchivo(msg);
            //Leemos el archivo
            recorrer(rutaEntrada);
            salida.close();
            fr.close();
            
      
}
      
      public static void recorrer(String rutaEntrada) throws IOException
      {
          
         archivo = new File (rutaEntrada);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
        String linea;
            //Recorremos cada linea del archivo
        for(int j=0;j<3;j++)
         //while((linea=br.readLine())!=null)
         {
            linea=br.readLine();
            if(linea==null)
                return;
            tam = linea.length();
            //Leemos cada movimiento por linea
             for (int i =0;i<tam;i++)
             {
               char mov = linea.charAt(i); 
               msg=""; 
               //Averiguamos que movimiento debe realizar el Dron
             movimiento(mov);
             }
             
             msg=msg+"("+x+","+y+")"+" en dirección "+sentido;
             escribirArchivo(msg);
           }
            
      }
           
   
   public static String  movimiento(char pos)
   {
   
       if(pos=='A')
       {
           switch (sentido)
           {
               case "Norte":y++;
                   break;
               case "Sur":y--;
                   break;
               case "Oriente":x++;
                   break;
               case "Occidente":x--;
           }
       }
       
       else if(pos=='I')
       {
              switch (sentido)
           {
               case "Norte":sentido ="Occidente";
                   break;
               case "Sur":sentido="Oriente";
                   break;
               case "Oriente":sentido ="Norte";
                   break;
               case "Occidente": sentido="Sur";
                   break;
           }
       }
       else if (pos=='D')
       {
          switch (sentido)
           {
               case "Norte":sentido ="Oriente";
                   break;
               case "Sur":sentido="Occidente";
                   break;
               case "Oriente":sentido ="Sur";
                   break;
               case "Occidente": sentido="Norte";
                   break;
           }
       }
       return ("("+x+","+y+")"+ " en dirección "+ sentido);  
   }
   
   public static void escribirArchivo(String msg)
   {
    
        try
        {
              pw.println(msg);

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }   
 }

