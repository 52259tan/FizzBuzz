import java.util.HashSet;

public class Multiples {
    // Let n, k be natural numbers such that 3n < 1000, 5k <1000.
    // Append every 3n, and 5k into a set;
    // We use set so that there are no duplicates;
    // Count the length of the set;
    public static void main(String[] args){
        HashSet<Integer> lst = new HashSet<Integer>();

        //Multiples of 3
        int n = 1;
        while (3*n < 1000){
            lst.add(3*n);
            ++n;
        }
        // Multiples of 5
        int k = 5;
        while (3*n < 1000){
            lst.add(3*n);
            ++n;
        }
        //Length of set
        int size = lst.size();

        //Checker
        boolean good = true;
        for (int i: lst){
            if ((i%3 !=0 && i%5 !=0) || i>= 1000){
                good = false;
            }
        }
        System.out.println(size);
    }
}
