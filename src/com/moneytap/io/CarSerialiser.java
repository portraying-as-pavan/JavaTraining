package com.moneytap.io;

import com.moneytap.pojo.Car;

import java.io.*;
import java.util.ArrayList;


public class CarSerialiser {

    public static boolean isUnique(File file,Car car) throws Exception{
        FileInputStream fin=new FileInputStream(file);
        ObjectInputStream in=new ObjectInputStream(fin);
        while (true){

                try {
                    Car c= (Car) in.readObject();
                    if(c.getEngineCapacity()== car.getEngineCapacity()){
                        return false;
                    }
                }catch (EOFException eof){
                    break;
                }


        }
        in.close();
        fin.close();
      return true;
    }


    public static void main(String[] args) throws Exception{
        Car car1=new Car("BMW",1100,"Pavan");
     //   Car car2=new Car("Ferrari",1100,"Rakesh");
        Car car3=new Car("1.Lamborghini",2000,"Ramesh");
        Car car4=new Car("Lamborghini",1300,"Raju");

        ArrayList<Car> carList=new ArrayList<>();

        carList.add(car1);
        //carList.add(car2);
        carList.add(car3);
        carList.add(car4);


        File carFile=new File("./resources/car.txt");
        FileOutputStream fout=new FileOutputStream("./resources/car.txt",true);
        ObjectOutputStream out=null;


        if (carFile.length()<1){
            System.out.println("Inside Default OutputStream");
            out=new ObjectOutputStream(fout);

        }
        else{
            System.out.println("Inside CarOutput stream");
            out=new CarOutputStream(fout);
        }

         try{

            for(Car car:carList){
                if(isUnique(carFile,car)) {
                    out.writeObject(car);
                    System.out.println("Car Inserted "+car.getCarName());
                }
                else {
                    throw new DuplicateEngineNumberException("Duplicate Found "+car.getCarName());
                }
            }
        }catch (DuplicateEngineNumberException duplicateEngine ){
                //duplicateEngine.printStackTrace();
             System.out.println(duplicateEngine.getMessage());
        }




        fout.close();
        out.close();

        System.out.println("Serailisation done");
        System.out.println();

/*
        FileInputStream fin=new FileInputStream("./resources/car.txt");
        ObjectInputStream in=new ObjectInputStream(fin);
        ArrayList<Car> deseralisedCar=new ArrayList<>();

        while (true){
            try {
                deseralisedCar=(ArrayList<Car>)in.readObject();
            }catch (EOFException eof){
                break;
            }
        }
        fin.close();
        in.close();

        System.out.println("Deserialised.........");
        System.out.println();


        for (Car car:deseralisedCar){
            System.out.println(car);
        }

 */
    }
}
