package exceptions.seminar3.homework.core.view;

import exceptions.seminar3.homework.core.control.Control;
import exceptions.seminar3.homework.core.control.ControlVersion1;

import java.util.Scanner;

public class ViewVersion1 implements View {
    private final Control control;

    public ViewVersion1() {
        this.control = new ControlVersion1();
    }

    @Override
    public void start() {
        Scanner in = new Scanner(System.in).useDelimiter("\r?\n");
        while (true) {
            System.out.println("""
                    Введите данные, разделенные пробелом, в произвольном порядке:
                    <ФИО дд.мм.гггг 0123456789 f|m>
                    введите [exit] для выхода""");
            String input = in.next();
            if (input.equalsIgnoreCase("exit")) System.exit(0);
            this.control.execute(input);
        }
    }
}
