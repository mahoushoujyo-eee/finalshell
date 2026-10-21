package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.DM;
import com.finalshell.ui.panel.KA_3;
import com.finalshell.ui.panel.Ky4;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class Lm4 implements MouseListener {
   public final boolean T;
   public final KA_3 t;

   public Lm4(KA_3 var1, boolean var2) {
      this.t = var1;
      this.T = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      Ky4[] var2 = KA_3.y$arrky_4();
      int var10000 = var1.getButton();
      if (var2 == null) {
         if (var10000 != 1) {
            return;
         }

         var10000 = (Registry.lookupField(495673752776433786L).getBoolean(this)) ? 1 : 0;
      }

      if (var10000 == 0) {
         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10001 = Registry.packArgs(new DM(this));
         long var4 = 434592463220957006L;
         Object[] var3 = var10001;
         Ref.h(434592463220957006L, var3, var4);

         try {
            ;
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Object var2 = 275628384420924903L;
      Registry.lookupField(123845205254103433L).setBoolean(Ref.g(275628384420924903L, var2), false);
      Object var4 = 275628384420924903L;
      Ref.g(275628384420924903L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 212415783875365536L;
      Object[] var6 = var10003;
      Ref.h(212415783875365536L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Object var2 = 275628384420924903L;
      Registry.lookupField(123845205254103433L).setBoolean(Ref.g(275628384420924903L, var2), true);
      Object var4 = 275628384420924903L;
      Ref.g(275628384420924903L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 212415783875365536L;
      Object[] var6 = var10003;
      Ref.h(212415783875365536L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





