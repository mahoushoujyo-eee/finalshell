package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.MainFrame;
import com.finalshell.ui.listener.D92;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class Qz2 implements Runnable {
   public final File j;
   public final MainFrame I;
   public final D92 g;

   public Qz2(D92 var1, File var2, MainFrame var3) {
      this.g = var1;
      this.j = var2;
      this.I = var3;
   }

   @Override
   public void run() {
      Object var1 = 370007062679519157L;
      Ref.g(370007062679519157L, var1);
      Object var3 = 483663784764278403L;
      Ref.g(483663784764278403L, var3);
      Object var5 = 248333035757884415L;
      Ref.g(248333035757884415L, var5);
      Object var7 = 351404065837575042L;
      Object[] var10005 = Registry.packArgs(this, Ref.g(351404065837575042L, var7));
      long var10 = 594337148944086925L;
      Object[] var9 = var10005;
      Ref.h(594337148944086925L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw new RuntimeException(var11.getTargetException());
      }
   }
}





