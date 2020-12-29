class Abc{
int x;
int y;
Abc(){
System.out.println("this is default constructor");
}
Abc(int x, int y){
this();
this.x=x;
this.y=y;
System.out.println("this is parametrized constructr");
}

public void display(){
this.diplay();
System.out.println("X value is: "+x+" Y value is:"+y);
}
public void display(){
System.out.println("this is dsiplay2");
}
}

class constructor{
public static void main(String args[]){
Abc a1 = new Abc(20,50);
a1.display();
}
}