package spacex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Controller {

    static String csvFileHeader;
    List<Mission> list;

    public Controller() {
        list = new ArrayList<>();
    }

    private static Mission parse(String line) throws IllegalArgumentException {
        String[] str = line.split(",");
        String[] column = new String[16];

        //copy data into larger array to fix issues with splitting
        for (int i = 0; i < str.length; i++) {
            column[i] = str[i];
        }

        // null values at the end set to empty
        if (str.length < column.length) {
            for (int i = str.length; i < column.length; i++) {
                column[i] = "";
            }
        }
        Mission miss = new Mission();
        miss.setFlightNumber(column[0]);
        String[] date = column[1].split("-");

        miss.setLaunchDate(new Date(Integer.parseInt(date[0]), new Month(date[1]), Integer.parseInt(date[2])));
        String[] time = column[2].split(":");
        miss.setLaunchTime(new Time(Integer.parseInt(time[0]), Integer.parseInt(time[1])));
        miss.setLaunchSite(column[3]);
        miss.setVehicleType(column[4]);
        if (!column[7].trim().equals("")) {
            miss.setPayload(new Payload(column[5], column[6], Double.parseDouble(column[7]), column[8]));
        } else {
            miss.setPayload(new Payload(column[5], column[6], 0, column[8]));
        }
        miss.setCustomer(new Customer(column[9], column[10], column[11]));
        miss.setMissionOutcome(column[12]);
        miss.setFailureReason(column[13]);
        miss.setLandingType(column[14]);
        miss.setLandingOutcome(column[15]);
        return miss;
    }

    public static void read(List<Mission> list, String inputLocation) throws FileNotFoundException {
        File file = new File(inputLocation);
        Scanner input = new Scanner(file);
        input.nextLine();
        try {
            while (input.hasNextLine()) {
                list.add(parse(input.nextLine()));
            }
        } finally {
            input.close();
        }

    }

    public static void writeCustomersInOrder(List<Mission> list, String customer, String outputLocation)
            throws FileNotFoundException {
        String csvLocation = outputLocation + File.separator + customer + ".csv";
        String txtLocation = outputLocation + File.separator + customer + ".txt";
        File csvFile = new File(csvLocation);
        File txtFile = new File(txtLocation);
        PrintStream csvStream = new PrintStream(csvFile);
        PrintStream txtStream = new PrintStream(txtFile);

        Customer missionCustomer = null;
        Mission mission = null;

        for (int i = 0; i < list.size(); i++) {
            mission = (Mission) list.get(i);
            if (mission.getCustomer().getName().equalsIgnoreCase(customer)) {
                missionCustomer = mission.getCustomer();
                csvStream.println((String) mission.toCSVFormat());
                txtStream.println(missionCustomer);
            }

        }

        //TODO: get mission data with customer name.
        csvStream.close();
        txtStream.close();

    }

    public static void writePayloadsByOrder(List<Mission> list, String outputLocation) throws FileNotFoundException {
        String csvLocation =outputLocation+ File.separator + "ordered_payload.csv";
        String txtLocation = outputLocation+ File.separator +"ordered_payload.txt";
        File csvFile = new File(csvLocation);
        File txtFile = new File(txtLocation);
        PrintStream csvStream = new PrintStream(csvFile);
        PrintStream txtStream = new PrintStream(txtFile);

        ArrayList<Payload> payloads = new ArrayList();
        Mission mission = null;

        for (int i = 0; i < list.size(); i++) {
            mission = (Mission) list.get(i);
            payloads.add(mission.getPayload());

        }

        //TODO: sort payloads and order in a seperate output file.
        payloads.sort(Comparator.comparing(Payload::getName));

        for (int i = 0; i < payloads.size(); i++) {

            csvStream.println(payloads.get(i).toString());
            txtStream.println(payloads.get(i).toString());

        }



        csvStream.close();
        txtStream.close();
    }

    public static void intro() {
        System.out.println();
        System.out.println();
        System.out.println("========================================================");
        System.out.println();
        System.out.println(" \t \t    W E L C O M E  ");
        System.out.println();
        System.out.println("\tS P A C E   X    T E S T    P R O G R A M");
        System.out.println();
        System.out.println(" \t   S    T    A    R    T    I    N    G");
        System.out.println();
        System.out.println("========================================================");
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) throws FileNotFoundException {

        String outputLocation = "results";

        String inputLocation = "spacex_mission_data.csv";

        System.out.println();
        //TODO: print intro to console
        intro();

        //TODO: set list for data entry
        List<Mission> list = new ArrayList<>();

        //TODO: set locations, read and write files
        read(list, inputLocation);

        writeCustomersInOrder(list, "NASA", outputLocation);
        System.out.println("Details of mission based of name is saved in file");

        writePayloadsByOrder(list, outputLocation);
        System.out.println("Details of payload is saved in file");

        System.out.println();

    }
}