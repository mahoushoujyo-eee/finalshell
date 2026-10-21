package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ShowInFolderPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class UQ implements ActionListener {
   final ShowInFolderPanel d;

   UQ(ShowInFolderPanel var1) {
      this.d = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 215093639761600999L;
      Ref.g(215093639761600999L, var2);
      Object var4 = 352347871280815957L;
      Ref.g(352347871280815957L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 568849302607123804L;
      Object[] var6 = var10003;
      Ref.h(568849302607123804L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





