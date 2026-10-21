import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JCheckBoxMenuItem;

class Y5 implements ActionListener {
   final yB_3 x;

   Y5(yB_3 var1) {
      this.x = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object[] var10000 = com.c.f();
      Method var7 = com.c.d(270389152141252877L);
      Object[] var25 = var10000;
      Object var16 = null;

      try {
         var10000 = (Object[])var7.invoke(var16, var25);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var16 = com.c.f();
      Method var10003 = com.c.d(306266403902896148L);
      var25 = (Object[])var16;
      var16 = var10000;
      Method var9 = var10003;

      try {
         var10000 = (Object[])var9.invoke(var16, var25);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var16 = com.c.a(((JCheckBoxMenuItem)com.c.c(274811053631936956L).get(com.c.c(444456035672562901L).get(this))).isSelected());
      var10003 = com.c.d(192311363740458831L);
      var25 = (Object[])var16;
      var16 = var10000;
      Method var11 = var10003;

      try {
         var11.invoke(var16, var25);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10000 = com.c.f();
      Method var13 = com.c.d(270389152141252877L);
      var25 = var10000;
      var16 = null;

      try {
         var10000 = (Object[])var13.invoke(var16, var25);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var16 = com.c.f();
      var10003 = com.c.d(578864097947885485L);
      var25 = (Object[])var16;
      var16 = var10000;
      Method var15 = var10003;

      try {
         var15.invoke(var16, var25);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





