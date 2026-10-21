import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class cE_3 implements Runnable {
   final tf_4 H;
   final yY_3 y;

   cE_3(yY_3 var1, tf_4 var2) {
      this.y = var1;
      this.H = var2;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(627973027287447539L).get(com.c.c(216006756334095373L).get(com.c.c(408438253181889861L).get(this)));
      Object[] var10001 = com.c.a(com.c.c(163960328229192286L).get(this));
      Method var10003 = com.c.d(354921658348946569L);
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





