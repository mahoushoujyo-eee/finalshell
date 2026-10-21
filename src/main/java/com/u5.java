package com;

import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ComponentAdapter;

class u5 extends uo_2 {
   final com.Wd_2 j;
   final AWTEventListener Y;
   final com.Qm_2 M;
   final ComponentAdapter S;
   final boolean A;
   private static final long a;

   u5(com.Wd_2 var1, AWTEventListener var2, com.Qm_2 var3, ComponentAdapter var4, boolean var5) {
      this.j = var1;
      this.Y = var2;
      this.M = var3;
      this.S = var4;
      this.A = var5;
   }

   @Override
   public void R() {
      if (this.j.R()) {
         Toolkit.getDefaultToolkit().addAWTEventListener(this.Y, a);
      }
   }

   @Override
   public void d() {
      u5 var3;
      label25: {
         com.ky_4[] var10000 = com.ac_2.n();
         this.j.R(this);
         com.ky_4[] var1 = var10000;
         boolean var2 = this.j.R();
         if (var1 == null) {
            if (var2) {
               Toolkit.getDefaultToolkit().removeAWTEventListener(this.Y);
            }

            com.ac_2.g.remove(this.j);
            this.M.removeComponentListener(this.S);
            var3 = this;
            if (var1 != null) {
               break label25;
            }

            var2 = this.A;
         }

         if (!var2) {
            return;
         }

         var3 = this;
      }

      var3.j.R();
   }

   static {
      long var0 = 3633096230226626834L;
      long var10002 = 3633096230226626818L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





