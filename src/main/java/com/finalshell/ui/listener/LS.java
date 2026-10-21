package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.KH;
import com.finalshell.ui.panel.FilePermissionPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JMenuItem;

public class LS implements ActionListener {
   final JMenuItem V;
   final FilePermissionPanel M;

   LS(FilePermissionPanel var1, JMenuItem var2) {
      this.M = var1;
      this.V = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new KH(this));
      long var3 = 434592463220957006L;
      Object[] var2 = var10001;
      Ref.h(434592463220957006L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }
}





