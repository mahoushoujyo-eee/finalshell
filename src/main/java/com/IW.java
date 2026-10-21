package com;

import java.awt.Component;
import java.lang.ref.WeakReference;
import javax.swing.JComponent;

class IW implements p5_2 {
   final WeakReference T;
   final WeakReference y;

   IW(WeakReference var1, WeakReference var2) {
      this.T = var1;
      this.y = var2;
   }

   @Override
   public void r() {
      ((JComponent)this.T.get()).repaint();
   }

   @Override
   public void M(int var1, int var2, int var3, int var4) {
      ((JComponent)this.T.get()).repaint(var1, var2, var3, var4);
   }

   @Override
   public void J() {
      GA.i((Component)this.T.get());
      ((JComponent)this.T.get()).revalidate();
   }

   @Override
   public void p() {
      int[] var10000 = com.Lz_2.M();
      com.og_4 var2 = (com.og_4)this.y.get();
      int[] var1 = var10000;
      com.og_4 var4 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return;
         }

         var4 = var2;
      }

      Boolean var3 = var4.d((JComponent)this.T.get());
      var10000 = (int[])var3;
      if (var1 == null) {
         if (var3 == null) {
            return;
         }

         var10000 = (int[])this.T.get();
      }

      ((JComponent)var10000).setOpaque(var3);
   }
}





