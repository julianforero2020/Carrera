
import java.util.*;
public class Carrera
{
   private String codigo;
   private String nombre;
   private Integer numesem;
   private Integer numecreditos;
   private String titulo;
   private String director;
   Date fechain;
   
   public Carrera()
   {
   this.codigo="1151933";
   this.nombre="jose julian forero";
   this.numesem=8;
   this.numecreditos=120;
   this.titulo="Ingeniero de Sistemas";
   this.director=director="Claudia gomez";
    
    
    
   }
   public Carrera( String codigo,String nombre,Integer numesem,Integer numecreditos,String titulo, String director,Date fechain)
   {
   this.codigo=codigo;
   this.nombre=nombre;
   this.numesem=numesem;
   this.numecreditos=numecreditos;
   this.titulo=titulo;
   this.director=director;
   this.fechain=fechain;
    
    
    
   } 
   
   public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumesem() {
        return numesem;
    }

    public void setNumesem(Integer numesem) {
        this.numesem = numesem;
    }

    public Integer getNumecreditos() {
        return numecreditos;
    }

    public void setNumecreditos(Integer numecreditos) {
        this.numecreditos = numecreditos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public Date getFechain() {
        return fechain;
    }

    public void setFechain(Date fechain) {
        this.fechain = fechain;
    }
       
    
   
   
}
