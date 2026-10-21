package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Xw2;
import com.finalshell.ui.panel.Address;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class OB implements MouseListener {
   public final Xw2 W;

   public OB(Xw2 var1) {
      this.W = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      boolean var2 = Address.g();
      int var10000 = var1.getClickCount();
      byte var10001 = 2;
      if (!var2) {
         if (var10000 != 2) {
            return;
         }

         var10000 = var1.getButton();
         var10001 = 1;
      }

      if (var10000 == var10001) {
         Object var3 = 302105993042482768L;
         Ref.g(302105993042482768L, var3);
         Object[] var10002 = Registry.emptyArgs();
         long var6 = 297395466930437108L;
         Object[] var5 = var10002;
         Ref.h(297395466930437108L, var5, var6);

         try {
            ;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
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





