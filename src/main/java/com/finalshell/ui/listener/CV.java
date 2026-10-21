package com.finalshell.ui.listener;

import com.finalshell.core.D__2;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CV extends FocusAdapter {
   final SetBackgroundImagePanel o;

   CV(SetBackgroundImagePanel var1) {
      this.o = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      SetBackgroundImagePanel.D(this.o).E();
      this.o.h = System.currentTimeMillis();
      this.o.cQ = false;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      int var2 = ConnectionProperty.M$int();
      D__2 var10000 = SetBackgroundImagePanel.D(this.o);
      if (var2 != 0) {
         if (var10000 == null) {
            return;
         }

         var10000 = SetBackgroundImagePanel.D(this.o);
      }

      var10000.E();
   }
}





