/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado3;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Atributos {
    public String idcancion;
    public String titulo;
    public String autor;
    public String duracion;
    public int anioCreacion;
    
    
    
    
    Atributos arrSpotify [] = new Atributos [10];
    public Atributos (String idcancion, String titulo, String autor, String duracion, int anioCreacion){
        this.idcancion = idcancion;
        this.autor = autor;
        this.duracion = duracion;
        this.titulo = titulo;
        this.anioCreacion = anioCreacion;
    }
        
    
    public String getIdcancion() {
        return this.idcancion;
    }

    public void setIdcancion(String idcancion) {
        this.idcancion = JOptionPane.showInputDialog("Cual es el id de la cancion:");
        
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
       this.titulo = JOptionPane.showInputDialog("Cual es el titulo de la cancion:");
       
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor= JOptionPane.showInputDialog("Cual es el autor de la cancion:");
        
    }

    public String getDuracion() {
        return this.duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = JOptionPane.showInputDialog("Cual es la duracion de la cancion:");
        
      
    }

    public int getAnioCreacion() {
        return this.anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion= Integer.parseInt(JOptionPane.showInputDialog("En cual año se creo:"));
        
    }
   
    public void enseñar(){
        JOptionPane.showMessageDialog(null, "\nID:"+this.idcancion+"\nTitulo:"+this.titulo+"\nAutor:"+this.autor+"\nDuracion:"+this.duracion+"\nAño Creacion:"+this.anioCreacion);
    }
    
    public void setPreguntasCanciones(){
        for ( int i = 0; i < 10; i++){
            setIdcancion("");
            setTitulo("");
            setAutor("");
            setDuracion("");
            setAnioCreacion(0);
            
            arrSpotify[i]= new Atributos (idcancion, titulo, autor,duracion,anioCreacion);
            
        }
    }
    
    public void getInfoCanciones(){
        int i = 0;
        for ( int x = 0; x <10; x++){
            arrSpotify[x].enseñar();
            
            if (arrSpotify[x].getAnioCreacion()<2023){
                JOptionPane.showMessageDialog(null,"Esta cancion fue lanzada antes del año 2023(año actual), Lammada:   "+arrSpotify[x].getTitulo());
            } else 
                if (arrSpotify[x].getAnioCreacion()==2023){
                    JOptionPane.showMessageDialog(null,"Esta cancion salio en el año 2023, Llamada:   "+arrSpotify[x].getTitulo());
                    
                }
                else {
                    JOptionPane.showMessageDialog(null,"Esta cancion fue lanzada despues del año 2023, Llamada:  "+arrSpotify[x].getTitulo());
                } 
        }
    }
    
    public void getMayorDuracion(){
        Atributos MayorDuracion = arrSpotify[0];
        for(int j = 0; j < 10; j++){
            if (Integer.parseInt(arrSpotify[j].getDuracion())> Integer.parseInt(MayorDuracion.getDuracion())){
                MayorDuracion = arrSpotify[j];
                
                
            }
        }
        JOptionPane.showMessageDialog(null,"\nLa Cancion de mayor duracion se llama:"+MayorDuracion.getTitulo());
        JOptionPane.showMessageDialog(null,"\nCon una Duracion de:"+MayorDuracion.getDuracion());
    }
  
    public void getPrimerAutor(){
        JOptionPane.showMessageDialog(null,"El autor de la primera cancion es:"+arrSpotify[0].getAutor());
    }
   
    
    public void MostrarCanciones (){
        System.out.println("Acontinuacion se mostraran las top 10 canciones:");
        for (int i = 0; i<arrSpotify.length; i++){
            System.out.println("Cancion numero"+(i+1));
            System.out.println("ID:"+arrSpotify[i].getIdcancion());
            System.out.println("Autor:"+arrSpotify[i].getAutor());
            System.out.println("Titulo:"+arrSpotify[i].getTitulo());
            System.out.println("Duracion:"+arrSpotify[i].getDuracion());
            System.out.println("Año creacion:"+arrSpotify[i].getAnioCreacion());
        }
    }
}
    

             
                    
                
    
     
         
    
    

    