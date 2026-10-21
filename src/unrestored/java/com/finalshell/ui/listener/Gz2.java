package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.PathPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Gz2 implements MouseListener {
   public final PathPanel w;

   public Gz2(PathPanel var1) {
      this.w = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Object var2 = 571881132085630799L;
      Ref.g(571881132085630799L, var2);
      Object var4 = 427789642816905166L;
      ((com.finalshell.core.Km2)Ref.g(427789642816905166L, var4)).clearSelection();
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





