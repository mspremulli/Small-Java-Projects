package com.company;

import java.time.LocalDate;

public class ToDo {
  private String task;
  private LocalDate dueDate;
  private int priority; //10 most important
  private boolean isCompleted;

  public ToDo(String task, LocalDate dueDate, int priority){
    this.dueDate = dueDate;
    this.task = task;
    this.priority = priority;
    isCompleted = false;
  }

  public ToDo(String task, LocalDate dueDate, int priority, boolean isCompleted){
    this.dueDate = dueDate;
    this.task = task;
    this.priority = priority;
    this.isCompleted = isCompleted;
  }

  public void setIsCompleted(boolean isCompleted){
    this.isCompleted = isCompleted;
  }

  public String getTask(){
    return task;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public int getPriority() {
    return priority;
  }

  public boolean isCompleted() {
    return isCompleted;
  }
}
