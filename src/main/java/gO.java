import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class gO implements Runnable {
   final F8 b;
   final ck_4 v;
   final U g;
   final oQ_3 p;

   gO(oQ_3 var1, F8 var2, ck_4 var3, U var4) {
      this.p = var1;
      this.b = var2;
      this.v = var3;
      this.g = var4;
   }

   @Override
   public void run() {
      String var1 = aA.z();
      gO var10000 = this;
      if (var1 == null) {
         if (com.c.c(290808397898617243L).get(this) instanceof CL) {
            CL var2 = (CL)com.c.c(290808397898617243L).get(this);
            Method var10001 = (Method)com.c.c(508956589370960468L).get(this);
            Object[] var10002 = com.c.f();
            Method var10004 = com.c.d(272998330038223631L);
            Object[] var10003 = var10002;
            var10002 = var10001;
            var10001 = var10004;

            try {
               var10001 = (Method)var10001.invoke(var10002, var10003);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            Object[] var12 = com.c.a(var10001, com.c.c(325143752404869623L).get(this));
            Method var24 = com.c.d(298666565248176577L);
            var10002 = var12;
            CL var13 = var2;
            Method var7 = var24;

            try {
               var7.invoke(var13, var10002);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }

            if (var1 == null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000 = (gO)com.c.c(325143752404869623L).get(var10000);
      Method var14 = (Method)com.c.c(508956589370960468L).get(this);
      Object[] var21 = com.c.f();
      Method var27 = com.c.d(272998330038223631L);
      Object[] var25 = var21;
      var21 = var14;
      var14 = var27;

      try {
         var14 = (Method)var14.invoke(var21, var25);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      Object[] var17 = com.c.a(var14, false);
      Method var26 = com.c.d(392275651608919501L);
      var21 = var17;
      var14 = var10000;
      Method var9 = var26;

      try {
         var9.invoke(var14, var21);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





