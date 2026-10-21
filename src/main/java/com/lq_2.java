package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Lq_2 implements ActionListener {
   final com.kD_3 q;

   Lq_2(com.kD_3 var1) {
      this.q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = com.kD_3.u();
      if (!com.kD_3.c(this.q).R()) {
         String var3 = com.Wx_2.a();
         Object var10000 = var3;
         if (var2 == null) {
            if (var3 == null) {
               return;
            }

            var10000 = PM.N(var3);
         }

         RT var4 = (RT)var10000;
         com.kD_3.c(this.q).O(var4);
      }
   }
}





