package com.finalshell.ui.listener;

import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TT implements MouseListener {
   public final Uo2 H;

   public TT(Uo2 var1) {
      this.H = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Object var3 = 206763814706490892L;
      int var2 = ((Uo2)Ref.g(206763814706490892L, var3)).rowAtPoint(var1.getPoint());
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





