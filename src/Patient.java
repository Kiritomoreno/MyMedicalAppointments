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
    private String phoneNumber;
        /*
        Ahora no podemos añadirle los nuevos atributos  o cambiar el nombre.
        Pero tenemos otra forma más facil que sesuelve muestra validaciones y nos sigue dando acceso sin tocarlos directamente.
        Getter y Setter
        Serán los que se encargan de validar los parámetros
        Método Constructor
        Se Encarga de definir los parámetros
        */

// Método constructor sobre cargado
    Patient(String name, String email){
        this.name = name;
        this.email= email;

    }
    // Quiero que tenga acceso a una variable pero no directamente y utilizamos public
    // set recibimos un dato, lo introducimos
    public void setWeight(double weight){
        this.weight = weight;
    }
    // este metodo get nos devuelva este formato que queremos
    public String getWeight(){
        return this.weight + " Kg.";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 8){
            System.out.println("El número de telefóno debe ser de 8 dígitos");
        }else if(phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }
}
