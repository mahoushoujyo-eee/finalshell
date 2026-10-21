package com.finalshell.core;

import com.finalshell.reflect.Registry;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Yd4_2 {
   public static ThreadPoolExecutor h;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var6 = 2856720731247343017L;
      long var10002 = 3809682922248735318L ^ var6;
      byte var10001 = -1;
      long var4 = var10002;
      long var2 = 3351568334700878052L;
      var10002 = 3351568334700899796L ^ var2;
      var10001 = -1;
      long var0 = var10002;
      SynchronousQueue var8 = new SynchronousQueue();
      ThreadPoolExecutor var9 = new ThreadPoolExecutor(5, (int)var4, var0, TimeUnit.MILLISECONDS, var8);
      Registry.lookupField(285529366020626428L).set(null, var9);
   }
}





