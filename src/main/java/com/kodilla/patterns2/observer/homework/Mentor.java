package com.kodilla.patterns2.observer.homework;


import org.jvnet.inflector.Noun;

public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username){
        this.username=username;
    }

    @Override
    public void update(TaskQueue taskQueue){
        System.out.println(username + ": New tasks in topic "+ taskQueue.getTasks().toString() +
                "\n" + "(total: "  + taskQueue.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getUsername(){
        return username;
    }
    public int getUpdateCount(){
        return updateCount;
    }
}
