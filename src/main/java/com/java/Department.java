package com.java;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private TeamLead teamLead;
    private List<Staff> staffList;
    private List<String> assignmentList;

    public Department(TeamLead teamLead) {
        if (teamLead == null) {
            throw new IllegalArgumentException("A team cannot be formed without a team leader");
        }
        this.teamLead = teamLead;
        this.staffList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    public void changeTeamLead(TeamLead newTeamLead) {
        this.teamLead = newTeamLead;
    }

    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    public void removeStaff(Staff staff) {
        if (staffList.contains(staff)) {
            staffList.remove(staff);
        } else {
            System.out.println("Staff not found");
        }
    }

    public void changeStaff(Staff oldStaff, Staff newStaff) {
        int index = staffList.indexOf(oldStaff);
        if (index != -1) {
            staffList.set(index, newStaff);
        }
    }

    public void addAssignment(String assignment) {
        assignmentList.add(assignment);
    }

    public void markAssignmentCompleted(String assignment) {
        assignmentList.remove(assignment);
    }

    public TeamLead getTeamLead() {
        return teamLead;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public List<String> getAssignmentList() {
        return assignmentList;
    }
}

