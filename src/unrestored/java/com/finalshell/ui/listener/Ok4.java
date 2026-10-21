package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ImportExportPanel;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class Ok4 implements PopupMenuListener {
   public final com.finalshell.ui.dialog.KQ L;
   public final ImportExportPanel v;

   public Ok4(ImportExportPanel var1, com.finalshell.ui.dialog.KQ var2) {
      this.v = var1;
      this.L = var2;
   }

   @Override
   public void popupMenuWillBecomeVisible(PopupMenuEvent var1) {
   }

   @Override
   public void popupMenuWillBecomeInvisible(PopupMenuEvent var1) {
      Object var2 = 163268243942053263L;
      Ref.g(163268243942053263L, var2);
      Object[] var10002 = Registry.packArgs(false);
      long var5 = 438941361784812150L;
      Object[] var4 = var10002;
      Ref.h(438941361784812150L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }

   @Override
   public void popupMenuCanceled(PopupMenuEvent var1) {
      Object var2 = 163268243942053263L;
      Ref.g(163268243942053263L, var2);
      Object[] var10002 = Registry.packArgs(false);
      long var5 = 438941361784812150L;
      Object[] var4 = var10002;
      Ref.h(438941361784812150L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }
}





