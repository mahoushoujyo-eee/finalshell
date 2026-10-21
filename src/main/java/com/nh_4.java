package com;

class nh_4 implements Runnable {
   final com.DI t;

   nh_4(com.DI var1) {
      this.t = var1;
   }

   @Override
   public void run() {
      boolean var1 = com.dm_4.F();

      while (this.t.t()) {
         try {
            this.t.U();
         } catch (Exception var4) {
            var4.printStackTrace();
            if (var1) {
               break;
            }
         }

         try {
            Thread.sleep((long)com.c.c(327550303567808343L).getInt(null));
         } catch (InterruptedException var3) {
            var3.printStackTrace();
            if (!var1) {
               break;
            }
         }
      }
   }
}





