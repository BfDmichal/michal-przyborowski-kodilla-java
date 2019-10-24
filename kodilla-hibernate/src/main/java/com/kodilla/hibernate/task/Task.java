package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;
import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="TASKS")
public class Task {
    private int id;
    private String decription;
    private Date created;
    private int duration;
    private TaskFinancialDetails taskFinancialDetails;
    private TaskList taskList;

    public Task() {
    }

    public Task(String decription, int duration) {
        this.decription = decription;
        this.created = new Date();
        this.duration = duration;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID",unique = true)
    public int getId() {
        return id;
    }
    @Column(name="DESCRIPTION")
    public String getDecription() {
        return decription;
    }
    @NotNull
    @Column(name = "CREATED")
    public Date getCreated() {
        return created;
    }
    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "TASK_FINANCIALS_ID")
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }
    @ManyToOne
    @JoinColumn(name = "TASKSLIST_ID")
    public TaskList getTaskList() {
        return taskList;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDecription(String decription) {
        this.decription = decription;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
}
