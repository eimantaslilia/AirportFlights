import java.util.ArrayList;
import java.util.HashMap;

public class Planes {
    ArrayList<String> flights = new ArrayList<String>();
    HashMap<String, String> planes;
    private Reader reader;

    public Planes() {
        this.planes = new HashMap<String, String>();
        this.reader = new Reader();
    }

    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print(">");
            String command = reader.getCommand();
            if (command.equals("1")) {
                System.out.print("Give plane ID: ");
                String id = reader.readString();
                System.out.print("Give plane capacity: ");
                String capacity = reader.readString();
                addPlane(id, capacity);
            } else if (command.equals("2")) {
                System.out.print("Give plane ID: ");
                command = reader.getCommand();
                System.out.print("Give departure airport code: ");
                String dep = reader.getCommand();
                System.out.print("Give destination airport code: ");
                String dest = reader.getCommand();
                addFlight(command, dep, dest);


            } else if (command.equals("x")) {
                System.out.println("");
                System.out.println("Flight service");
                System.out.println("------------");
                System.out.println("");
                break;
            }
        }
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print(">");
            String command = reader.getCommand();
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                printAllPlanes();
            } else if (command.equals("2")) {
                printFlights();
            }
            else if (command.equals("3")) {
                printPlane();
            }
        }

    }

    public void addPlane(String name, String capacity) {
        this.planes.put(name, capacity);
    }

    public ArrayList<String> planesToArray() {
        ArrayList<String> nameAndCap = new ArrayList<String>();
        for (String i : this.planes.keySet()) {
            nameAndCap.add(i + " (" + this.planes.get(i) + " ppl)");
        }
        return nameAndCap;
    }

    public void printPlane() {
        System.out.print("Give plane ID: ");
        String command = reader.getCommand();
        ArrayList<String> nameAndCap = planesToArray();
        for (String plane : nameAndCap) {
            if (plane.contains(command)) {
                System.out.println(plane);
                System.out.println("");
            }
        }
    }

    public void printAllPlanes() {
        ArrayList<String> nameAndCap = planesToArray();
        for (String plane : nameAndCap) {
            System.out.println(plane);
        }
    }
    public void addFlight(String command, String dep, String dest){
        ArrayList<String> nameAndCap = planesToArray();
        for(String plane : nameAndCap) {
            if (plane.contains(command)){
                plane = plane + " (" + dep + "-" + dest + ")";
                flights.add(plane);
            }
        }
    }
    public void printFlights(){
        for(String plane : flights){
            System.out.println(plane);
        }
    }
}
