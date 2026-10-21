package com.finalshell.task;

import com.finalshell.core.U82;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.TerminateProcessConfirmListener;
import java.lang.reflect.InvocationTargetException;

public class OA implements Runnable {
   public final U82 F;
   public final TerminateProcessConfirmListener i;

   public OA(TerminateProcessConfirmListener var1, U82 var2) {
      this.i = var1;
      this.F = var2;
   }

   @Override
   public void run() {
      Integer var14;
      Object var1 = 161046042370805589L;
      Ref.g(161046042370805589L, var1);
      Object var3 = 569826412732108781L;
      Ref.g(569826412732108781L, var3);
      Object var5 = 277418865962131275L;
      Ref.g(277418865962131275L, var5);
      Object var10005 = Registry.emptyArgs();
      long var8 = 340521912883652737L;
      Object var7 = var10005;
      var10005 = Ref.h(340521912883652737L, var7, var8);

      try {
         var14 = (Integer)var10005;
      } catch (InvocationTargetException var12) {
         throw new RuntimeException(var12.getTargetException());
      }

      var10005 = Registry.packArgs(var14);
      long var10 = 196856092777064026L;
      Object var9 = var10005;
      Ref.h(196856092777064026L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw new RuntimeException(var11.getTargetException());
      }
   }
}





