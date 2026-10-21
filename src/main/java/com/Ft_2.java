package com;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class Ft_2 extends com.Fm_2 {
   public static ComponentUI createUI(JComponent var0) {
      return new com.Ft_2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      this.I.c(this.B().g());
   }

   protected ud_2 B() {
      return (ud_2)this.U;
   }

   @Override
   protected com.aO s() {
      return new com.a2(this.B());
   }

   @Override
   protected void A() {
      ud_2 var4;
      label30: {
         ud_2 var2;
         com.ky_4[] var10000 = Pt_2.b();
         var2 = this.B();
         com.ky_4[] var1 = var10000;
         var3 = this;
         label29:
         if (var1 == null) {
            if (this.u()) {
               var3 = this;
               if (var1 != null) {
                  break label29;
               }

               if (this.O()) {
                  var4 = var2;
                  if (var1 != null) {
                     break label30;
                  }

                  if (var2.isEnabled()) {
                     this.I.U(var2.g());
                     this.P.u();
                     if (var1 == null) {
                        return;
                     }

                     com.ky_4.K(new String[4]);
                  }
               }
            }

            this.P.Y();
            var3 = this;
         }

         var3.I.c(var2.g());
         var4 = var2;
      }

      var4.repaint();
   }
}





