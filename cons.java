class Xyz{
 void disp1(){

System.out.println("this is display method");
}
}
class Abc extends Xyz{
 void disp2(){
System.out.println("display method2");
}
}
class cons{
public static void main(String args[]){
Abc a1 = new Abc();
a1.disp2();
a1.disp1();
}
}