package com.finalshell.task;

import com.finalshell.core.FN;
import com.finalshell.core.FV_2;
import com.finalshell.core.RD3;
import javax.swing.JScrollBar;
import javax.swing.SwingUtilities;

public class II3 implements Runnable {
   public final JScrollBar A;
   public final int a;
   public final int B;
   public static long b;

   public II3(JScrollBar var1, int var2, int var3) {
      this.A = var1;
      this.a = var2;
      this.B = var3;
   }

   @Override
   public void run() {
      int var6;
      String var10000 = FV_2.D();
      FN.B(Thread.currentThread());
      String var1 = var10000;
      int var2 = this.A.getValue();

      while (var2 != this.a) {
         label54: {
            Thread var4 = FN.Z();
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
            int var10001 = this.a;
            if (var1 == null) {
               if (var2 == this.a) {
                  break label65;
               }

               var5 = var2;
               var10001 = this.B * Math.max(Math.abs(var2 - this.a) / 4, 1);
            }

            int var3;
            var3 = var5 + var10001;
            var2 = var3;
            SwingUtilities.invokeLater(new IM3(this, var3));
            var6 = this.B;
            label41:
            if (var1 == null) {
               if (this.B < 0) {
                  var6 = var3;
                  if (var1 != null) {
                     break label41;
                  }

                  if (var3 == this.A.getMinimum()) {
                     break;
                  }
               }

               var6 = this.B;
            }

            if (var1 == null) {
               if (var6 <= 0) {
                  break label65;
               }

               var6 = var3;
            }

            if (var6 == this.A.getMaximum() && var1 == null) {
               break;
            }
         }

         RD3.l(b);
         if (var1 != null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6885509346455184032L;
      long var10002 = 6885509346455184057L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





