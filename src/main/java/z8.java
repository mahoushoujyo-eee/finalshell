import java.awt.CardLayout;
import javax.swing.JComponent;

public class z8 extends JComponent {
   CardLayout G;

   public z8() {
      com.c.c(345630514562266623L).set(this, new CardLayout());
      this.setLayout((CardLayout)com.c.c(345630514562266623L).get(this));
   }

   public void c(JComponent var1) {
      this.add(var1, var1.getName());
   }

   public void P(JComponent var1) {
      ((CardLayout)com.c.c(345630514562266623L).get(this)).show(this, var1.getName());
   }
}





