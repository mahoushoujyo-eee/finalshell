package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ComponentAdapter;

public class U5_2 extends Uo2_2 {
   public final com.finalshell.ui.panel.Wd2 j;
   public final AWTEventListener Y;
   public final com.finalshell.ui.panel.Qm2 M;
   public final ComponentAdapter S;
   public final boolean A;
   public static long a;

   public U5_2(com.finalshell.ui.panel.Wd2 var1, AWTEventListener var2, com.finalshell.ui.panel.Qm2 var3, ComponentAdapter var4, boolean var5) {
      this.j = var1;
      this.Y = var2;
      this.M = var3;
      this.S = var4;
      this.A = var5;
   }

   @Override
   public void R() {
      if (this.j.R$boolean()) {
         Toolkit.getDefaultToolkit().addAWTEventListener(this.Y, a);
      }
   }

   @Override
   public void d() {
      U5_2 var3;
      label25: {
         Ky4[] var10000 = Ac2.n();
         this.j.R(this);
         Ky4[] var1 = var10000;
         boolean var2 = this.j.R$boolean();
         if (var1 == null) {
            if (var2) {
               Toolkit.getDefaultToolkit().removeAWTEventListener(this.Y);
            }

            Ac2.g.remove(this.j);
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

      var3.j.R$void();
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3633096230226626834L;
      long var10002 = 3633096230226626818L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





