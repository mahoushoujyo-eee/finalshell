import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

class QJ implements Runnable {
   final String S;
   final nq_2 Q;
   final List r;
   final String K;
   final Yd_2 I;

   QJ(Yd_2 var1, String var2, nq_2 var3, List var4, String var5) {
      this.I = var1;
      this.S = var2;
      this.Q = var3;
      this.r = var4;
      this.K = var5;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.a(com.c.c(521442314554970225L).get(this));
      Method var4 = com.c.d(571034619098221891L);
      Object[] var11 = var10000;
      Object var8 = null;

      try {
         var10000 = (String)var4.invoke(var8, var11);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      String var1 = var10000;
      var10000 = (Object[])com.c.c(144331608959698200L).get(this);
      var8 = com.c.a(com.c.c(199262481176799242L).get(this), com.c.c(521442314554970225L).get(this), com.c.c(217205850914256335L).get(this), var1);
      Method var10003 = com.c.d(566104538227199671L);
      var11 = (Object[])var8;
      var8 = var10000;
      Method var7 = var10003;

      try {
         var7.invoke(var8, var11);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





