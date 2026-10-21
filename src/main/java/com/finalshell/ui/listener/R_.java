package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Kz4;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;

public class R_ extends FocusAdapter {
   public final Kz4 d;

   public R_(Kz4 var1) {
      this.d = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      Kz4 var3;
      label36: {
         label39: {
            String var2;
            label40: {
               var2 = Kz4.M();
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





