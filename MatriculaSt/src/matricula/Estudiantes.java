
package matricula;


public class Estudiantes {
    String nombre;
    String apellido;
    String edad;
  
    public Estudiantes(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    

    @Override
    public boolean equals(Object obj) {
       
        final Estudiantes otroEstudiante = (Estudiantes) obj;
 
       return false;
    }
    
    
    @Override
    public String toString() {
        return  nombre + " " + apellido + " " + edad;
    }

    
    
}
