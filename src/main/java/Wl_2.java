import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Wl_2 implements Runnable {
   final yT_3 n;

   Wl_2(yT_3 var1) {
      this.n = var1;
   }

   @Override
   public void run() {
      com.c.c(179331486645727952L).set(com.c.c(214018044769332063L).get(this), new DU(null));
      com.c.c(274180952810189743L)
         .set(com.c.c(214018044769332063L).get(this), new aW((DU)com.c.c(179331486645727952L).get(com.c.c(214018044769332063L).get(this))));
      Method var10000 = (Method)com.c.c(179331486645727952L).get(com.c.c(214018044769332063L).get(this));
      Object[] var10001 = com.c.a(com.c.c(274180952810189743L).get(com.c.c(214018044769332063L).get(this)));
      Method var10003 = com.c.d(170030301797488080L);
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





