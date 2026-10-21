package com.finalshell.ui.listener;

import com.finalshell.ui.panel.EX;
import com.finalshell.ui.panel.KD3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rw2 implements ActionListener {
   public final EX U;
   public final KD3 x;
   public static long a;

   public Rw2(KD3 var1, EX var2) {
      this.x = var1;
      this.U = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.U.setValue((int)a);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8229549093471946858L;
      long var10002 = 2772536876090296394L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





