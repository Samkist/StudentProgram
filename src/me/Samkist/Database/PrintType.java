package me.Samkist.Database;

public enum PrintType {
    PERSON("Persons"),
    STUDENT("Students"),
    GRADUATE("Graduate Students"),
    UNDERGRADUATE("Undergraduates");

    private String description;

    PrintType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
