public class Persona {
    String nombre;
    int edad;
    public Persona(String nombre,int edad)
    {
    this.nombre=nombre;
    this.edad=edad;
    }
     public void mostrar(){
         System.out.println("El nombre de la persona es " + nombre);
         System.out.println("La  edad de la persona es "+ edad);
     }
     public void correr(){
         System.out.println("Soy "+ nombre + " y tengo " + edad);
     }
 
    public static void main(String[] args) {
     Persona Persona1 = new Persona ("Paulo",21);
        Persona1.mostrar();
        Persona1.correr();
 }
 }
    

