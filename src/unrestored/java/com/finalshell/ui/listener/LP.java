package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Ox4;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LP implements MouseListener {
   public final Ox4 A;

   public LP(Ox4 var1) {
      this.A = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Object var2 = 255878012033833740L;
      Ref.g(255878012033833740L, var2);
      Object var4 = 255878012033833740L;
      Ref.g(255878012033833740L, var4);
      Object var6 = 577313982458780365L;
      Ref.g(577313982458780365L, var6);
      Object[] var10005 = Registry.packArgs(var1.getPoint());
      long var9 = 520457556467656899L;
      Object[] var8 = var10005;
      var10005 = Ref.h(520457556467656899L, var8, var9);
      long var11 = 448185761952082693L;
      Object var10 = var10005;
      Ref.s(448185761952082693L, var10, var11);
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





