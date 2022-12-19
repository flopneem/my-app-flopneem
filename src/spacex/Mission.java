package spacex;
import java.util.Objects;
/******************************************************************
 * This class is used in module-02.
 * Update this class to complete the OOP design document
 * description (see Canvas).
 * CLASS DESCRIPTION
 * This class is used to store mission data using a builder pattern
 * from a given data file.
 ******************************************************************/
public class Mission {
    private String flightNumber;
    private Date launchDate;
    private Time launchTime;
    private String launchSite;
    private String vehicleType;
    private Payload payload;
    private Customer customer;
    private String missionOutcome;
    private String failureReason;
    private String landingType;
    private String landingOutcome;

    /**
     * @return the flightNumber
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * @param flightNumber the flightNumber to set
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * @return the launchDate
     */
    public Date getLaunchDate() {
        return launchDate;
    }

    /**
     * @param launchDate the launchDate to set
     */
    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    /**
     * @return the launchTime
     */
    public Time getLaunchTime() {
        return launchTime;
    }

    /**
     * @param launchTime the launchTime to set
     */
    public void setLaunchTime(Time launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * @return the launchSite
     */
    public String getLaunchSite() {
        return launchSite;
    }

    /**
     * @param launchSite the launchSite to set
     */
    public void setLaunchSite(String launchSite) {
        this.launchSite = launchSite;
    }

    /**
     * @return the vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * @param vehicleType the vehicleType to set
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * @return the payload
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * @param payload the payload to set
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the missionOutcome
     */
    public String getMissionOutcome() {
        return missionOutcome;
    }

    /**
     * @param missionOutcome the missionOutcome to set
     */
    public void setMissionOutcome(String missionOutcome) {
        this.missionOutcome = missionOutcome;
    }

    /**
     * @return the failureReason
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * @param failureReason the failureReason to set
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * @return the landingType
     */
    public String getLandingType() {
        return landingType;
    }

    /**
     * @param landingType the landingType to set
     */
    public void setLandingType(String landingType) {
        this.landingType = landingType;
    }

    /**
     * @return the landingOutcome
     */
    public String getLandingOutcome() {
        return landingOutcome;
    }

    /**
     * @param landingOutcome the landingOutcome to set
     */
    public void setLandingOutcome(String landingOutcome) {
        this.landingOutcome = landingOutcome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Mission load = (Mission) o;
        return this.customer.equals(load.customer)
                && this.launchDate.equals(load.launchDate)
                && this.launchTime.equals(load.launchTime)
                && this.payload.equals(load.payload)
                && Objects.equals(this.failureReason, load.failureReason)
                && Objects.equals(this.flightNumber, load.flightNumber)
                && Objects.equals(this.landingOutcome, load.landingOutcome)
                && Objects.equals(this.landingType, load.landingType)
                && Objects.equals(this.launchSite, load.launchSite)
                && Objects.equals(this.missionOutcome, load.missionOutcome)
                && Objects.equals(this.vehicleType, load.vehicleType);
    }

    public String toCSVFormat(){

        return flightNumber+","+launchDate+","+launchTime+","+launchSite+","+vehicleType+","+this.payload.getName()+","+this.payload.getType()+","+this.payload.getMass()+","+this.payload.getOrbit()
                +","+ this.customer.getName()+","+this.customer.getType()+","+this.customer.getCountry()+","+this.missionOutcome+","+failureReason+","+this.landingType+","+landingOutcome;
    }
    @Override
    public String toString() {
        return "Mission({"
                + this.customer.toString() + '\''
                + ", failureReason='" + failureReason + '\''
                + ", flightNumber='" + flightNumber + '\''
                + ", landingOutcome='" + landingOutcome + '\''
                + ", landingType='" + landingType + '\''
                + ", launchSite='" + launchSite + '\''
                + ", missionOutcome='" + missionOutcome + '\''
                + ", vehicleType='" + vehicleType + '\''
                + ", launchDate='" + launchDate.toString() + '\''
                + ", launchTime='" + launchTime.toString()+ '\''
                + ", payload='" + payload.toString() + "})";
    }
}


//TODO: create a static nested class called "Builder"

