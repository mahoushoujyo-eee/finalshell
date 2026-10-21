package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class Zg2_2 {
   public static HashMap a;

   public void D() {
      ((HashMap)Registry.lookupField(323929397643124273L).get(null)).clear();
   }

   public static synchronized boolean d(int var0, int var1) {
      int var2 = (var0 + "_" + var1).hashCode();
      return ((HashMap)Registry.lookupField(323929397643124273L).get(null)).containsKey(var2);
   }

   public static synchronized Uc2 s(int var0, int var1) {
      int var2 = (var0 + "_" + var1).hashCode();
      return (Uc2)((HashMap)Registry.lookupField(323929397643124273L).get(null)).get(var2);
   }

   public static void K() {
   }

   public static synchronized Uc2 u(BufferedImage var0, BufferedImage var1, RenderingHints var2, int var3, int var4) {
      int var5 = (var3 + "_" + var4).hashCode();
      Uc2 var6 = new Uc2();
      Registry.lookupField(331345675446116425L).setInt(var6, var3);
      Registry.lookupField(224601074955414455L).setInt(var6, var4);
      Object[] var10001 = Registry.emptyArgs();
      long var8 = 190504784764553274L;
      Object[] var7 = var10001;
      Ref.h(190504784764553274L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      ((HashMap)Registry.lookupField(323929397643124273L).get(null)).put(var5, var6);
      return var6;
   }

   public static synchronized void o(Uc2 var0, int var1) {
      Object[] var10001 = Registry.packArgs(var1);
      long var3 = 365828054481938659L;
      Object[] var2 = var10001;
      Ref.h(365828054481938659L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public static synchronized void G(Uc2 var0, int var1) {
      com.finalshell.ui.panel.F8.y();
      Object var10002 = Registry.packArgs(var1);
      long var5 = 228632970311438472L;
      Object var4 = var10002;
      Ref.h(228632970311438472L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      var10002 = Registry.emptyArgs();
      long var7 = 502552909089695756L;
      Object var6 = var10002;
      var10002 = Ref.h(502552909089695756L, var6, var7);

      try {
         var15 = (Integer)var10002;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      if (var0 == null) {
         if (var15 != 0) {
            return;
         }

         var15 = (Registry.lookupField(331345675446116425L).getInt(var0) + "_" + Registry.lookupField(224601074955414455L).getInt(var0)).hashCode();
      }

      int var3 = var15;
      ((HashMap)Registry.lookupField(323929397643124273L).get(null)).remove(var3);
      Object[] var10003 = Registry.emptyArgs();
      long var9 = 514459637192101058L;
      Object[] var8 = var10003;
      Ref.h(514459637192101058L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   public static void B(int var0, int var1) {
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      Registry.lookupField(323929397643124273L).set(null, new HashMap());
   }
   private static Object var15;
}





