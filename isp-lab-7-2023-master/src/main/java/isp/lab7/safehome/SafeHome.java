package isp.lab7.safehome;

import java.util.Scanner;

public class SafeHome {

    public static void main(String[] args) throws TenantAlreadyExistsException, TenantNotFoundException, TooManyAttemptsException, InvalidPinException {

        Scanner scanner = new Scanner(System.in);
        int c = 0;
        DoorLockController o = new DoorLockController();

        System.out.println("Enter who is logging in(Admin/Tenant)");
        while(c != 3) {
            System.out.println("1-admin");
            System.out.println("2-tenant");
            c = scanner.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Logged in as Admin");
                    System.out.println("Choose an action: ");
                    int c2 = 0;
                    while (c2 != 4) {
                        System.out.println("1-add Tenant");
                        System.out.println("2-remove Tenant");
                        System.out.println("3-view AccessLog");
                        System.out.println("4-exit");
                        c2 = scanner.nextInt();

                        switch (c2) {
                            case 1:
                                String name, pin;
                                System.out.println("Enter the name: ");
                                name = scanner.next();
                                System.out.println("Enter the pin: ");
                                pin = scanner.next();
                                o.addTenant(name, pin);
                                break;
                            case 2:
                                System.out.println("Enter the name: ");
                                name = scanner.next();
                                o.removeTenant(name);
                                break;
                            case 3:
                                System.out.println("AccessLog ");
                                break;

                            case 4:
                                System.out.println("exit");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Logged in as Tenant");
                    c2 = 0;
                    while (c2 != 3) {
                        System.out.println("1-open the door");
                        System.out.println("2-close the door");
                        System.out.println("3-exit");
                        c2 = scanner.nextInt();
                        switch (c2) {
                            case 1:
                                System.out.println("Enter pin to open: ");
                                String pin = scanner.next();
                                o.enterPin(pin);
                                System.out.println(o.enterPin(pin));
                                break;
                            case 2:
                                System.out.println("Enter pin to close: ");
                                pin = scanner.next();
                                o.enterPin(pin);
                                System.out.println(o.enterPin(pin));
                                break;
                            case 3:
                                System.out.println("exit");
                                break;
                        }
                    }
                    break;
            }
        }

    }

}
