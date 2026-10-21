package com.finalshell.task;

import com.finalshell.core.B0;
import com.finalshell.core.DX3_2;
import com.finalshell.core.XQ_2;
import org.icmp4j.j;

public class Lx2 implements Runnable {
   public final Qt2 e;
   public final j c;

   public Lx2(Qt2 var1, j var2) {
      this.e = var1;
      this.c = var2;
   }

   @Override
   public void run() {
      DX3_2 var3;
      label24: {
         label23: {
            String[] var1 = XQ_2.B();
            j var10000 = this.c;
            if (var1 != null) {
               if (this.c.r() == -1) {
                  this.c.P(true);
                  this.c.v(false);
                  B0 var2 = new B0(B0.Z);
                  var2.q(this.c);
                  var3 = FH3.P(Qt2.A(this.e));
                  if (var1 == null) {
                     break label24;
                  }

                  if (var3.F == null) {
                     break label23;
                  }

                  FH3.P(Qt2.A(this.e)).F.a(var2);
                  if (var1 != null) {
                     break label23;
                  }
               }

               var10000 = this.c;
            }

            var10000.v(true);
         }

         var3 = FH3.P(Qt2.A(this.e));
      }

      var3.P.T(this.c);
   }
}





