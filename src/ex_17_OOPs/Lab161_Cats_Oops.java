package ex_17_OOPs;

public class Lab161_Cats_Oops {
    static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat("Mufasa");
        Cat c3 = new Cat("Spicy");
        Cat c4 = new Cat("Lucy");
        Cat c5 = new Cat("Oggy");

    }
}

    class Cat {
        String name;

        Cat() {
            System.out.println("DC");
        }

        Cat(String nameGiven) {
            this.name = nameGiven;
        }

        void running() {
            int local_var = 10;
            System.out.println("Who is running->" + this.name);
        }

    }

