public class Vehiculo{

    String empresa_propietaria;
    int numero_pasajeros;
    double capacidad_combustible;
    double rendimiento_millas;
    
    public Vehiculo(String empresa_propietaria,int numero_pasajeros,double capacidad_combustible,double rendimiento_millas)
    {
        this.empresa_propietaria=empresa_propietaria;
        this.numero_pasajeros=numero_pasajeros;
        this.capacidad_combustible=capacidad_combustible;
        this.rendimiento_millas=rendimiento_millas;
    }
    public double calcularRango()
            {
                return capacidad_combustible * rendimiento_millas;
            }
    public void mostrar(){
        System.out.println(" La Minivan de la empresa "  + empresa_propietaria+" puede llevar " + numero_pasajeros+ " pasajeros con un rango de " + calcularRango() + " millas ");
    }
    public void informar(){
        System.out.println(" El Doubus de la empresa "  + empresa_propietaria+" puede llevar " + numero_pasajeros+ " pasajeros con un rango de " + calcularRango()+ " millas ");
    }
    
       
    
    public static void main(String[] args) {
        Vehiculo Vehiculo1= new Vehiculo ("Cootranar",11,29,22);
        Vehiculo Vehiculo2= new Vehiculo ("TrasArauca",40,28,35);
        Vehiculo1.mostrar();
        Vehiculo2.informar();
}
}
