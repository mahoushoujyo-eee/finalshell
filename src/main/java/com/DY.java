package com;

import java.util.List;

class DY implements Runnable {
   final List T;
   final List w;
   final com.cB_3 x;
   final com.zn_2 t;

   DY(com.zn_2 var1, List var2, List var3, com.cB_3 var4) {
      this.t = var1;
      this.T = var2;
      this.w = var3;
      this.x = var4;
   }

   @Override
   public void run() {
      Object var10000;
      String[] var1 = com.cB_3.C();
      var10000 = this.T;
      label27:
      if (var1 != null) {
         if (this.T != null) {
            var10000 = this.T;
            if (var1 == null) {
               break label27;
            }

            if (this.T.size() > 0) {
               this.t.N(this.w, false);
               this.t.o(this.T, this.x, 0);
            }
         }

         var10000 = this.t.K;
      }

      synchronized (var10000) {
         this.x.Y(ux_2.loaded);
         this.t.nodeChanged(this.x);
      }

      this.t.s(this.x, this.T);
   }
}





