package generics.smartwerehouse;

public class Groceries extends WareHouse{

    //Constructor
    public Groceries(String name){
        super(name);
    }
    //toString function to get name of item
    public String toString(){
        return "Groceries :"+getItem();
    }

}
