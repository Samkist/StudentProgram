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
}
