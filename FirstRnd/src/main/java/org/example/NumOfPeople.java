package org.example;

import java.util.ArrayList;

/**
 * There is a bus moving in the city which takes and drops some people at each bus stop.

 * You are provided with a list (or array) of integer pairs.
 * Elements of each pair represent the number of people that get on the bus (the first item)
 * and the number of people that get off the bus (the second item) at a bus stop.

 * Your task is to return the number of people who are still on the bus after the last bus stop
 * (after the last array). Even though it is the last bus stop, the bus might not be empty and

 * some people might still be inside the bus, they are probably sleeping there :D

 * Take a look on the test cases.

 * Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0.
 * So the returned integer can't be negative.

 * The second value in the first pair in the array is 0, since the bus is empty in the first bus stop.

 public static int countPassengers(ArrayList<int[]> stops) {
 return stops.stream()
 .mapToInt(x -> x[0] - x[1])
 .sum();
 }

 */

public class NumOfPeople {



    public  int countPassengers(ArrayList<int[]> stops) {

        int inside = 0;
        int leftBus = 0;
        //Code here!
        for(int[] array :stops){
            inside += array[0];
            leftBus += array[1];
        }
        return inside - leftBus;
    }

    public static void main(String[] args) {
        NumOfPeople numOfPeople = new NumOfPeople();

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});

        System.out.println(numOfPeople.countPassengers(list));
    }


}
