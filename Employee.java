package Java26.HW;

import java.util.HashMap;
import java.util.Map;

    public class Employee {
        /*
       Create a Map that will store Employee name and salary.
       Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
       John Smith=$100000
        */
        public static void main(String[] args) {
            Map<String, Integer> employee = new HashMap<>();
            employee.put("Hich em", 120_000);
            employee.put("Oum yma", 50_000);
            employee.put("Om ar", 60_000);
            employee.put("hash em ", 60_000);
            employee.put("ma lek ", 70_000);

            int maxValue = 0;
            for (Map.Entry<String, Integer> entry : employee.entrySet()) {
                if (entry.getValue() > maxValue) {
                    maxValue = entry.getValue();
                }}
            for(Map.Entry<String,Integer> e:employee.entrySet()){
                if(e.getValue()==maxValue){
                    System.out.println(e.getKey()+"=$"+e.getValue());
                }
            }
        }
    }

