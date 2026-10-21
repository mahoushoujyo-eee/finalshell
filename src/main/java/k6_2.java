import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class k6_2 implements Runnable {
   final Cc_2 c;

   k6_2(Cc_2 var1) {
      this.c = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(299536276505910457L).get(this);
      Object[] var10001 = com.c.a(com.c.c(449769185297014212L).get(null));
      Method var10003 = com.c.d(525365375200145529L);
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





