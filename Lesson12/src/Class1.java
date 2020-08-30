

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Class1 {
    public static void main(String[] arg){
        Ex1 x=new Ex1();
        x.af3();
        Ex2 k=new Ex2();
        double pr=k.area(1,2,3,4);
        System.out.println(pr);
        double tr=k.area(4,5,8,7,9,6);
        System.out.println(tr);
        double kr= k.area(5);
        System.out.println(kr);
        Ex3 n=new Ex3(5,7,"wqe");
        n.prn();
    }
}
class Ex1 {
    public void af1(){
        System.out.println("Method 1");

    }
    public void af2(){
        System.out.println("Method 2");

    }
    public void af3(){
        System.out.println("Method 3");
        this.af1();
        this.af2();

    }

}
class Ex2{
    int sq(int x){
        return x*x;
    }
    double sq(double x){
        return  x*x;
    }
    double dist(int x1,int y1,int x2,int y2){
        return sqrt( sq(x2-x1)+sq(y2-y1));
    }
        double area(int x1,int y1,int x2,int y2){
        return (x2-x1)*(y2-y1);
    }
    double area(int x1,int y1,int x2,int y2,int x3,int y3){
        double a=dist(x1,y1,x2,y2);
        double b=dist(x1,y1,x3,y3);
        double c=dist(x3,y3,x2,y2);
        double p=(a+b+c)/2;
        return sqrt(p*(p-a)*(p-b)*(p-c));
    }
    double area(int r){
        return r*r*PI;
    }

}
class  Ex3{
    int p1;
    int p2;
    String p3;

    Ex3(int p1){
    this.p1=p1;
    }
    Ex3(int p1,int p2){
        this(p1);
        this.p2=p2;
    }
    Ex3(int p1,int p2,String p3){
        this(p1,p2);
        this.p3=p3;
    }
    public void prn(){
        System.out.println(this.p1+" "+this.p2+" "+this.p3);
    }
}
class Ex4{

}
