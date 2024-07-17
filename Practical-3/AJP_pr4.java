import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Practical 4: WAP to draw a smiley using the Graphics class.
 * Author: Rudra Mistry
 * Division: Q-C (Batch - 1)
 * Enrollment: 2203396160149
 */
public class AJP_pr4 extends Applet {
    @Override
    public void paint(Graphics g) {
        // Draw face
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        // Draw eyes
        g.setColor(Color.RED);
        g.fillOval(90, 110, 40, 40); // Left eye
        g.fillOval(170, 110, 40, 40); // Right eye

        // Draw mouth
        g.setColor(Color.RED);
        g.fillArc(95, 150, 110, 50, 0, -180); // Mouth
    }
}
