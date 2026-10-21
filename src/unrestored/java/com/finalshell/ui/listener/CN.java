package com.finalshell.ui.listener;

import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.EnvironmentVariablePanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class CN extends MouseAdapter {
   public final EnvironmentVariablePanel I;

   public CN(EnvironmentVariablePanel var1) {
      this.I = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      boolean var2 = Uo2.i();
      if (!var2) {
         super.mousePressed(var1);
         if (var1.getButton() != 1) {
            return;
         }
      }

      Object var3 = 174330978349075902L;
      Ref.g(174330978349075902L, var3);
      Object var5 = 166263389195533693L;
      ((JTable)Ref.g(166263389195533693L, var5)).clearSelection();
   }
}





