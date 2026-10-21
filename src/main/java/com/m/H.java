package com.m;

import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;

class H implements TreeExpansionListener {
   final com.m.K l;

   H(com.m.K var1) {
      this.l = var1;
   }

   @Override
   public void treeExpanded(TreeExpansionEvent var1) {
      this.l.F();
   }

   @Override
   public void treeCollapsed(TreeExpansionEvent var1) {
      this.l.F();
   }
}





