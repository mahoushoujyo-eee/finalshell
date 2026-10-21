package com.finalshell.task;

import com.finalshell.core.L9;
import com.finalshell.core.YT3_2;
import com.finalshell.core.Zh2_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.RouteTracePanel;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.util.HashSet;
import java.util.Hashtable;

public class Fk2 implements Runnable {
   final L9 U;
   final RouteTracePanel d;
   final String Q;
   public static long a;

   Fk2(L9 var1, RouteTracePanel var2, String var3) {
      this.U = var1;
      this.d = var2;
      this.Q = var3;
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
         } catch (Exception var31) {
            throw a(var31);
         }

         try {
            Object var5 = 508038361377045891L;
            Ref.g(508038361377045891L, var5);
            String var10002 = (String)(Registry.emptyArgs());
            long var8 = 564648154927582737L;
            Object[] var7 = var10002;
            var10002 = Ref.h(564648154927582737L, var7, var8);

            try {
               var10002 = (String)var10002;
            } catch (InvocationTargetException var29) {
               throw var29.getTargetException();
            }

            Registry.packArgs(InetAddress.getByName(var10002).getHostAddress());
            long var9 = 602697815696322216L;
            Object var10003 = Ref.h2(602697815696322216L, var9);

            try {
               var10003 = (Zh2_2)var10003;
            } catch (InvocationTargetException var28) {
               throw var28.getTargetException();
            }

            Zh2_2 var3 = (Zh2_2)var10003;
            Object var11 = 508038361377045891L;
            Ref.g(508038361377045891L, var11);
            Object[] var10005 = Registry.packArgs(var3);
            long var14 = 432746213469381812L;
            Object[] var13 = var10005;
            Ref.h(432746213469381812L, var13, var14);

            try {
               ;
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            Object var15 = 394503099456042459L;
            Ref.g(394503099456042459L, var15);
            Object var17 = 508038361377045891L;
            Object[] var10008 = Registry.packArgs(Ref.g(508038361377045891L, var17));
            long var20 = 137222181119797019L;
            Object[] var19 = var10008;
            Ref.h(137222181119797019L, var19, var20);

            try {
               ;
            } catch (InvocationTargetException var26) {
               throw var26.getTargetException();
            }

            Hashtable var36 = (Hashtable)Registry.lookupField(447779733764178905L).get(null);
            Object var21 = 350883208365418364L;
            this.put((String)Ref.g(350883208365418364L, var21), var3);
            break;
         } catch (Exception var30) {
            try {
               Thread.sleep(a);
            } catch (InterruptedException var25) {
               var25.printStackTrace();
            }

            var2++;
            if (var1 == null) {
               break;
            }
         }
      }

      HashSet var32 = (HashSet)Registry.lookupField(317469799130091897L).get(null);
      Object var23 = 350883208365418364L;
      this.remove((String)Ref.g(350883208365418364L, var23));
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2269056343135973305L;
      long var10002 = 2269056343135972941L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





