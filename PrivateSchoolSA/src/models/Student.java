package models;

import interfaces.IStudent;

public class Student extends Person implements IStudent{

    private long dateOfBirth;
    private int tuitionFees;
    public CoursesPStudent coursesPStudent;

    Student(String firstName, String lastName) {
        super(firstName, lastName);
        this.coursesPStudent = new CoursesPStudent();
    }

    Student(String firstName, String lastName, long dateOfBirth, int tuitionFees) {
        super(firstName, lastName);
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
        this.coursesPStudent = new CoursesPStudent();
    }

    @Override
    public long getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int getTuitionFees() {
        return tuitionFees;
    }

    @Override
    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        return "Student{" +  super.getFirstName() + super.getLastName()
                + ", dateOfBirth=" + ConvertDateLong.convertLong(dateOfBirth)
                + ", tuitionFees=" + tuitionFees + '}';
    }

}
