package com.finalshell.ui.listener;

import com.finalshell.core.Lw4_2;
import com.finalshell.reflect.Ref;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class V1 implements MouseListener {
   final Lw4_2 z;

   V1(Lw4_2 var1) {
      this.z = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Object var3 = 130225670826288020L;
      int var2 = ((Lw4_2)Ref.g(130225670826288020L, var3)).rowAtPoint(var1.getPoint());
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





