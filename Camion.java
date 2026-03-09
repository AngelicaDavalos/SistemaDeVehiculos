public class Camion extends Vehiculo{
    protected  int capacidadCarga;
    protected int numeroEjes ;
     //constructor 
     public Camion (String marca, String modelo, intr anio, double precio, int capacidadCarga, int numeroEjes){
        super(marca,modelo,anio,precio);
        this.capacidadCarga=capacidadCarga;
        this.numeroEjes=numeroEjes;

     }
     //metodos 
     public void cargarMercancia (){
        System.out.println("El camión  "+getMarca()+" esta cargando mercancia");
     }
     public void mostrarCapacida(){
        System.out.println("Capacidad de carga  "+ this.capacidadCarga);
     }
}