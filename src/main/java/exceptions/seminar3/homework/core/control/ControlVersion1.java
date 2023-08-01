package exceptions.seminar3.homework.core.control;

import exceptions.seminar3.homework.core.model.Model;

public class ControlVersion1 implements Control {
    @Override
    public void execute(String input) {
        new Model(input);
    }
}
