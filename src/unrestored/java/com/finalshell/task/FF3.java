package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.CP;
import java.lang.reflect.InvocationTargetException;

public class FF3 implements Runnable {
   public final CP a;

   public FF3(CP var1) {
      this.a = var1;
   }

   @Override
   public void run() {
      try {
         Registry.emptyArgs();
         long var2 = 270389152141252877L;
         Ref.h2(270389152141252877L, var2);
         Object[] var19 = Registry.emptyArgs();
         long var5 = 612604310671515822L;
         Object[] var4 = var19;
         Ref.h(612604310671515822L, var4, var5);
         Object[] var20 = Registry.emptyArgs();
         long var7 = 387012053033668218L;
         Object[] var6 = var20;
         Ref.h(387012053033668218L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var17) {
            throw new RuntimeException(var17.getTargetException());
         }
      } catch (Exception var18) {
         Registry.emptyArgs();
         long var8 = 270389152141252877L;
         Ref.h2(270389152141252877L, var8);
         Object[] var10002 = Registry.emptyArgs();
         long var11 = 606040881383812332L;
         Object[] var10 = var10002;
         Ref.h(606040881383812332L, var10, var11);
         Object[] var10003 = Registry.emptyArgs();
         long var13 = 140823137094225943L;
         Object[] var12 = var10003;
         Ref.h(140823137094225943L, var12, var13);
         Object[] var10004 = Registry.packArgs("" + var18);
         long var15 = 539001526584876911L;
         Object[] var14 = var10004;
         Ref.h(539001526584876911L, var14, var15);

         try {
            ;
         } catch (InvocationTargetException var16) {
            throw new RuntimeException(var16.getTargetException());
         }
      }
   }
}





