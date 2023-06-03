package Java26.HW;

import java.util.LinkedHashSet;



    public class Concatenation {
        /*
       Create the collection that will store single uniques Objects of a String type in which order is preserved.
       Write a logic to concatenate all string from the collection.
        */
        public static void main(String[] args) {
            LinkedHashSet<String> str=new LinkedHashSet<>();
            str.add("The");
            str.add("Java");
            str.add("class");
            str.add("make ");
            str.add("me");
            str.add("crazy");
            str.add("and");
            str.add("angry");

            StringBuilder newStr=new StringBuilder();

            for (String s : str) {
                newStr.append(s+" ");
            }
            System.out.println(newStr);
        }
    }

