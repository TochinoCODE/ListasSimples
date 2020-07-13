//ejercicio 2
package ejercicio2;

public class Nodo {
     private Alumno datos;
    private Nodo siguiente;
    
    public void enlazarA(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    public Nodo obtenerSiguiente(){
        return this.siguiente;
    }
    
    public Alumno getDatos() {
        return datos;
    }

    public void setDatos(Alumno datos) {
        this.datos = datos;
    }
    
    public void listar(){
        datos.mostarDatos();
    }
    
    public String obtenerCodigo() {
        String codigo = datos.getCodigo();
    return codigo;
    }
    
    public String obtenerNombre(){
        String nombre = datos.getNombre();
        return nombre;
    }
}
