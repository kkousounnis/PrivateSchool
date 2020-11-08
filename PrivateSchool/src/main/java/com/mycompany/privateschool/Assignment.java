package com.mycompany.privateschool;

import java.util.Date;

public class Assignment {

    private TitleName title;
    private String description;
    private long subDateTime;
    private int oralMark;
    private int totalMark;

    Assignment(TitleName title) {
        this.title = title;
    }

    Assignment(TitleName title, String description,
            long subDateTime) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(long subDateTime) {
        this.subDateTime = subDateTime;
    }

    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

}
