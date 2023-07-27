//Class abstract

abstract class PBO{
	void print (String Masakan){}
}

//Overriding

class Surabaya extends PBO{
	@Override
	void print (String Masakan){
		System.out.println("Print Overide");
	}
}

//Inheritance
class Pegawai{  
    float salary=40000;  
}

class Sales extends Pegawai{
    int bonus=5000;
}

class Programmer extends Pegawai{  
    int bonus=10000;  
    public static void main(String args[]){  
        Programmer p=new Programmer(); 
        Sales q=new Sales();
        System.out.println("Both salary is:"+p.salary);  
        System.out.println("Bonus of Sales is:"+q.bonus);
        System.out.println("Bonus of Programmer is:"+p.bonus);
}  
}  

//Encapsulation
class Person {
	private String name;
	private int age;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}

public class Main {
	public static void main(String[] args)
	{
		Person person = new Person();
		person.setName("Doni");
		person.setAge(30);

		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
	}
}

//Overloading

class BelajarJava {
   
  static int tambah(int var1, int var2) {
    return var1 + var2;
  }
    
  static int tambah(int var1, int var2, int var3) {
    return var1 + var2 + var3;
  }
    
  static String tambah(String var1, String var2) {
    return var1 + "tambah" + var2;
  }
 
  public static void main(String args[]){
    System.out.println( tambah(1,2) );
    System.out.println( tambah(5,4,3) );
    System.out.println( tambah("satu","dua") );
  }
   
}