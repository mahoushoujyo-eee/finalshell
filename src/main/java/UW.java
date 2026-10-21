import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JCheckBox;

class UW implements ActionListener {
   final JCheckBox k;
   final zf_2 e;

   UW(zf_2 var1, JCheckBox var2) {
      this.e = var1;
      this.k = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = ((JCheckBox)com.c.c(142067958742870066L).get(this)).isSelected();
      Object[] var10000 = com.c.f();
      Method var8 = com.c.d(270389152141252877L);
      Object[] var26 = var10000;
      Object var17 = null;

      try {
         var10000 = (Object[])var8.invoke(var17, var26);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var17 = com.c.f();
      Method var10003 = com.c.d(306266403902896148L);
      var26 = (Object[])var17;
      var17 = var10000;
      Method var10 = var10003;

      try {
         var10000 = (Object[])var10.invoke(var17, var26);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var17 = com.c.a(var2);
      var10003 = com.c.d(205923000048875104L);
      var26 = (Object[])var17;
      var17 = var10000;
      Method var12 = var10003;

      try {
         var12.invoke(var17, var26);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10000 = com.c.f();
      Method var14 = com.c.d(270389152141252877L);
      var26 = var10000;
      var17 = null;

      try {
         var10000 = (Object[])var14.invoke(var17, var26);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var17 = com.c.f();
      var10003 = com.c.d(578864097947885485L);
      var26 = (Object[])var17;
      var17 = var10000;
      Method var16 = var10003;

      try {
         var16.invoke(var17, var26);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





