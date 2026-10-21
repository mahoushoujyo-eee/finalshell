import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class mt_2 implements Runnable {
   final xW V;

   mt_2(xW var1) {
      this.V = var1;
   }

   @Override
   public void run() {
      try {
         Method var10000 = (Method)com.c.c(157659510478786273L).get(com.c.c(610634713269186354L).get(this));
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(265460201950227144L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      } catch (Exception var3) {
      }
   }
}





