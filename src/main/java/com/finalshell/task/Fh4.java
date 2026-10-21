package com.finalshell.task;

import com.finalshell.core.D82_2;
import com.finalshell.core.GH_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Fh4 implements Runnable {
   public final D82_2 L;
   public final GH_2 p;

   public Fh4(D82_2 var1, GH_2 var2) {
      this.L = var1;
      this.p = var2;
   }

   @Override
   public void run() {
      Integer var45;
      D82_2.Q();
      Object var2 = 391045987025414928L;
      Ref.g(391045987025414928L, var2);
      Object[] var10003 = Registry.packArgs(Thread.currentThread());
      long var5 = 310185339103778335L;
      Object[] var4 = var10003;
      Ref.h(310185339103778335L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      Object var6 = 391045987025414928L;
      Object var10004 = Ref.g(391045987025414928L, var6);
      Runnable var10005 = Registry.emptyArgs();
      long var9 = 341542274982347937L;
      Object var8 = var10005;
      var10005 = Ref.h(341542274982347937L, var8, var9);

      try {
         var10005 = (Runnable)var10005;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      var10005.run();
      Object var1 = var10004;
      Object var10 = 391045987025414928L;
      Ref.g(391045987025414928L, var10);
      Boolean var10006 = (Boolean)(Registry.emptyArgs());
      long var13 = 434390456563867566L;
      Object var12 = var10006;
      var10006 = Ref.h(434390456563867566L, var12, var13);

      try {
         var10006 = (Boolean)var10006;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      label79: {
         if (var1 == null) {
            if (var10006 != null) {
               return;
            }

            var10006 = this;
            Object var14 = 391045987025414928L;
            GH_2 var10007 = (GH_2)Ref.g(391045987025414928L, var14);
            if (var1 != null) {
               break label79;
            }

            Object[] var10008 = Registry.emptyArgs();
            long var17 = 140051292629163334L;
            Object[] var16 = var10008;
            var10008 = Ref.h(140051292629163334L, var16, var17);

            try {
            } catch (InvocationTargetException var33) {
               throw var33.getTargetException();
            }
         }

         if (var10006 != Registry.lookupField(439517225992595079L).getInt(null)) {
            return;
         }

         Object var18 = 391045987025414928L;
         GH_2 var41 = (GH_2)Ref.g(391045987025414928L, var18);
         System.currentTimeMillis();
         Object var20 = 391045987025414928L;
         Object var10010 = Ref.g(391045987025414928L, var20);
         Object var10011 = Registry.emptyArgs();
         long var23 = 175209733329813569L;
         Object var22 = var10011;
         var10011 = Ref.h(175209733329813569L, var22, var23);

         try {
            var45 = (Integer)var10011;
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }

         var10010 = Registry.e(var10010 + (long)var45);
         long var25 = 231959045328111640L;
         Object[] var24 = (Object[])var10010;
         Ref.h(231959045328111640L, var24, var25);

         try {
            ;
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }

         Object var26 = 391045987025414928L;
         GH_2 var46 = (GH_2)Ref.g(391045987025414928L, var26);
      }

      Object[] var10012 = Registry.packArgs(false);
      long var29 = 573074163756087155L;
      Object[] var28 = var10012;
      Ref.h(573074163756087155L, var28, var29);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }
   }
}





