package Clases;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String Nombre;
    private String Rol; 
    private String Subdivision;
    private String Contraseña;
      
    public Usuario(String Nombre, String Rol, String Subdivision, String Contraseña){
        this.Nombre = Nombre;
        this.Rol = Rol;
        this.Subdivision = Subdivision;
        this.Contraseña=Contraseña;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    public String getNombre(){
        return this.Nombre;
    }
    
    public String getRol(){
        return this.Rol;
    }
    
    public String getSubdivision(){
        return this.Subdivision;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public void setRol(String Rol){
        this.Rol = Rol;
    }
    
    public void setSubdivision(String Subdivision){
        this.Subdivision = Subdivision;
    }
}
