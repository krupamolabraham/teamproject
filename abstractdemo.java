abstract class RBI{
  abstract void loan();
public void display(){
}
class SBI extends RBI{
        void loan(){
System.out.println("SBI provides personalloan with 8% rate of interest");
}

}
class AXIS extends RBI{
     void loan(){
System.out.println("SBI provides personalloan with 9% rate of interest");
}

}
class abstractdemo{

 public static void main(String args[]){
        

System.out.println("--this is abstract demo");

     SBI s = new SBI();
      s.loan();
     RBI r = new SBI();
    r.loan();

}
}