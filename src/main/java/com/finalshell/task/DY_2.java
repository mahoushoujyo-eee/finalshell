package com.finalshell.task;

import com.finalshell.core.Zn2;
import com.finalshell.ui.model.CB3;
import java.util.List;

public class DY_2 implements Runnable {
   public final List T;
   public final List w;
   public final CB3 x;
   public final Zn2 t;

   public DY_2(Zn2 var1, List var2, List var3, CB3 var4) {
      this.t = var1;
      this.T = var2;
      this.w = var3;
      this.x = var4;
   }

   @Override
   public void run() {
      Object var10000;
      String[] var1 = CB3.C$arrString();
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
         this.x.Y(com.finalshell.ui.model.Ux2.loaded);
         this.t.nodeChanged(this.x);
      }

      this.t.s(this.x, this.T);
   }
}





