package com.finalshell.task;

import com.finalshell.core.CB;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class BF implements Runnable {
   public final ArrayList h;
   public final CB R;

   public BF(CB var1, ArrayList var2) {
      this.R = var1;
      this.h = var2;
   }

   @Override
   public void run() {
      Object var1 = 450927814935428182L;
      Ref.g(450927814935428182L, var1);
      Object var3 = 414347828709011535L;
      Ref.g(414347828709011535L, var3);
      Object var5 = 472421458783157056L;
      Object[] var10004 = Registry.packArgs(Ref.g(472421458783157056L, var5));
      long var8 = 631850759663681853L;
      Object[] var7 = var10004;
      Ref.h(631850759663681853L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }
}





