package op;

public class Adress 
{
    String street;
    String city;
    Long pin;
    
    public Adress(String street, String city, Long pin) 
    {
            this.street=street;
            this.city=city;
            this.pin=pin;
    }

    @Override
    public String toString() {
        return "Adress{" + "street=" + street + ", city=" + city + ", pin=" + pin + '}';
    }

    
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public Long getPin() {
        return pin;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPin(Long pin) {
        this.pin = pin;
    }

}
