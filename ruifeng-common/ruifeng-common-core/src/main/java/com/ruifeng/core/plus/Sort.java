package com.ruifeng.core.plus;

/**
 * Created by Administrator on 2019/2/28.
 */
public class Sort
{
    public static final String ASC  = "ASC";
    public static final String DESC = "DESC";

    private String field;
    private String dir;

    public Sort(String field, String dir)
    {
        this.field = field;
        this.dir = dir;
    }

    public String getField()
    {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getDir()
    {
        return dir;
    }
}