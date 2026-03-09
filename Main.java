public class  Main {
    public static void main (String[]args ){
        PedirDatos pd = new PedirDatos();
        int opcion ; 

        do {
            System.out.println("-----Menu-----");
            System.out.println("1-Crear auto");
            System.out.println("2-Crear camión");
            System.out.println("3-Mostrar total de vehiculos ");
            System.out.println("4-Salir");
            System.out.println("________________________________________");

            opcion = pd.pedirEntero("Selecciona una opcion");

            if (opcion==4 ){
                System.out.println("BYE");
            }else {
                switch (opcion){
                    case 1 :
                    System.out.println("--------Crear auto---------");
                    String marca = pd.pedirCadena("Ingresa la marca  ");
                    String modelo = pd.pedirCadena("Ingresa el modelo  ");
                    int anio = pd.pedirEntero("Ingresa el año en que salio  ",2000,2026);
                    double precio = pd.pedirDecimal("Ingresa el precio  ");
                    int puertas = pd.pedirEntero("Ingrese el numero de puertas que tiene  ",2,16);
                    String combustible = pd.pedirCadena("Ingrese el tipo de combustible  ");
                    System.out.println("________________________________________");
                    Auto auto = new Auto(marca,modelo,anio,precio,puertas,combustible);

                    auto.mostrarInfo();
                    auto.tocarClaxon();
                    auto.mostrarPuertas();

                    break;

                    case 2 : 
                     System.out.println("----------Crear camión----------");
                     String marca1 = pd.pedirCadena("Ingresa la marca  ");
                     String modelo1 = pd.pedirCadena("Ingresa el modelo  ");
                     int anio1 = pd.pedirEntero("Ingresa el año en que salio  ",2000,2026);
                     double precio1 = pd.pedirDecimal("Ingresa el precio  ");
                     int carga = pd.pedirEntero("Ingrese la capacidad de carga  ");
                     int ejes = pd.pedirEntero("Ingrese el numero de ejes  ",2,10);
                     System.out.println("________________________________________");
                     Camion camion = new Camion(marca1, modelo1, anio1, precio1 , carga, ejes );

                     camion.mostrarInfo();
                     camion.cargarMercancia();
                     camion.mostrarCapacidad();

                     break;

                     case 3 :
                      System.out.println("-----------Vehiculos Creados--------------");
                     System.out.println("Total de vehiculos creados   "+Vehiculo.totalVehiculos);
                     System.out.println("________________________________________");
                     break;
                    default:
                    System.out.println("Opcion invalida ");

                }
            }



        }while (opcion != 4);
    }
}