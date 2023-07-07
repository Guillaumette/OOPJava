package org.example.Seminar2.Homework.Creatures;

import org.example.Seminar2.Homework.Interface.Jump;
import org.example.Seminar2.Homework.Interface.Run;
import org.example.Seminar2.Homework.Obstacles.Racetrack;
import org.example.Seminar2.Homework.Obstacles.Wall;

public class Cat implements Run, Jump {
    private final String name;
    private final int heightJump;
    private int runDistance;

    public Cat(String name, int heightJump, int runDistance) {
        this.name = name;
        this.heightJump = heightJump;
        this.runDistance = runDistance;
    }

    public Cat(String name) {
        this.name = name;
        this.heightJump = 0;
        this.runDistance = 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean run(Racetrack racetrack) {
        if (runDistance >= racetrack.getDistance()) {
            runDistance -= racetrack.getDistance();
            System.out.println(getName() + " пробежал дистанцию");
            return true;
        } else {
            System.out.println(getName() + " выбывает, у него недостаточно сильные лапки :(");
            return false;
        }
    }

    @Override
    public boolean jump(Wall wall) {
        if (heightJump >= wall.getHeight()) {
            System.out.println(getName() + " перепрыгнул через препятствие");
            return true;
        } else {
            System.out.println(getName() + "выбывает, у него недостаточно сильные лапки :(");
            return false;
        }
    }
}
