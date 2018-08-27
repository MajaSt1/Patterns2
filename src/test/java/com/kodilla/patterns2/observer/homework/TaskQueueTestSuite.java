package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {
    @Test
    public void testUpdate(){
        //Given
        TaskQueue taskQueue1=new TaskQueue();
        TaskQueue taskQueue2=new TaskQueue();
        TaskQueue taskQueue3=new TaskQueue();

        Mentor johnSmith= new Mentor("John Smith");
        Mentor jessiePinkman= new Mentor("Jessie Pinkman");

        taskQueue1.registerObserver(johnSmith);
        taskQueue2.registerObserver(johnSmith);
        taskQueue3.registerObserver(jessiePinkman);
        //When

        taskQueue1.addTask("Queues with tasks to check");
        taskQueue2.addTask("Adding requests");
        taskQueue1.addTask("Adding requests");
        taskQueue3.addTask("Decorate pizza");
        //Then
        assertEquals(3,johnSmith.getUpdateCount());
        assertEquals(1,jessiePinkman.getUpdateCount());



    }
}
