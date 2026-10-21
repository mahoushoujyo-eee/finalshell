package com;

import javax.swing.AbstractListModel;

class Wz_2 extends AbstractListModel {
   final Object[] C;
   final wO_3 I;

   Wz_2(wO_3 var1, Object[] var2) {
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





