public class Count {
   
    String titular;
    double total;

   
   public Count (String titular){
       this.titular=titular;
               this.total=5000;
               
   }
   
    public Count (String titular,double cantidad){
       this.titular=titular;
               this.total=5000 + cantidad;
   }
    public String getTitular()
    {
return titular;
    }
    public void setTitular (String titular)
    {
        this.titular=titular;
    }
    public double getTotal()
    {
return total;
    }
    public void setTotal (double total)
    {
        this.total=total;
    }
   
    public void ingresar( double cantidad){
        if (cantidad >0) {
            this.total += cantidad;
            System.out.println(" Se ingreso $ " +cantidad+ " Nuevo Saldo $ "+ this.total);
        }
        else {
            System.out.println("No se puede ingresar una cantidad negativa.");
        }
        }

        public void retirar(double cantidad)
        {
        if (cantidad<0) {
            System.out.println("Intento de retiro fallido. Se restablece el saldo a $5000.");
        }
        else if (this.total-cantidad < 0)
        {
            System.out.println("Fondos insuficientes");
            this.total = 0;
            this.total=0;
        }
        else {
            this.total-=cantidad;
            
            System.out.println("Se retira con exito $" + cantidad + ". Nuevo saldo: $" + this.total);
        }
        }
       
    public static void main(String[] args) {
        Count cuenta1= new Count ("Maria del Mar P");
                 System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo inicial: $" + cuenta1.getTotal());
         cuenta1.ingresar(2000);
         cuenta1.retirar(2000);
           cuenta1.retirar(6000);
             cuenta1.retirar(-500);
             Count cuenta2= new Count ("Juan Jose P",8000);
                 System.out.println("Titular: " + cuenta2.getTitular());
        System.out.println("Saldo inicial: $" + cuenta2.getTotal());
        cuenta2.ingresar(3000);
         cuenta2.retirar(-2000);
           cuenta2.retirar(60000);
           
    }
}
   