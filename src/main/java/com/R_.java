package com;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;

class R_ extends FocusAdapter {
   final com.kz_4 d;

   R_(com.kz_4 var1) {
      this.d = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      com.kz_4 var3;
      label36: {
         label39: {
            String var2;
            label40: {
               var2 = com.kz_4.M();
               File var10000 = this.d.b;
               if (var2 != null) {
                  if (this.d.b == null) {
                     var3 = this.d;
                     if (var2 == null) {
                        break label36;
                     }

                     if (this.d.Z.getText().trim().equals("")) {
                        break label39;
                     }
                  }

                  var3 = this.d;
                  if (var2 == null) {
                     break label40;
                  }

                  var10000 = this.d.b;
               }

               if (var10000 == null) {
                  return;
               }

               var3 = this.d;
            }

            if (var2 == null) {
               break label36;
            }

            if (!var3.y().equals(this.d.Z.getText())) {
               return;
            }
         }

         var3 = this.d;
      }

      var3.P();
   }
}





