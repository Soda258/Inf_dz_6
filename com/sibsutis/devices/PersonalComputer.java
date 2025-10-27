package devices;

public class PersonalComputer extends Device{
    
    public PersonalComputer(int id, int price){
        super(id, price, null);
    }

    public PersonalComputer(int id, int price, String ip){
        super(id, price, ip);
    }

    @Override
    public String getDeviceType() {
        return "Personal Computer";
    }


    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)){return false};
        return true;
    }

    @Override
    public int hashCode() {return super.hashCode();}
}