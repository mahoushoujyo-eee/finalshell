package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.FileBrowserAddressBar;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class O6 implements MouseListener {
   public final FileBrowserAddressBar I;

   public O6(FileBrowserAddressBar var1) {
      this.I = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      boolean var2 = FileBrowserAddressBar.i();
      int var10000 = var1.getClickCount();
      byte var10001 = 2;
      if (var2) {
         if (var10000 != 2) {
            return;
         }

         var10000 = var1.getButton();
         var10001 = 1;
      }

      if (var10000 == var10001) {
         Object var3 = 163605535943126963L;
         Ref.g(163605535943126963L, var3);
         Object[] var10002 = Registry.packArgs(false);
         long var6 = 238680660514778174L;
         Object[] var5 = var10002;
         Ref.h(238680660514778174L, var5, var6);

         try {
            ;
         } catch (InvocationTargetException var7) {
            throw new RuntimeException(var7.getTargetException());
         }
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





