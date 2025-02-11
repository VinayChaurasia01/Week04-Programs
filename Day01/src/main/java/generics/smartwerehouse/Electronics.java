package generics.smartwerehouse;

public class Electronics extends WareHouse{

    //Constructor
    public  Electronics(String name){
        super(name);
    }

    //Overriding function
    @Override
    public String toString(){
        return "Electronic :"+getItem();
    }
}
