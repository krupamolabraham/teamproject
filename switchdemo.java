class switchdemo{
 public static void main(String args[])
{
System.out.println("--this is switch demo");
String choice="bye";
switch(choice)
{
case "hi": System.out.println("selected hi");
break;
case "hello": System.out.println("selected hello");
break;
case "bye": System.out.println("selected bye");
break;
default: System.out.println("wrong selection");
break;
}
}
}