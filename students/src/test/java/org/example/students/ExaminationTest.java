package org.example.students;

import org.junit.jupiter.api.Test;

public class ExaminationTest {
    @Test
    void addScore() {
        Institute institute = new Institute();
        Score score = new Score("Иван", "Математика", 5);
        institute.addScore(score);
    }

    @Test
    void getScore() {
        Institute institute = new Institute();
        Score score = new Score("Иван", "Математика", 5);
        institute.addScore(score);
        System.out.println("Метод получение обьекта класса через параметры: " + institute.getScore("Иван", "Математика"));
    }

    @Test
    void getAverageForSubject() {
        Institute institute = new Institute();
        Score score1 = new Score("Иван", "Математика", 5);
        Score score2 = new Score("Пётр", "Математика", 4);
        Score score3 = new Score("Наталья", "Математика", 4);
        institute.addScore(score1);
        institute.addScore(score2);
        institute.addScore(score3);
        System.out.println("Среднее Арифметическое по предмету: " + institute.getAverageForSubject("Математика"));
    }

    @Test
    void multipleSubmissionsStudentNames() {
        Institute institute = new Institute();
        Score score1 = new Score("Иван", "Математика", 5);
        Score score2 = new Score("Пётр", "Математика", 4);
        Score score3 = new Score("Наталья", "Математика", 3);
        Score score4 = new Score("Наталья", "Математика", 4);
        institute.addScore(score1);
        institute.addScore(score2);
        institute.addScore(score3);
        institute.addScore(score4);
        System.out.println("Студенты перездававшие экзамены: " + institute.multipleSubmissionsStudentNames());
    }

    @Test
    void lastFiveStudentsWithExcellentMarkOnAnySubject() {
        Institute institute = new Institute();
        Score score1 = new Score("Иван", "Математика", 5);
        Score score2 = new Score("Пётр", "Литература", 5);
        Score score3 = new Score("Наталья", "Физика", 5);
        Score score4 = new Score("Марина", "Математика", 5);
        Score score5 = new Score("Павел", "Литература", 5);
        Score score6 = new Score("Елена", "Физика", 5);
        Score score7 = new Score("Никита", "Математика", 5);
        Score score8 = new Score("Тимур", "Литература", 5);
        institute.addScore(score1);
        institute.addScore(score2);
        institute.addScore(score3);
        institute.addScore(score4);
        institute.addScore(score5);
        institute.addScore(score6);
        institute.addScore(score7);
        institute.addScore(score8);
        System.out.println("Вывод последних пяти отличников " + institute.lastFiveStudentsWithExcellentMarkOnAnySubject());
    }

    @Test
    void getAllScores() {
        Institute institute = new Institute();
        Score score1 = new Score("Иван", "Математика", 5);
        Score score2 = new Score("Пётр", "Литература", 4);
        Score score3 = new Score("Наталья", "Физика", 3);
        Score score4 = new Score("Марина", "Математика", 4);
        Score score5 = new Score("Павел", "Литература", 5);
        Score score6 = new Score("Елена", "Физика", 4);
        Score score7 = new Score("Никита", "Математика", 3);
        Score score8 = new Score("Тимур", "Литература", 5);
        institute.addScore(score1);
        institute.addScore(score2);
        institute.addScore(score3);
        institute.addScore(score4);
        institute.addScore(score5);
        institute.addScore(score6);
        institute.addScore(score7);
        institute.addScore(score8);
        System.out.println("Все студенты: " + institute.getAllScores());
    }
}
