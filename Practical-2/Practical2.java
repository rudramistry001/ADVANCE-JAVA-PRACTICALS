import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
/**
 * Practical 2 : WAP to demonstrate life cycle of Applet.
 * @author Rudra Mistry
 * Division : Q-C
 * Batch : Q-C1
 */

 
 
 public class Practical2 extends Applet {
 
     
     public void init() {
         super.init();
         System.out.println("hello.init()");
         
     }
     
     public void start() {
         super.start();
         System.out.println("hello.start()");
         
     }
     public void paint(Graphics g){
         g.setColor(Color.red);
         g.drawString("Hello World", 100, 100);
        
     }
     
     public void stop() {
         super.stop();
         System.out.println("hello.stop()");
         
     }
     
     public void destroy() {
         super.stop();
         System.out.println("hello.desttroy()");
         
     }
     
 }