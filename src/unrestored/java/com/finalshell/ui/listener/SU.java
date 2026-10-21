package com.finalshell.ui.listener;

import com.finalshell.core.EW;
import com.finalshell.core.IY3;
import com.finalshell.core.XE;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SU extends MouseAdapter {
   public final IY3 c;
   public final SetBackgroundImagePanel e;

   public SU(SetBackgroundImagePanel var1, IY3 var2) {
      this.e = var1;
      this.c = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      SetBackgroundImagePanel var4;
      MouseEvent var10001;
      label24: {
         int var2 = ConnectionProperty.M$int();
         boolean var10000 = SetBackgroundImagePanel.S(this.e).t();
         if (var2 != 0) {
            if (!var10000) {
               return;
            }

            var4 = this.e;
            var10001 = var1;
            if (var2 == 0) {
               break label24;
            }

            var10000 = this.e.b(var1);
         }

         if (!var10000) {
            return;
         }

         var4 = this.e;
         var10001 = var1;
      }

      XE var3 = SetBackgroundImagePanel.x(var4, var10001.getPoint());
      this.c.u(var3.q, var3.r, new EW(var1));
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      SetBackgroundImagePanel var4;
      MouseEvent var10001;
      label24: {
         int var2 = ConnectionProperty.M$int();
         boolean var10000 = SetBackgroundImagePanel.S(this.e).t();
         if (var2 != 0) {
            if (!var10000) {
               return;
            }

            var4 = this.e;
            var10001 = var1;
            if (var2 == 0) {
               break label24;
            }

            var10000 = this.e.b(var1);
         }

         if (!var10000) {
            return;
         }

         var4 = this.e;
         var10001 = var1;
      }

      XE var3 = SetBackgroundImagePanel.x(var4, var10001.getPoint());
      this.c.z(var3.q, var3.r, new EW(var1));
   }
}





