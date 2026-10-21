package com.finalshell.core;

import java.awt.FontMetrics;
import java.awt.datatransfer.DataFlavor;
import javax.swing.Icon;

public class ZU extends ZJ {
   protected final com.finalshell.ui.panel.QL C;

   public ZU(com.finalshell.ui.panel.QL var1) {
      this.C = var1;
   }

   @Override
   public DataFlavor y() {
      return LL3.q;
   }

   protected FontMetrics R(At2 var1) {
      return this.C.getFontMetrics(this.C.getFont());
   }

   protected Icon h(At2 var1) {
      return var1.I();
   }

   protected String A(At2 var1) {
      return var1.V();
   }

   @Override
   protected String O(Object var1) {
      return this.A((At2)var1);
   }

   @Override
   protected Icon n(Object var1) {
      return this.h((At2)var1);
   }

   @Override
   protected FontMetrics Z(Object var1) {
      return this.R((At2)var1);
   }
}





