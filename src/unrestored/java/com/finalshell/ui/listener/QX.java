package com.finalshell.ui.listener;

import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.TerminateProcessPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class QX implements MouseListener {
   public final TerminateProcessPanel M;

   public QX(TerminateProcessPanel var1) {
      this.M = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Object var2 = 304595607757047866L;
      Ref.g(304595607757047866L, var2);
      Object var4 = 342129762932297171L;
      ((Uo2)Ref.g(342129762932297171L, var4)).clearSelection();
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





