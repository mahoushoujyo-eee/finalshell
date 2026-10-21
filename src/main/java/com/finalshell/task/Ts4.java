package com.finalshell.task;

import com.finalshell.core.A6;
import com.finalshell.core.B22;
import com.finalshell.core.Cm4;

public class Ts4 implements Runnable {
   public final Cm4 V;
   public final com.finalshell.core.PacketLoss b;
   public final A6 I;
   public final A6 Z;

   public Ts4(Cm4 var1, com.finalshell.core.PacketLoss var2, A6 var3, A6 var4) {
      this.V = var1;
      this.b = var2;
      this.I = var3;
      this.Z = var4;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void run() {
      com.finalshell.ui.panel.Ky4[] var10000 = A6.P();
      B22 var2 = null;
      com.finalshell.ui.panel.Ky4[] var1 = var10000;
      int var3 = 0;

      while (true) {
         label30: {
            if (var3 < 3) {
               var2 = this.b.e(this.I.m, this.I.a, this.V.S, this.V.Y, 1);
               if (var2.g == 0.0F || var1 == null) {
                  break label30;
               }
            }

            do {
               if (var1 != null) {
                  if (var2 != null) {
                     this.V.f.l(this.Z.m, this.I.m, var2);
                     this.Z.g(this.I.m, var2);
                  }

                  return;
               }
            } while (var2.g != 0.0F && var1 != null);
         }

         var3++;
      }
   }
}





