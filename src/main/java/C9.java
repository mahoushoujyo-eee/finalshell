import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class C9 implements ActionListener {
   final u6_2 q;
   final int m;
   final Tg_2 t;

   C9(Tg_2 var1, u6_2 var2, int var3) {
      this.t = var1;
      this.q = var2;
      this.m = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(291041501170898130L).get(this);
      Object[] var10001 = com.c.a(com.c.c(524579665746781176L).getInt(this));
      Method var10003 = com.c.d(521300695156736180L);
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





