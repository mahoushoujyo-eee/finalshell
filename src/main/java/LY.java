import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class LY implements Runnable {
   final L9 n;
   final Kd_2 G;

   LY(Kd_2 var1, L9 var2) {
      this.G = var1;
      this.n = var2;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(188463863722214745L).get(com.c.c(163845508223340572L).get(this));
      Object[] var10001 = com.c.a(com.c.c(223064528988202144L).get(this));
      Method var10003 = com.c.d(510458658460942160L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





