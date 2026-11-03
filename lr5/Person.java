public class Person {
    private String name;
    private Gender gender;

    public Person() {
    }

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Иван", Gender.MALE);
        people[1] = new Person("Пётр", Gender.MALE);
        people[2] = new Person("Сергей", Gender.MALE);
        people[3] = new Person("Анна", Gender.FEMALE);
        people[4] = new Person("Ольга", Gender.FEMALE);

        for (int i = 0; i < people.length; i++) {
            if (people[i].getGender() == Gender.FEMALE) {
                System.out.println(people[i].getName());
            }
        }
    }
}