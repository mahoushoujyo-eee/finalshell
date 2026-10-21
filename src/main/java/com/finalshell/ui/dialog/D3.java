package com.finalshell.ui.dialog;

import com.finalshell.core.Gm2;
import com.finalshell.core.Pk4;
import java.awt.Dialog;
import java.awt.Frame;
import javax.swing.JRootPane;

public class D3 extends Y2 {
   final Pk4 B;

   public D3(Pk4 var1, Frame var2, String var3, boolean var4) {
      super(var2, var3, var4);
      this.B = var1;
   }

   public D3(Pk4 var1, Dialog var2, String var3, boolean var4) {
      super(var2, var3, var4);
      this.B = var1;
   }

   @Override
   protected JRootPane createRootPane() {
      Gm2 var1 = new Gm2(this);
      var1.setOpaque(true);
      return var1;
   }
}





