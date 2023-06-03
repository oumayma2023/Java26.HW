package Java26.HW;

import java.util.ArrayList;

    public class Sum {
        /*
      Create a collection of integers in which you can keep duplicates.
      Write a logic to find sum of all integers
       */
        public static void main(String[] args) {
            ArrayList<Integer> arr=new ArrayList<>();
            arr.add(20);
            arr.add(20);
            arr.add(20);
            arr.add(20);

            int sum=0;
            for (Integer i : arr) {
                sum+=i;
            }
            System.out.println("Sum of all integers is "+sum);
        }
    }

