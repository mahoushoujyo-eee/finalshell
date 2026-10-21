package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

class zM implements ActionListener {
   final JProgressBar k;
   final Ej_2 R;
   private static final long a;

   zM(Ej_2 var1, JProgressBar var2) {
      this.R = var1;
      this.k = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = com.By_2.J();
      int var10000 = Ej_2.g(this.R);
      label14:
      if (var2 == 0) {
         if (var10000 < (int)a) {
            Ej_2.L(this.R);
            if (var2 == 0) {
               break label14;
            }
         }

         Ej_2.X(this.R, 0);
      }

      SwingUtilities.invokeLater(new com.BG(this));
   }

   static {
      long var0 = 5785545440390487775L;
      long var10002 = -5827984117255692552L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





