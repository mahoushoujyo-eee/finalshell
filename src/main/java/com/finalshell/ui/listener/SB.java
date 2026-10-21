package com.finalshell.ui.listener;

import com.finalshell.core.EW;
import com.finalshell.core.IY3;
import com.finalshell.core.XE;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class SB extends MouseMotionAdapter {
   public final IY3 F;
   public final SetBackgroundImagePanel d;

   public SB(SetBackgroundImagePanel var1, IY3 var2) {
      this.d = var1;
      this.F = var2;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      SetBackgroundImagePanel var4;
      MouseEvent var10001;
      label24: {
         int var2 = ConnectionProperty.M$int();
         boolean var10000 = SetBackgroundImagePanel.S(this.d).t();
         if (var2 != 0) {
            if (!var10000) {
               return;
            }

            var4 = this.d;
            var10001 = var1;
            if (var2 == 0) {
               break label24;
            }

            var10000 = this.d.b(var1);
         }

         if (!var10000) {
            return;
         }

         var4 = this.d;
         var10001 = var1;
      }

      XE var3 = SetBackgroundImagePanel.x(var4, var10001.getPoint());
      this.F.R(var3.q, var3.r, new EW(var1));
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      SetBackgroundImagePanel var4;
      MouseEvent var10001;
      label24: {
         int var2 = ConnectionProperty.y();
         boolean var10000 = SetBackgroundImagePanel.S(this.d).t();
         if (var2 == 0) {
            if (!var10000) {
               return;
            }

            var4 = this.d;
            var10001 = var1;
            if (var2 != 0) {
               break label24;
            }

            var10000 = this.d.b(var1);
         }

         if (!var10000) {
            return;
         }

         var4 = this.d;
         var10001 = var1;
      }

      XE var3 = SetBackgroundImagePanel.x(var4, var10001.getPoint());
      this.F.G(var3.q, var3.r, new EW(var1));
   }
}





