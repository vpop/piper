
package com.creactiviti.piper.config;

public class CoordinatorSubscriptions {

  private int completions = 1;
  private int errors = 1;
  private int events = 1;
  private int jobs = 1;

  public int getCompletions() {
    return completions;
  }
  
  public void setCompletions(int aCompletions) {
    completions = aCompletions;
  }

  public int getErrors() {
    return errors;
  }
  
  public void setErrors(int aErrors) {
    errors = aErrors;
  }
  
  public int getEvents() {
    return events;
  }
  
  public void setEvents(int aEvents) {
    events = aEvents;
  }
  
  public int getJobs() {
    return jobs;
  }
  
  public void setJobs(int aJobs) {
    jobs = aJobs;
  }
  
}
