package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Connection5;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeWillExpandListener;
import javax.swing.tree.ExpandVetoException;

public class A7 implements TreeWillExpandListener {
   public final Connection5 R;

   public A7(Connection5 var1) {
      this.R = var1;
   }

   @Override
   public void treeWillExpand(TreeExpansionEvent var1) throws ExpandVetoException {
   }

   @Override
   public void treeWillCollapse(TreeExpansionEvent var1) throws ExpandVetoException {
   }
}





