class Constructor5
{
Constructor5()
{
System.out.println("Constructor5");
}
}
class Constructor6 extends Constructor5
{
Constructor6()
{
this(10);
System.out.println("Constructor4");
}
Constructor6(int i)
{
System.out.println("Constructor4 parameterized");
}
public static void main(String args[])
{
Constructor6 i = new Constructor6();
System.out.println("main");
}
}
//o/p:Constructor5
//Constructor4 Parameterized
//Constructor4
//main