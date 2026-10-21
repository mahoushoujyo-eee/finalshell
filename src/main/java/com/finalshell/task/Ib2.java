package com.finalshell.task;

import com.finalshell.core.UO;
import java.util.concurrent.TimeUnit;

public class Ib2 implements Runnable {
   public final long V;
   public volatile boolean O;
   final UO e;

   public Ib2(UO var1) {
      this.e = var1;
      this.O = true;
      this.V = System.nanoTime() + UO.G(var1);
   }

   public void I() {
      this.O = false;
   }

   @Override
   public void run() {
      boolean var1 = com.finalshell.ui.model.J2.g();
      Ib2 var10000 = this;
      if (var1) {
         if (!this.O) {
            return;
         }

         var10000 = this;
      }

      long var2 = var10000.V - System.nanoTime();
      if (var1) {
         if (var2 > 0L) {
            UO.J().schedule(this, var2, TimeUnit.NANOSECONDS);
            if (var1) {
               return;
            }
         }

         this.O = false;
      }

      UO.u(this.e).run();
   }
}





