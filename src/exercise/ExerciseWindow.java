package exercise;
import javax.swing.*;
import java.awt.*;

/**
 * Created by hillmanrj on 4/20/2017.
 */
public class ExerciseWindow extends JFrame{
    public static void main(String[] args) { ExerciseWindow ew = new ExerciseWindow(); }

    public void ExersiseWindow(){
        this.setTitle("Exercise  Window");
        this.setSize(win_width,win_height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
