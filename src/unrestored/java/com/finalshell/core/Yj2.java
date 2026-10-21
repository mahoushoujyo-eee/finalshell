package com.finalshell.core;

import com.finalshell.ui.panel.QX;
import com.finalshell.ui.panel.Qq2;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class Yj2 extends D2_2 {
   public final Qq2 e;

   public Yj2(Qq2 var1) {
      this.e = var1;
   }

   public void j(Graphics2D var1, Rectangle var2, Qq2 var3) {
      Color var5;
      Shape var10002;
      label26: {
         label28: {
            String[] var4 = QX.Y();
            var10002 = this.e.d(var3);
            boolean var10003 = Qq2.r(this.e).isFocusable();
            if (var4 == null) {
               if (!var10003) {
                  break label28;
               }

               var10003 = Qq2.r(this.e).z();
            }

            if (var4 == null) {
               if (!var10003) {
                  break label28;
               }

               var10003 = this.u;
            }

            if (var10003) {
               var5 = GO.c;
               break label26;
            }
         }

         var5 = GO.r;
      }

      GA.i(var1, var3, var10002, var5, Qq2.r(this.e).q$int(), true, this.z());
   }

   @Override
   public void h(Graphics2D var1, Rectangle var2, JPanel var3) {
      this.j(var1, var2, (Qq2)var3);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.j(var1, var2, (Qq2)var3);
   }
}





