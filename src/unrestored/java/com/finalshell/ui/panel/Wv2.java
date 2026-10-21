package com.finalshell.ui.panel;

import com.finalshell.core.WH3;
import javax.swing.JLabel;

public class Wv2 extends JLabel {
   public final XW3 t;

   public Wv2(XW3 var1) {
      this.t = var1;
   }

   @Override
   public String getText() {
      String[] var1 = Cn2.Q$arrString();
      WH3 var10000 = Cn2.l(this.t.u);
      if (var1 != null) {
         if (var10000 == null) {
            return null;
         }

         var10000 = Cn2.l(this.t.u);
      }

      int var2 = var10000.F(this.t);
      return var2 != -1 ? Cn2.l(this.t.u).r(var2) : null;
   }
}





