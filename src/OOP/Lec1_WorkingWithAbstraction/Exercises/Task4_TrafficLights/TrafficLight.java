package OOP.Lec1_WorkingWithAbstraction.Exercises.Task4_TrafficLights;

public class TrafficLight {
    private Color currentColor;

    public TrafficLight(Color currentColor) {
        this.currentColor = currentColor;
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void changeColor() {
        switch (currentColor) {
            case RED:
               this.currentColor = Color.GREEN;
               break;
            case YELLOW:
                this.currentColor = Color.RED;
                break;
            case GREEN:
                this.currentColor = Color.YELLOW;
        }
    }
}
