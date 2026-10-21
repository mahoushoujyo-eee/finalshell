package com.finalshell.ui.listener;

import com.finalshell.core.JR;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.T4;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class Ya4 implements MouseListener {
   public final JR m;

   public Ya4(JR var1) {
      this.m = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Object var3 = 544896587708147604L;
      int var2 = ((JR)Ref.g(544896587708147604L, var3)).rowAtPoint(var1.getPoint());
      if (var1.getButton() == 1) {
         Ref.g(388376917454860932L, null);
         Object[] var10002 = Registry.packArgs(new T4(this));
         long var6 = 434592463220957006L;
         Object[] var5 = var10002;
         Ref.h(434592463220957006L, var5, var6);

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
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}





