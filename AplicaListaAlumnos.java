//ejercicio dos
package ejercicio2;

import java.util.Scanner;

public class AplicaListaAlumnos {
    
    static Scanner teclado = new Scanner(System.in);
    static ListaAlumno lista = new ListaAlumno();
    static Nodo nodo;
    public static void main(String[] args) {
        menu();
    }
    

    

    static void menu() {
        int opcion;

        do {
            System.out.println("\n\nMenú de Opciones");
            System.out.println("==================================");
            System.out.println("[1] Insertar alumno");
            System.out.println("[2] Mostrar lista de alumnos");
            System.out.println("[3] Buscar alumno");
            System.out.println("[4] Eliminar Alumno");
            System.out.println("[5] Ordenar Alumnos por orden afabertico");
            System.out.println("===================================");
            System.out.println("[0] Salir de la Aplicación");

            System.out.print("Ingrese una Opción : ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    ingreso(pedirDatos());
                    break;
                case 2:
                    lista.mostrar();
                    break;
                case 3:
                    lista.buscar(pedirCodigo());
                    break;
                case 4:
                    lista.eliminar(pedirCodigo());
                    break;
                case 5:
                    lista.ordenarNombre();
                    break;
                    default:System.out.println("Ingrese opcion valida ");
            }

        } while (opcion != 0);
    }

    static void ingreso(Alumno valor) {
        lista.ingresarInicio(valor);
    }

    static Alumno pedirDatos() {
        String nombre;
        String codigo;
        int nota;
        do{
           System.out.print("Ingrese nombre del alumno: ");
           teclado.nextLine();
           nombre = teclado.nextLine(); 
           if (nombre.equals("")){
               System.out.println("**rellene el espacio**");
           }
        }while(nombre.equals(""));
           do {
              System.out.print("Ingrese codigo del alumno : ");
           codigo = teclado.nextLine(); 
           if (codigo.equals("")){
               System.out.println("**rellene el espacio**");
           }
           }while(codigo.equals(""));
           
           do{
             System.out.print("Ingrese nota del alumno : ");
           nota = teclado.nextInt();
           if (nota > 20 || nota < 0){
               System.out.println("**El rango de notas es de 0 a 20**");
           }
           }while(nota > 20 || nota < 0);
           
           Alumno persona = new Alumno(nombre,codigo,nota);
        
        return persona;
    }
    
    static String pedirCodigo(){
        String codigo;
        System.out.print("Ingrese codigo : ");
           teclado.nextLine();
        codigo = teclado.nextLine(); 
        return codigo;
    }
    
}
