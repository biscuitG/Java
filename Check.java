public class Check {

    private int a,b,c;

    void set(int a,int b,int c){
         this.a=a;
         this.b=b;
         this.c=c;
    }

    public int sum(){
        return a+b+c;
    }

    public static void main(String args[]){
       Check C1= new Check();
       C1.set(3,5,4);
       int b=C1.sum();
       System.out.println(b);
    }

}