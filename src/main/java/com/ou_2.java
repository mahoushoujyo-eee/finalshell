package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JWindow;

class Ou_2 extends KeyAdapter {
   final com.kz_4 y;

   Ou_2(com.kz_4 var1) {
      this.y = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      String var2;
      boolean var3;
      label60: {
         label63: {
            var2 = com.kz_4.M();
            JWindow var10000 = this.y.d;
            if (var2 != null) {
               if (this.y.d == null) {
                  break label63;
               }

               var10000 = this.y.d;
            }

            var3 = var10000.isVisible();
            if (var2 == null) {
               break label60;
            }

            if (var3) {
               return;
            }
         }

         var3 = GR.lD.J(var1);
      }

      if (var3) {
         label47: {
            label46: {
               label45: {
                  label64: {
                     File var4 = this.y.b;
                     if (var2 != null) {
                        if (this.y.b == null) {
                           var5 = this.y;
                           if (var2 == null) {
                              break label45;
                           }

                           if (this.y.Z.getText().trim().equals("")) {
                              break label64;
                           }
                        }

                        var6 = this.y;
                        if (var2 == null) {
                           break label47;
                        }

                        var4 = this.y.b;
                     }

                     if (var4 == null) {
                        break label46;
                     }

                     var6 = this.y;
                     if (var2 == null) {
                        break label47;
                     }

                     if (!this.y.y().equals(this.y.Z.getText())) {
                        break label46;
                     }
                  }

                  this.y.P();
                  var5 = this.y;
               }

               var5.transferFocus();
               if (var2 != null) {
                  return;
               }
            }

            var6 = this.y;
         }

         var6.Z.setText(this.y.y());
      }
   }
}





