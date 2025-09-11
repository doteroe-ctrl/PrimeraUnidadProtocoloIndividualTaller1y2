public class Estudiante {
    String nombre;
    int edad;
    String curso;

    public Estudiante(){
        nombre = "desconocido";
        edad = 0;
        curso = "desconocido";
    }

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(String nombre, int edad, String curso){
        this(nombre, edad);
        this.curso = curso;
    }
    public String toString(){
        return "\nNombre= " + nombre + "\nEdad= " + edad + "\nCurso= "+curso; 

    }

}
