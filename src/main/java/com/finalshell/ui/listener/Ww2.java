package com.finalshell.ui.listener;

import com.finalshell.ui.panel.OY3;
import com.finalshell.ui.panel.Xt2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ww2 implements ActionListener {
   final Xt2 u;
   public static long a;

   Ww2(Xt2 var1) {
      this.u = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = OY3.y$boolean();
      int var10000 = Xt2.M(this.u);
      if (var2) {
         if (var10000 > 0) {
            Xt2.n(this.u, (int)a);
            if (var2) {
               return;
            }
         }

         Xt2.i(this.u, 0);
      }

      Xt2.K(this.u).Y();
      Xt2.a(this.u);
      this.u.setVisible(false);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 1488391915559922698L;
      long var10002 = -6479319485684438014L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





