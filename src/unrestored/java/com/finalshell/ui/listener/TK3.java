package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class TK3 implements PopupMenuListener {
   public final com.finalshell.ui.dialog.KQ m;
   public final OQ3 z;

   public TK3(OQ3 var1, com.finalshell.ui.dialog.KQ var2) {
      this.z = var1;
      this.m = var2;
   }

   @Override
   public void popupMenuWillBecomeVisible(PopupMenuEvent var1) {
   }

   @Override
   public void popupMenuWillBecomeInvisible(PopupMenuEvent var1) {
      Object var2 = 518058221808674410L;
      Ref.g(518058221808674410L, var2);
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
      Object var2 = 518058221808674410L;
      Ref.g(518058221808674410L, var2);
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





