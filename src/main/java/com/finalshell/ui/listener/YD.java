package com.finalshell.ui.listener;

import com.finalshell.core.Ac2;
import com.finalshell.core.FN;
import com.finalshell.core.WC_2;
import com.finalshell.ui.panel.Ky4;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.ref.WeakReference;

public class YD extends MouseAdapter {
   final WeakReference A;
   final WC_2 b;

   YD(WeakReference var1, WC_2 var2) {
      this.A = var1;
      this.b = var2;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Ky4[] var10000 = Ac2.n();
      Component var3 = (Component)this.A.get();
      Ky4[] var2 = var10000;
      Component var5 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return;
         }

         var5 = var3;
      }

      Window var4 = FN.L(var5);
      boolean var6 = var4.isShowing();
      if (var2 == null) {
         if (!var6) {
            return;
         }

         var6 = var4.isActive();
      }

      if (var6) {
         this.b.u$WC();
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

   public void N() {
      Ky4[] var10000 = Ac2.n();
      Component var2 = (Component)this.A.get();
      Ky4[] var1 = var10000;
      Component var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return;
         }

         this.b.Y();
         var3 = var2;
      }

      Ac2.y(var3);
   }
}





