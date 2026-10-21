package com.finalshell.task;

import com.finalshell.core.Km2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.U2;
import java.lang.reflect.InvocationTargetException;

public class YL implements Runnable {
   public final String c;
   public final U2 j;

   public YL(U2 var1, String var2) {
      this.j = var1;
      this.c = var2;
   }

   @Override
   public void run() {
      try {
         Object var2 = 553870491410165956L;
         Ref.g(553870491410165956L, var2);
         Object var4 = 199671164151222333L;
         Ref.g(199671164151222333L, var4);
         Object var6 = 476201740043670453L;
         Ref.g(476201740043670453L, var6);
         Object[] var10004 = Registry.emptyArgs();
         long var9 = 346382751221538814L;
         Object[] var8 = var10004;
         Ref.h(346382751221538814L, var8, var9);
         Object var10 = 553870491410165956L;
         Ref.g(553870491410165956L, var10);
         Object var12 = 199671164151222333L;
         Ref.g(199671164151222333L, var12);
         Object var14 = 166731455568463101L;
         ((Km2)Ref.g(166731455568463101L, var14)).getParent();
         Object var16 = 553870491410165956L;
         Ref.g(553870491410165956L, var16);
         Object var18 = 199671164151222333L;
         Ref.g(199671164151222333L, var18);
         Object var20 = 166731455568463101L;
         Ref.g(166731455568463101L, var20);
         Object[] var10013 = Registry.emptyArgs();
         long var23 = 565315838989287146L;
         Object[] var22 = var10013;
         Ref.h(565315838989287146L, var22, var23);
         Object[] var10014 = Registry.emptyArgs();
         long var25 = 152919711700242153L;
         Object[] var24 = var10014;
         Ref.h(152919711700242153L, var24, var25);
         Object[] var10015 = Registry.emptyArgs();
         long var27 = 498856411508641826L;
         Object[] var26 = var10015;
         var10015 = Ref.h(498856411508641826L, var26, var27);
         Object var28 = 178664827901399723L;
         var10015 = Registry.packArgs(var10015, this, Ref.g(178664827901399723L, var28), true, true);
         long var31 = 184332907359967333L;
         Object[] var30 = var10015;
         Ref.h(184332907359967333L, var30, var31);

         try {
            ;
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }
      } catch (Exception var33) {
         var33.printStackTrace();
      }
   }
}





