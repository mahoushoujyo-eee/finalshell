package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Kb2;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class G6 implements MouseListener {
   public final Kb2 p;

   public G6(Kb2 var1) {
      this.p = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Object var2 = 375515453512579778L;
      Ref.g(375515453512579778L, var2);
      Object var4 = 375515453512579778L;
      Ref.g(375515453512579778L, var4);
      Object var6 = 418996528515713032L;
      Ref.g(418996528515713032L, var6);
      Object[] var10005 = Registry.packArgs(var1.getPoint());
      long var9 = 520457556467656899L;
      Object[] var8 = var10005;
      var10005 = Ref.h(520457556467656899L, var8, var9);
      long var11 = 322611781361533534L;
      Object var10 = var10005;
      Ref.s(322611781361533534L, var10, var11);
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





