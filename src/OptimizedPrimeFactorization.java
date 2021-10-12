public class OptimizedPrimeFactorization implements Runnable{
    private String name;
    private Thread thread;

    public OptimizedPrimeFactorization(String name) {
        this.name = name;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (checkPrime(i)){
                System.out.println(name + "   " + i);
            }
        }
    }
    public boolean checkPrime(int n){
        if(n < 3){
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
