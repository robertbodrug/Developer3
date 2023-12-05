package logic;

public class SumCalculator {
    public int sum(int n){
        if(n>0) {
            int result=0;
            while (n>0){
                result+=n;
                n--;
            }
            return result;
        }
        else throw new IllegalArgumentException();
    }
}
