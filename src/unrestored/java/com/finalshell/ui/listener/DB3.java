package com.finalshell.ui.listener;

import com.finalshell.core.Qp2;
import com.finalshell.reflect.Ref;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DB3 implements MouseListener {
   public final Qp2 Q;

   public DB3(Qp2 var1) {
      this.Q = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Object var3 = 158949890241960259L;
      int var2 = ((Qp2)Ref.g(158949890241960259L, var3)).rowAtPoint(var1.getPoint());
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





