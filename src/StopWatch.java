public class StopWatch {
    public StopWatch(){
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
    }

    //Test kommentar
    private long startTime = System.currentTimeMillis();
    private long endTime = System.currentTimeMillis();
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        long elapsedTime = endTime - startTime;
        return elapsedTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}
