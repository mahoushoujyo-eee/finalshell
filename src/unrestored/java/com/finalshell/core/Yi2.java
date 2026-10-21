package com.finalshell.core;

import com.finalshell.ui.listener.Wz4;
import com.finalshell.ui.model.WF;
import com.finalshell.ui.panel.Ky4;
import javax.swing.JComponent;

public abstract class Yi2 implements Rq2 {
   public com.finalshell.ui.panel.Wd2 l;
   public WC_2 A;

   @Override
   public long T() {
      return (long)Ac2.S$int();
   }

   @Override
   public com.finalshell.ui.panel.Wd2 y(JComponent var1, Object var2, int var3, int var4, boolean var5) {
      String var6 = this.D(var1, var2, var3, var4, var5);
      WF var7 = this.h(var1, var2, var3, var4, var5);
      return new com.finalshell.ui.panel.Wd2(var1, var6, var7);
   }

   public WF h(JComponent var1, Object var2, int var3, int var4, boolean var5) {
      return WF.trailing;
   }

   public abstract String D(JComponent var1, Object var2, int var3, int var4, boolean var5);

   @Override
   public void M(JComponent var1, int var2, int var3, int var4, int var5) {
      Ky4[] var6 = Ac2.n();
      Yi2 var10000 = this;
      if (var6 == null) {
         if (this.A != null) {
            this.A.Y();
         }

         var10000 = this;
      }

      label44: {
         com.finalshell.ui.panel.Wd2 var9 = var10000.l;
         if (var6 == null) {
            if (var10000.l == null) {
               break label44;
            }

            var9 = this.l;
         }

         var9.j$void();
      }

      int var10 = var4;
      byte var10001 = -1;
      if (var6 == null) {
         if (var4 == -1) {
            return;
         }

         var10 = var5;
         var10001 = -1;
      }

      if (var10 != var10001) {
         long var7;
         label31: {
            var7 = this.T();
            if (var6 == null) {
               if (var7 > 0L) {
                  break label31;
               }

               this.z(var1, var4, var5);
            }

            if (var6 == null) {
               return;
            }
         }

         this.A = WC_2.A(var7, new Wz4(this, var1, var4, var5));
      }
   }

   public void z(JComponent var1, int var2, int var3) {
      Object var4 = this.c(var1, var2, var3);
      boolean var5 = this.M(var1, var2, var3);
      this.l = this.y(var1, var4, var2, var3, var5);
      this.l.Q(this.E(var1, var4, var2, var3, var5));
      Ac2.i(this.l);
   }

   public abstract Object c(JComponent var1, int var2, int var3);

   public abstract boolean M(JComponent var1, int var2, int var3);
}





