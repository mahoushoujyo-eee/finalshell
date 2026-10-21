import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JCheckBoxMenuItem;

class Lf_2 implements ActionListener {
   final JCheckBoxMenuItem C;
   final Kj_2 L;
   final U J;

   Lf_2(U var1, JCheckBoxMenuItem var2, Kj_2 var3) {
      this.J = var1;
      this.C = var2;
      this.L = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = ((JCheckBoxMenuItem)com.c.c(438571043727846030L).get(this)).isSelected();
      Method var10000 = (Method)com.c.c(294388469702703610L).get(this);
      Object[] var10001 = com.c.a(var2);
      Method var10003 = com.c.d(137024548965563513L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var10000 = (Method)com.c.c(208444474277099894L).get(com.c.c(238850161964236737L).get(this));
      var10001 = com.c.f();
      var10003 = com.c.d(483219322811206313L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10001 = com.c.a(((JCheckBoxMenuItem)com.c.c(438571043727846030L).get(this)).isSelected());
      var10003 = com.c.d(137024548965563513L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      Object[] var14 = com.c.f();
      var10000 = com.c.d(270389152141252877L);
      var10002 = var14;
      var10001 = null;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(578864097947885485L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10000 = (Method)com.c.c(238850161964236737L).get(this);
      var10001 = com.c.a(com.c.c(208444474277099894L).get(com.c.c(238850161964236737L).get(this)));
      var10003 = com.c.d(182560589671772498L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





