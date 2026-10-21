import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Ki_2 implements Runnable {
   final BU t;

   Ki_2(BU var1) {
      this.t = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(476201740043670453L).get(com.c.c(267379412116570843L).get(com.c.c(597797036197355507L).get(this)));
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

      var10001 = com.c.a(com.c.c(588985816751341623L).get(com.c.c(597797036197355507L).get(this)));
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





