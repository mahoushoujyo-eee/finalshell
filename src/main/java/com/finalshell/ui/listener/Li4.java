package com.finalshell.ui.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class Li4 extends MouseAdapter {
   public final JComponent S;
   public final com.finalshell.core.N2 T;
   public static long a;

   public Li4(com.finalshell.core.N2 var1, JComponent var2) {
      this.T = var1;
      this.S = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      com.finalshell.core.N2.r(this.T).repaint();
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      com.finalshell.core.N2.q(this.T).repaint();
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      com.finalshell.core.N2.K(this.T).repaint();
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Li4 var4;
      int var10000 = com.finalshell.core.N2.G$int();
      this.T.y = true;
      int var2 = var10000;
      com.finalshell.core.N2 var3 = this.T;
      if (var2 == 0) {
         label20: {
            if (this.T.h$boolean()) {
               var4 = this;
               if (var2 != 0) {
                  break label20;
               }

               if (this.S.isEnabled()) {
                  this.T.v.u$WC();
                  if (var2 == 0) {
                     return;
                  }
               }
            }

            this.T.B = (int)a;
            var4 = this;
         }

         var3 = var4.T;
      }

      com.finalshell.core.N2.s(var3).repaint();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Li4 var4;
      int var10000 = com.finalshell.core.N2.W();
      this.T.y = false;
      int var2 = var10000;
      com.finalshell.core.N2 var3 = this.T;
      if (var2 != 0) {
         label20: {
            if (this.T.h$boolean()) {
               var4 = this;
               if (var2 == 0) {
                  break label20;
               }

               if (this.S.isEnabled()) {
                  this.T.v.u$WC();
                  if (var2 != 0) {
                     return;
                  }
               }
            }

            this.T.B = 0;
            var4 = this;
         }

         var3 = var4.T;
      }

      com.finalshell.core.N2.X(var3).repaint();
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 488343422258881099L;
      long var10002 = 7349351560752898638L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





