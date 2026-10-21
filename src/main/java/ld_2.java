import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

class Ld_2 implements Comparator {
   final Vc_2 O;

   Ld_2(Vc_2 var1) {
      this.O = var1;
   }

   public int V(L1 var1, L1 var2) {
      int[] var10000 = yB_3.Y();
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(608348398594129275L);
      Object[] var10003 = var10002;
      L1 var27 = var1;
      Method var10001 = var10004;

      try {
         var20 = (Integer)var10001.invoke(var27, var10003);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      double var4 = (double)var20;
      var10002 = com.c.f();
      var10004 = com.c.d(608348398594129275L);
      var10003 = var10002;
      L1 var29 = var2;
      var10001 = var10004;

      try {
         var22 = (Integer)var10001.invoke(var29, var10003);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      double var6 = (double)var22;
      var10002 = com.c.f();
      var10004 = com.c.d(236277018693765536L);
      var10003 = var10002;
      L1 var31 = var1;
      var10001 = var10004;

      try {
         var24 = (Integer)var10001.invoke(var31, var10003);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      double var8 = (double)var24;
      int[] var3 = var10000;
      Object[] var25 = com.c.f();
      Method var35 = com.c.d(236277018693765536L);
      var10002 = var25;
      L1 var26 = var2;
      Method var17 = var35;

      try {
         var18 = (Integer)var17.invoke(var26, var10002);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      double var10 = (double)var18;
      byte var12 = 0;
      double var38;
      int var19 = (var38 = var4 - var6) == 0.0 ? 0 : (var38 < 0.0 ? -1 : 1);
      if (var3 == null) {
         if (var19 > 0) {
            var12 = -1;
            if (var3 == null) {
               return var12;
            }
         }

         double var39;
         var19 = (var39 = var6 - var4) == 0.0 ? 0 : (var39 < 0.0 ? -1 : 1);
      }

      if (var3 == null) {
         if (var19 > 0) {
            var12 = 1;
            if (var3 == null) {
               return var12;
            }
         }

         double var40;
         var19 = (var40 = var8 - var10) == 0.0 ? 0 : (var40 < 0.0 ? -1 : 1);
      }

      if (var3 == null) {
         if (var19 > 0) {
            var12 = 1;
            if (var3 == null) {
               return var12;
            }
         }

         double var41;
         var19 = (var41 = var10 - var8) == 0.0 ? 0 : (var41 < 0.0 ? -1 : 1);
      }

      if (var3 != null) {
         return var19;
      } else {
         if (var19 > 0) {
            var12 = -1;
         }

         return var12;
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((L1)var1, (L1)var2);
      Method var10003 = com.c.d(417293533616605001L);
      Object[] var10002 = var10001;
      Ld_2 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





