import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JPopupMenu;

class aG implements ActionListener {
   final fX_3 q;
   final String D;
   final JPopupMenu N;
   final W8 S;
   final mi_2 m;

   aG(mi_2 var1, fX_3 var2, String var3, JPopupMenu var4, W8 var5) {
      this.m = var1;
      this.q = var2;
      this.D = var3;
      this.N = var4;
      this.S = var5;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(199036356961837208L).get(this);
      Object[] var10001 = com.c.a(com.c.c(308573825510407868L).get(this));
      Method var10003 = com.c.d(452642608051992089L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var10000 = (Method)com.c.c(352329716694519879L).get(this);
      var10001 = com.c.f();
      var10003 = com.c.d(136665046032231527L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      ((JPopupMenu)com.c.c(398950747833943895L).get(this)).remove((W8)com.c.c(249387698434160646L).get(this));
      ((JPopupMenu)com.c.c(398950747833943895L).get(this)).validate();
      ((JPopupMenu)com.c.c(398950747833943895L).get(this)).pack();
      Dimension var2 = ((JPopupMenu)com.c.c(398950747833943895L).get(this)).getPreferredSize();
      var10000 = (Method)com.c.c(352329716694519879L).get(this);
      var10001 = com.c.a(com.c.c(308573825510407868L).get(this));
      var10003 = com.c.d(399675325010309536L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var12 = (W8)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      W8 var3 = var12;
      ((ArrayList)com.c.c(375737987500155781L).get(com.c.c(352329716694519879L).get(this))).remove(var3);
   }
}





