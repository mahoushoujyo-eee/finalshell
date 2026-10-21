import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class KH implements Runnable {
   final LS A;

   KH(LS var1) {
      this.A = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(305402254993059552L).get(com.c.c(366105017638426158L).get(com.c.c(156801642212502866L).get(this)));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(346382751221538814L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10001 = com.c.a(com.c.c(622438402074773363L).get(com.c.c(156801642212502866L).get(this)));
      var10003 = com.c.d(277808345207982888L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





