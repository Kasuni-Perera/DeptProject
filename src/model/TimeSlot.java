
package model;

/**
 *
 * @author Kasuni Navoda
 */
public enum TimeSlot {
    A("08:00 - 10:00"), 
    B("10:00 - 12:00"),
    C("13:00 - 15:00"),
    D("15:00 - 17:00");

    private String value;

    TimeSlot(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
