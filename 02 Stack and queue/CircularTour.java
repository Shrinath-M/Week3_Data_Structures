class PetrolPump {
    int petrol;
    int distance;

    // Constructor
    public PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

public class CircularTour {
    public static int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;

        int start = 0; // Starting point
        int deficit = 0; // Keeps track of shortfall
        int surplus = 0; // Keeps track of overall surplus

        for (int i = 0; i < n; i++) {
            surplus += pumps[i].petrol - pumps[i].distance;

            // If surplus is negative, reset starting point and update deficit
            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }

        // If total surplus + deficit is negative, no solution exists
        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)
        };

        int startingPoint = findStartingPoint(pumps);

        if (startingPoint != -1) {
            System.out.println("Start the circular tour at petrol pump: " + startingPoint);
        } else {
            System.out.println("No solution exists to complete the circular tour.");
        }
    }
}
