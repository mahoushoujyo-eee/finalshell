package com.finalshell.core;

import javax.swing.AbstractListModel;

public class Wz2 extends AbstractListModel {
   public final Object[] C;
   public final WO3 I;

   public Wz2(WO3 var1, Object[] var2) {
      this.I = var1;
      this.C = var2;
   }

   @Override
   public int getSize() {
      return this.C.length;
   }

   @Override
   public Object getElementAt(int var1) {
      return this.C[var1];
   }
}





