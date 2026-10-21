package com.finalshell.ui.listener;

import com.finalshell.core.RU3;
import com.finalshell.core.XE;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Hb2 extends MouseMotionAdapter {
   final SetBackgroundImagePanel a;
   public static long b;

   Hb2(SetBackgroundImagePanel var1) {
      this.a = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      super.mouseMoved(var1);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      int var2 = ConnectionProperty.y();
      long var8;
      int var10000 = (var8 = System.currentTimeMillis() - this.a.M - b) == 0L ? 0 : (var8 < 0L ? -1 : 1);
      if (var2 == 0) {
         if (var10000 < 0) {
            return;
         }

         var10000 = this.a.A;
      }

      MouseEvent var10001;
      label63: {
         if (var2 == 0) {
            if (var10000 == 0) {
               return;
            }

            var4 = this.a;
            var10001 = var1;
            if (var2 != 0) {
               break label63;
            }

            var10000 = (this.a.m(var1)) ? 1 : 0;
         }

         if (var10000 == 0) {
            return;
         }

         var4 = this.a;
         var10001 = var1;
      }

      XE var3 = SetBackgroundImagePanel.x(var4, var10001.getPoint());
      RU3 var5 = SetBackgroundImagePanel.e(this.a);
      if (var2 == 0) {
         if (var5 == null) {
            SetBackgroundImagePanel var6 = this.a;
            if (var2 == 0) {
               if (SetBackgroundImagePanel.A$XE(this.a) == null) {
                  SetBackgroundImagePanel.f(this.a, var3);
               }

               var6 = this.a;
            }

            SetBackgroundImagePanel.t(var6, new RU3(new XE(SetBackgroundImagePanel.A$XE(this.a))));
         }

         this.a.repaint();
         var5 = SetBackgroundImagePanel.e(this.a);
      }

      var5.m(var3);
      if (SetBackgroundImagePanel.S(this.a).V()) {
      }

      var10000 = var1.getPoint().y;
      if (var2 == 0) {
         if (var10000 < 0) {
            SetBackgroundImagePanel.Z(this.a, (int)((double)var1.getPoint().y * SetBackgroundImagePanel.z));
         }

         var10000 = var1.getPoint().y;
      }

      if (var10000 > this.a.J$int()) {
         SetBackgroundImagePanel.Z(this.a, (int)((double)(var1.getPoint().y - this.a.J$int()) * SetBackgroundImagePanel.z));
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3575949113380697443L;
      long var10002 = 3575949113380697425L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





