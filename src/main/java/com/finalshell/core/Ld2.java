package com.finalshell.core;

import javax.swing.AbstractListModel;

public class Ld2 extends AbstractListModel {
   final com.finalshell.task.No2 o;

   Ld2(com.finalshell.task.No2 var1) {
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





