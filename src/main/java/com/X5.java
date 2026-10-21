package com;

import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;

class X5 extends KeyAdapter {
   final FocusAdapter H;
   final JList I;
   final wO_3 Z;

   X5(wO_3 var1, FocusAdapter var2, JList var3) {
      this.Z = var1;
      this.H = var2;
      this.I = var3;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      int var2 = wO_3.H();
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





