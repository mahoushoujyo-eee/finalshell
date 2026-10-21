package com.finalshell.task;

import com.finalshell.core.Ln2;
import com.finalshell.core.Ln4_2;
import com.finalshell.core.U5;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class OW implements Runnable {
   public final Ln2 l;
   public static long a;

   public OW(Ln2 var1) {
      this.l = var1;
   }

   @Override
   public void run() {
      boolean var1 = Ln4_2.i();

      try {
         Object var5 = 444888628147674524L;
         Ref.g(444888628147674524L, var5);
         Object[] var10002 = Registry.emptyArgs();
         long var8 = 349012733953542138L;
         Object[] var7 = var10002;
         var10002 = Ref.h(349012733953542138L, var7, var8);

         try {
            var37 = (Boolean)var10002;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }

         if (!var37) {
            return;
         }
      } catch (Exception var35) {
         throw a(var35);
      }

      Registry.emptyArgs();
      long var9 = 270389152141252877L;
      Ref.h2(270389152141252877L, var9);
      U5 var10004 = (U5)(Registry.emptyArgs());
      long var12 = 375944019649708240L;
      Object[] var11 = var10004;
      var10004 = Ref.h(375944019649708240L, var11, var12);

      try {
         var10004 = (U5)var10004;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      U5 var2 = var10004;
      int var3 = (int)a;

      label70: {
         try {
            if (!var1) {
               break label70;
            }

            System.currentTimeMillis();
            Object[] var10006 = Registry.emptyArgs();
            long var14 = 186487761808053297L;
            Object[] var13 = var10006;
            var10006 = Ref.h(186487761808053297L, var13, var14);

            try {
               var41 = (Long)var10006;
            } catch (InvocationTargetException var31) {
               throw var31.getTargetException();
            }

            if (var2 - var41 <= (long)var3) {
               return;
            }
         } catch (Exception var34) {
            throw a(var34);
         }

         try {
            Object var15 = 444888628147674524L;
            Ref.g(444888628147674524L, var15);
            Object var17 = 444888628147674524L;
            Ref.g(444888628147674524L, var17);
            Object var19 = 358782464092968093L;
            Object[] var10009 = Registry.packArgs(Ref.g(358782464092968093L, var19));
            long var22 = 355391844538089141L;
            Object[] var21 = var10009;
            Ref.h(355391844538089141L, var21, var22);
         } catch (Exception var30) {
         }
      }

      Registry.emptyArgs();
      long var23 = 270389152141252877L;
      Ref.h2(270389152141252877L, var23);
      Object[] var42 = Registry.emptyArgs();
      long var26 = 375944019649708240L;
      Object[] var25 = var42;
      Ref.h(375944019649708240L, var25, var26);
      Object[] var10007 = Registry.e(System.currentTimeMillis());
      long var28 = 511675613308694766L;
      Object[] var27 = var10007;
      Ref.h(511675613308694766L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8592086498739285636L;
      long var10002 = 3124416405911935924L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





