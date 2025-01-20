
package Service;

import Repo.AdressRepo;
import Repo.DetailRepo;
import Repo.FeesRepo;
import java.util.ArrayList;
import java.util.List;
import op.Adress;
import op.Detail;
import op.Fees;
import op.Filter;
import op.Student;


public class Data {

    AdressRepo adressRepo = new AdressRepo();
    DetailRepo detailRepo = new DetailRepo();
    FeesRepo feesRepo = new FeesRepo();
    

    public Student getStudent(long Sid) {
        List<Adress> adress = adressRepo.getAdress(Sid);
        Detail detail = detailRepo.getDetail(Sid);
        Fees fees = feesRepo.getFees(Sid);
        Student s1 = new Student(adress, fees, detail);
        return s1;//new Student(adress,detail,fees);

    }

    public Filter getFilter(long Sid) {
        List<Adress> adress = adressRepo.getAdress(Sid);
        Student s1 = getStudent(Sid);
        Filter f1 = new Filter();
        f1.setCast(s1.getDetail().getCast());
        for(Adress a : adress)
        {
        f1.setCity(a.getCity());
        }
        f1.setFees(s1.getFees().getFee());
        return f1;
    }
    
    public List<Student> getAllStudent(String city) {
        List<Student> list1 = createStudentList();
        List<Student> list = calclulateFees(list1);

        List<Student> filter = new ArrayList<>();
        for (Student s : list) {
            List<Adress> address = s.getAdress();
            for (Adress a : address) {
                if (a.getCity().equals(city)) {
                    filter.add(s);
                }
            }

        }
        return filter;
    }

    private List<Student> createStudentList() {
        List<Student> list = new ArrayList();
        List<Adress> list2 = new ArrayList<>();

        list2.add(new Adress("yoginagar", "Gondal", 360311L));
        list2.add(new Adress("yoginagar", "Rajkot", 360311L));

        list.add(new Student(list2, new Fees(40000, 4000, "panding"), new Detail("dhavl", 3L, "kadiya")));
        list.add(new Student(list2, new Fees(30000, 3000, "panding"), new Detail("dhavl", 3L, "kadiya")));
        list.add(new Student(list2, new Fees(20000, 2000, "panding"), new Detail("dhavl", 3L, "kadiya")));

        return list;
    }

    public List<Student> calclulateFees(List<Student> list) {

        for (Student s : list) {
            if (s.getFees().getStatus().equals("panding")) {
                Fees fees = new Fees();
                fees = s.getFees();
                fees.setFees(fees.getFee() - fees.getDis());
                s.setFees(fees);
            }

        }
        return list;
    }
}
