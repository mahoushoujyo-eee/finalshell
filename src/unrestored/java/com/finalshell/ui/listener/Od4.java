package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.TerminalHelpFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Od4 implements ActionListener {
   public final com.finalshell.ui.frame.MainFrame h;

   public Od4(com.finalshell.ui.frame.MainFrame var1) {
      this.h = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = com.finalshell.ui.panel.F8.y();
      TerminalHelpFrame var10000 = (TerminalHelpFrame)Ref.g(194285877583497070L, null);
      if (var2 == null) {
         if (var10000 == null) {
            TerminalHelpFrame var10001;
            Object var3 = 147680755442349247L;
            // [VF-super] super((com.finalshell.ui.frame.U)Ref.g(147680755442349247L, var3));
            Ref.s(194285877583497070L, null, var10001);
         }

         ((TerminalHelpFrame)Ref.g(194285877583497070L, null)).setVisible(true);
         var10000 = (TerminalHelpFrame)Ref.g(194285877583497070L, null);
      }

      var10000.toFront();
   }
}





