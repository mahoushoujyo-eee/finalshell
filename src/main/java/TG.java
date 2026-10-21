import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

class TG implements Runnable {
   final String W;
   final nq_2 Y;
   final List r;
   final String I;
   final nK J;

   TG(nK var1, String var2, nq_2 var3, List var4, String var5) {
      this.J = var1;
      this.W = var2;
      this.Y = var3;
      this.r = var4;
      this.I = var5;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.a(com.c.c(392366729472972769L).get(this));
      Method var4 = com.c.d(571034619098221891L);
      Object[] var11 = var10000;
      Object var8 = null;

      try {
         var10000 = (String)var4.invoke(var8, var11);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      String var1 = var10000;
      var10000 = (Object[])com.c.c(501455745045430860L).get(this);
      var8 = com.c.a(com.c.c(360094047934338870L).get(this), com.c.c(392366729472972769L).get(this), com.c.c(260250598083004817L).get(this), var1);
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





