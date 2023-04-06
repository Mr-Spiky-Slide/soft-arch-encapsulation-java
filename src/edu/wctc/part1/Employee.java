package edu.wctc.part1;

import java.io.InvalidClassException;
import java.time.LocalDate;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document Encapsulation Checklist if
 * needed.
 */
public class Employee {

    private String firstName;
    private String lastName;
    private final String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private LocalDate orientationDate;

    public Employee(String firstName, String lastName, String ssn) {
        setFirstName(firstName);
        setLastName(lastName);
        if (ssn != null && ssn.length() == 9){
            this.ssn = ssn;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && firstName.length() > 1){
            this.firstName = firstName;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName.length() > 1){
            this.lastName = lastName;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public String getSsn() {
        return ssn;
    }


    public boolean isMetWithHr() {
        return metWithHr;
    }

    public void meetWithHr() {
        this.metWithHr = true;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void meetDeptStaff() {
        this.metDeptStaff = true;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void reviewDeptPolicies() {
        this.reviewedDeptPolicies = true;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void toggleMovedIn() {
        this.movedIn = !movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        if (cubeId != null && cubeId.length() > 1){
            this.cubeId = cubeId;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public LocalDate getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(LocalDate orientationDate) {
        if (true)
        this.orientationDate = orientationDate;
    }
}
