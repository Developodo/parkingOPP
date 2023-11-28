package Model;

import java.util.Arrays;

public class Parking {
    private String name;
    private Car[] cars;

    public Parking(String name, int tam){
        this.name = name;
        if(tam<=1){
            tam=2;
        }
        this.cars = new Car[tam];
    }
    public Parking(){
        this("Genérico",2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "name='" + name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    /**
     * Comprueba que todos los elentos sean disntito de null
     * @return true si no hay huecos disponibles
     */
    public boolean isFull(){
        return howManyCars()==cars.length;
       /* boolean result=true;
        for(int i=0;i<cars.length&&result;i++){
            if(cars[i]==null){
                result=false;
            }
        }
        return result;*/
    }
    public int howManyCars(){
        int result = 0;
        for(Car car:cars){
            if(car!=null){
                result++;
            }
        }
        return result;
    }
    public int searchCar(String license){
        int pos=-1;

        return pos;
    }
    public int parkCar(Car car){
        return 0;
    }
    public Car unParkCar(String license){
        return null;
    }

}
