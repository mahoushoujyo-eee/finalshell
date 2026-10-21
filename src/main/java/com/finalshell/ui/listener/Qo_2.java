package com.finalshell.ui.listener;

import com.finalshell.core.Ac2;
import com.finalshell.core.FN;
import com.finalshell.ui.panel.Ky4;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.WeakReference;

public class Qo_2 implements ActionListener {
   final WeakReference S;

   Qo_2(WeakReference var1) {
      this.S = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Ky4[] var10000 = Ac2.n();
      Component var3 = (Component)this.S.get();
      Ky4[] var2 = var10000;
      Component var5 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return;
         }

         var5 = var3;
      }

      Window var4 = FN.L(var5);
      Window var6 = var4;
      if (var2 == null) {
         if (var4 == null) {
            return;
         }

         var6 = var4;
      }

      if (var2 == null && var6.isActive()) {
         Ac2.z(var3, false);
      }
   }
}





