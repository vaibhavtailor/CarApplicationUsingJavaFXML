package Utilities;

import models.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DBUtilities {
    private static ArrayList<Car> carList = new ArrayList<>();

    public static ArrayList<Car> addCars()
    {
        ArrayList<Car> cars = new ArrayList<>();
        Car car1 = new Car("Jaguar", "XJ5", "White", "Automatic", "Sedan", 100000, 4, 9.3, false);
        Car car2 = new Car("BMW", "M4", "Bue", "Automatic", "Convertible", 89000, 2, 6.8, false);
        Car car3 = new Car("Dodge", "Journey", "Black", "Gear", "Wagon", 15000, 7, 20.3, true);
        Car car4 = new Car("Ferrari", "812", "Red", "Automatic", "Sports", 340000, 2, 5.9, false);
        Car car5 = new Car("BMW", "X1", "White", "Gear", "Sedan", 52000, 4, 11.3, true);


        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        cars = carList;
        return cars;
    }

    public static ArrayList<Car> sortByCompany() {
        List<String> companyName = new ArrayList<>();

        for(int i=0; i<carList.size(); i++)
            companyName.add((String) carList.get(i).getCompanyName());
        Collections.sort(companyName);

        ArrayList<Car> companyNameAsc = new ArrayList<>();

        for(int i=0; i<companyName.size(); i++) {
            for(int j=0; j<carList.size(); j++) {
                String name = (String) carList.get(j).getCompanyName();
                if(companyName.get(i).equals(name))
                    companyNameAsc.add(carList.get(i));
            }
        }
        return companyNameAsc;
    }

    public static ArrayList<Car> sortPriceAscending() {
        List<Integer> ascendingPrice = new ArrayList<>();

        for(int i=0; i<carList.size(); i++)
            ascendingPrice.add((int) carList.get(i).getPrice());
        Collections.sort(ascendingPrice);

        ArrayList<Car> ascendingList = new ArrayList<>();

        for(int i=0; i<ascendingPrice.size(); i++) {
            for(int j = 0; j<carList.size(); j++) {
                int price = (int) carList.get(j).getPrice();
                if (ascendingPrice.get(i) == price)
                    ascendingList.add(carList.get(i));
            }
        }
        return ascendingList;
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
