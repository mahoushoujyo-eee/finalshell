package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.SelectPrivateKeyDialog;
import com.finalshell.ui.panel.ImportPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class LZ implements MouseListener {
   public final SelectPrivateKeyDialog E;

   public LZ(SelectPrivateKeyDialog var1) {
      this.E = var1;
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
         Object var3 = 208817150286845168L;
         Ref.g(208817150286845168L, var3);
         Object[] var10002 = Registry.emptyArgs();
         long var6 = 271888329314383012L;
         Object[] var5 = var10002;
         Ref.h(271888329314383012L, var5, var6);

         try {
            ;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
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





