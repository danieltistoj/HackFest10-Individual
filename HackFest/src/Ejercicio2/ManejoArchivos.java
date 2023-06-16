/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Usuario
 */
public class ManejoArchivos {
       public String leerArchivo(File archivo){
        String contenido="";
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String leer = br.readLine();
            while(leer!=null){
                contenido = contenido + leer +"\n";
           
                //System.out.println("");
                //System.out.println(leer);
               
                //System.out.println(rectangulo.getLista());
                leer = br.readLine();
                
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
             e.printStackTrace();
        }
       return contenido;
    }
         
         
         
       public File abrirArchivo(){
      LookAndFeel old = UIManager.getLookAndFeel();
      File archivo;
      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } 
      catch (Throwable ex) {
         old = null;
      } 
        JFileChooser ruta = new JFileChooser();
        ruta.setDialogTitle("Seleccione el archivo");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        ruta.setFileFilter(filter);
        
        if(ruta.showOpenDialog(ruta) == JFileChooser.APPROVE_OPTION){
            archivo = ruta.getSelectedFile();
           
            //System.out.println("entro");
        }else{
            archivo =null;
        }
     return archivo;
    }
}
