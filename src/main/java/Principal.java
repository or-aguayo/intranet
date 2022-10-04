public class Principal {
    public static void main(String[] args) {
        Principal principal= new Principal();
        principal.inicializar();
    }
    public void inicializar(){
        Curso curso = new Curso();
        curso.agregarAlumno("nombre_alumno1","apellido_alumno1","11.111.111-1","11111111121");
        //no debería agregar este alumno debido a nombre y rut ya agregados
        curso.agregarAlumno("nombre_alumno1","apellido_alumno1","11.111.111-1","11111111121");
        Alumno alumno = new Alumno("nombre_alumno2","apellido_alumno2","22.222.222-2","22222222221");
        curso.agregarAlumno(alumno);
        //mostrará dos alumnos
        curso.mostrarAlumnos();
        curso.eliminarAlumno("11.111.111-1","nombre_alumno1");
        //mostrará un alumno
        curso.mostrarAlumnos();
    }
}
