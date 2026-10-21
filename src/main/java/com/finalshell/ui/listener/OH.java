package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.FileBrowserAddressBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class OH implements ActionListener {
   public final FileBrowserAddressBar j;

   public OH(FileBrowserAddressBar var1) {
      this.j = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 221933783446966383L;
      Ref.g(221933783446966383L, var2);
      Object var4 = 221933783446966383L;
      Ref.g(221933783446966383L, var4);
      Object var6 = 506751131738108937L;
      Object[] var10004 = Registry.packArgs(Ref.g(506751131738108937L, var6));
      long var9 = 277808345207982888L;
      Object[] var8 = var10004;
      Ref.h(277808345207982888L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }
}





