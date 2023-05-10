package isp.lab8.airways;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the new route: ");
        String routeName = input.nextLine();

        File routeFolder = new File("C:\\lab_se\\isp-labs-2023-repo-rokaly-kriszta-30322\\isp-lab-8-2023-main\\src\\main\\java\\isp\\lab8\\" + routeName);
        routeFolder.mkdir();

        ArrayList<String> waypoints = new ArrayList<String>();
        boolean addAnother = true;
        while (addAnother) {
            System.out.print("Enter the name of a waypoint (or 'done' to finish): ");
            String waypoint = input.nextLine();
            if (waypoint.equalsIgnoreCase("done")) {
                addAnother = false;
            } else {
                waypoints.add(waypoint);
            }
        }

        for (int i = 0; i < waypoints.size(); i++) {
            String waypointName = waypoints.get(i);
            String fileName = "C:\\lab_se\\isp-labs-2023-repo-rokaly-kriszta-30322\\isp-lab-8-2023-main\\src\\main\\java\\isp\\lab8\\" + routeName + "/waypoint_" + i + ".txt";
            try {
                FileWriter writer = new FileWriter(fileName);
                writer.write(waypointName);
                writer.close();
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        }

        System.out.println("Route and waypoints saved successfully.");

        System.out.print("Enter the name of the folder to delete: ");
        String folderName = input.nextLine();

        deleteFolder(folderName);
    }

    private static void deleteFolder(String routeName) {
        File routeFolder = new File(routeName);
        if (routeFolder.exists() && routeFolder.isDirectory()) {
            File[] waypointFiles = routeFolder.listFiles();
            for (int i = 0; i < waypointFiles.length; i++) {
                waypointFiles[i].delete();
            }
            routeFolder.delete();
            System.out.println("Route and waypoints deleted successfully.");
        } else {
            System.out.println("Route does not exist.");
        }
    }
}
