package com;

import java.awt.FontMetrics;
import java.awt.datatransfer.DataFlavor;
import javax.swing.Icon;

public class zU extends com.zJ {
   protected final com.QL C;

   public zU(com.QL var1) {
      this.C = var1;
   }

   @Override
   public DataFlavor y() {
      return com.lL_3.q;
   }

   protected FontMetrics R(com.at_2 var1) {
      return this.C.getFontMetrics(this.C.getFont());
   }

   protected Icon h(com.at_2 var1) {
      return var1.I();
   }

   protected String A(com.at_2 var1) {
      return var1.V();
   }

   @Override
   protected String O(Object var1) {
      return this.A((com.at_2)var1);
   }

   @Override
   protected Icon n(Object var1) {
      return this.h((com.at_2)var1);
   }

   @Override
   protected FontMetrics Z(Object var1) {
      return this.R((com.at_2)var1);
   }
}





