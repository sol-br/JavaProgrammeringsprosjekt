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
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
    }

    // TODO - getter/setter methods for all objectvariables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public PowerAgreementType getAgreement() {
        return agreement;
    }

    public void setAgreement(PowerAgreementType agreement) {
        this.agreement = agreement;
    }
}

    public void customerToString() {
        System.out.println("Customer number: " + customer_id);
        System.out.println("Name: " + name);
        System.out.println("E-Mail: " + email);
        System.out.println("Agreement: " + agreement);
    }

}
