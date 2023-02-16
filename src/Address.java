public class Address {
    private int streetNum;
    private String streetName;
    private String apartmentNum;
    private String city;
    private String state;
    private int zipCode;

    public Address(int streetNum, String streetName, String apartmentNum, String city, String state, int zipCode)
    {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.apartmentNum = apartmentNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public Address(Address addie)
    {
        this.streetNum = addie.getStreetNum();
        this.streetName = addie.getStreetName();
        this.apartmentNum = addie.getApartmentNum();
        this.city = addie.getCity();
        this.state = addie.getState();
        this.zipCode = addie.getZipCode();
    }
    public Address(String add)
    {
        String[] addie =  add.split(" ");
        if (addie.length == 6)
        {
            this.streetNum = Integer.parseInt(addie[0]);
            this.streetName = addie[1];
            this.apartmentNum = addie[2].substring(0,addie[2].length()-1);
            this.city = addie[3].substring(0,addie[3].length()-1);
            this.state = addie[4];
            this.zipCode = Integer.parseInt(addie[5]);
        }
        else
        {
            this.streetNum = Integer.parseInt(addie[0]);
            this.streetName = addie[1].substring(0,addie[1].length()-1);
            this.city = addie[2].substring(0,addie[2].length()-1);
            this.state = addie[3];
            this.zipCode = Integer.parseInt(addie[4]);
        }
    }
    public String toString()
    {
        return streetNum+" "+streetName+" "+apartmentNum+", "+city+", " + state+" "+ zipCode;
    }
    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setApartmentNum(String apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getApartmentNum() {
        return apartmentNum;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }
}
