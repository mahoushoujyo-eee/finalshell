package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.KeyManagerFrame;
import com.finalshell.ui.panel.ImportPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class KB implements MouseListener {
   public final KeyManagerFrame P;

   public KB(KeyManagerFrame var1) {
      this.P = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var2 = ImportPanel.j();
      int var10000 = var1.getButton();
      byte var10001 = 1;
      if (var2 != null) {
         if (var10000 != 1) {
            return;
         }

         var10000 = var1.getClickCount();
         var10001 = 2;
      }

      if (var10000 == var10001) {
         Object var4 = 455024111575775958L;
         Ref.g(455024111575775958L, var4);
         Object var6 = 512348400607580044L;
         Ref.g(512348400607580044L, var6);
         Object[] var10003 = Registry.emptyArgs();
         long var9 = 457204009113929650L;
         Object[] var8 = var10003;
         var10003 = Ref.h(457204009113929650L, var8, var9);

         try {
            var10003 = (com.finalshell.core.LN3)var10003;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         com.finalshell.core.LN3 var3 = var10003;
         if (var3 != null) {
            Object var10 = 455024111575775958L;
            Ref.g(455024111575775958L, var10);
            Object var12 = 512348400607580044L;
            Ref.g(512348400607580044L, var12);
            Object[] var10006 = Registry.packArgs(var3);
            long var15 = 306838697711798482L;
            Object[] var14 = var10006;
            Ref.h(306838697711798482L, var14, var15);

            try {
               ;
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }
         }
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}





