package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    private List<String> tasksList;

    public TaskList() {
        tasksList = new ArrayList<>();
    }
    public void addTask(String task){
        tasksList.add(task);
    }
    public List<String> getList(){
        return tasksList;
    }
}
