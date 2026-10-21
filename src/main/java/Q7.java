import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JCheckBox;

class Q7 implements ActionListener {
   final JCheckBox U;
   final cB_3 h;

   Q7(cB_3 var1, JCheckBox var2) {
      this.h = var1;
      this.U = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = F_.F();
      Object[] var10000 = com.c.f();
      Method var8 = com.c.d(270389152141252877L);
      Object[] var27 = var10000;
      Object var17 = null;

      try {
         var10000 = (Object[])var8.invoke(var17, var27);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var17 = com.c.f();
      Method var10003 = com.c.d(306266403902896148L);
      var27 = (Object[])var17;
      var17 = var10000;
      Method var10 = var10003;

      try {
         var10000 = (u6_2)var10.invoke(var17, var27);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      boolean var20 = ((JCheckBox)com.c.c(522942075709586275L).get(this)).isSelected();
      if (var2 != null) {
         var20 = !var20;
      }

      var17 = com.c.a(var20);
      var10003 = com.c.d(590278996794808699L);
      var27 = (Object[])var17;
      var17 = var10000;
      Method var12 = var10003;

      try {
         var12.invoke(var17, var27);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10000 = com.c.f();
      Method var14 = com.c.d(270389152141252877L);
      var27 = var10000;
      var17 = null;

      try {
         var10000 = (Object[])var14.invoke(var17, var27);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var17 = com.c.f();
      var10003 = com.c.d(578864097947885485L);
      var27 = (Object[])var17;
      var17 = var10000;
      Method var16 = var10003;

      try {
         var16.invoke(var17, var27);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





