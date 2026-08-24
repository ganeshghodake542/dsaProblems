package String;

public class GetShortestPath {
    public static void main(String[] args) {

        String route = "EENNW";

        int x = 0;
        int y = 0;

        for (int i = 0; i < route.length(); i++) {

            char direction = route.charAt(i);

            if (direction == 'E') {
                x++;
            } else if (direction == 'W') {
                x--;
            } else if (direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            }
        }

        int shortestDistance = Math.abs(x) + Math.abs(y);

        System.out.println("Shortest distance = " + shortestDistance);
    }
}