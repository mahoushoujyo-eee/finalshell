package com.finalshell.ui.listener;

import com.finalshell.network.SW;
import com.finalshell.ui.dialog.DA;
import javax.swing.event.AncestorEvent;

public class F8 extends FY {
   final SW X;
   final DA z;

   F8(DA var1, SW var2) {
      this.z = var1;
      this.X = var2;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      DA.l(this.z).requestFocusInWindow();
   }
}





