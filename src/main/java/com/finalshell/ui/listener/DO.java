package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Connection4;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class DO implements MouseMotionListener {
   final Connection4 F;

   DO(Connection4 var1) {
      this.F = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      Object var2 = 155253476012076023L;
      Registry.lookupField(191167021799414579L).setBoolean(Ref.g(155253476012076023L, var2), false);
   }
}





