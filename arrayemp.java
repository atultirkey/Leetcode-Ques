import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class  Employ{
    private final String Empname;
    private final int Emno;
    private final String Joindate;
    private final char Dcode;
    private final String Dept;
    private final int Basic;
    private final int HRA;
    private final int IT;

    Employ(int emno,String empname, String joindate, char dcode, String dept, int basic, int hra, int it) {
        Empname = empname;
        Emno = emno;
        Joindate = joindate;
        Dcode = dcode;
        Dept = dept;
        Basic = basic;
        HRA = hra;
        IT = it;
    }

    public char getDcode() {
        return Dcode;
    }

    public int getBasic() {
        return Basic;
    }

    public int getHRA() {
        return HRA;
    }

    public int getIT() {
        return IT;
    }

    public int getEmno() {
        return Emno;
    }

    public String getEmpname() {
        return Empname;
    }

    public String getDept() {
        return Dept;
    }

    public String getJoindate() {
        return Joindate;
    }
}

public class ArrayEmp {

    public static int calculateSalary(int basic, int hra, int it, int da){
        return basic + hra + da - it;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employ[] allEmp = new Employ[7];
        allEmp[0] = new Employ(1001, "Atul", "01/04/2009", 'e', "R&D", 20000, 8000, 3000);
        allEmp[1] = new Employ(1002, "Seema", "23/08/2012", 'c', "PM", 30000, 12000, 9000);
        allEmp[2] = new Employ(1003, "Tirkey", "12/11/2008", 'k', "Acct", 10000, 8000, 1000);
        allEmp[3] = new Employ(1004, "Jacob", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000);
        allEmp[4] = new Employ(1005, "Virat", "16/07/2005", 'm', "Engg", 50000, 20000, 20000);
        allEmp[5] = new Employ(1006, "Hardik", "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400);
        allEmp[6] = new Employ(1007, "jarvish", "12/06/2006", 'c', "PM", 29000, 12000, 10000);

        Map<Character, Integer> empMap = new HashMap<>();
        empMap.put('e', 20000);
        empMap.put('c', 32000);
        empMap.put('k', 12000);
        empMap.put('r', 15000);
        empMap.put('m', 40000);

        Map<Character, String> decodeToDesignation = new HashMap<>();
        decodeToDesignation.put('e', "Engineer");
        decodeToDesignation.put('c', "Consultant");
        decodeToDesignation.put('k', "Clerk");
        decodeToDesignation.put('r', "Receptionist");
        decodeToDesignation.put('m', "Manager");

        Employ curr = null;
        int DaValue, salary;
        System.out.println("Enter Emp No :- ");
        int empno = in.nextInt();

        for (Employ employ : allEmp) {
            if (empno == employ.getEmno()) {
                curr = employ;
                break;
            }
        }

        if(curr != null){
            DaValue = empMap.get(curr.getDcode());
            salary = calculateSalary(curr.getBasic(), curr.getHRA(), curr.getIT(),DaValue);
            System.out.println("EmpNo " + curr.getEmno());
            System.out.println("EmpName " + curr.getEmpname());
            System.out.println("Department " + curr.getDept());
            System.out.println("Designation " + decodeToDesignation.get(curr.getDcode()));
            System.out.println("salary " + salary);
            return;
        }
        System.out.println("there is no employee with EmpNo " + empno);

    }
}