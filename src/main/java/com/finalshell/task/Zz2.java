package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.core.Zh2_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.util.HashSet;
import java.util.Hashtable;

public class Zz2 implements Runnable {
   final String A;
   public static long a;

   Zz2(String var1) {
      this.A = var1;
   }

   @Override
   public void run() {
      com.finalshell.ui.panel.Ky4[] var10000 = YT3_2.c();
      int var2 = 0;
      com.finalshell.ui.panel.Ky4[] var1 = var10000;

      while (true) {
         try {
            if (var1 == null) {
               return;
            }

            if (var2 >= 1) {
               break;
            }
         } catch (Exception var16) {
            throw a(var16);
         }

         try {
            Object var5 = 247010010226726452L;
            Registry.packArgs(InetAddress.getByName((String)Ref.g(247010010226726452L, var5)).getHostAddress());
            long var7 = 602697815696322216L;
            Object var10002 = Ref.h2(602697815696322216L, var7);

            try {
               var10002 = (Zh2_2)var10002;
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            Zh2_2 var3 = (Zh2_2)var10002;
            var10002 = (Hashtable)Registry.lookupField(447779733764178905L).get(null);
            Object var9 = 247010010226726452L;
            this.put((String)Ref.g(247010010226726452L, var9), var3);
            break;
         } catch (Exception var15) {
            try {
               Thread.sleep(a);
            } catch (InterruptedException var13) {
               var13.printStackTrace();
            }

            var2++;
            if (var1 == null) {
               break;
            }
         }
      }

      HashSet var17 = (HashSet)Registry.lookupField(317469799130091897L).get(null);
      Object var11 = 247010010226726452L;
      this.remove((String)Ref.g(247010010226726452L, var11));
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7378301255278588148L;
      long var10002 = 7378301255278588160L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





