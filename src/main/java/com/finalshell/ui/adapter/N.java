package com.finalshell.ui.adapter;

import com.finalshell.ui.model.D2;
import com.finalshell.ui.panel.T;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

public class N extends AbstractAction {
   public final T i;

   public N(T var1) {
      this.i = var1;
   }

   @Override
   public boolean isEnabled() {
      String var1 = T.v$String();
      int var10000 = this.i.E.getSelectedIndex();
      if (var1 == null) {
         var10000 = var10000 != -1 ? 1 : 0;
      }

      return var10000 != 0;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      File var2 = this.i.E.J();
      if (var2.isDirectory()) {
         this.i.M(var2, D2.list);
      }
   }
}





