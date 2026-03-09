public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio ; 
    private double precio ; 
    public Static int totalVehiculos =0;
    
    //costructores 
    public Vehiculo(){
        totalVehiculos++;
    }

    public Vehiculo(String marca, String modelo, int anio, double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
        this.precio=precio;
        totalVehiculos++;
    }


    //setters
    public setMarca (String marca){
        this.marca=marca;
    }
    public setModelo (String modelo){
        this.modelo=modelo;
    }
    public setAnio(int anio){
        this.anio=anio;
    }
    public SetPrecio(double precio){
        this.precio=precio;
    }

    //metodo
     public void mostrarInfo(){
        System.out.println("Marca  "+this.marca);
        System.out.println("Modelo  "+this.modelo);
        System.out.println("Año  "+this.anio);
        System.out.println("Precio  "+this.precio);
    
     }
     public void encender (){
        System.out.println("El vehiculo  "+this.marca+"  ha sido encendido ");
     }
     public void aplicarDescuento(){
        double descuento = precio*.10;
        System.out.println("El descuento es de "+descuento);
     }

     //getters
      public String getMarca (){
        return this.marca;
      }
      public String getModelo(){
        return this.modelo;
      }
      public int getAnio(){
        return this.anio;
      }
      public double getPrecio(){
        return this.precio;
      }

}