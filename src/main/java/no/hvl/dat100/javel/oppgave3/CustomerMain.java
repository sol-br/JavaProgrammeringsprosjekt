package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that creates a Customer object and teste the methods implemented in the class

        */

        Customer customer1 = new Customer("Andrea", "andrea@gmail.no", 1, PowerAgreementType.SPOTPRICE);
        Customer customer2 = new Customer("Grethe", "grethe@gmail.no", 2,PowerAgreementType.POWERSUPPORT);
        Customer customer3 = new Customer("Solfrid", "solfrid@gmail.com", 3, PowerAgreementType.NORGESPRICE);

        //Solfrid

        //Grethe

        customer1.customerToString();
        System.out.println();
        customer2.customerToString();
        System.out.println();
        customer3.customerToString();

    }
}
