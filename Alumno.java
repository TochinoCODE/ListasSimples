// ejercicio 2
package ejercicio2;


public class Alumno {
    private String nombre;
    private String codigo;
    private int nota;

    public Alumno(String nombre, String codigo, int nota) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nota = nota;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void mostarDatos(){
        System.out.print("["+nombre+" , "+codigo+" , "+nota+"] ->");
        
    }
    
    
}
