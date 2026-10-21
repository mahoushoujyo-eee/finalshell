import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

class K9 implements Comparator {
   final Yf_2 Y;

   K9(Yf_2 var1) {
      this.Y = var1;
   }

   public int C(lv_4 var1, lv_4 var2) {
      int[] var10000 = lv_4.H();
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(622590009271170486L);
      Object[] var10003 = var10002;
      lv_4 var41 = var1;
      Method var10001 = var10004;

      try {
         var26 = (Long)var10001.invoke(var41, var10003);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      long var4 = var26;
      int[] var3 = var10000;
      Object[] var27 = com.c.f();
      Method var51 = com.c.d(365199820804367683L);
      var10002 = var27;
      lv_4 var28 = var1;
      Method var16 = var51;

      try {
         var17 = (Long)var16.invoke(var28, var10002);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      if (var3 != null) {
         var10002 = com.c.f();
         var10004 = com.c.d(622590009271170486L);
         var10003 = var10002;
         lv_4 var44 = var1;
         var10001 = var10004;

         try {
            var30 = (Long)var10001.invoke(var44, var10003);
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         if (var17 > var30) {
            Object[] var31 = com.c.f();
            Method var53 = com.c.d(365199820804367683L);
            var10002 = var31;
            lv_4 var32 = var1;
            Method var18 = var53;

            try {
               var19 = (Long)var18.invoke(var32, var10002);
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            var4 = var19;
         }

         Object[] var33 = com.c.f();
         Method var54 = com.c.d(622590009271170486L);
         var10002 = var33;
         lv_4 var34 = var2;
         Method var20 = var54;

         try {
            var17 = (Long)var20.invoke(var34, var10002);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }
      }

      long var6 = var17;
      Object[] var35 = com.c.f();
      Method var55 = com.c.d(365199820804367683L);
      var10002 = var35;
      lv_4 var36 = var2;
      Method var21 = var55;

      try {
         var22 = (Long)var21.invoke(var36, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var10002 = com.c.f();
      var10004 = com.c.d(622590009271170486L);
      var10003 = var10002;
      lv_4 var49 = var2;
      var10001 = var10004;

      try {
         var38 = (Long)var10001.invoke(var49, var10003);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      long var60;
      int var23 = (var60 = var22 - var38) == 0L ? 0 : (var60 < 0L ? -1 : 1);
      if (var3 != null) {
         if (var23 > 0) {
            Object[] var39 = com.c.f();
            Method var57 = com.c.d(365199820804367683L);
            var10002 = var39;
            lv_4 var40 = var2;
            Method var24 = var57;

            try {
               var25 = (Long)var24.invoke(var40, var10002);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            var6 = var25;
         }

         var23 = Long.compare(var6, var4);
      }

      return var23;
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((lv_4)var1, (lv_4)var2);
      Method var10003 = com.c.d(369838979687248377L);
      Object[] var10002 = var10001;
      K9 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





