package org.example.students;

public record Score(String name, String subject, int score) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public String subject() {
        return subject;
    }

    @Override
    public int score() {
        return score;
    }
}
