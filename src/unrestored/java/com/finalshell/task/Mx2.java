package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Mx2 implements Runnable {
   public final YT3_2 s;

   public Mx2(YT3_2 var1) {
      this.s = var1;
   }

   @Override
   public void run() {
      boolean var28;
      com.finalshell.ui.panel.Ky4[] var10000 = YT3_2.c();
      long var2 = System.currentTimeMillis();
      com.finalshell.ui.panel.Ky4[] var1 = var10000;
      Object var4 = 596574325639006435L;
      Ref.g(596574325639006435L, var4);
      Object var6 = 596574325639006435L;
      Registry.packArgs(Ref.g(596574325639006435L, var6));
      long var8 = 385643251219565463L;
      Ref.h2(385643251219565463L, var8);
      Object[] var10005 = Registry.emptyArgs();
      long var11 = 227837117761533093L;
      Object[] var10 = var10005;
      var10005 = Registry.packArgs(Ref.h(227837117761533093L, var10, var11));
      long var13 = 448378562507554122L;
      Object[] var12 = var10005;
      Ref.h(448378562507554122L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var26) {
         throw new RuntimeException(var26.getTargetException());
      }

      if (var1 != null) {
         Registry.emptyArgs();
         long var14 = 454647487873911743L;
         Object var10006 = Ref.h2(454647487873911743L, var14);

         try {
            var28 = (Boolean)var10006;
         } catch (InvocationTargetException var25) {
            throw new RuntimeException(var25.getTargetException());
         }

         if (var28) {
            Registry.emptyArgs();
            long var16 = 258164365275909391L;
            Ref.h2(258164365275909391L, var16);

            try {
               ;
            } catch (InvocationTargetException var24) {
               throw new RuntimeException(var24.getTargetException());
            }
         }

         Ref.g(388376917454860932L, null);
         Object[] var10007 = Registry.packArgs(new BH3(this));
         long var19 = 434592463220957006L;
         Object[] var18 = var10007;
         Ref.h(434592463220957006L, var18, var19);

         try {
            ;
         } catch (InvocationTargetException var23) {
            throw new RuntimeException(var23.getTargetException());
         }

         Ref.g(388376917454860932L, null);
         Object[] var10008 = Registry.packArgs(new Fo2(this));
         long var21 = 434592463220957006L;
         Object[] var20 = var10008;
         Ref.h(434592463220957006L, var20, var21);

         try {
            ;
         } catch (InvocationTargetException var22) {
            throw new RuntimeException(var22.getTargetException());
         }
      }
   }
}





