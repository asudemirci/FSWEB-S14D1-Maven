import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;

public class Main {
    public static void main(String[] args) {
        JuniorDeveloper junior = new JuniorDeveloper(1, "Ali", 8000);
        MidDeveloper mid = new MidDeveloper(2, "Ayşe", 12000);
        SeniorDeveloper senior = new SeniorDeveloper(3, "Ahmet", 16000);
        HRManager hr = new HRManager(4, "Zeynep", 20000);

        junior.work();
        mid.work();
        senior.work();
        hr.work();

        hr.addEmployee(junior, 0);
        hr.addEmployee(mid, 1);
        hr.addEmployee(senior, 1);
    }
}