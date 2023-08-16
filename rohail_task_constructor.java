package hello.com;
class A{
    private int x ;
    // Using Constructor:
     A(){
         this.x = 10;
         System.out.println("Setting value of x:" + x);

    }
    A(int value){
         x = value;

        System.out.println("Setting value of x" + x);
    }
        }
public class rohail_task_constructor {
    public static void main(String[] args) {
    A obj =  new A();


    }
}