class test 
{
int x=10;
void show(int x)
{
System.out.println(x);
System.out.println(this.x);
System.out.println(this);//this is use for reference for this
}
public static void main(String...s)
{
test t1=new test();
t1.show(20);
System.out.println(t1);//this is use for 0bject reference
test t2=new test();
t2.show(30);
System.out.println(t2);
}
}