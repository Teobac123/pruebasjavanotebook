package empleados;

public class Empleados {
    public static void main(String[] args) {
        Datosempleado e=new Datosempleado("Mateo","Baccillere", 1);
        e.establece_PrimerNombre("Mateo");
        System.out.println(e.dame_PrimerNombre());
        Datosempleado e2=new Datosempleado();
        e2.establece_PrimerNombre("Mich");
        System.out.println(e.dame_PrimerNombre());
        e2.establece_PrimerNombre("Mateo");
        System.out.println(e.dame_PrimerNombre());
        e2.establece_PrimerNombre("La telen");
        System.out.println(e.dame_PrimerNombre());
        e2.establece_PrimerNombre("Aldana");
        System.out.println(e.dame_PrimerNombre());
        e2.establece_PrimerNombre("Diego");
        System.out.println(e.dame_PrimerNombre());
        e2.establece_PrimerNombre("Mati");
        System.out.println(e.dame_PrimerNombre());
    }  
}

class Datosempleado{

    private String FirstName;
    private String LastName;
    private int Id;

    public Datosempleado(String firstName, String LastName,int Id) {
        // This keyword refers to current instance itself
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Id = Id;
    }
    public Datosempleado(){

    }
    public void establece_PrimerNombre(String FirstName){
        this.FirstName=FirstName;
    }
    public String dame_PrimerNombre(){
        return FirstName;
    }
}


