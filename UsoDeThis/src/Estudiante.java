public class Estudiante {
    String nombre;
    int edad;


    public Estudiante(){
        this("Desconocido", 0);

    }

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre del estudiante: "+this.nombre+"\nEdad del estudiante: "+this.edad);

    }

}
