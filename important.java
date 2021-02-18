public Maruti800()
   {​​​​
    System.out.println("Maruti Model: 800");
   }​​​​
   public void speed()
   {​​​​
    System.out.println("Max: 80Kmph");
   }​​​​

















class Author
{
  String authorName;
  int age;
  String place;

  // Author class constructor
  Author(String name, int age, String place)
  {
    this.authorName = name;
    this.age = age;
    this.place = place;
  }
}

class  Book
{
  String name;
  int price;
  // author details
  Author auther;
  Book(String n, int p, Author auther)
  {
    this.name = n;
    this.price = p;
    this.auther = auther;
  }
  public static void main(String[] args) {
    Author auther = new Author("John", 42, "USA");
    Book b = new Book("Java for Begginer", 800, auther);
    System.out.println("Book Name: "+b.name);
    System.out.println("Book Price: "+b.price);
    System.out.println("------------Auther Details----------");
    System.out.println("Auther Name: "+b.auther.authorName);
    System.out.println("Auther Age: "+b.auther.age);
    System.out.println("Auther place: "+b.auther.place);
  }
  
}






























//////////////////////
method over loading
polymorphism

create contact

public class OverloadDemo {​​​​
 
    void createContact(String n,long ph)
    {​​​​
        System.out.println("Name :"+n + " "+"Phone : "+ph);
    }​​​​

    void createContact(String n,long ph1,long ph2)
    {​​​​
     System.out.println("Name :"+n + " "+"Phone : "+ph1+","+ph2);
    }​​​​
    public static void main(String[] args) {​​​​

        OverloadDemo p1=new OverloadDemo();
        p1.createContact("Raj", 7869878711L);
        p1.createContact("Mike", 5454677,868899);
    }​​​​
 
}​​​​