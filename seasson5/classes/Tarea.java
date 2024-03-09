package seasson5.classes;

public class Tarea {
    public String Nombre_de_la_tarea;
    public int Duración;
    public Persona Persona_encargada;
    public EstadoTarea estado;

    public Tarea(String Nombre_de_la_tarea, int Duración, Persona Persona_encargada) {
        this.Nombre_de_la_tarea = Nombre_de_la_tarea;
        this.Duración = Duración;
        this.Persona_encargada = Persona_encargada;
        this.estado = EstadoTarea.ACTIVA;
    }

    public Tarea() {

    }

    public String getNombre_de_la_tarea() {
        return Nombre_de_la_tarea;
    }

    public void setNombre_de_la_tarea(String Nombre_de_la_tarea) {
        this.Nombre_de_la_tarea = Nombre_de_la_tarea;
    }

    public int getDuración() {
        return Duración;
    }

    public void setDuración(int Duración) {
        this.Duración = Duración;
    }

    public Persona getPersona_encargada() {
        return Persona_encargada;
    }

    public void setPersona_encargada(Persona Persona_encargada) {
        this.Persona_encargada = Persona_encargada;
    }

    public EstadoTarea getEstado() {
        return estado;
    }

    public void setEstado(EstadoTarea Estado) {
        this.estado = Estado;
    }
    @Override
    public String toString() {
        return "Tarea{" +
                "Nombre_de_la_tarea='" + Nombre_de_la_tarea + '\'' +
                ", Duración=" + Duración +
                ", Persona_encargada=" + Persona_encargada +
                ", estado=" + estado +
                '}';
    }
}