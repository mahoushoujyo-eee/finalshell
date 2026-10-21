package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import javax.swing.JComponent;

public class RS3 extends Rt4 {
   public RS3() {
      int[] var10000 = Rq4.G();
      this.G = new Lk4(false);
      ((Lk4)this.G).N(true);
      ((Lk4)this.G).Z(new XN3(this));
      KD var2 = ((Lk4)this.G).Y();
      var2.s(0);
      int[] var1 = var10000;
      var2.O$KD(0);
      var2.E(false, true, false, false);
      this.m = new com.finalshell.ui.listener.X2_2(this);
      if (var1 == null) {
         Ky4.K(new String[3]);
      }
   }

   static JComponent U(RS3 var0) {
      return var0.G;
   }

   static JComponent S(RS3 var0) {
      return var0.G;
   }

   static JComponent a(RS3 var0) {
      return var0.G;
   }
}





