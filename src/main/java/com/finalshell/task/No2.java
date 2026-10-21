package com.finalshell.task;

import com.finalshell.core.Ld2;
import com.finalshell.ui.listener.Ic2;
import com.finalshell.ui.panel.Kz4;
import java.awt.Point;
import java.util.List;
import javax.swing.JWindow;

public class No2 implements Runnable {
   final List M;
   final Ic2 h;
   public static long a;

   No2(Ic2 var1, List var2) {
      this.h = var1;
      this.M = var2;
   }

   @Override
   public void run() {
      Ic2.g(this.h).setModel(new Ld2(this));
      String var10000 = Kz4.M();
      Ic2.g(this.h).setVisibleRowCount(Math.min(this.M.size(), (int)a));
      Ic2.g(this.h).updateUI();
      String var1 = var10000;
      No2 var3 = this;
      if (var1 != null) {
         if (this.M.size() > 0) {
            Ic2.g(this.h).setSelectedIndex(0);
         }

         var3 = this;
      }

      Point var2;
      int var6;
      label31: {
         var2 = var3.h.L.Z.getLocationOnScreen();
         this.h.L.d.setSize(this.h.L.Z.getWidth(), Ic2.a(this.h).getPreferredSize().height);
         var4 = this.h.L.d;
         var6 = (this.h.L.Z.getComponentOrientation().isLeftToRight()) ? 1 : 0;
         if (var1 != null) {
            if (var6 != 0) {
               var6 = var2.x;
               break label31;
            }

            var6 = var2.x + this.h.L.Z.getWidth();
         }

         var6 -= this.h.L.d.getWidth();
      }

      var4.setLocation(var6, var2.y + this.h.L.Z.getHeight());
      JWindow var5 = this.h.L.d;
      if (var1 != null) {
         if (this.h.L.d.isShowing()) {
            return;
         }

         var5 = this.h.L.d;
      }

      var5.setVisible(true);
      this.h.L.transferFocus();
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8932703871800293049L;
      long var10002 = -245180978171365697L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





