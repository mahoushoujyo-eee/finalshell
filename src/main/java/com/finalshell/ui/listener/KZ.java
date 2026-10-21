package com.finalshell.ui.listener;

import com.finalshell.core.LQ;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.SwitchTabCommand;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KZ extends MouseAdapter {
   final SwitchTabCommand Z;

   KZ(SwitchTabCommand var1) {
      this.Z = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var2 = SwitchTabCommand.B();
      if (var2 != null) {
         super.mouseReleased(var1);
         if (var1.getButton() != 1) {
            return;
         }
      }

      Object var3 = 203606650134368525L;
      Ref.g(203606650134368525L, var3);
      Object var5 = 240160579628937511L;
      ((LQ)Ref.g(240160579628937511L, var5)).clearSelection();
   }
}





