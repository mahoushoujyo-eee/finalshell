package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class Pq_2 extends MouseAdapter {
   private boolean f;
   final com.k4_2 h;
   final com.O_ b;
   final String W;
   final String E;
   final com.kk_4 z;

   Pq_2(com.kk_4 var1, com.k4_2 var2, com.O_ var3, String var4, String var5) {
      this.z = var1;
      this.h = var2;
      this.b = var3;
      this.W = var4;
      this.E = var5;
      this.f = com.k4_2.K(this.z.E);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String var10000 = com.kz_4.M();
      this.z.requestFocusInWindow();
      String var2 = var10000;
      if (var2 != null) {
         label35:
         if (SwingUtilities.isRightMouseButton(var1)) {
            com.k4_2 var3 = this.z.E;
            if (var2 != null) {
               if (this.z.E.I) {
                  boolean var10001 = this.f;
                  if (var2 != null) {
                     var10001 = !this.f;
                  }

                  label43: {
                     this.f = var10001;
                     Pq_2 var4 = this;
                     if (var2 != null) {
                        if (this.f) {
                           var5 = this.W;
                           break label43;
                        }

                        var4 = this;
                     }

                     var5 = var4.E;
                  }

                  this.b.setText(var5);
                  if (var2 != null) {
                     break label35;
                  }
               }

               var3 = this.z.E;
            }

            boolean var6 = this.z.E.o();
            if (var2 != null) {
               var6 = !var6;
            }

            var3.N(var6);
         }

         com.kk_4.L(this.z);
      }
   }
}





