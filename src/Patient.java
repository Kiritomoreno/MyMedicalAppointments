public class Patient {
    //Atributos
    // encapsulamiento: Modificadores de acceso
    private int id;
    private String name;
    private String email;
    private String address;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

// Método constructor sobre cargado
    Patient(String name, String email){
        this.name = name;
        this.email= email;
        this.weight = 54.5;
        // desde aqui podemos tener acceso al dato
        System.out.println(weight+ "Kg");
    }
}
