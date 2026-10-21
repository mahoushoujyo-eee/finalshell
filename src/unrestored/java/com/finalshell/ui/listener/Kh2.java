package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Xj2;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class Kh2 implements MouseListener {
   public final Xj2 F;

   public Kh2(Xj2 var1) {
      this.F = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 1) {
         Object var2 = 244054721873399846L;
         Ref.g(244054721873399846L, var2);
         Object var4 = 445558421278779817L;
         Ref.g(445558421278779817L, var4);
         Object var6 = 244054721873399846L;
         Object var10004 = Ref.g(244054721873399846L, var6);
         Object var8 = 362540202329407130L;
         Registry.packArgs(var10004, Ref.g(362540202329407130L, var8));
         long var10 = 274988989695972769L;
         Ref.h2(274988989695972769L, var10);

         try {
            ;
         } catch (InvocationTargetException var12) {
            throw new RuntimeException(var12.getTargetException());
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





