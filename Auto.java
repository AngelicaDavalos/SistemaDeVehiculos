public class Auto extends Vehiculo{
    protected int numeroPuertas;
    protected String tipoCombustible;

    //constructor
     public Auto (String marca, String modelo, int anio, double precio, int numeroPuertas, String tipoCombustible){
        super(marca.modelo,anio,precio);
        this.numeroPuertas=numeroPuertas;
        this.tipoCombustible=tipoCombustible;
     }
     //metodo 

     public void tocarClaxon (){
        System.out.println("El auto "+getMarca()+" toca el claxon");
     }
     public void mostrarPuertas(){
        System.out.println("Numero de puertas que tiene el auto  "+this.mostrarPuertas);
     }
}