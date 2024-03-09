package seasson5.classes;

public class Persona{
    private String nombre;
    private String email;
    private String telefono;
    private String id;

    public  Persona(String nombre, String email, String telefono, String id){
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.id = id;
    }

    public Persona() {  

    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + ", id=" + id + '}';
    }
}