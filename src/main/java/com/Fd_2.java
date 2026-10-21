package com;

import javax.swing.event.AncestorEvent;

class Fd_2 extends com.FY {
   final com.QX X;

   Fd_2(com.QX var1) {
      this.X = var1;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      label36: {
         com.QX var4;
         label38: {
            String[] var2 = com.QX.Y();
            boolean var10000 = this.X.h;
            if (var2 == null) {
               label31:
               if (this.X.h) {
                  var4 = this.X;
                  if (var2 == null) {
                     if (this.X.v != null) {
                        this.X.v.requestFocusInWindow();
                        if (var2 == null) {
                           break label31;
                        }
                     }

                     var4 = this.X;
                  }

                  var4.transferFocus();
               }

               var4 = this.X;
               if (var2 != null) {
                  break label38;
               }

               var10000 = this.X.i;
            }

            if (var10000) {
               this.X.F = 0.0F;
               this.X.M = iC_3.fadeIn;
               this.X.C.u();
               if (var2 == null) {
                  break label36;
               }
            }

            var4 = this.X;
         }

         var4.F = 1.0F;
      }

      this.X.C();
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.X.H();
   }
}





