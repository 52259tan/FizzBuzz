public class Reduce {
    // While loop to n until n = 0
    public static void main(String[] args){
        int operation = 0;
        int n = 100;
        while (n!=0){
            if (n % 2 == 0){
                n = n / 2;
            } else{
                --n;
            }
            ++operation;
        }
        System.out.println(operation);
    }
}
