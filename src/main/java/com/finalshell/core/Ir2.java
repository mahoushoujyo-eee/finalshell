package com.finalshell.core;

import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeListener;

public class Ir2 extends IB {
   public ChangeListener i;

   public Ir2(AS var1) {
      super(var1);
   }

   public void H(JTabbedPane var1) {
      this.i = new com.finalshell.ui.listener.BO(this);
      var1.addChangeListener(this.i);
   }

   public void S(JTabbedPane var1) {
      var1.removeChangeListener(this.i);
      this.i = null;
   }

   public void E(JTabbedPane var1) {
      String[] var10000 = IH.M();
      Integer var3 = (Integer)this.o();
      String[] var2 = var10000;
      Integer var4 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return;
         }

         var4 = var3;
      }

      int var5 = var4;
      if (var2 != null) {
         if (var5 < 0) {
            return;
         }

         var5 = var1.getTabCount();
      }

      int var10001 = var3;
      if (var2 != null) {
         if (var5 <= var10001) {
            return;
         }

         var5 = var3;
         var10001 = var1.getSelectedIndex();
      }

      if (var5 != var10001) {
         var1.setSelectedIndex(var3);
      }
   }

   public void N(JTabbedPane var1) {
      this.J(Integer.valueOf(var1.getSelectedIndex()));
   }

   @Override
   public void T(JComponent var1) {
      this.N((JTabbedPane)var1);
   }

   @Override
   public void s(JComponent var1) {
      this.E((JTabbedPane)var1);
   }

   @Override
   public void r(JComponent var1) {
      this.S((JTabbedPane)var1);
   }

   @Override
   public void F(JComponent var1) {
      this.H((JTabbedPane)var1);
   }
}





