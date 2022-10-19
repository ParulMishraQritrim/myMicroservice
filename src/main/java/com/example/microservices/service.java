package com.example.microservices;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class service
{
    private List<tasks> myTasks= new ArrayList<>(Arrays.asList(
          new tasks("01","Get Groceries"),
          new tasks("02","Car Wash"),
          new tasks("03","Prepare Lunch"),
          new tasks("04","Meeting with Wills"),
          new tasks("05","Diwali Decoration")
  ));

    public List<tasks> getTasks()
    {
        return myTasks;
    }

    public tasks getTask(String SrNo)
    {
       return myTasks.stream().filter(t -> t.getSrNo().equals(SrNo)).findFirst().get();
    }

    public tasks addTask(tasks tas)
    {
       myTasks.add(tas);

        return tas;
    }

    public tasks updateTask(String SrNo, tasks tas)
    {
      for(int i=0; i<myTasks.size();i++)
      {
        tasks t= myTasks.get(i);
        if(t.getSrNo().equals(SrNo))
        {
            myTasks.set(i,tas);
            return t;
        }

      }
        return tas;
    }

    public boolean deleteTask(String SrNo)
    {
       return myTasks.removeIf(t-> t.getSrNo().equals(SrNo));

    }
}