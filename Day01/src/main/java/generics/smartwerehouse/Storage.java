package generics.smartwerehouse;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends  WareHouse> {

    private List<T> items;

    public Storage(){
        items=new ArrayList<>();
    }

    //Add item function
    public void add(T item){
        items.add(item);
    }

    //Get function
    public List<T> get(){
        return items;
    }
}
