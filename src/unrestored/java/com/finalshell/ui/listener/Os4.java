package com.finalshell.ui.listener;

import com.finalshell.connection.CopyConnectionInfoAction;
import com.finalshell.core.Y62_2;
import com.finalshell.reflect.Ref;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Os4 implements MouseListener {
   public final CopyConnectionInfoAction T;

   public Os4(CopyConnectionInfoAction var1) {
      this.T = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getButton() == 1) {
         Object var2 = 263803791413266767L;
         Ref.g(263803791413266767L, var2);
         Object var4 = 406455305964270214L;
         ((Y62_2)Ref.g(406455305964270214L, var4)).clearSelection();
      }
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





