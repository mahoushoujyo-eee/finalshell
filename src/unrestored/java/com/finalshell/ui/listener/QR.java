package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.ImportExportPanel;
import com.finalshell.ui.panel.ConnectionContextMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QR implements ActionListener {
   public final ConnectionContextMenu k;

   public QR(ConnectionContextMenu var1) {
      this.k = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 629814853747040842L;
      Ref.g(629814853747040842L, var2);
      Object var4 = 131037384951395357L;
      ImportExportPanel var10002 = (ImportExportPanel)Ref.g(131037384951395357L, var4);
      Object var6 = 629814853747040842L;
      Object var10004 = Ref.g(629814853747040842L, var6);
      Object var8 = 131037384951395357L;
      ((ImportExportPanel)var10004).startEditingAtPath(((ImportExportPanel)Ref.g(131037384951395357L, var8)).getSelectionPath());
   }
}





