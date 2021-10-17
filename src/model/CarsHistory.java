/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rakeshbaddi
 */
public class CarsHistory {
    
    private ArrayList<Car> history;
    public String timeStamp;
    
    public CarsHistory() {
        this.history = new ArrayList<Car>();
    }

    public ArrayList<Car> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Car> history) {
        this.history = history;
    }
    
    public Car addNewCars(){
        Car newCar = new Car();
        history.add(newCar);
        timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        return newCar;
    }
    
    public void deleteCar(Car car) {
        history.remove(car);
    }
    
    public Car updateCar(int index) {
        Car newCar = new Car();
        history.set(index, newCar);
        timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        return newCar;
    }
}
