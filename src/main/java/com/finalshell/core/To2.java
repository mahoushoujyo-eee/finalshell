package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.QS;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingConstants;

public class To2 extends T4 implements SwingConstants {
   protected final List W = new ArrayList(2);
   protected final Object B = new Object();

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void A(Component var1, Object var2) {
      Ky4[] var10000 = com.finalshell.ui.panel.QQ.N$arrky_4();
      Object var4 = this.B;
      synchronized (this.B){} // $VF: monitorenter 
      Ky4[] var3 = var10000;

      try {
         var10000 = var1;
         if (var3 == null) {
            if (var1 instanceof QS) {
               this.W.add((QS)var1);
            }

            var10000 = (Ky4[])var4;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void F(Component var1) {
      Ky4[] var10000 = com.finalshell.ui.panel.QQ.N$arrky_4();
      Object var3 = this.B;
      synchronized (this.B){} // $VF: monitorenter 
      Ky4[] var2 = var10000;

      try {
         var10000 = var1;
         if (var2 == null) {
            if (var1 instanceof QS) {
               this.W.remove(var1);
            }

            var10000 = (Ky4[])var3;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      return null;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void layoutContainer(Container var1) {
      Ky4[] var10000 = com.finalshell.ui.panel.QQ.N$arrky_4();
      Object var3 = this.B;
      synchronized (this.B){} // $VF: monitorenter 
      Ky4[] var2 = var10000;

      try {
         var10000 = this.W;
         if (var2 == null) {
            if (this.W.size() > 0) {
               Rectangle var4 = FN.N(var1);
               CJ_2.O(this.W, var4);
            }

            var10000 = (Ky4[])var3;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }
}





