package com;

import java.util.concurrent.TimeUnit;

class Ib_2 implements Runnable {
   private final long V;
   private volatile boolean O;
   final uO e;

   public Ib_2(uO var1) {
      this.e = var1;
      this.O = true;
      this.V = System.nanoTime() + uO.G(var1);
   }

   public void I() {
      this.O = false;
   }

   @Override
   public void run() {
      boolean var1 = j_2.g();
      Ib_2 var10000 = this;
      if (var1) {
         if (!this.O) {
            return;
         }

         var10000 = this;
      }

      long var2 = var10000.V - System.nanoTime();
      if (var1) {
         if (var2 > 0L) {
            uO.J().schedule(this, var2, TimeUnit.NANOSECONDS);
            if (var1) {
               return;
            }
         }

         this.O = false;
      }

      uO.u(this.e).run();
   }
}





