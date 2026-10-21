package com.finalshell.task;

import com.finalshell.core.Vn2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Point;

public class MF implements Runnable {
   public final X2 c;

   public MF(X2 var1) {
      this.c = var1;
   }

   @Override
   public void run() {
      Vn2.C();
      Object var3 = 494534573427285740L;
      Object var10002 = Ref.g(494534573427285740L, var3);
      Object var5 = 296940250323823662L;
      Point var2 = ((Vn2)Ref.g(296940250323823662L, var5)).getMousePosition();
      Object var1 = var10002;
      if (var1 == null) {
         if (var2 != null) {
            return;
         }

         Object var7 = 494534573427285740L;
         Ref.g(494534573427285740L, var7);
         Object var9 = 296940250323823662L;
         Registry.lookupField(506848354576877670L).setInt(Ref.g(296940250323823662L, var9), -1);
         Object var11 = 494534573427285740L;
         Ref.g(494534573427285740L, var11);
         Object var13 = 296940250323823662L;
         Registry.lookupField(244753811008757660L).setInt(Ref.g(296940250323823662L, var13), -1);
      }

      Object var15 = 494534573427285740L;
      Ref.g(494534573427285740L, var15);
      Object var17 = 296940250323823662L;
      ((Vn2)Ref.g(296940250323823662L, var17)).repaint();
   }
}





