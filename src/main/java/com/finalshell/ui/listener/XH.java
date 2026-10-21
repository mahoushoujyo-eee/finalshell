package com.finalshell.ui.listener;

import com.finalshell.core.RU3;
import com.finalshell.core.XE;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class XH extends MouseMotionAdapter {
   final SetBackgroundImagePanel i;
   public static long a;

   XH(SetBackgroundImagePanel var1) {
      this.i = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      SetBackgroundImagePanel.f(this.i, var1.getPoint(), var1.isControlDown());
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      int var2 = ConnectionProperty.y();
      long var8;
      int var10000 = (var8 = System.currentTimeMillis() - this.i.M - a) == 0L ? 0 : (var8 < 0L ? -1 : 1);
      if (var2 == 0) {
         if (var10000 < 0) {
            return;
         }

         var10000 = this.i.A;
      }

      if (var2 == 0) {
         if (var10000 == 0) {
            return;
         }

         var10000 = (this.i.m(var1)) ? 1 : 0;
      }

      MouseEvent var10001;
      label71: {
         if (var2 == 0) {
            if (var10000 == 0) {
               return;
            }

            var4 = this.i;
            var10001 = var1;
            if (var2 != 0) {
               break label71;
            }

            var10000 = (this.i.m(var1)) ? 1 : 0;
         }

         if (var10000 == 0) {
            return;
         }

         var4 = this.i;
         var10001 = var1;
      }

      XE var3 = SetBackgroundImagePanel.x(var4, var10001.getPoint());
      RU3 var5 = SetBackgroundImagePanel.e(this.i);
      if (var2 == 0) {
         if (var5 == null) {
            SetBackgroundImagePanel var6 = this.i;
            if (var2 == 0) {
               if (SetBackgroundImagePanel.A$XE(this.i) == null) {
                  SetBackgroundImagePanel.f(this.i, var3);
               }

               var6 = this.i;
            }

            SetBackgroundImagePanel.t(var6, new RU3(new XE(SetBackgroundImagePanel.A$XE(this.i))));
         }

         this.i.repaint();
         var5 = SetBackgroundImagePanel.e(this.i);
      }

      var5.m(var3);
      if (SetBackgroundImagePanel.S(this.i).V()) {
      }

      var10000 = var1.getPoint().y;
      if (var2 == 0) {
         if (var10000 < 0) {
            SetBackgroundImagePanel.Z(this.i, (int)((double)var1.getPoint().y * SetBackgroundImagePanel.z));
         }

         var10000 = var1.getPoint().y;
      }

      if (var10000 > this.i.J$int()) {
         SetBackgroundImagePanel.Z(this.i, (int)((double)(var1.getPoint().y - this.i.J$int()) * SetBackgroundImagePanel.z));
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 1307081537624475081L;
      long var10002 = 1307081537624475131L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





