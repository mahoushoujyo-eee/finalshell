package com.finalshell.ui.listener;

import com.finalshell.core.WC_2;
import com.finalshell.ui.panel.CC;
import com.finalshell.ui.panel.Co2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Iu4 implements ActionListener {
   public int M;
   final int x;
   final CC D;
   public static long a;

   Iu4(CC var1, int var2) {
      this.D = var1;
      this.x = var2;
      this.M = (int)a;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = Co2.U$String();
      Object var10000 = this;
      if (var2 != null) {
         if (this.M > 0) {
            this.D.repaint(this.D.getCellBounds(this.x, this.x));
            this.M--;
            if (var2 != null) {
               return;
            }
         }

         var10000 = var1.getSource();
      }

      ((WC_2)var10000).Y();
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 87862909567340684L;
      long var10002 = -5282331182490349430L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





