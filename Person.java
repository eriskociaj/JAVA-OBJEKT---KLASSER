import java.util.Random;

public class Person {
    private String name;
    private int age;
    private boolean isMale;

   // Konstruktör
    public Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    // Getters och Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Daisy", "Ethan", "Fiona", "George", "Hannah", "Ian", "Julia"};
        Random random = new Random();

        // Skapa personerna från uppgiften
        Person person1 = new Person("Pjotr", 23, true);
        Person person2 = new Person("Tengil", 109, true);
        Person person3 = new Person("Louise", 39, false);

        // Skapa en array av personerna
        Person[] people = new Person[10];
        for (int i = 0; i < people.length; i++) {
            String randomName = names[random.nextInt(names.length)];
            boolean isMale = random.nextBoolean();
            int randomAge = random.nextInt(50) + 20; // Random age between 20 and 69
            people[i] = new Person(randomName, randomAge, isMale);
        }

        // Skriv ut information om de skapade objekten
        System.out.println("Personerna från uppgiften:");
        printPersonInfo(person1);
        printPersonInfo(person2);
        printPersonInfo(person3);

        System.out.println("\nPeople Array:");
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Index " + i + ":");
            printPersonInfo(person);
            System.out.println();
        }
    }

    // Metod för att skriva ut personinformationen som är enligt uppgiften
    public static void printPersonInfo(Person person) {
        System.out.println("Namn: " + person.getName());
        System.out.println("Ålder: " + person.getAge());
        System.out.println("Kön: " + (person.isMale() ? "Man" : "Kvinna"));
    }
}
