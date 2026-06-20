package ex_17_OOPs;

public class Lab162_OOPs {
    static void main(String[] args) {
        Baby b1 = new Baby();
        Baby b2 = new Baby("Jacky");
        Baby b3 = new Baby("Jacky1", "1000");
    }
}
class Baby{
    String name;
    Baby(){
        System.out.println("DC");
    }

    Baby(String name){
        System.out.println("PC - name");
    }
    Baby(String name, String money){
        System.out.println("PC - name.age");
    }
}


