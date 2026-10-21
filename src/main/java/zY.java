import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

class zY implements MouseMotionListener {
   final JButton g;
   final Tv_2 G;

   zY(Tv_2 var1, JButton var2) {
      this.G = var1;
      this.g = var2;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      Point var2 = SwingUtilities.convertPoint(
         (JButton)com.c.c(204373106762481439L).get(this), var1.getPoint(), (aJ)com.c.c(336078366828898497L).get(com.c.c(334109740315771342L).get(this))
      );
      ((aJ)com.c.c(336078366828898497L).get(com.c.c(334109740315771342L).get(this)))
         .dispatchEvent(
            new MouseEvent(
               (aJ)com.c.c(336078366828898497L).get(com.c.c(334109740315771342L).get(this)),
               var1.getID(),
               var1.getWhen(),
               var1.getModifiers(),
               var2.x,
               var2.y,
               var1.getClickCount(),
               var1.isPopupTrigger()
            )
         );
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
   }
}





