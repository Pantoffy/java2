package org.aptech.t2303e.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CRMHashMap crm = new CRMHashMap();
        Map<Integer, String> optionDemo = new HashMap<>();
        optionDemo.put(1, "Add");
        optionDemo.put(2, "Find");
        optionDemo.put(3, "Display");
        optionDemo.put(4, "Exit");
        for (Integer key : optionDemo.keySet()) {
            System.err.println("Value with key = " + key + " is  : " + optionDemo.get(key));
        }
        for (Map.Entry<Integer, String> entry : optionDemo.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.err.println("Value with key = " + key + " is  : " + value);
        }
        private static void addCustomer(Scanner scanner, CRMHashMap crm) {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        System.out.print("Enter customer phone: ");
        String phone = scanner.nextLine();

        crm.addCustomer(name, email, phone);
        System.out.println("Customer added!");
    }

    private static void findCustomer(Scanner scanner, CRMHashMap crm) {
        System.out.print("Enter customer name to find: ");
        String name = scanner.nextLine();
        crm.findCustomer(name);
    }
    }
}

