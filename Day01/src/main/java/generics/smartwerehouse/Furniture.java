package generics.smartwerehouse;

public class Furniture extends WareHouse{

    //Constructor
    public Furniture(String name){
        super(name);
    }

    //toString function to get name of item
    public String toString(){
        return "Furniture :"+getItem();
    }
}
