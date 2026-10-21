package com.finalshell.ui.listener;

import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Wg2 implements ChangeListener {
   public final SetBackgroundImagePanel o;

   public Wg2(SetBackgroundImagePanel var1) {
      this.o = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      SetBackgroundImagePanel var3;
      int var10000 = ConnectionProperty.y();
      this.o.cS = true;
      this.o.P = SetBackgroundImagePanel.y(this.o).getValue();
      int var2 = var10000;
      var3 = this.o;
      label17:
      if (var2 == 0) {
         if (SetBackgroundImagePanel.e(this.o) != null) {
            var3 = this.o;
            if (var2 != 0) {
               break label17;
            }

            if (this.o.q.isVisible()) {
               this.o.N$void();
               this.o.q.getParent().doLayout();
            }
         }

         var3 = this.o;
      }

      var3.repaint();
   }
}





