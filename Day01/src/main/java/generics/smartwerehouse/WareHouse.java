package generics.smartwerehouse;

public class WareHouse {
    private  String item;

    //Constructor
    public WareHouse(String item){
        this.item=item;
    }

    //GetItem function
    public String getItem(){
        return this.item;
    }

    //toString function
    @Override
    public String toString() {
        return "Item: " + item;
    }
}
