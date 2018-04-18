package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Customer;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository
{
    private List<Customer> listOfCustomers = new ArrayList<Customer>();

    public InMemoryCustomerRepository()
    {
        Customer janusz = new Customer("K1", "Janusz", "Wisniowa 12");
        janusz.setNoOfOrdersMade(5);
        Customer adam = new Customer("K2", "Adam", "Szoje 12");
        adam.setNoOfOrdersMade(10);
        Customer robert = new Customer("K3", "Robert", "Szoje 6");
        robert.setNoOfOrdersMade(1);
        listOfCustomers.add(janusz);
        listOfCustomers.add(robert);
        listOfCustomers.add(adam);


    }

    public List<Customer> getAllCustomers()
    {
        return listOfCustomers;
    }
}
