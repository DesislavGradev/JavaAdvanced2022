package workout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Workout {
    private String type;
    private int exerciseCount;
    private List<Exercise> exercises;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        if (exercises.size() < exerciseCount) {
            exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle) {
        return exercises.removeIf(ex -> ex.getName().equals(name) && ex.getMuscle().equals(muscle));
    }

    public int getExerciseCount() {
            return exercises.size();
    }
    public Exercise getExercise(String name, String muscle) {
        return exercises.stream().filter(ex -> ex.getName().equals(name) && ex.getMuscle().equals(muscle)).findFirst().orElse(null);
    }

    public Exercise getMostBurnedCaloriesExercise() {
        return exercises.stream().max(Comparator.comparing(Exercise::getBurnedCalories)).orElse(null);
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Workout type: %s%n", type));
        for (Exercise exercise : exercises) {
            sb.append(String.format("%s%n", exercise.toString()));
        }
        return sb.toString().trim();
    }
}
