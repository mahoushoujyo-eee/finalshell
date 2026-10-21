package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.MainFrame;
import java.lang.reflect.InvocationTargetException;

public class X5 implements Runnable {
   public final MainFrame n;

   public X5(MainFrame var1) {
      this.n = var1;
   }

   @Override
   public void run() {
      Object var1 = 265036161987460101L;
      Ref.g(265036161987460101L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 536360337896202451L;
      Object[] var3 = var10002;
      Ref.h(536360337896202451L, var3, var4);
      Object[] var10003 = Registry.packArgs(false);
      long var6 = 634601920284847200L;
      Object[] var5 = var10003;
      Ref.h(634601920284847200L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw new RuntimeException(var12.getTargetException());
      }

      Object var7 = 265036161987460101L;
      Ref.g(265036161987460101L, var7);
      Object[] var10005 = Registry.emptyArgs();
      long var10 = 435963413772485648L;
      Object[] var9 = var10005;
      Ref.h(435963413772485648L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw new RuntimeException(var11.getTargetException());
      }
   }
}





