package com.finalshell.ui.listener;

import com.finalshell.core.UA3;
import com.finalshell.reflect.Ref;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class U implements MouseListener {
   final UA3 G;

   U(UA3 var1) {
      this.G = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Object var3 = 567100541265198599L;
      int var2 = ((UA3)Ref.g(567100541265198599L, var3)).rowAtPoint(var1.getPoint());
      if (var1.getButton() == 3) {
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}





