package com.finalshell.task;

import com.finalshell.core.File8;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Nq2;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class TG implements Runnable {
   final String W;
   final Nq2 Y;
   final List r;
   final String I;
   final File8 J;

   TG(File8 var1, String var2, Nq2 var3, List var4, String var5) {
      this.J = var1;
      this.W = var2;
      this.Y = var3;
      this.r = var4;
      this.I = var5;
   }

   @Override
   public void run() {
      Object var2 = 392366729472972769L;
      Registry.packArgs(Ref.g(392366729472972769L, var2));
      long var4 = 571034619098221891L;
      Object var10002 = Ref.h2(571034619098221891L, var4);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      String var1 = (String)var10002;
      Object var6 = 501455745045430860L;
      Ref.g(501455745045430860L, var6);
      Object var8 = 360094047934338870L;
      Ref.g(360094047934338870L, var8);
      Object var10 = 392366729472972769L;
      Object var10007 = Ref.g(392366729472972769L, var10);
      Object var12 = 260250598083004817L;
      var10007 = Registry.packArgs(var10007, this, Ref.g(260250598083004817L, var12), var1);
      long var15 = 566104538227199671L;
      Object[] var14 = (Object[])var10007;
      Ref.h(566104538227199671L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }
}





