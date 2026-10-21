package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class iu_4 implements ActionListener {
   private int M;
   final int x;
   final com.CC D;
   private static final long a;

   iu_4(com.CC var1, int var2) {
      this.D = var1;
      this.x = var2;
      this.M = (int)a;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = com.Co_2.U();
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

      ((com.WC)var10000).Y();
   }

   static {
      long var0 = 87862909567340684L;
      long var10002 = -5282331182490349430L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





