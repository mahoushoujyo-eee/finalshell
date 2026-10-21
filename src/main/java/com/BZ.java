package com;

import java.util.List;

class BZ implements Runnable {
   final List e;
   final NF V;

   BZ(NF var1, List var2) {
      this.V = var1;
      this.e = var2;
   }

   @Override
   public void run() {
      Object var10000;
      String[] var1 = com.cB_3.C();
      var10000 = this.e;
      label27:
      if (var1 != null) {
         if (this.e != null) {
            var10000 = this.e;
            if (var1 == null) {
               break label27;
            }

            if (this.e.size() > 0) {
               this.V.C.c.o(this.e, this.V.C.o, 0);
            }
         }

         var10000 = this.V.C.c.K;
      }

      synchronized (var10000) {
         this.V.C.o.Y(ux_2.loaded);
         this.V.C.c.nodeChanged(this.V.C.o);
      }

      this.V.C.c.s(this.V.C.o, this.e);
   }
}





