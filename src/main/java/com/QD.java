package com;

import javax.swing.JScrollBar;
import javax.swing.SwingUtilities;

class QD implements Runnable {
   final JScrollBar z;
   final int t;
   final int C;
   private static final long a;

   QD(JScrollBar var1, int var2, int var3) {
      this.z = var1;
      this.t = var2;
      this.C = var3;
   }

   @Override
   public void run() {
      String var10000 = com.FV.D();
      com.FN.M(Thread.currentThread());
      String var1 = var10000;
      int var2 = this.z.getValue();

      while (var2 != this.t) {
         label54: {
            Thread var4 = com.FN.E();
            if (var1 == null) {
               if (var4 == Thread.currentThread()) {
                  break label54;
               }

               var4 = Thread.currentThread();
            }

            var4.interrupt();
         }

         label65: {
            int var5 = var2;
            int var10001 = this.t;
            if (var1 == null) {
               if (var2 == this.t) {
                  break label65;
               }

               var5 = var2;
               var10001 = this.C * Math.max(Math.abs(var2 - this.t) / 4, 1);
            }

            int var3;
            var3 = var5 + var10001;
            var2 = var3;
            SwingUtilities.invokeLater(new RR(this, var3));
            var6 = this.C;
            label41:
            if (var1 == null) {
               if (this.C < 0) {
                  var6 = var3;
                  if (var1 != null) {
                     break label41;
                  }

                  if (var3 == this.z.getMinimum()) {
                     break;
                  }
               }

               var6 = this.C;
            }

            if (var1 == null) {
               if (var6 <= 0) {
                  break label65;
               }

               var6 = var3;
            }

            if (var6 == this.z.getMaximum() && var1 == null) {
               break;
            }
         }

         rD_3.l(a);
         if (var1 != null) {
            break;
         }
      }
   }

   static {
      long var0 = 5628729250429719190L;
      long var10002 = 5628729250429719183L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





