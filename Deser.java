public class Deser extends Check {
    public int a,b,c;
    void set(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    int product(){
        return a*b*c;
    }

  public static void main(String args[]){
      Deser d=new Deser();
      d.set(2,3,4);
      System.out.println(d.product()+d.sum());
  }
}
