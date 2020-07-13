//ejercicio 2

package ejercicio2;


public class ListaAlumno {
    static Alumno alu;
     private Nodo inicio;
    private int tamaño;
    
    public boolean estaVacia(){
        return inicio == null;
    }
    
    public int getTamaño(){
        return tamaño;
    }
    
    public void ingresarInicio(Alumno valor){
        Nodo nuevo = new Nodo();
        nuevo.setDatos(valor);
        if (estaVacia()){
           inicio = nuevo;
        }else{
            nuevo.enlazarA(inicio);
            inicio = nuevo;
        }
        tamaño++;
    }
    
    public void mostrar(){
        int contador = 0; 
        Nodo temp;
        temp = inicio;
        if (estaVacia()){
            System.out.println("No hay alumnos");
        }else{
            while (contador < tamaño){
//            System.out.print("["+ temp.listar() +"] ->");
            temp.listar();
            temp = temp.obtenerSiguiente();   
            contador++;
            }
        }
    }
    
    //algoritmo creado por mi **************************************************
    public void eliminar(String codigo){
        int contador = 0;
        int contadorPos = 0;
        int aux = 0;
        Nodo temp = inicio;
        Nodo naux = inicio;
        if(estaVacia()){
            System.out.println("La lista esta vacia");
        }else{
            while (contador < tamaño){
                if(temp.obtenerCodigo().equals(codigo)){
                    aux = contador;
                    System.out.println("Se elimino correctamente... ");
                    break;
                }
                temp = temp.obtenerSiguiente();
                contador++;
            }
            while(contadorPos < aux-1){
                naux = naux.obtenerSiguiente();
                contadorPos++;
            }
            naux.enlazarA(temp.obtenerSiguiente());
            tamaño--;
        }
    }
    //**************************************************************************
    
    public void borrarAlumno(String nombre){
        int contador = 0;
        Nodo temp , anterior;
        temp= inicio ;
        anterior = null;
        while (contador < tamaño){
            if (temp.getDatos().equals(nombre)){
                System.out.println("**Se elimina a : "+temp.getDatos()+" **");
                anterior.enlazarA(temp.obtenerSiguiente());
            }
            anterior = temp;
            temp = temp.obtenerSiguiente();
            
            contador++;
        }
        tamaño--;
    }
    //metodo para bustar un alumno**********************************************
    public void buscar(String codigo){
        int contador = 0;
        Nodo temp;
        temp = inicio;
        while(contador<tamaño){
            if (temp.obtenerCodigo().equals(codigo)){
                temp.listar();
                break;
            }
            temp = temp.obtenerSiguiente();
        }
    }
    //metodo para ordenar alumnos alfaveticamente por su nombre*****************
    public void ordenarNombre(){
        int contador1 = 0;
        int contador2 = 0;
        Nodo temp1 = inicio;
        Nodo temp2 = inicio;
        while(contador1 < tamaño){
            while(contador2 < tamaño){
                //si tamp1 es va antes que temp2 debuelve un valormneor a 0(entra al if )
                if ((temp1.obtenerNombre()).compareToIgnoreCase(temp2.obtenerNombre()) < 0){
                    System.out.println("entro al if");
                    Nodo aux = temp2;
                   temp2.setDatos(temp1.getDatos());
                   aux.enlazarA(inicio);
                    
                }
                System.out.println("entro bucle");
                contador2++;
                temp2 = temp2.obtenerSiguiente();
            }
            temp1 = temp1.obtenerSiguiente();
            contador1++;
        }
    }
    
//    public void ordenar(){
//        char a;
//        String let,aux;
//        for (int i = 97; i<123 ; i++){
//            a = (char) i;
//            for(int j = 0 ; j < tamaño ; j++){
//                aux 
//            }
//        }
//    }
}
