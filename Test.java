 class Car {

   static String isCar = "not Started";



   public static String start(){

           return isCar;
            
        }



    public void drive(){
        System.out.println("Driving");
    }

}


 class BMU {

   static String isCar = "not Started";



   public static String start(){

           return isCar;
            
        }



    public void drive(){

        start();

        System.out.println("Driving");
    }

}




public class Test {

    int age = 10;


     public static void main(String[] args) {



     System.out.println(Car.start());


     Car obj1 = new Car();


     BMU obj2 = new BMU();


     obj1.drive();


     Car.isCar = "hg";



 
     



        
    }


}
