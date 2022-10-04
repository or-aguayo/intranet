import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Alumno> alumnos;

    public Curso(){
        this.alumnos = new ArrayList<>();
    }
    public boolean agregarAlumno(String nombre, String apellido, String rut, String nMatricula){
        if(buscarAlumno(rut,nombre) == null) {
            Alumno alumno = new Alumno(nombre, apellido, rut, nMatricula);
            this.alumnos.add(alumno);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean agregarAlumno(Alumno alumno){
        if(buscarAlumno(alumno.getRut(),alumno.getNombre()) == null){
            this.alumnos.add(alumno);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean eliminarAlumno(String rut, String nombre){
        Alumno alumno= this.buscarAlumno(rut,nombre);
        if(alumno != null){
            this.alumnos.remove(alumno);
            return true;
        }
        else {
            return false;
        }
    }

    public Alumno buscarAlumno(String rut, String nombre){
        for(Alumno alumno : this.alumnos){
            if(alumno.getNombre().equals(nombre) && alumno.getRut().equals(rut)){
                return alumno;
            }
        }
        return null;
    }
    public List buscarAlumnos(String nombre){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        for(Alumno alumno : this.alumnos){
            if(alumno.getNombre().equals(nombre)){
                alumnos.add(alumno);
            }
        }
        return alumnos;
    }

    public void mostrarAlumnos(){
        for(Alumno alumno : this.alumnos){
            System.out.println(alumno.toString());
        }
    }

    public void mostrarAlumnos(List<Alumno> alumnos){
        for(Alumno alumno : alumnos){
            System.out.println(alumno.toString());
        }
    }

}
