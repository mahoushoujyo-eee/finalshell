import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class fS_3 implements Runnable {
   final Qn_2 i;

   fS_3(Qn_2 var1) {
      this.i = var1;
   }

   @Override
   public void run() {
      String[] var1 = F8.y();
      U var10000 = com.c.f();
      Method var6 = com.c.d(270389152141252877L);
      Object[] var21 = var10000;
      Object var14 = null;

      try {
         var10000 = (Object[])var6.invoke(var14, var21);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var14 = com.c.f();
      Method var10003 = com.c.d(306266403902896148L);
      var21 = (Object[])var14;
      var14 = var10000;
      Method var8 = var10003;

      try {
         var10000 = (Object[])var8.invoke(var14, var21);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var14 = com.c.f();
      var10003 = com.c.d(577875833820570498L);
      var21 = (Object[])var14;
      var14 = var10000;
      Method var10 = var10003;

      try {
         var11 = (Boolean)var10.invoke(var14, var21);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      label57: {
         if (var1 == null) {
            if (!var11) {
               return;
            }

            var10000 = (U)com.c.c(389567756310007794L).get(com.c.c(516278995074848564L).get(this));
            if (var1 != null) {
               break label57;
            }

            var11 = var10000.isVisible();
         }

         if (!var11) {
            return;
         }

         var10000 = (U)com.c.c(389567756310007794L).get(com.c.c(516278995074848564L).get(this));
      }

      var14 = com.c.f();
      var10003 = com.c.d(526151509200330945L);
      var21 = (Object[])var14;
      var14 = var10000;
      Method var13 = var10003;

      try {
         var13.invoke(var14, var21);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





