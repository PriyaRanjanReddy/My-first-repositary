class Constructor3
{
Constructor3()
{
System.out.println("Constructor3");
}
}
class Constructor4 extends Constructor3
{
Constructor4()
{
System.out.println("Constructor4");
}
{
System.out.println("IIB2");
}
public static void main(String args[])
{
Constructor4 i = new Constructor4();
System.out.println("main");
}
{
System.out.println("IIB1");
}
}
//o/p:Constructor3
//IIB2
//IIB1
//Constructor4
//main