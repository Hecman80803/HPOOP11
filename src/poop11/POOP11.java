/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author hecman
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
///////////////////////////////////////////////////////
/*
        System.out.println("########file#######");
        File archivo=new File("archivo.txt");
        System.out.println("Afrchivo existe"+archivo.exists());
        if(!archivo.exists()){
            try {
                boolean seCreo=archivo.createNewFile();
                System.out.println("Se creo archivo:"+seCreo);
                System.out.println("Archivo existe:"+archivo.exists());

            }catch(IOException ex){
                System.out.println("ex.getMessage()");

            }    
        }
    
///////////////////////////////////////////////////////////////
        System.out.println("······FIle Write··········");
        try{
        System.out.println("······Lectura desde teclado·····");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escriba el texto para el archivo");
        String texto=br.readLine();
        System.out.println("EL usuario escribio:"+texto);
        System.out.println("······Escritura del archivo·····");
        FileWriter fw= new FileWriter("archivo.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter impresoraDeArchivos=new PrintWriter(bw);
        impresoraDeArchivos.println(texto);
        impresoraDeArchivos.close();
///////////////////////////////////////////////////////////////
        System.out.println("····Lectura del archivo·····");
        FileReader fr=new FileReader("archivo.txt");
        br= new BufferedReader(fr);
        System.out.println("El texto del archivo es :");
        String linea=br.readLine();
        while(linea!=null){
            System.out.println(linea);
            linea=br.readLine();
            
        }
        br.close();
/////////////////////////////////////////////////////////////
            System.out.println("·········StringTokenixer·········");
            String alumno="Hector,Jimenez,Maya,07112004,20,8.3";
            System.out.println("Cadena a tokenizar:"+alumno);
            StringTokenizer tokenizador=new StringTokenizer(alumno,",");
            while(tokenizador.hasMoreTokens()){
                System.out.println(tokenizador.nextToken());
            }    
        
        }
        
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
/////////////////////////////////////////////////////////////
*/

        System.out.println("······Activida··········");
        try{
        System.out.println("······Escritura del archivo·····");
        FileWriter fw= new FileWriter("archivo.csv");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter impresoraDeArchivos=new PrintWriter(bw);
        impresoraDeArchivos.println("Rodihgo,sanchex,perez,20,123456789,9.9,copilco 3000");
        impresoraDeArchivos.println("kevin,sanchex,perez,20,123456789,9.9,copilco 3000");
        impresoraDeArchivos.println("pedoro,sanchex,perez,20,123456789,9.9,copilco 3000");
        impresoraDeArchivos.println("ekgo,sanchex,perez,20,123456789,9.9,copilco 3000");
        impresoraDeArchivos.println("aeffgo,sanchex,perez,20,123456789,9.9,copilco 3000");
        impresoraDeArchivos.println("afsegwegehgo,sanchex,perez,20,123456789,9.9,copilco 3000");
        impresoraDeArchivos.println("Raefewfafaefo,sanchex,perez,20,123456789,9.9,copilco 3000");

        impresoraDeArchivos.close();
///////////////////////////////////////////////////////////////
        System.out.println("····Lectura del archivo·····");
        FileReader fr=new FileReader("archivo.txt");
        BufferedReader br= new BufferedReader(fr);
        System.out.println("El texto del archivo es :");
        String linea=br.readLine();
        while(linea!=null){
            System.out.println(linea);
            linea=br.readLine();
            
        }
        br.close();
/////////////////////////////////////////////////////////////
            System.out.println("·········StringTokenixer·········");
            String alumno="Hector,Jimenez,Maya,07112004,20,8.3";
            System.out.println("Cadena a tokenizar:"+alumno);
            StringTokenizer tokenizador=new StringTokenizer(alumno,",");
            while(tokenizador.hasMoreTokens()){
                System.out.println(tokenizador.nextToken());
            }

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        

    }
}