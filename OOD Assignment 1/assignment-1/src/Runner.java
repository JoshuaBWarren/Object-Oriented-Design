/**
 * Represents a runner that has a name, a start time, and a duration.
 */
public class Runner {

    private String name;
    private Time startTime;
    private Time duration;

    /**
     *
     * @param name represents the name of the runner
     * @param startTime represents the runners start time
     * @param duration represents the runners duration
     */
    public Runner (String name, Time startTime, Time duration){
        this.name = name;
        this.startTime = startTime;
        this.duration = duration;
    }
    //> Missing javadoc description for Runner()


    /**
     *
     * @return name of the runner
     */
    public String getName(){
        return this.name;
    }
    //> Missing javadoc description for getName()


    /**
     *
     * @return start time of the runner
     */
    public Time getStartTime(){
        return this.startTime;
    }
    //> Missing javadoc description for getStartTime()


    /**
     *
     * @return total duration time of the runner
     */
    public Time getDuration() {
        return this.duration;
    }
    //> Missing javadoc description for getDuration()


    /**
     *
     * @return the runners total time
     */
    public Time getEndTime() {
        return startTime duration;
    }
    //> Missing javadoc description for getDuration()
    //> -3 This method does not properly calculate a valid time. Seconds ought not exceed 60,
    //> minutes ought not to exceed 60, and hours ought not to exceed 24. Look into modular
    //> division. The cases needing to be covered are not covered in this method.

    //> -1 Missing javadoc descriptions.
}
