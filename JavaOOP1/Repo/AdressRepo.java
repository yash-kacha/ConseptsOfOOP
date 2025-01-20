package Repo;

import java.util.ArrayList;
import java.util.List;
import op.Adress;

public class AdressRepo 
{
    public List<Adress> getAdress(long Sid) 
    {
        List<Adress> list= new ArrayList<>();
        list.add(new Adress("main","rajkot",360002L));
        list.add(new Adress("canal road","rajkot",360002L));

        return list;
    }
    
}
