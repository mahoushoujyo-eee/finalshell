package com.finalshell.ui.model;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class Bn2 implements Comparator {
   public final boolean H;
   public final YT3_2 d;

   public Bn2(YT3_2 var1, boolean var2) {
      this.d = var1;
      this.H = var2;
   }

   public int M(File var1, File var2) {
      Object var8 = 196598744367778661L;
      Registry.packArgs(Ref.g(196598744367778661L, var8), var1.getName());
      long var10 = 607259551718786171L;
      Object var10002 = Ref.h2(607259551718786171L, var10);

      try {
         var18 = (Long)var10002;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      long var4 = var18;
      YT3_2.c();
      Object var12 = 196598744367778661L;
      Object[] var10004 = Registry.packArgs(Ref.g(196598744367778661L, var12), var2.getName());
      long var14 = 607259551718786171L;
      Object var10005 = Ref.h2(607259551718786171L, var14);

      try {
         var20 = (Long)var10005;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      long var6 = var20;
      Object[] var3 = var10004;
      int var19 = (Registry.lookupField(156915645017568853L).getBoolean(this)) ? 1 : 0;
      if (var3 != null) {
         if (var19 == 0) {
            return Long.compare(var4, var6);
         }

         var19 = Long.compare(var6, var4);
      }

      return var19;
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object var10001 = Registry.packArgs((File)var1, (File)var2);
      long var4 = 489202120646989913L;
      Object var3 = var10001;
      var10001 = Ref.h(489202120646989913L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
   private static Object var18;
   private static Object var20;
}





