package com;

import java.awt.Dialog;
import java.awt.Frame;
import javax.swing.JRootPane;

class D3 extends com.A.y_2 {
   final pk_4 B;

   public D3(pk_4 var1, Frame var2, String var3, boolean var4) {
      super(var2, var3, var4);
      this.B = var1;
   }

   public D3(pk_4 var1, Dialog var2, String var3, boolean var4) {
      super(var2, var3, var4);
      this.B = var1;
   }

   @Override
   protected JRootPane createRootPane() {
      Gm_2 var1 = new Gm_2(this);
      var1.setOpaque(true);
      return var1;
   }
}





