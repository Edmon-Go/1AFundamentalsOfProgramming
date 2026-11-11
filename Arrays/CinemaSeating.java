// Array: Problem 2: Multidimensional Array (Cinema Seating Chart)

import java.util.Arrays;

public class CinemaSeating {
    public static void main(String[] args) {

        // Gumawa ako ng 2D string array sa seating arrangement na nilalaman ay mga pangalan ng nakaupo
        String[][] seats = new String[][]
        {
            {"Alice", "Bob", "Charlie"},
            {"David", "Emma", "Frank"}
        };

        // Print ang name na nasa second row at third column (Frank)
        System.out.println(seats[1][2]);

        // Papalitan ang nakaupo sa first row at second column (Bob) ng Vacant meaning magiging Vacant ang Bob sa array
        seats[0][1] = "Vacant";

        // Print ang laman ng 2D array sa isang line
        System.out.println(Arrays.deepToString(seats));

    }
}