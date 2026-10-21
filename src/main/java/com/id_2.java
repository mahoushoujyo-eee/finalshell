package com;

import javax.swing.JComponent;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class Id_2 extends IB implements TreeSelectionListener, TreeExpansionListener {
   public Id_2(com.aS var1) {
      super(var1);
   }

   protected void p(com.m.s var1) {
      var1.addTreeSelectionListener(this);
      var1.addTreeExpansionListener(this);
   }

   protected void j(com.m.s var1) {
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

   protected void I(com.m.s var1) {
      String[] var2 = IH.M();
      Object var10000 = var1.M();
      if (var2 != null) {
         if (!(var10000 instanceof com.m.Q)) {
            return;
         }

         var10000 = this.o();
      }

      com.m.p_2 var3 = (com.m.p_2)var10000;
      if (var3 != null) {
         var1.P(var3);
      }
   }

   protected void W(com.m.s var1) {
      if (var1.M() instanceof com.m.Q) {
         this.J(var1.B());
      }
   }

   @Override
   protected void T(JComponent var1) {
      this.W((com.m.s)var1);
   }

   @Override
   protected void s(JComponent var1) {
      this.I((com.m.s)var1);
   }

   @Override
   protected void r(JComponent var1) {
      this.j((com.m.s)var1);
   }

   @Override
   protected void F(JComponent var1) {
      this.p((com.m.s)var1);
   }
}





