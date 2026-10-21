package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.task.NV;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.SwingUtilities;

public class YM3 extends ComponentAdapter {
   final com.finalshell.ui.dialog.KQ q;

   YM3(com.finalshell.ui.dialog.KQ var1) {
      this.q = var1;
   }

   @Override
   public void componentShown(ComponentEvent var1) {
      Object var2 = 173060672883094482L;
      ((com.finalshell.ui.dialog.KQ)Ref.g(173060672883094482L, var2)).setFocusableWindowState(true);
      Object var4 = 173060672883094482L;
      ((com.finalshell.ui.dialog.KQ)Ref.g(173060672883094482L, var4)).getContentPane().requestFocus();
      SwingUtilities.invokeLater(new NV(this));
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
      Object var2 = 173060672883094482L;
      ((com.finalshell.ui.dialog.KQ)Ref.g(173060672883094482L, var2)).setFocusableWindowState(false);
   }
}





