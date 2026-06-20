package ex_17_OOPs;

public class  Lab164_Cars {
    static void main(String[] args) {
        Car t = new Car();
        System.out.println(t.name);
        Car p1 = new Car("Xuv");
        Car p2 = new Car("Tesla","Xaxs");
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p2.model);

    }
}
class Car {
    String name;
    int year;
    String model;
     Car(){
         name = "Unkown";
         year = 4353;
         model = "123";
     }
     Car(String GivenName ){
         this.name = GivenName;
     }
     Car(String GivenName, String model){
         this.name = GivenName;
         this.model = model;
     }

//     test123
}
