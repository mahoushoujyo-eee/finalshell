package com.finalshell.task;

import com.finalshell.core.WC_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

public class BW implements Runnable {
   final List D;
   final ActionEvent n;
   final WC_2 H;

   BW(WC_2 var1, List var2, ActionEvent var3) {
      this.H = var1;
      this.D = var2;
      this.n = var3;
   }

   @Override
   public void run() {
      int[] var10000 = WC_2.V();
      Iterator var2 = this.D.iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         ActionListener var3 = (ActionListener)var2.next();
         var3.actionPerformed(this.n);
         if (var1 != null) {
            break;
         }
      }
   }
}





