package no.hvl.dat100.javel.oppgave3;

//a, d: Grethe
//b: Andrea
//c: Solfrid

public class Customer {

    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        // TODO
    }

    // TODO - getter/setter methods for all objectvariables

    public void customerToString() {
        System.out.println("Customer number: " + customer_id);
        System.out.println("Name: " + name);
        System.out.println("E-Mail: " + email);
        System.out.println("Agreement: " + agreement);
    }

}
