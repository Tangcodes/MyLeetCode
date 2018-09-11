
package employeeimportance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeImportance {
    
    static class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
    }
    
    static HashMap<Integer, Employee> map = new HashMap<> ();
    
    public static int getImportance(List<Employee> employees, int id) {
        for (Employee e: employees) {
            map.put(e.id, e);
        }
        return getImportance(id);
    }
    
    private static int getImportance(int eid) {
        int res = 0;
        Employee e = map.get(eid);
        if (e.subordinates.size() == 0) return e.importance;
        for (int id: e.subordinates) res += getImportance(id);
        return res + e.importance;
    }
    
    public static void main(String[] args) {
        int id =1;
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        List<Integer> s1= new ArrayList<>();
        s1.add(2);s1.add(3);
        List<Integer> s2= new ArrayList<>();
        List<Integer> s3= new ArrayList<>();
        e1.id=1;e1.importance=5;e1.subordinates=s1;
        e2.id=2;e2.importance=3;e2.subordinates=s2;
        e3.id=3;e3.importance=3;e3.subordinates=s3;
        List<Employee> e = new ArrayList<>();
        e.add(e1);e.add(e2);e.add(e3);
        System.out.println(getImportance(e,id));
    }
}
