class task{
     public static void main(String args[]){
        
int mymark = 88;
 if (mymark >= 90){
  System.out.println("Outsanding");
}
 else if(mymark>=85 && mymark<90){
  System.out.println("grade is A+");
}
 else if(mymark>=80 && mymark<85){
  System.out.println("grade is A");
}
else if (mymark>=70 && mymark<80){
  System.out.println("grade is B+");
}
 else if (mymark>=60 && mymark<70){
  System.out.println("grade is B");
}
 else if (mymark>=50 && mymark<60){
  System.out.println("grade is C");
}
 else if (mymark>=45 && mymark<50){
  System.out.println(" Just Pass");
}
 else {
  System.out.println("Fail");
}
}
}