package spacex;

public class Month {
    private String value;

    Month(String value){
        this.value=value;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }



}
