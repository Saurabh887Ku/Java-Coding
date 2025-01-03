class Ankita{
    String brand;
    int id;
    // Setter method is used to set the data which is present in this class.
    public void setData(String b, int i){// non static method 
        brand = b;
        id = i;
    } // to usi samay se bol rhe hai ki dono setter and getter mehtod hai to samajh me nhi aa rha tha kya 
    // Getter method is used to get all the data which is present in this class.
    public void getData(){
        System.out.println("Brand is => "+brand);
        System.out.println("Id is => "+id);
    }
}
public class SetterGetter {
    public static void main(String[] args) {
        Ankita ankita = new Ankita();
        // ankita.brand = "Mirzapur Brand"; ya to ye likho data set krne ke lliye 
        // ankita.id = 1234;
        ankita.setData("Mirzapur brand", 1234); // ya to ye likho data set krne ke liye
        ankita.getData(); // iske through data ko access krenge
    }
}
