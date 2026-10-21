package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Km4;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FD implements MouseListener {
   final Km4 t;

   FD(Km4 var1) {
      this.t = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Object var2 = 275811009654227000L;
      Ref.g(275811009654227000L, var2);
      Object var4 = 275811009654227000L;
      Ref.g(275811009654227000L, var4);
      Object var6 = 595819195510091629L;
      Ref.g(595819195510091629L, var6);
      Object[] var10005 = Registry.packArgs(var1.getPoint());
      long var9 = 520457556467656899L;
      Object[] var8 = var10005;
      var10005 = Ref.h(520457556467656899L, var8, var9);
      long var11 = 578607023926813312L;
      Object var10 = var10005;
      Ref.s(578607023926813312L, var10, var11);
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





