package com.finalshell.ui.listener;

import com.finalshell.core.NA_2;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.ImportMenuPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NG extends MouseAdapter {
   public final ImportMenuPanel I;

   public NG(ImportMenuPanel var1) {
      this.I = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var2 = ImportMenuPanel.j();
      if (var2 != null) {
         super.mouseReleased(var1);
         if (var1.getButton() != 1) {
            return;
         }
      }

      Object var3 = 273957854721752233L;
      Ref.g(273957854721752233L, var3);
      Object var5 = 474934089651157961L;
      ((NA_2)Ref.g(474934089651157961L, var5)).clearSelection();
   }
}





