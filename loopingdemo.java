class loopingdemo {

public static void main (String args[]){
System.out.println("this is the looping demo");

System.out.println("--------- for---------");
for (int i=0;i<10;i++) {

System.out.println("hello");
}
System.out.println("--------- while---------");
int k=1;
while(k<5)
{

System.out.println("wlecome");
k++;
}

System.out.println("----------do while---------");
int x=1;
do{

System.out.println("virtual class");
x++;
}
while(x<5);

System.out.println("----------continue statement---------");
for (int y=0;y<5;y++) {


if(y==2){
continue;
}
System.out.println("this is continue statement"+y);
}

System.out.println("----------break statement---------");
for (int yy=0;yy<5;yy++) {


if(yy==2){
break;
}
System.out.println("this is continue statement"+yy);
}

                 }
}