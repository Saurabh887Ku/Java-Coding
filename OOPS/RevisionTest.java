abstract class Buttery{
    abstract public void serialNumber();
    abstract public void typeOfButtery();
}
class HP extends Buttery{
    public void serialNumber(){
        System.out.println("3232SR");
    }
    public void typeOfButtery(){
        System.out.println("Lithim");
    }
}
class Lenovo extends Buttery{
    public void serialNumber(){
        System.out.println("3232LENOVO");
    }
    public void typeOfButtery(){
        System.out.println("SIlver");
    }
}
class RevisionTest{
    public static void main(String[] args) {
        Buttery b1 = new HP();
        b1.serialNumber();
        b1.typeOfButtery();
        Buttery b2 = new Lenovo();
        b2.serialNumber();
        b2.typeOfButtery();
    }
}