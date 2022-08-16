class student
{
  int sid;
   String sname,colgname;
     void setdata(int si,String sn,String co)
{
   sid=si;
   sname=sn;
   colgname=co;
 }
  void getdata ()
{
   System.out.println(sid);
   System.out.println(sname);
   System.out.println(colgname);
}
   public static void main(String...s)
 {
    student s1=new student();
    s1.setdata(1,"prince","iamr"); 
    s1.getdata();
     student s2=new student();
    s2.setdata(1,"twinkle","iamr"); 
    s2.getdata();
   System.out.println(s1);
   System.out.println(s2);
  }
}