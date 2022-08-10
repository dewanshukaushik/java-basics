class test
{
  int  x=10,y=20;
  void show()
 {
   System.out.println(x);
   System.out.println(y);
  }
  public static void main(String...s)
 {
       new test ().show();
     System.out.println(new test().hashCode()); //hash code is use for reference
   }
}
// this programe is use for anunmas objet