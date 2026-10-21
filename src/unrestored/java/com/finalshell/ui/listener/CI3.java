package com.finalshell.ui.listener;

import com.finalshell.core.UA3;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.RouteTracePanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CI3 implements MouseListener {
   public final RouteTracePanel R;

   public CI3(RouteTracePanel var1) {
      this.R = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Object var2 = 472868878651715832L;
      Ref.g(472868878651715832L, var2);
      Object var4 = 266946451169580014L;
      ((UA3)Ref.g(266946451169580014L, var4)).clearSelection();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





