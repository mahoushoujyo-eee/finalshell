package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.GJ2;
import java.lang.reflect.InvocationTargetException;

public class Zk2 implements Runnable {
   public final GJ2 X;

   public Zk2(GJ2 var1) {
      this.X = var1;
   }

   @Override
   public void run() {
      Object var1 = 350317579936282484L;
      Ref.g(350317579936282484L, var1);
      Object var3 = 156604263834063936L;
      Ref.g(156604263834063936L, var3);
      Object[] var10003 = Registry.packArgs(((Integer)Ref.g(189389645615350517L, null)).intValue(), true);
      long var6 = 547792367998174127L;
      Object[] var5 = var10003;
      Ref.h(547792367998174127L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw new RuntimeException(var7.getTargetException());
      }
   }
}





