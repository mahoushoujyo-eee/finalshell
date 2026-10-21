package com.finalshell.task;

import com.finalshell.core.A6;
import com.finalshell.core.B22;
import com.finalshell.core.Cm4;

public class FI implements Runnable {
   public final Cm4 f;
   public final com.finalshell.core.PacketLossStats j;
   public final A6 h;

   public FI(Cm4 var1, com.finalshell.core.PacketLossStats var2, A6 var3) {
      this.f = var1;
      this.j = var2;
      this.h = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void run() {
      com.finalshell.ui.panel.Ky4[] var10000 = A6.P();
      B22 var2 = null;
      com.finalshell.ui.panel.Ky4[] var1 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 >= this.f.I) {
            this.h.g = var2;
            if (var1 != null) {
               return;
            }
         } else {
            var2 = this.j.W(this.f.S, this.f.Y, 1);
         }

         while (var2.g != 0.0F && var1 != null) {
            this.h.g = var2;
            if (var1 != null) {
               return;
            }
         }

         var3++;
      }
   }
}





