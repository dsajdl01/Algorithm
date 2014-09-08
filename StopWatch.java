package analysisOfAlgorithm;

/**
 * StopWatch class enable to measure program 
 * for how long the program needs to execute
 * 
 * @author David Sajdl
 *
 */

public class StopWatch {
	 private long startTime;
	 private long stopTime = 0;
	 private boolean running;
	  
	  // constructor
	  public StopWatch(){
		  startTime = 0;
		  stopTime = 0;
		  running = false;
	  }

	  /**
	   * it starts to measure time by assigning 
	   * instance variable startTime to the number of milliseconds
	   */
	  public void start() {
	    this.startTime = System.currentTimeMillis();
	    System.out.println("it's start time: " + startTime);
	    this.running = true;
	  }

	  /**
	   * it stops to measure time by assigning 
	   * instance variable stopTime to the number of milliseconds
	   */
	  public void stop() {
	    this.stopTime = System.currentTimeMillis();
	    //System.out.println("it's stop  time: " + stopTime);
	    this.running = false;
	  }

	  /**
	   * it calculate time in milliseconds by subtraction stopTime to startTime
	   * 
	   * @return elapsed time in milliseconds
	   */
	  public long getElapsedTime() {
	    long elapsed;
	    if (running) {
	      elapsed = (System.currentTimeMillis() - startTime);}
	    else {
	      elapsed = (stopTime - startTime);}
	    return elapsed;
	  }

	  /**
	   * it calculate time in milliseconds by subtraction stopTime to startTime
	   * 
	   * @return elapsed time in seconds
	   */
	  public long getElapsedTimeSecs() {
	    long elapsed;
	    if (running) {
	      elapsed = ((System.currentTimeMillis() - startTime) / 1000);}
	    else {
	      elapsed = ((stopTime - startTime) / 1000);}
	    return elapsed;
	  }
}