package com.finalshell.core;

import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JComboBox;
import javax.swing.JComponent;

public class IQ extends IB {
   public ActionListener J;

   public IQ(AS var1) {
      super(var1);
   }

   public Integer H() {
      String[] var10000 = IH.M();
      Integer var2 = (Integer)super.Y();
      String[] var1 = var10000;
      Integer var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            var2 = -1;
         }

         var3 = var2;
      }

      return var3;
   }

   public void Q(JComboBox var1) {
      this.J = new com.finalshell.ui.listener.UD(this);
      var1.addActionListener(this.J);
   }

   public void t(JComboBox var1) {
      var1.removeActionListener(this.J);
      this.J = null;
   }

   public void L(JComboBox var1) {
      JComboBox var6;
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

         var5 = var1.getModel().getSize();
      }

      label41: {
         int var10001 = var3;
         if (var2 != null) {
            if (var5 <= var10001) {
               return;
            }

            var6 = var1;
            if (var2 == null) {
               break label41;
            }

            var5 = var1.getSelectedIndex();
            var10001 = var3;
         }

         if (var5 == var10001) {
            return;
         }

         var6 = var1;
      }

      var6.setSelectedIndex(var3);
   }

   public void i(JComboBox var1) {
      this.J(Integer.valueOf(var1.getSelectedIndex()));
   }

   @Override
   public void T(JComponent var1) {
      this.i((JComboBox)var1);
   }

   @Override
   public void s(JComponent var1) {
      this.L((JComboBox)var1);
   }

   @Override
   public void r(JComponent var1) {
      this.t((JComboBox)var1);
   }

   @Override
   public void F(JComponent var1) {
      this.Q((JComboBox)var1);
   }

   @Override
   public Serializable Y() {
      return this.H();
   }
}





