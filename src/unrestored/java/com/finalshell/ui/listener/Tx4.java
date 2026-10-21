package com.finalshell.ui.listener;

import com.finalshell.core.UT;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.ProcessInfoPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Tx4 implements MouseListener {
   public final ProcessInfoPanel p;

   public Tx4(ProcessInfoPanel var1) {
      this.p = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Object var2 = 270617495665729321L;
      Ref.g(270617495665729321L, var2);
      Object var4 = 483411846868584119L;
      ((UT)Ref.g(483411846868584119L, var4)).clearSelection();
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





