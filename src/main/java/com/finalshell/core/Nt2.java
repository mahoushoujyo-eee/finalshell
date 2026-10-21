package com.finalshell.core;

import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import javax.swing.SwingUtilities;

public class Nt2 implements IL3 {
   public final int l;
   public final int Z;
   public final SetBackgroundImagePanel e;

   public Nt2(SetBackgroundImagePanel var1, int var2, int var3) {
      this.e = var1;
      this.l = var2;
      this.Z = var3;
   }

   @Override
   public void s() {
      int var10000 = ConnectionProperty.M$int();
      int var2 = SetBackgroundImagePanel.D(this.e).T.r - 1;
      int var1 = var10000;
      if (var1 != 0) {
         if (var2 + this.l < this.Z) {
            return;
         }

         SetBackgroundImagePanel.T(this.e).q(this);
      }

      SwingUtilities.invokeLater(this::lambda$modelChanged$0);
   }

   public void lambda$modelChanged$0() {
      SetBackgroundImagePanel.T(this.e).w();

      try {
         SetBackgroundImagePanel.y(this.e).setRangeProperties(0, this.e.N.c(), -SetBackgroundImagePanel.T(this.e).H(), this.e.N.c(), false);
      } finally {
         SetBackgroundImagePanel.T(this.e).h$void();
      }
   }
}





