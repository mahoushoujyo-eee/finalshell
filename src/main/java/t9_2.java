import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class t9_2 implements Runnable {
   final OT u;

   t9_2(OT var1) {
      this.u = var1;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.f();
      Method var6 = com.c.d(270389152141252877L);
      Object[] var19 = var10000;
      Method var11 = null;

      try {
         var10000 = (Object[])var6.invoke(var11, var19);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var11 = com.c.f();
      Method var10003 = com.c.d(176098798606098947L);
      var19 = (Object[])var11;
      var11 = var10000;
      Method var8 = var10003;

      try {
         var10000 = (ta_4)var8.invoke(var11, var19);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      ta_4 var1 = var10000;
      var1.setVisible(true);
      var11 = com.c.c(406580448552580548L).get(com.c.c(566236282398450369L).get(this));
      var19 = com.c.f();
      Method var10004 = com.c.d(191716730601734423L);
      Object[] var24 = var19;
      var19 = (Object[])var11;
      var11 = var10004;

      try {
         var11 = (Method)var11.invoke(var19, var24);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      Object[] var17 = com.c.a(var11);
      var10003 = com.c.d(553387157770947632L);
      var19 = var17;
      ta_4 var18 = var1;
      Method var10 = var10003;

      try {
         var10.invoke(var18, var19);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





