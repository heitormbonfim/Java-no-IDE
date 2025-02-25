import people.Person;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello, Jobs Java program here");

    Person firstPerson = new Person();
    firstPerson.setName("Heitor");

    String firstPersonName = firstPerson.getName();

    System.out.println(firstPersonName);
  }
}