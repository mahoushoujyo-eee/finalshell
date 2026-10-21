package com;

import javax.swing.JComponent;

public abstract class Yi_2 implements Rq_2 {
   private com.Wd_2 l;
   private com.WC A;

   @Override
   public long T() {
      return (long)com.ac_2.S();
   }

   @Override
   public com.Wd_2 y(JComponent var1, Object var2, int var3, int var4, boolean var5) {
      String var6 = this.D(var1, var2, var3, var4, var5);
      com.WF var7 = this.h(var1, var2, var3, var4, var5);
      return new com.Wd_2(var1, var6, var7);
   }

   public com.WF h(JComponent var1, Object var2, int var3, int var4, boolean var5) {
      return com.WF.trailing;
   }

   public abstract String D(JComponent var1, Object var2, int var3, int var4, boolean var5);

   @Override
   public void M(JComponent var1, int var2, int var3, int var4, int var5) {
      com.ky_4[] var6 = com.ac_2.n();
      com.Yi_2 var10000 = this;
      if (var6 == null) {
         if (this.A != null) {
            this.A.Y();
         }

         var10000 = this;
      }

      label44: {
         com.Wd_2 var9 = var10000.l;
         if (var6 == null) {
            if (var10000.l == null) {
               break label44;
            }

            var9 = this.l;
         }

         var9.j();
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

         this.A = com.WC.A(var7, new wz_4(this, var1, var4, var5));
      }
   }

   protected void z(JComponent var1, int var2, int var3) {
      Object var4 = this.c(var1, var2, var3);
      boolean var5 = this.M(var1, var2, var3);
      this.l = this.y(var1, var4, var2, var3, var5);
      this.l.Q(this.E(var1, var4, var2, var3, var5));
      com.ac_2.i(this.l);
   }

   protected abstract Object c(JComponent var1, int var2, int var3);

   protected abstract boolean M(JComponent var1, int var2, int var3);
}





