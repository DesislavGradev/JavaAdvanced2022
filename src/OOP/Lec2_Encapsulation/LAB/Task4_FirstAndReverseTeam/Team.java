package OOP.Lec2_Encapsulation.LAB.Task4_FirstAndReverseTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        setName(name);
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void addPlayer(Person player) {
        if (player.getAge() < 40) {
            firstTeam.add(player);
        } else {
            reserveTeam.add(player);
        }
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }
    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }
}
