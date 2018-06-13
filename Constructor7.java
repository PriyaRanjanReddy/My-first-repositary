class Constructor6
{
Constructor6()
{
System.out.println("Constructor6");
}
}
class Constructor7 extends Constructor6
{
Constructor7()
{
System.out.println("Constructor4");
}
Constructor7(int i)
{
this();
System.out.println("Constructor4 parameterized");
}
public static void main(String args[])
{
Constructor7 i = new Constructor7(20);
System.out.println("main");
}
}
//o/p:Constructor6
//Constructor4 
//Constructor4 Parameterized
//main