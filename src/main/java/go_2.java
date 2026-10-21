import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class go_2 implements Runnable {
   final lF_3 J;

   go_2(lF_3 var1) {
      this.J = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep((long)com.c.c(293577005979220571L).getInt(com.c.c(194417552812168696L).get(this)));
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }

      Method var10000 = (Method)com.c.c(549777208306704057L).get(com.c.c(194417552812168696L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(335950632529437253L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





