import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class L8 implements Runnable {
   final aa_2 X;

   L8(aa_2 var1) {
      this.X = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(362499978219265933L).get(com.c.c(630666139679178869L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(318198075729798656L);
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





