package com.finalshell.ui.listener;

import com.finalshell.ui.panel.II;
import com.finalshell.ui.panel.Wb2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.SwingUtilities;

public class Cb4 extends MouseAdapter {
   public final II a;

   public Cb4(II var1) {
      this.a = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String var2 = Wb2.m$String();
      byte var10000 = (byte)((SwingUtilities.isLeftMouseButton(var1)) ? 1 : 0);
      if (var2 != null) {
         if (var10000 == 0) {
            return;
         }

         this.a.requestFocusInWindow();
         var10000 = 0;
      }

      int var3 = var10000;

      while (var3 < II.d(this.a).size()) {
         label24: {
            II var4 = this.a;
            int var10001 = var3;
            if (var2 != null) {
               if (!this.a.l(var3).contains(var1.getPoint())) {
                  break label24;
               }

               var4 = this.a;
               var10001 = var3;
            }

            var4.T(var10001);
            if (var2 != null) {
               break;
            }
         }

         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   @Override
   public void mouseWheelMoved(MouseWheelEvent var1) {
      int var6;
      label42: {
         int var3 = this.a.i();
         String var10000 = Wb2.m$String();
         int var4 = II.d(this.a).size() - 1;
         String var2 = var10000;
         int var5 = var1.getWheelRotation();
         int var7 = var5;
         if (var2 != null) {
            if (var5 > 0) {
               var6 = var3 + var5;

               do {
                  if (var6 <= var4) {
                     break label42;
                  }

                  var6 -= II.d(this.a).size();
                  if (var2 == null) {
                     return;
                  }
               } while (var2 != null);
            }

            var7 = var3 + var5;
         }

         var6 = var7;

         while (var6 < 0) {
            var6 += II.d(this.a).size();
            if (var2 == null) {
               return;
            }

            if (var2 == null) {
               break;
            }
         }
      }

      this.a.T(var6);
   }
}





