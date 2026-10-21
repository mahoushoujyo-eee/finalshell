package com;

import java.awt.Component;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.ref.WeakReference;

class YD extends MouseAdapter {
   final WeakReference A;
   final com.WC b;

   YD(WeakReference var1, com.WC var2) {
      this.A = var1;
      this.b = var2;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      com.ky_4[] var10000 = com.ac_2.n();
      Component var3 = (Component)this.A.get();
      com.ky_4[] var2 = var10000;
      Component var5 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return;
         }

         var5 = var3;
      }

      Window var4 = com.FN.L(var5);
      boolean var6 = var4.isShowing();
      if (var2 == null) {
         if (!var6) {
            return;
         }

         var6 = var4.isActive();
      }

      if (var6) {
         this.b.u();
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.N();
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.N();
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.N();
   }

   private void N() {
      com.ky_4[] var10000 = com.ac_2.n();
      Component var2 = (Component)this.A.get();
      com.ky_4[] var1 = var10000;
      Component var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return;
         }

         this.b.Y();
         var3 = var2;
      }

      com.ac_2.y(var3);
   }
}





