package org.aptech.t2303e.exam;

import java.util.HashMap;

public class CRMHashMap {
    private HashMap<String, Customer> customerHashMap;
    public CRMHashMap() {
        customerHashMap = new HashMap<>();
    }
    public void setCustomerHashMap(HashMap<String, Customer> customerHashMap) {
        this.customerHashMap = customerHashMap;
    }
    public void addCustomer(String name, String email, String phone) {
        Customer newCustomer = new Customer(name, email, phone);
        customerHashMap.put(name, newCustomer);
    }
    public void findCustomer(String name) {
        Customer customer = customerHashMap.get(name);
        if (customer != null) {
            System.out.println("Name:\n" + customer.getName() + "Phone:\n " + customer.getPhone());
        } else {
            System.err.println("Not found");
        }
    }
}
