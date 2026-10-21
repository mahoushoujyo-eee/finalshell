package com.finalshell.ui.listener;

import com.finalshell.core.GR;
import com.finalshell.core.WO3;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;

public class X5 extends KeyAdapter {
   public final FocusAdapter H;
   public final JList I;
   public final WO3 Z;

   public X5(WO3 var1, FocusAdapter var2, JList var3) {
      this.Z = var1;
      this.H = var2;
      this.I = var3;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      int var2 = WO3.H();
      boolean var10000 = GR.lZ.J(var1);
      if (var2 != 0) {
         if (var10000) {
            this.Z.d.removeFocusListener(this.H);
            this.Z.C(this.I);
            this.I.requestFocusInWindow();
            if (var2 != 0) {
               return;
            }
         }

         var10000 = GR.lD.J(var1);
      }

      if (var2 != 0 && var10000) {
         this.Z.d.removeFocusListener(this.H);
         this.Z.w(this.I);
         this.I.requestFocusInWindow();
      }
   }
}





