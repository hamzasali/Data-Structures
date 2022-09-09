import java.util.ArrayList;

public class Assignment2_NumOfPeopleInTheBus {
    public static void main(String[] args) {
        ArrayList<int[]> busStrops = new ArrayList<>();
        busStrops.add(new int[]{10, 0});
        busStrops.add(new int[]{3, 5});
        busStrops.add(new int[]{2, 5});


        System.out.println(countPassengers(busStrops));

    }

    public static int countPassengers(ArrayList<int[]> stops) {
        int numOfPeople = 0;
        for (int i = 0; i < stops.size(); i++) {
            numOfPeople += stops.get(i)[0] - stops.get(i)[1];
        }
        return numOfPeople;
    }

}
