package com.finalshell.ui.listener;

import com.finalshell.core.Rt4;
import com.finalshell.core.WC_2;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import javax.swing.JComboBox;

public class XC3 extends XA3 {
   public final JComboBox A;
   public final Rt4 s;
   public static long a;

   public XC3(Rt4 var1, JComboBox var2) {
      super(var1);
      this.s = var1;
      this.A = var2;
   }

   @Override
   public void y(Object var1) {
      this.A.setSelectedItem(var1);
   }

   @Override
   public Object G() {
      return this.A.getSelectedItem();
   }

   @Override
   public boolean P(EventObject var1) {
      int[] var2 = WC_2.V();
      int var10000 = (var1 instanceof MouseEvent) ? 1 : 0;
      if (var2 == null) {
         if (var10000) {
            MouseEvent var3 = (MouseEvent)var1;
            var10000 = var3.getID();
            if (var2 == null) {
               var10000 = var10000 != (int)a ? 1 : 0;
            }

            return var10000 != 0;
         }

         var10000 = 1;
      }

      return var10000 != 0;
   }

   @Override
   public boolean p() {
      int[] var1 = WC_2.V();
      boolean var10000 = this.A.isEditable();
      if (var1 == null) {
         if (var10000) {
            this.A.actionPerformed(new ActionEvent(this.s, 0, ""));
         }

         var10000 = super.p();
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6011872944660465104L;
      long var10002 = -7714817601070382038L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





