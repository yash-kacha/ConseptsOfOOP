
package javaapplication1;

import Service.Data;
import java.util.List;
import op.Student;
public class JavaApplication1 {
        
    
    public static void main(String[] args)
    {
        Data Ds = new Data();
        System.out.println(Ds.getStudent(123L));
        
        
        List<Student> list = Ds.getAllStudent("Rajkot");
        
        for(Student s : list)
        {
            System.out.println(s);
        }
        List<Student> list2 = Ds.calclulateFees(list);
        for(Student s : list2)
        {
            System.out.println(s);
        }
        
        System.out.println(Ds.getFilter(1l));
    }
}
