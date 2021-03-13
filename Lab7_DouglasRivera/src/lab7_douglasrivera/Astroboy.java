/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_douglasrivera;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author river
 */
public class Astroboy implements Serializable {
    int Id;
    String Nombre;
    String Apellido;
    String Nacionalidad;
    String TituloU;
    String COntextura;
    double Peso;
    int Misiones;
    File Archivo;

    private static final long SerialVersionUID = 444L;
     
    public Astroboy() {
        try {
            Archivo = new File(new File(".").getCanonicalPath() + "\\src\\Files\\" + "astronautas.txt");
        } catch (IOException ex) {
            Logger.getLogger(Astroboy.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Astroboy(int Id, String Nombre, String Apellido, String Nacionalidad, String TituloU, String COntextura, double Peso, int Misiones) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nacionalidad = Nacionalidad;
        this.TituloU = TituloU;
        this.COntextura = COntextura;
        this.Peso = Peso;
        this.Misiones = Misiones;
         try {
            Archivo = new File(new File(".").getCanonicalPath() + "\\src\\Files\\" + "astronautas.txt");
        } catch (IOException ex) {
            Logger.getLogger(Astroboy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getTituloU() {
        return TituloU;
    }

    public void setTituloU(String TituloU) {
        this.TituloU = TituloU;
    }

    public String getCOntextura() {
        return COntextura;
    }

    public void setCOntextura(String COntextura) {
        this.COntextura = COntextura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public int getMisiones() {
        return Misiones;
    }

    public void setMisiones(int Misiones) {
        this.Misiones = Misiones;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }
    public void ReadFileScanner(File archivo) {
        Scanner sc = null;//Hacemos lo mismo, leemos con el scanner
        try {
            sc = new Scanner(archivo);
            while (sc.hasNext()) {
                String[] next = sc.nextLine().split("|"); 
                System.out.println(next);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la lectura.");
        }
        sc.close();
    }
    
    
     public void ReadFileScanner() {
        Scanner sc = null;//Hacemos lo mismo, leemos con el scanner
        try {
            sc = new Scanner(Archivo);
            while (sc.hasNext()) {
                String[] next = sc.nextLine().split("|"); 
                
                System.out.println(next);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la lectura.");
        }
        sc.close();
    }
     
     public ArrayList<Astroboy> ReadFileScannerArrayList() {
        Scanner sc = null;//Hacemos lo mismo, leemos con el scanner
        ArrayList<Astroboy> astroboy = new ArrayList<>();
        try {
            sc = new Scanner(Archivo);
            while (sc.hasNext()) {
                String temp = sc.nextLine();
                System.out.println(temp);
                System.out.println(temp.split(",").length);
                String[] next = temp.split(","); 
                astroboy.add(new Astroboy(Integer.parseInt(next[8]), next[7], next[6], next[5], next[4], next[3],Double.parseDouble(next[2]),Integer.parseInt(next[1])));
                
                // .out.println(next);
               
            }
            return astroboy;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la lectura.");
            return astroboy;
        } finally {
             sc.close();
        }
        
    }
    
    public void WriteFile(int Id,String Nombre,String Apellido,String Nacionalidad,String TituloU,String COntextura,double Peso,int Misiones) {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null; 
        try {
            fw = new FileWriter(Archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(Id + "," + Nombre + "," + Apellido + "," + Nacionalidad + "," + TituloU + COntextura + "," + Peso + "," + Misiones);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura.");
        }
    }
    
    public void WriteFile() {
        FileWriter fw = null;
        BufferedWriter bw = null; 
        try {
            fw = new FileWriter(Archivo, true);
            bw = new BufferedWriter(fw);
           bw.write(Id + "," + Nombre + "," + Apellido + "," + Nacionalidad + "," + TituloU + COntextura + "," + Peso + "," + Misiones);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura.");
        }
    }
    
     public void WriteFileMod(ArrayList<Astroboy> astroboy) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(Archivo, false);
            bw = new BufferedWriter(fw);
            for (Astroboy astro : astroboy) {
            bw.write(astro.getId() + "," + astro.getNombre()+ "," + astro.getApellido() + "," + astro.getNacionalidad() + "," + astro.getTituloU() + astro.getCOntextura() + "," + astro.getPeso() + "," + astro.getMisiones());
            bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura");
        }
    }
}
