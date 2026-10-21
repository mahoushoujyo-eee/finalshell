package com.finalshell.core;

import java.util.Calendar;

public class Ct4_2 {
   public static boolean W(long var0) {
      String var10000 = D52_2.k();
      Calendar var3 = Calendar.getInstance();
      var3.setTimeInMillis(var0);
      String var2 = var10000;
      Calendar var4 = Calendar.getInstance();
      boolean var5 = false;
      int var6 = var4.get(1);
      if (var2 == null) {
         var6 = var6 == var3.get(1) ? 1 : 0;
      }

      int var10001 = var4.get(2);
      if (var2 == null) {
         var10001 = var10001 > var3.get(2) ? 1 : 0;
      }

      int var7 = var6 & var10001;
      var10001 = var4.get(1);
      if (var2 == null) {
         var10001 = var10001 > var3.get(1) ? 1 : 0;
      }

      return (boolean)((var7 | var10001) != 0);
   }

   public static boolean D(long var0) {
      String var10000 = D52_2.k();
      Calendar var3 = Calendar.getInstance();
      var3.setTimeInMillis(var0);
      Calendar var4 = Calendar.getInstance();
      boolean var5 = false;
      String var2 = var10000;
      int var6 = var4.get(1);
      if (var2 == null) {
         var6 = var6 == var3.get(1) ? 1 : 0;
      }

      int var10001 = var4.get(2);
      if (var2 == null) {
         var10001 = var10001 > var3.get(2) ? 1 : 0;
      }

      int var7 = var6 & var10001;
      var10001 = var4.get(1);
      if (var2 == null) {
         var10001 = var10001 > var3.get(1) ? 1 : 0;
      }

      return (boolean)((var7 | var10001) != 0);
   }

   public static boolean f(long var0) {
      String var10000 = D52_2.k();
      Calendar var3 = Calendar.getInstance();
      var3.setTimeInMillis(var0);
      String var2 = var10000;
      Calendar var4 = Calendar.getInstance();
      boolean var5 = false;
      int var6 = var4.get(1);
      if (var2 == null) {
         var6 = var6 == var3.get(1) ? 1 : 0;
      }

      int var10001 = var4.get(2);
      if (var2 == null) {
         var10001 = var10001 > var3.get(2) ? 1 : 0;
      }

      return (boolean)((var6 & var10001) != 0);
   }
}





