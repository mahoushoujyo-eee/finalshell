package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.TerminalHelpFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Od4 implements ActionListener {
   public final com.finalshell.ui.frame.U h;

   public Od4(com.finalshell.ui.frame.U var1) {
      this.h = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = com.finalshell.ui.panel.F8.y();
      TerminalHelpFrame var10000 = (TerminalHelpFrame)Registry.lookupField(194285877583497070L).get(null);
      if (var2 == null) {
         if (var10000 == null) {
            TerminalHelpFrame var10001;
            Object var3 = 147680755442349247L;
            super((com.finalshell.ui.frame.U)Ref.g(147680755442349247L, var3));
            Registry.lookupField(194285877583497070L).set(null, var10001);
         }

         ((TerminalHelpFrame)Registry.lookupField(194285877583497070L).get(null)).setVisible(true);
         var10000 = (TerminalHelpFrame)Registry.lookupField(194285877583497070L).get(null);
      }

      var10000.toFront();
   }
}





