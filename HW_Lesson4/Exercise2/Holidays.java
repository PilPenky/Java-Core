package HW_Lesson4.Exercise2;

public enum Holidays {
    NO_HOLIDAY(), NEW_YEAR("12-31"), MARCH_8("03-08"), FEBRUARY_23("02-23");
    private String value;

    Holidays(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    Holidays() {
    }
}