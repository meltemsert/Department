package com.java;

public class Main {
    public static void main(String[] args) {
        TeamLead teamLead = new TeamLead("Ahmet", "Yılmaz", "06-01-1997");
        Department department = new Department(teamLead);

        Male staff1 = new Male("Mehmet", "Öztürk", "15-05-1990");
        Female staff2 = new Female("Meltem", "Sert", "04-07-1994");
        Male staff3 = new Male("Veli", "Bilek", "10-05-1992");
        Female staff4 = new Female("Ayşe", "Demir", "08-11-1993");

        department.addStaff(staff1);
        department.addStaff(staff2);
        department.addStaff(staff4);

        department.addAssignment("Project Management");
        department.addAssignment("Software Development");

        System.out.println("Team Lead: " + department.getTeamLead().getName()
                + " " + department.getTeamLead().getSurname());

        System.out.println("-------------------------------");

        System.out.println("Personel Listesi:");
        for (Staff staff : department.getStaffList()) {
            System.out.println(staff.getName() + " " + staff.getSurname());
        }

        System.out.println("-------------------------------");

        System.out.println("Assignment: ");
        for (String assignment : department.getAssignmentList()) {
            System.out.println(assignment);
        }

        department.changeStaff(staff1, staff3);
        department.removeStaff(staff4);

        System.out.println("-------------------------------");

        System.out.println("Personel Listesi:");
        for (Staff staff : department.getStaffList()) {
            System.out.println(staff.getName() + " " + staff.getSurname());
        }
    }
}