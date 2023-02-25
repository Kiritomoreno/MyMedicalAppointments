public class Patient extends User {
    //Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;


    // Necesito un constructor default disponible en User
    // Estoy aplicando herencia con Super
    Patient(String name, String email){
        super(name,email);
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

}
