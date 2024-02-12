public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.name = "Tom";
        cat1.color = "black";
        cat1.age = 3;
        cat1.gender = "male";
        System.out.println(cat1.name + "\n" + cat1.color + "\n" + cat1.age + "\n" +
                cat1.gender);
        System.out.println(" ");


        Cat cat2 = new Cat("Myshyk", "black", 5, "fymale");

        System.out.println(cat2.name + "\n" + cat2.color + "\n" + cat2.age
                + "\n" + cat2.gender);

        System.out.println(" ");

        Dog dog1 = new Dog();
        dog1.name = "Tom";
        dog1.color = "black";
        dog1.age = 3;
        dog1.gender = "male";
        System.out.println(dog1.name + "\n" + dog1.color + "\n" + dog1.age +
                "\n" + dog1.gender);

        System.out.println(" ");
        Dog dog2 = new Dog("Reks", "black", 8, "male");
        System.out.println(dog2.name + "\n" + dog2.color + "\n" + dog2.age +
                "\n" + dog2.gender);

    }
}