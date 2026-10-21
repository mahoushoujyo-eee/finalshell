import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

class bs_4 implements MouseListener {
   final JButton Q;
   final Tv_2 g;

   bs_4(Tv_2 var1, JButton var2) {
      this.g = var1;
      this.Q = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      ((aJ)com.c.c(336078366828898497L).get(com.c.c(314275367622392601L).get(this))).stopEditing();
      Point var2 = SwingUtilities.convertPoint(
         (JButton)com.c.c(513372155625613746L).get(this), var1.getPoint(), (aJ)com.c.c(336078366828898497L).get(com.c.c(314275367622392601L).get(this))
      );
      com.c.c(219376416234545265L).set(com.c.c(314275367622392601L).get(this), null);
      Method var10000 = (Method)com.c.c(336078366828898497L).get(com.c.c(314275367622392601L).get(this));
      Object[] var10001 = com.c.a(var2);
      Method var10003 = com.c.d(379754982100791858L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var9 = (Integer)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      int var3 = var9;
      var10000 = com.c.c(336078366828898497L).get(com.c.c(314275367622392601L).get(this));
      var10001 = com.c.a(var3);
      var10003 = com.c.d(313360281912871059L);
      var10002 = var10001;
      var10001 = (Object[])var10000;
      var10000 = var10003;

      try {
         var12 = (DefaultMutableTreeNode)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      DefaultMutableTreeNode var4 = var12;
      var10000 = (Method)com.c.c(314275367622392601L).get(this);
      var10001 = com.c.a(var4);
      var10003 = com.c.d(135515410391156914L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





