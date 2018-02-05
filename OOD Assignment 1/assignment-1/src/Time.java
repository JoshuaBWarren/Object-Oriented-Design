/**
 * Represents the time in hours, minutes, and seconds.
 */
public class Time {

    private Integer hours;
    private Integer minutes;
    private Integer seconds;

    /**
     *
     * @param hours represents the hours
     * @param minutes represents the minutes
     * @param seconds represents the seconds
     */
    public Time (Integer hours, Integer minutes, Integer seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    //> Missing javadoc description
    //> Each field ought to declare what the valid inputs are for that field
    //> for example it should be written in javadoc or in the comments that seconds is [0,59]

    /**
     *
     * @return the hours
     */
    public Integer getHours() {
        return this.hours;
    }
    //> Missing javadoc description


    /**
     *
     * @return the minutes
     */
    public Integer getMinutes() {
        return this.minutes;
    }
    //> Missing javadoc description


    /**
     *
     * @return the seconds
     */
    public Integer getSeconds() {
        return this.seconds;
    }
    //> Missing javadoc description

    //> -1 Missing javadoc descriptions.


}
