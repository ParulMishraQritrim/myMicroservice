package com.example.microservices;

public class tasks
{
    private String  SrNo;
    private String mytasks;
    tasks()
    {

    }

    tasks(String SrNo,String mytasks)
    {
        super();
        this.SrNo = SrNo;
        this.mytasks = mytasks;
    }

    public String getSrNo()
    {
        return SrNo;
    }

    public String getMytasks()
    {
        return mytasks;
    }

    public void setSrNo(String SrNo)
    {
        this.SrNo=SrNo;
    }

    public void setMytasks(String mytasks)
    {
        this.mytasks=mytasks;
    }
}
