package com.finalshell.ui.model;

import com.finalshell.core.KT;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class Ab2 implements Comparator {
   public final boolean h;

   public Ab2(boolean var1) {
      this.h = var1;
   }

   public int a(File var1, File var2) {
      Registry.packArgs(var1.getName());
      long var8 = 240174729775302079L;
      Object var10001 = Ref.h2(240174729775302079L, var8);

      try {
         var14 = (Long)var10001;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      long var4 = var14;
      KT.F();
      Object[] var10002 = Registry.packArgs(var2.getName());
      long var10 = 240174729775302079L;
      Object var10003 = Ref.h2(240174729775302079L, var10);

      try {
         var16 = (Long)var10003;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      long var6 = var16;
      Object[] var3 = var10002;
      int var15 = (Registry.lookupField(619787630767044970L).getBoolean(this)) ? 1 : 0;
      if (var3 == null) {
         if (var15 == 0) {
            return Long.compare(var4, var6);
         }

         var15 = Long.compare(var6, var4);
      }

      return var15;
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object var10001 = Registry.packArgs((File)var1, (File)var2);
      long var4 = 154605682348061912L;
      Object var3 = var10001;
      var10001 = Ref.h(154605682348061912L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
   private static Object var14;
   private static Object var16;
}





