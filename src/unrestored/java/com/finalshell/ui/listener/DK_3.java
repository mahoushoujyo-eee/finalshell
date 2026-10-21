package com.finalshell.ui.listener;

import com.finalshell.core.NH;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.TunnelList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DK_3 extends MouseAdapter {
   public final TunnelList b;

   public DK_3(TunnelList var1) {
      this.b = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String var2 = TunnelList.V();
      if (var2 != null) {
         super.mouseReleased(var1);
         if (var1.getButton() != 1) {
            return;
         }
      }

      Object var3 = 562032403762553071L;
      Ref.g(562032403762553071L, var3);
      Object var5 = 548989663897657123L;
      ((NH)Ref.g(548989663897657123L, var5)).clearSelection();
   }
}





