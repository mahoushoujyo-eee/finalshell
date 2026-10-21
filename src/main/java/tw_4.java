import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JCheckBoxMenuItem;

class tw_4 implements ActionListener {
   final JCheckBoxMenuItem u;
   final U d;

   tw_4(U var1, JCheckBoxMenuItem var2) {
      this.d = var1;
      this.u = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = ((JCheckBoxMenuItem)com.c.c(320499158333428503L).get(this)).isSelected();
      Object[] var10000 = com.c.f();
      Method var9 = com.c.d(270389152141252877L);
      Object[] var31 = var10000;
      Object var20 = null;

      try {
         var10000 = (Object[])var9.invoke(var20, var31);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var20 = com.c.f();
      Method var10003 = com.c.d(306266403902896148L);
      var31 = (Object[])var20;
      var20 = var10000;
      Method var11 = var10003;

      try {
         var10000 = (Object[])var11.invoke(var20, var31);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var20 = com.c.a(var2);
      var10003 = com.c.d(542391450237137501L);
      var31 = (Object[])var20;
      var20 = var10000;
      Method var13 = var10003;

      try {
         var13.invoke(var20, var31);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var10000 = com.c.f();
      Method var15 = com.c.d(270389152141252877L);
      var31 = var10000;
      var20 = null;

      try {
         var10000 = (Object[])var15.invoke(var20, var31);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var20 = com.c.f();
      var10003 = com.c.d(578864097947885485L);
      var31 = (Object[])var20;
      var20 = var10000;
      Method var17 = var10003;

      try {
         var17.invoke(var20, var31);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10000 = (Object[])com.c.c(478820766842959448L).get(this);
      var20 = com.c.a(var2);
      var10003 = com.c.d(555658123259816064L);
      var31 = (Object[])var20;
      var20 = var10000;
      Method var19 = var10003;

      try {
         var19.invoke(var20, var31);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





