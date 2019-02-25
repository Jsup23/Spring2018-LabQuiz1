/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursescheduler;

/**
 *
 * @author jjoec
 */
public class Instructor {
    private String firstName;
    private String lastName;
    private String building;
    private int roomNumber;
    
    public Instructor() {
        firstName = "Albert";
        lastName = "Einstein";
        building = "McNair";
        roomNumber = 420;
    }
    
    public Instructor(String fName, String lName, String office, int room) {
        firstName = fName;
        lastName = lName;
        building = office;
        roomNumber = room;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the building
     */
    public String getBuilding() {
        return building;
    }

    /**
     * @param building the building to set
     */
    public void setBuilding(String building) {
        this.building = building;
    }

    /**
     * @return the roomNumber
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public String toString() {
        return firstName + " * " + lastName + " * " + building + " * " + roomNumber;
    }
}
