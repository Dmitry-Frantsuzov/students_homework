package org.example.students;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Institute implements Examination {
    List<Score> multipleSubmissionsStudent = new ArrayList<>();
    Set<Score> scores = new HashSet<>();
    Set<Score> lastFiveStudents = new LinkedHashSet<>();

    @Override
    public void addScore(Score score) {
        for(Score item :scores){
            if (score.name()== item.name()&&score.subject()== item.subject()){
                multipleSubmissionsStudent.add(item);
            }
        }
        scores.add(score);
        if (score.score() == 5) {
            lastFiveStudents.add(score);
        }
    }

    @Override
    public Score getScore(String name, String subject) {
        for (Score res : scores) {
            if (res.name() == name && res.subject() == subject) {
                return res;
            }
        }
        return null;
    }

    @Override
    public double getAverageForSubject(String subject) {
        double sum = 0;
        for (Score res : scores) {
            if (res.subject() == subject) {
                sum += res.score();
            }
        }
        return sum / scores.size();
    }

    @Override
    public Set<String> multipleSubmissionsStudentNames() {
        Set<String> res = new HashSet<>();
        for (Score item : multipleSubmissionsStudent) {
            res.add(item.name());
        }
        return res;
    }

    @Override
    public Set<String> lastFiveStudentsWithExcellentMarkOnAnySubject() {
        Set<String> res = new HashSet<>();
        long toSkip = lastFiveStudents.size() - 5;
        for (Score lastFiveStudent : lastFiveStudents) {
            if (toSkip > 0) {
                toSkip--;
                continue;
            }
            res.add(lastFiveStudent.name());
        }
        return res;
    }

    @Override
    public Collection<Score> getAllScores() {
        return scores;
    }
}
