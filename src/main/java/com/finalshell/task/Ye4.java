package com.finalshell.task;

import com.finalshell.core.Lv4_2;
import com.finalshell.core.Yl4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.U;
import java.lang.reflect.InvocationTargetException;

public class Ye4 implements Runnable {
   final Lv4_2 H;
   final Yl4 Y;
   final U g;

   Ye4(U var1, Lv4_2 var2, Yl4 var3) {
      this.g = var1;
      this.H = var2;
      this.Y = var3;
   }

   @Override
   public void run() {
      Object var1 = 334672685735148447L;
      Ref.g(334672685735148447L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 203984722032151557L;
      Object[] var3 = var10002;
      Ref.h(203984722032151557L, var3, var4);
      Object var5 = 476023279456077333L;
      Object var10004 = Ref.g(476023279456077333L, var5);
      Object[] var10005 = Registry.emptyArgs();
      long var8 = 323168880566913665L;
      Object[] var7 = var10005;
      Registry.packArgs(var10004, Ref.h(323168880566913665L, var7, var8));
      long var9 = 557657948220663807L;
      Ref.h2(557657948220663807L, var9);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }
}





