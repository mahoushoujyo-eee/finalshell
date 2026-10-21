import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class gL implements Runnable {
   final yT_3 S;

   gL(yT_3 var1) {
      this.S = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(226726102134796735L).get(this);
      Object[] var10001 = com.c.a(new ty_4(com.c.c(462380862468346033L).getInt(null)));
      Method var10003 = com.c.d(473928376202613579L);
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





