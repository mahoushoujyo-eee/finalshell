package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class Bn4 implements MouseListener {
   public final com.finalshell.ui.frame.MainFrame Z;

   public Bn4(com.finalshell.ui.frame.MainFrame var1) {
      this.Z = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      boolean var12;
      String[] var2 = com.finalshell.ui.panel.F8.y();
      int var10000 = var1.getButton();
      byte var10001 = 1;
      if (var2 == null) {
         if (var10000 == 1) {
            Registry.emptyArgs();
            long var3 = 253808553645062345L;
            Object var11 = Ref.h2(253808553645062345L, var3);

            try {
               var12 = (Boolean)var11;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            if (!var12) {
               return;
            }

            Object var5 = 250841638483635250L;
            Ref.g(250841638483635250L, var5);
            Object[] var10003 = Registry.emptyArgs();
            long var8 = 361892076397147493L;
            Object[] var7 = var10003;
            Ref.h(361892076397147493L, var7, var8);

            try {
               ;
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }

            if (var2 == null) {
               return;
            }
         }

         var10000 = var1.getButton();
         var10001 = 3;
      }

      if (var10000 == var10001) {
      }
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





