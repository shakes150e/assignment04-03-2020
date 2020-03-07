package org.example;

public class PersonComposition {

    //composition has-a relationship
    private Job job;

    public PersonComposition(){
        this.job=new Job();
        job.setSalary(1000L);
    }
    public long getSalary() {
        return job.getSalary();
    }

}