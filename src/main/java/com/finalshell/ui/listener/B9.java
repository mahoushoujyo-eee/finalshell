package com.finalshell.ui.listener;

import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class B9 implements MouseWheelListener {
   public final SetBackgroundImagePanel R;

   public B9(SetBackgroundImagePanel var1) {
      this.R = var1;
   }

   @Override
   public void mouseWheelMoved(MouseWheelEvent var1) {
      int var2 = ConnectionProperty.y();
      int var10000 = (this.R.m(var1)) ? 1 : 0;
      if (var2 == 0) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1.getWheelRotation();
      }

      int var3 = var10000;
      SetBackgroundImagePanel.Z(this.R, var3);
   }
}





