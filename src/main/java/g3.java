import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class g3 implements Runnable {
   final cQ_3 L;

   g3(cQ_3 var1) {
      this.L = var1;
   }

   @Override
   public void run() {
      com.c.c(257967421985105261L).set(com.c.c(369047721302880721L).get(com.c.c(325372583320156444L).get(this)), new FP());
      com.c.c(583702008139450328L)
         .set(
            com.c.c(369047721302880721L).get(com.c.c(325372583320156444L).get(this)),
            new av_2((FP)com.c.c(257967421985105261L).get(com.c.c(369047721302880721L).get(com.c.c(325372583320156444L).get(this))))
         );
      com.c.c(588846076310445591L)
         .set(
            com.c.c(369047721302880721L).get(com.c.c(325372583320156444L).get(this)),
            new F7((FP)com.c.c(257967421985105261L).get(com.c.c(369047721302880721L).get(com.c.c(325372583320156444L).get(this))))
         );
      Method var10000 = (Method)com.c.c(167724588209923666L).get(com.c.c(369047721302880721L).get(com.c.c(325372583320156444L).get(this)));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(552739904589115408L);
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





