package com;

import javax.swing.AbstractListModel;

class Ld_2 extends AbstractListModel {
   final No_2 o;

   Ld_2(No_2 var1) {
      this.o = var1;
   }

   @Override
   public int getSize() {
      return this.o.M.size();
   }

   @Override
   public Object getElementAt(int var1) {
      return this.o.M.get(var1);
   }
}





