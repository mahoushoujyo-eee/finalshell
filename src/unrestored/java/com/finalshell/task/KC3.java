package com.finalshell.task;

import com.finalshell.core.FileDropTransferHandler;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import java.lang.reflect.InvocationTargetException;

public class KC3 implements Runnable {
   public final ConnectionInfoPanel o;
   public final Tf4 L;
   public final Tf4 w;
   public final FileDropTransferHandler Y;

   public KC3(FileDropTransferHandler var1, ConnectionInfoPanel var2, Tf4 var3, Tf4 var4) {
      this.Y = var1;
      this.o = var2;
      this.L = var3;
      this.w = var4;
   }

   @Override
   public void run() {
      Object var4 = 550271666310848713L;
      Ref.g(550271666310848713L, var4);
      Object[] var10002 = Registry.emptyArgs();
      long var7 = 212042562452272939L;
      Object[] var6 = var10002;
      Ref.h(212042562452272939L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var46) {
         throw new RuntimeException(var46.getTargetException());
      }

      Object var8 = 128708130735072831L;
      Ref.g(128708130735072831L, var8);
      Object[] var10004 = Registry.emptyArgs();
      long var11 = 498856411508641826L;
      Object[] var10 = var10004;
      Registry.packArgs(Ref.h(498856411508641826L, var10, var11));
      long var12 = 159824902428932603L;
      Object var10005 = Ref.h2(159824902428932603L, var12);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var45) {
         throw new RuntimeException(var45.getTargetException());
      }

      String var2 = (String)var10005;

      try {
         Object var14 = 128708130735072831L;
         Ref.g(128708130735072831L, var14);
         Object[] var10008 = Registry.emptyArgs();
         long var17 = 498856411508641826L;
         Object[] var16 = var10008;
         Ref.h(498856411508641826L, var16, var17);
         new StringBuilder();
         Object var18 = 632320723363164056L;
         Object var10011 = Ref.g(632320723363164056L, var18);
         String var10012 = (String)(Registry.emptyArgs());
         long var21 = 498856411508641826L;
         Object var20 = var10012;
         var10012 = Ref.h(498856411508641826L, var20, var21);

         try {
            var10012 = (String)var10012;
         } catch (InvocationTargetException var43) {
            throw new RuntimeException(var43.getTargetException());
         }

         ((java.lang.StringBuilder)var10011).append((String)var10012).append(var2);
         Object var22 = 128708130735072831L;
         Object var10013 = Ref.g(128708130735072831L, var22);
         String var10014 = (String)(Registry.emptyArgs());
         long var25 = 179612178163941306L;
         Object var24 = var10014;
         var10014 = Ref.h(179612178163941306L, var24, var25);

         try {
            var10014 = (String)var10014;
         } catch (InvocationTargetException var42) {
            throw new RuntimeException(var42.getTargetException());
         }

         var10012 = Registry.packArgs(this, ((java.lang.StringBuilder)var10013).append((String)var10014).toString());
         long var27 = 247777483328047393L;
         Object var26 = var10012;
         Ref.h(247777483328047393L, var26, var27);

         try {
            ;
         } catch (InvocationTargetException var41) {
            throw new RuntimeException(var41.getTargetException());
         }

         Object var28 = 550271666310848713L;
         Ref.g(550271666310848713L, var28);
         Object var30 = 128708130735072831L;
         Ref.g(128708130735072831L, var30);
         Object[] var10016 = Registry.emptyArgs();
         long var33 = 498856411508641826L;
         Object[] var32 = var10016;
         Ref.h(498856411508641826L, var32, var33);
         Object var34 = 632320723363164056L;
         Object var10018 = Ref.g(632320723363164056L, var34);
         Object[] var10019 = Registry.emptyArgs();
         long var37 = 498856411508641826L;
         Object[] var36 = var10019;
         var10018 = Registry.packArgs(var10018, Ref.h(498856411508641826L, var36, var37), true);
         long var39 = 405516439223989653L;
         Object[] var38 = (Object[])var10018;
         Ref.h(405516439223989653L, var38, var39);

         try {
            ;
         } catch (InvocationTargetException var40) {
            throw new RuntimeException(var40.getTargetException());
         }
      } catch (Exception var44) {
         var44.printStackTrace();
      }
   }
}





