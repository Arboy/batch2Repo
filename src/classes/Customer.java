package classes;

/**
 * Created by JPMPC-B209 on 11/10/2016.
 */
public class Customer extends Person{
    private String customer_id;
    private int membership_level;
    private int credit_card_number;
    private String Address;

    public String getCustomer_id() {

        return customer_id;
    }

    public void setCustomer_id(String customer_id) {

        this.customer_id = customer_id;
    }

    public int getMembership_level() {

        return membership_level;
    }

    public void setMembership_level(int membership_level) {

        this.membership_level = membership_level;
    }

    public int getCredit_card_number() {

        return credit_card_number;
    }

    public void setCredit_card_number(int credit_card_number) {

        this.credit_card_number = credit_card_number;
    }

    public String getAddress() {

        return  Address; }

    public void setAddress( String Address ) {

        this.Address = Address; }



}
