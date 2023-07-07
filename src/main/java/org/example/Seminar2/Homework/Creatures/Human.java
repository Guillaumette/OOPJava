package org.example.Seminar2.Homework.Creatures;

import org.example.Seminar2.Homework.Interface.Jump;
import org.example.Seminar2.Homework.Interface.Run;
import org.example.Seminar2.Homework.Obstacles.Racetrack;
import org.example.Seminar2.Homework.Obstacles.Wall;

public class Human implements Run, Jump {
    private final String name;
    private final int heightJump;
    private int runDistance;

    public Human(String name, int heightJump, int runDistance) {
        this.name = name;
        this.heightJump = heightJump;
        this.runDistance = runDistance;
    }

    public Human(String name){
        this.name = name;
        this.heightJump = 0;
        this.runDistance = 0;
    }

    private String getName() {
        return name;
    }

    @Override
    public boolean run(Racetrack racetrack) {
        if (runDistance >= racetrack.getDistance()) {
            runDistance -= racetrack.getDistance();
            System.out.println(getName() + " пробежал");
            return true;
        } else {
            System.out.println(getName() + " выбывает :(");
            return false;
        }
    }

    @Override
    public boolean jump( Wall wall) {
        if (heightJump >= wall.getHeight()) {
            System.out.println(getName() + " перепрыгнул через препятствие");
            return true;
        } else {
            System.out.println(getName() + " выбывает :(");
            return false;
        }
    }
}
