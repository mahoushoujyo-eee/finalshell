package com.finalshell.ui.listener;

import com.finalshell.core.Ej2;
import com.finalshell.task.BG_2;
import com.finalshell.ui.panel.By_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class ZM implements ActionListener {
   final JProgressBar k;
   final Ej2 R;
   public static long a;

   ZM(Ej2 var1, JProgressBar var2) {
      this.R = var1;
      this.k = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = By_2.J();
      int var10000 = Ej2.g(this.R);
      label14:
      if (var2 == 0) {
         if (var10000 < (int)a) {
            Ej2.L(this.R);
            if (var2 == 0) {
               break label14;
            }
         }

         Ej2.X(this.R, 0);
      }

      SwingUtilities.invokeLater(new BG_2(this));
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5785545440390487775L;
      long var10002 = -5827984117255692552L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





