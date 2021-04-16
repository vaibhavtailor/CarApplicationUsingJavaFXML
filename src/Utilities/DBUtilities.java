package Utilities;

import models.Car;

import java.util.*;

public class DBUtilities {
    private static ArrayList<Car> carList = new ArrayList<>();

    public static ArrayList<Car> addCars()
    {
        ArrayList<Car> cars = new ArrayList<>();
        Car car1 = new Car("Jaguar", "XJ5", "White", "Automatic", "Sedan", 100000, 4, 9.3);
        Car car2 = new Car("BMW", "M4", "Bue", "Automatic", "Convertible", 89000, 2, 6.8);
        Car car3 = new Car("Dodge", "Journey", "Black", "Gear", "Wagon", 15000, 7, 20.3);
        Car car4 = new Car("Ferrari", "812", "Red", "Automatic", "Sports", 340000, 2, 5.9);
        Car car5 = new Car("BMW", "X1", "White", "Gear", "Sedan", 52000, 4, 11.3);


        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        cars = carList;
        return cars;
    }

    public static ArrayList<Car> sortByCompany() {
        Collections.sort(carList, Comparator.comparing(Car::getCompanyName));
        return carList;
    }

    public static ArrayList<Car> sortPriceAscending() {
        Collections.sort(carList, Comparator.comparingInt(Car::getPrice));
        return carList;
    }

    public static ArrayList<Car> sortPriceDescending() {
        List<Integer> descendingPrice = new ArrayList<>();

        for(int i=0; i<carList.size(); i++)
            descendingPrice.add((int) carList.get(i).getPrice());
        Collections.reverse(descendingPrice);

        ArrayList<Car> descendingList = new ArrayList<>();

        for(int i=0; i<descendingPrice.size(); i++) {
            for(int j = 0; j<carList.size(); j++) {
                int price = (int) carList.get(j).getPrice();
                if (descendingPrice.get(i) == price)
                    descendingList.add(carList.get(i));
            }
        }
        return descendingList;
    }

    public static ArrayList<String> getMajors()
    {
        ArrayList<String> majors = new ArrayList<>();
        majors.addAll(Arrays.asList("Price Ascending","Price Descending","Company Name"));
        return majors;
    }

}
