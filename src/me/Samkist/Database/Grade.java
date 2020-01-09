package me.Samkist.Database;

public enum Grade {
    FRESHMAN("Freshman"),
    SOPHOMORE("Sophomore"),
    JUNIOR("Junior"),
    SENIOR("Senior");

    private String description;

    Grade(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Grade getByValue(String s) {
        if(s.equalsIgnoreCase("freshman"))
            return FRESHMAN;
        if(s.equalsIgnoreCase("sophomore"))
            return SOPHOMORE;
        if(s.equalsIgnoreCase("junior"))
            return JUNIOR;
        if(s.equalsIgnoreCase("senior"))
            return SENIOR;
        throw new IllegalArgumentException("invalid argument");
    }
}
