import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

class zO implements MouseListener {
   final String U;
   final JLabel g;
   final Color P;
   final W8 p;
   final JPopupMenu w;
   final mi_2 u;

   zO(mi_2 var1, String var2, JLabel var3, Color var4, W8 var5, JPopupMenu var6) {
      this.u = var1;
      this.U = var2;
      this.g = var3;
      this.P = var4;
      this.p = var5;
      this.w = var6;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int[] var2 = L9.X();
      if (var2 == null) {
         if (var1.getButton() != 1) {
            return;
         }

         ((JTextField)com.c.c(248665380297112060L).get(com.c.c(572657125606053081L).get(this))).setText((String)com.c.c(411598179636948090L).get(this));
         ((JLabel)com.c.c(547158884885104846L).get(this)).setBackground((Color)com.c.c(159448385553585843L).get(this));
         ((W8)com.c.c(217783752399713273L).get(this)).setBackground((Color)com.c.c(159448385553585843L).get(this));
         ((JPopupMenu)com.c.c(173830265044925830L).get(this)).setVisible(false);
      }

      Method var10000 = (Method)com.c.c(572657125606053081L).get(this);
      Object[] var10001 = com.c.a(null);
      Method var10003 = com.c.d(519002930381305189L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
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





