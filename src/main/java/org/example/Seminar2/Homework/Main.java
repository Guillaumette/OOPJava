package org.example.Seminar2.Homework;

import org.example.Seminar2.Homework.Creatures.Cat;
import org.example.Seminar2.Homework.Creatures.Human;
import org.example.Seminar2.Homework.Creatures.Robot;
import org.example.Seminar2.Homework.Obstacles.Obstacles;
import org.example.Seminar2.Homework.Obstacles.Racetrack;
import org.example.Seminar2.Homework.Obstacles.Wall;


public class Main {
    public static void main(String[] args) {
        Object[] participants = {
                new Human("Усейн Болт", 60, 500),
                new Robot("Бендер", 30, 490),
                new Cat("Гарфилд", 30, 500),
                new Human("Аркадий", 40, 350),
                new Robot("R2D2", 35, 450),
                new Cat("Тишка", 20, 380)
        };
        Obstacles[] obstacles = {
             new Racetrack("Дорожка 1", 150),
             new Racetrack("Дорожка 2", 160),
             new Racetrack("Дорожка 3", 170),
             new Racetrack("Дорожка 4", 180),
             new Racetrack("Дорожка 5", 190),
             new Wall("Препятствие 1", 20),
             new Wall("Препятствие 2", 30),
             new Wall("Препятствие 3", 40),
             new Wall("Препятствие 4", 50),
             new Wall("Препятствие 5", 60),
        };
        for (Object participant : participants) {
            for (Obstacles obstacle : obstacles) {
                System.out.print(obstacle.getName() + ": ");
                if (participant instanceof Human) {
                    if (obstacle instanceof Racetrack) {
                      if (!((Human) participant).run((Racetrack) obstacle)) break;
                    } else {
                        if (!((Human) participant).jump((Wall) obstacle)) break;
                    }
                } else if (participant instanceof Cat) {
                    if (obstacle instanceof Racetrack) {
                        if (!((Cat) participant).run((Racetrack) obstacle)) break;
                    } else {
                        if (!((Cat) participant).jump((Wall) obstacle)) break;
                    }
                } else if (participant instanceof Robot) {
                    if (obstacle instanceof Racetrack) {
                        if (!((Robot) participant).run((Racetrack) obstacle)) break;
                    } else {
                        if(!((Robot) participant).jump((Wall) obstacle)) break;
                    }
                }
            }
            System.out.println("Участник завершил соревнование \n");
        }
    }
}
