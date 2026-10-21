package com;

import java.util.concurrent.ThreadFactory;

public class PU implements ThreadFactory {
   private static String[] o;

   @Override
   public Thread newThread(Runnable var1) {
      String[] var10000 = l();
      Thread var3 = new Thread(var1);
      String[] var2 = var10000;
      var3.setDaemon(true);
      if (var2 == null) {
         com.ky_4.K(new String[3]);
      }

      return var3;
   }

   public static void z(String[] var0) {
      o = var0;
   }

   public static String[] l() {
      return o;
   }

   static {
      if (l() == null) {
         z(new String[2]);
      }
   }
}





