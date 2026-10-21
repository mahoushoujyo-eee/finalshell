package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import java.lang.reflect.InvocationTargetException;

public class UY3 implements Tk4 {
   public final boolean M;
   public final SelectDownloadFolderPanel q;

   public UY3(SelectDownloadFolderPanel var1, boolean var2) {
      this.q = var1;
      this.M = var2;
   }

   @Override
   public void R(com.finalshell.ui.frame.MainFrame var1) {
      Object[] var10001 = Registry.packArgs(Registry.lookupField(296414114989994442L).getBoolean(this));
      long var3 = 636304631404470975L;
      Object[] var2 = var10001;
      Ref.h(636304631404470975L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }
}





