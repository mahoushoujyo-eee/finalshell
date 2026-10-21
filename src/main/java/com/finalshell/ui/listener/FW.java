package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

public class FW extends MouseAdapter {
   public final Color s;
   public final Color H;
   public final com.finalshell.ui.frame.U p;

   public FW(com.finalshell.ui.frame.U var1, Color var2, Color var3) {
      this.p = var1;
      this.s = var2;
      this.H = var3;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 284609497308396758L;
      Object[] var5 = var10002;
      Ref.h(284609497308396758L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Object var7 = 572351643511277543L;
      com.finalshell.ui.frame.U var2 = (com.finalshell.ui.frame.U)Ref.g(572351643511277543L, var7);
      Object var9 = 572351643511277543L;
      Ref.g(572351643511277543L, var9);
      Object var11 = 488270198363831547L;
      com.finalshell.core.C var10005 = (com.finalshell.core.C)Ref.g(488270198363831547L, var11);
      Object var13 = 171664279687725675L;
      this.setForeground((Color)Ref.g(171664279687725675L, var13));
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Object var2 = 572351643511277543L;
      Ref.g(572351643511277543L, var2);
      Object var4 = 488270198363831547L;
      com.finalshell.core.C var10002 = (com.finalshell.core.C)Ref.g(488270198363831547L, var4);
      Object var6 = 420586151167517677L;
      this.setForeground((Color)Ref.g(420586151167517677L, var6));
   }
}





