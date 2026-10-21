import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class FG implements Runnable {
   final String X;
   final String T;
   final String K;
   final tf_4 x;
   final mT z;

   FG(mT var1, String var2, String var3, String var4, tf_4 var5) {
      this.z = var1;
      this.X = var2;
      this.T = var3;
      this.K = var4;
      this.x = var5;
   }

   @Override
   public void run() {
      try {
         Method var10000 = (Method)com.c.c(219976392524080121L).get(com.c.c(319034145398702008L).get(this));
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(622340890791521181L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000 = (Method)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var10001 = com.c.a(com.c.c(172513830479908398L).get(this), com.c.c(142338921408466909L).get(this));
         var10003 = com.c.d(247777483328047393L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         var10000 = (Method)com.c.c(400471378487267832L).get(com.c.c(319034145398702008L).get(this));
         var10001 = com.c.a(
            com.c.c(172513830479908398L).get(this),
            com.c.c(142338921408466909L).get(this),
            com.c.c(605821607350219874L).get(this),
            false,
            com.c.c(524368014565337208L).get(this),
            null
         );
         var10003 = com.c.d(599514589999069238L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            tf_4 var11 = (tf_4)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }
}





