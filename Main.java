public class Main (){
    public Static void main (String[]args ){
        PedirDatos pd = new PedirDatos();
        int opcion ; 

        do {
            System.out.println("-----Menu-----");
            System.out.println("1-Crear auto");
            System.out.println("2-Crear camión");
            System.out.println("3-Mostrar total de vehiculos ");
            System.out.println("4-Salir");

            opcion = pd.pedirEntero("Selecciona una opcion");

            if (opcion==4 ){
                System.out.println("BYE");
            }else {
                switch (opcion){
                    
                }
            }



        }while ();
    }
}