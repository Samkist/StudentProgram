package me.Samkist.Database;

import me.Samkist.Database.meta.Graduate;

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

    public PrintType getByValue(String s) {
        if(s.equalsIgnoreCase("person") || s.equalsIgnoreCase("persons")) {
            return PERSON;
        } else if(s.equalsIgnoreCase("students") || s.equalsIgnoreCase("student")) {
            return STUDENT;
        } else if(s.equalsIgnoreCase("graduate students") || s.equalsIgnoreCase("graduate student")) {
            return GRADUATE;
        } else if(s.equalsIgnoreCase("undergraduates") || s.equalsIgnoreCase("undergraduate")) {
            return UNDERGRADUATE;
        } else {
            throw new IllegalArgumentException("No value found");
        }
    }
}
