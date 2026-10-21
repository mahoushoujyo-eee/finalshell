import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class d3_2 implements Runnable {
   final aa_2 Q;

   d3_2(aa_2 var1) {
      this.Q = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(362499978219265933L).get(com.c.c(439663471776631349L).get(this));
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





