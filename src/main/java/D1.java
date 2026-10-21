import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class D1 implements Runnable {
   final Ul_2 W;

   D1(Ul_2 var1) {
      this.W = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(393801433552238231L).get(com.c.c(129158354330092400L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(412779964454069832L);
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





