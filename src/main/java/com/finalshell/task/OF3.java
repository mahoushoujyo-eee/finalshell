package com.finalshell.task;

import com.finalshell.core.A9;
import com.finalshell.ui.frame.Xc4;
import com.finalshell.ui.panel.KD3;

public class OF3 implements Runnable {
   public final String[] V;

   public OF3(String[] var1) {
      this.V = var1;
   }

   @Override
   public void run() {
      Xc4 var2;
      label19: {
         label18: {
            int[] var10000 = KD3.u();
            A9.x();
            int[] var1 = var10000;
            String[] var3 = this.V;
            if (var1 == null) {
               if (this.V == null) {
                  break label18;
               }

               var3 = this.V;
            }

            if (var3.length > 0) {
               var2 = new Xc4(this.V[0]);
               if (var1 == null) {
                  break label19;
               }
            }
         }

         var2 = new Xc4();
      }

      var2.setVisible(true);
   }
}





