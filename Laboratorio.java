import java.util.ArrayList;

public class Laboratorio
{
    private ArrayList<Alumno> alumnos;
    
    public Laboratorio()
    {
        alumnos = new ArrayList<Alumno>();
        
    }

    public void inscribir(String nombre, int clave)
    {
        Alumno aux = new Alumno(nombre, clave);
        alumnos.add(aux);
    }
    
    public void imprimirLista()
    {
        for(int i=0 ; i < alumnos.size() ; i++)
        {
            Alumno alumno = alumnos.get(i);
            
            System.out.println(alumno.dimeNombre(), alumno.dimeClave());
        }
    }
    
    public void darBaja()
    {
        
    }
    
}
