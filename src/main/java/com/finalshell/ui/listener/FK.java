package com.finalshell.ui.listener;

import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FK extends FocusAdapter {
   final SetBackgroundImagePanel L;

   FK(SetBackgroundImagePanel var1) {
      this.L = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      SetBackgroundImagePanel.C(this.L, SetBackgroundImagePanel.S(this.L).w());
      SetBackgroundImagePanel.D(this.L).E();
      this.L.h = System.currentTimeMillis();
      this.L.cQ = false;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      int var2 = ConnectionProperty.M$int();
      SetBackgroundImagePanel var10000 = this.L;
      if (var2 != 0) {
         if (SetBackgroundImagePanel.D(this.L) != null) {
            SetBackgroundImagePanel.D(this.L).E();
         }

         var10000 = this.L;
      }

      SetBackgroundImagePanel.Z(var10000, var1.getComponent(), false);
   }
}





