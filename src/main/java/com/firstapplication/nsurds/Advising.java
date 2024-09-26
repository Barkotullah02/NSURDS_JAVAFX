package com.firstapplication.nsurds;
import structure.*;

import java.io.Serializable;

public class Advising extends StudentPortal implements Serializable {
    private String courses;
    public Advising(String courses){
        this.courses = courses;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Courses = " + courses;
    }
}
