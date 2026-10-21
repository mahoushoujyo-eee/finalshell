import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

class cc_4 implements Comparator {
   final FK Z;

   cc_4(FK var1) {
      this.Z = var1;
   }

   public int o(L1 var1, L1 var2) {
      String[] var10000 = FK.i();
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(608348398594129275L);
      Object[] var10003 = var10002;
      L1 var31 = var1;
      Method var10001 = var10004;

      try {
         var24 = (Integer)var10001.invoke(var31, var10003);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      double var4 = (double)var24;
      String[] var3 = var10000;
      Object[] var25 = com.c.f();
      Method var35 = com.c.d(608348398594129275L);
      var10002 = var25;
      L1 var26 = var2;
      Method var17 = var35;

      try {
         var18 = (Integer)var17.invoke(var26, var10002);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      double var6 = (double)var18;
      Object[] var27 = com.c.f();
      Method var36 = com.c.d(236277018693765536L);
      var10002 = var27;
      L1 var28 = var1;
      Method var19 = var36;

      try {
         var20 = (Integer)var19.invoke(var28, var10002);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      double var8 = (double)var20;
      Object[] var29 = com.c.f();
      Method var37 = com.c.d(236277018693765536L);
      var10002 = var29;
      L1 var30 = var2;
      Method var21 = var37;

      try {
         var22 = (Integer)var21.invoke(var30, var10002);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      double var10 = (double)var22;
      byte var12 = 0;
      double var38;
      int var23 = (var38 = var4 - var6) == 0.0 ? 0 : (var38 < 0.0 ? -1 : 1);
      if (var3 == null) {
         if (var23 > 0) {
            var12 = -1;
            if (var3 == null) {
               return var12;
            }
         }

         double var39;
         var23 = (var39 = var6 - var4) == 0.0 ? 0 : (var39 < 0.0 ? -1 : 1);
      }

      if (var3 == null) {
         if (var23 > 0) {
            var12 = 1;
            if (var3 == null) {
               return var12;
            }
         }

         double var40;
         var23 = (var40 = var8 - var10) == 0.0 ? 0 : (var40 < 0.0 ? -1 : 1);
      }

      if (var3 == null) {
         if (var23 > 0) {
            var12 = 1;
            if (var3 == null) {
               return var12;
            }
         }

         double var41;
         var23 = (var41 = var10 - var8) == 0.0 ? 0 : (var41 < 0.0 ? -1 : 1);
      }

      if (var3 != null) {
         return var23;
      } else {
         if (var23 > 0) {
            var12 = -1;
         }

         return var12;
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((L1)var1, (L1)var2);
      Method var10003 = com.c.d(242703001634192352L);
      Object[] var10002 = var10001;
      cc_4 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





