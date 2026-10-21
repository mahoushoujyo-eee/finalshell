package com.finalshell.ui.listener;

import com.finalshell.core.AS;
import com.finalshell.core.IB;
import com.finalshell.core.IH;
import com.finalshell.ui.model.Q_2;
import javax.swing.JComponent;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class Id2 extends IB implements TreeSelectionListener, TreeExpansionListener {
   public Id2(AS var1) {
      super(var1);
   }

   protected void p(com.finalshell.ui.panel.S var1) {
      var1.addTreeSelectionListener(this);
      var1.addTreeExpansionListener(this);
   }

   protected void j(com.finalshell.ui.panel.S var1) {
      var1.removeTreeExpansionListener(this);
      var1.removeTreeSelectionListener(this);
   }

   @Override
   public void treeExpanded(TreeExpansionEvent var1) {
      this.M();
   }

   @Override
   public void treeCollapsed(TreeExpansionEvent var1) {
      this.M();
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      this.M();
   }

   protected void I(com.finalshell.ui.panel.S var1) {
      String[] var2 = IH.M();
      Object var10000 = var1.M$DefaultMutableTreeNode();
      if (var2 != null) {
         if (!(var10000 instanceof Q_2)) {
            return;
         }

         var10000 = this.o();
      }

      com.finalshell.ui.model.P2 var3 = (com.finalshell.ui.model.P2)var10000;
      if (var3 != null) {
         var1.P(var3);
      }
   }

   protected void W(com.finalshell.ui.panel.S var1) {
      if (var1.M$DefaultMutableTreeNode() instanceof Q_2) {
         this.J(var1.B$p_2());
      }
   }

   @Override
   protected void T(JComponent var1) {
      this.W((com.finalshell.ui.panel.S)var1);
   }

   @Override
   protected void s(JComponent var1) {
      this.I((com.finalshell.ui.panel.S)var1);
   }

   @Override
   protected void r(JComponent var1) {
      this.j((com.finalshell.ui.panel.S)var1);
   }

   @Override
   protected void F(JComponent var1) {
      this.p((com.finalshell.ui.panel.S)var1);
   }
}





