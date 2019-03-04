import java.util.Scanner;

public class Reader {
    private Scanner reader;

    public Reader(){
        this.reader = new Scanner(System.in);
    }
    public String readString(){
        String command = reader.nextLine();
        return command;
    }
    public int readInteger(){
        String command = reader.nextLine();
        int number = Integer.parseInt(command);
        return number;
    }
    public String getCommand() {
        String input = reader.nextLine();
        return input;
    }
}
