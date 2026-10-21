import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

class ub_4 implements Comparator {
   final FK J;

   ub_4(FK var1) {
      this.J = var1;
   }

   public int c(L1 var1, L1 var2) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(236277018693765536L);
      Object[] var10002 = var10001;
      L1 var14 = var1;
      Method var10000 = var10003;

      try {
         var11 = (Integer)var10000.invoke(var14, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      double var4 = (double)var11;
      String[] var12 = FK.i();
      var10002 = com.c.f();
      Method var10004 = com.c.d(236277018693765536L);
      Object[] var19 = var10002;
      L1 var18 = var2;
      Method var15 = var10004;

      try {
         var16 = (Integer)var15.invoke(var18, var19);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      double var6 = (double)var16;
      String[] var3 = var12;
      byte var8 = 0;
      double var20;
      int var13 = (var20 = var4 - var6) == 0.0 ? 0 : (var20 < 0.0 ? -1 : 1);
      if (var3 == null) {
         if (var13 > 0) {
            var8 = -1;
            if (var3 == null) {
               return var8;
            }
         }

         double var21;
         var13 = (var21 = var6 - var4) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
      }

      if (var3 != null) {
         return var13;
      } else {
         if (var13 > 0) {
            var8 = 1;
         }

         return var8;
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((L1)var1, (L1)var2);
      Method var10003 = com.c.d(574993626918362268L);
      Object[] var10002 = var10001;
      ub_4 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





