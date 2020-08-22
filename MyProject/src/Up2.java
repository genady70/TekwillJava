public class Up2 {
private int n=5;

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }
    public int sumN(int n){
        int i=1;
        int sum=0;
        while (i<5){
            sum+=i;
            i++;
        }
        return sum;
    }
    public  void afis1(int k){
    int i=0;
    while (i<k){
        System.out.print(i);
        i+=2;
    }
    }
    public  void afis2(int k){
        int i=1;
        while (i<k){
            System.out.print(i);
            i+=2;
        }
    }
    public void hello(){
       for (int i=0;i<10;i++)
        System.out.println("Hello");
    }
}

