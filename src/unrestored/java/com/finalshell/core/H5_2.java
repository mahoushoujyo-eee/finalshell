package com.finalshell.core;

import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;

public class H5_2 implements TreeExpansionListener {
   public final K5_2 l;

   public H5_2(K5_2 var1) {
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





