package com;

class Xh_2 implements Runnable {
   final pA_3 n;
   final pv_4 i;
   private static final long a;

   Xh_2(pv_4 var1, pA_3 var2) {
      this.i = var1;
      this.n = var2;
   }

   @Override
   public void run() {
      String var1 = pv_4.r();
      int var10000 = this.i.N;
      if (var1 == null) {
         if (!this.i.N) {
            return;
         }

         long var2;
         var10000 = (var2 = this.i.D - this.i.u) == 0L ? 0 : (var2 < 0L ? -1 : 1);
      }

      if (var1 == null) {
         if (var10000 <= 0) {
            return;
         }

         long var3;
         var10000 = (var3 = System.currentTimeMillis() - this.i.u - a) == 0L ? 0 : (var3 < 0L ? -1 : 1);
      }

      if (var10000 > 0) {
         this.i.u = System.currentTimeMillis();
         this.n.X().i();
      }
   }

   static {
      long var0 = 2727671679669309245L;
      long var10002 = 2727671679669309273L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





