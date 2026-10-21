package com.finalshell.ui.listener;

import com.finalshell.core.Qp2;
import com.finalshell.reflect.Ref;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class VM implements MouseListener {
   public final com.finalshell.ui.panel.StatusTextPanel X;

   public VM(com.finalshell.ui.panel.StatusTextPanel var1) {
      this.X = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Object var2 = 498800724028752721L;
      Ref.g(498800724028752721L, var2);
      Object var4 = 575306184824179663L;
      ((Qp2)Ref.g(575306184824179663L, var4)).clearSelection();
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





