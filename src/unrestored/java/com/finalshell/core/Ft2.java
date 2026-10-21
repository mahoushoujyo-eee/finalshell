package com.finalshell.core;

import com.finalshell.ui.model.Pt2;
import com.finalshell.ui.panel.Ky4;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class Ft2 extends Fm2 {
   public static ComponentUI createUI(JComponent var0) {
      return new Ft2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      this.I.c(this.B().g$Pt_2());
   }

   public Ud2_2 B() {
      return (Ud2_2)this.U;
   }

   @Override
   public AO_2 s() {
      return new A2_3(this.B());
   }

   @Override
   public void A() {
      Ft2 var3;
      Ud2_2 var4;
      label30: {
         Ud2_2 var2;
         Ky4[] var10000 = Pt2.b();
         var2 = this.B();
         Ky4[] var1 = var10000;
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
                     this.I.U(var2.g$Pt_2());
                     this.P.u$WC();
                     if (var1 == null) {
                        return;
                     }

                     Ky4.K(new String[4]);
                  }
               }
            }

            this.P.Y();
            var3 = this;
         }

         var3.I.c(var2.g$Pt_2());
         var4 = var2;
      }

      var4.repaint();
   }
}





