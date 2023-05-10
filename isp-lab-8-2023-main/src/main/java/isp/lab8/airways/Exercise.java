package isp.lab8.airways;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the new route: ");
        String routeName = input.nextLine();

        String packagePath = "isp.lab8.airways." + routeName;
        Package routePackage = Package.getPackage(packagePath);
        if (routePackage == null) {
            routePackage = createPackage(packagePath);
        }

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
            String packageName = "waypoint_" + i;
            String packagePathWithWaypoint = packagePath + "." + packageName;
            Package waypointPackage = Package.getPackage(packagePathWithWaypoint);
            if (waypointPackage == null) {
                Package parentPackage = Package.getPackage(packagePath + ".waypoint_" + (i - 1));
                if (parentPackage == null) {
                    throw new Exception("Parent package does not exist.");
                }
                waypointPackage = createPackage(packagePathWithWaypoint, parentPackage);
            }
        }

        System.out.println("Route and waypoints saved successfully.");
    }

    private static Package createPackage(String packageName, Package parentPackage) throws Exception {
        String[] packageNames = packageName.split("\\.");
        return (Package) ClassLoader.getSystemClassLoader()
                .loadClass(parentPackage.getName() + "." + packageNames[packageNames.length - 1])
                .getDeclaredConstructor()
                .newInstance();
    }

    private static Package createPackage(String packageName) throws Exception {
        String[] packageNames = packageName.split("\\.");
        String parentPackageName = "";
        for (int i = 0; i < packageNames.length - 1; i++) {
            parentPackageName += packageNames[i] + ".";
        }
        Package parentPackage = Package.getPackage(parentPackageName);
        if (parentPackage == null) {
            throw new Exception("Parent package does not exist.");
        }
        return createPackage(packageName, parentPackage);
    }
}