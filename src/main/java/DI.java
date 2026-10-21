import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JMenuItem;

class DI implements ActionListener {
   final u6_2 r;
   final JMenuItem Y;
   final Tg_2 P;

   DI(Tg_2 var1, u6_2 var2, JMenuItem var3) {
      this.P = var1;
      this.r = var2;
      this.Y = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(610756112525548103L).get(this);
      Object[] var10001 = com.c.a(((JMenuItem)com.c.c(443747423670745632L).get(this)).isSelected());
      Method var10003 = com.c.d(336543365265728522L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      Object[] var6 = com.c.f();
      var10000 = com.c.d(270389152141252877L);
      var10002 = var6;
      var10001 = null;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(578864097947885485L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





