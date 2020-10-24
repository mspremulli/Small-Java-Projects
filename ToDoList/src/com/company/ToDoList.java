package com.company;

import java.util.ArrayList;

public class ToDoList {
  private ArrayList<ToDo> toDolist;

  //Default Constructor
  public ToDoList(){
    toDolist = new ArrayList<>();
  }

  //TODO: Regular Constructor

  public void addToDo(ToDo todo){
    toDolist.add(todo);
  }

  public ToDo markAsCompleted(ToDo todo){
    todo.setIsCompleted(true);
    return todo;
  }

  public ArrayList<ToDo> getUncompletedToDos(){
    ArrayList<ToDo> uncompletedTodoList = new ArrayList<>();

    toDolist.forEach(todo -> {
      if(!todo.isCompleted()) uncompletedTodoList.add(todo);
    });
    return uncompletedTodoList;
  }

}
//work with dates
//llok at stringbuildwe
//practice tostring override
//remember access modifier
