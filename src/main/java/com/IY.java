package com;

import java.awt.event.ItemListener;
import java.io.Serializable;
import javax.swing.AbstractButton;
import javax.swing.JComponent;

public class IY extends IB {
   private ItemListener X;

   public IY(com.aS var1) {
      super(var1);
   }

   public Boolean K() {
      String[] var10000 = IH.M();
      Boolean var2 = (Boolean)super.Y();
      String[] var1 = var10000;
      Boolean var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            var2 = false;
         }

         var3 = var2;
      }

      return var3;
   }

   protected void w(AbstractButton var1) {
      this.X = new com.i(this);
      var1.addItemListener(this.X);
   }

   public void e(AbstractButton var1) {
      var1.removeItemListener(this.X);
      this.X = null;
   }

   public void j(AbstractButton var1) {
      String[] var10000 = IH.M();
      boolean var3 = (Boolean)this.o();
      String[] var2 = var10000;
      AbstractButton var4 = var1;
      if (var2 != null) {
         if (var1.isSelected() == var3) {
            return;
         }

         var4 = var1;
      }

      var4.setSelected(var3);
   }

   public void m(AbstractButton var1) {
      this.J(Boolean.valueOf(var1.isSelected()));
   }

   @Override
   public void T(JComponent var1) {
      this.m((AbstractButton)var1);
   }

   @Override
   public void s(JComponent var1) {
      this.j((AbstractButton)var1);
   }

   @Override
   public void r(JComponent var1) {
      this.e((AbstractButton)var1);
   }

   @Override
   protected void F(JComponent var1) {
      this.w((AbstractButton)var1);
   }

   @Override
   public Serializable Y() {
      return this.K();
   }
}





