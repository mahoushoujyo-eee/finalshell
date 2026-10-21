package com;

public class Yt_2 {
   private String g;
   private String j;
   private String N;
   private String R;
   private static int l;

   public Yt_2() {
   }

   public Yt_2(String var1, String var2, String var3, String var4) {
      this.g = var1;
      int var10000 = L();
      this.j = var2;
      int var5 = var10000;
      this.N = var3;
      this.R = var4;
      if (var5 != 0) {
         com.ky_4.K(new String[1]);
      }
   }

   public String h() {
      return this.g;
   }

   public void p(String var1) {
      this.g = var1;
   }

   public String U() {
      return this.j;
   }

   public void e(String var1) {
      this.j = var1;
   }

   public String Q() {
      return this.N;
   }

   public void v(String var1) {
      this.N = var1;
   }

   public String b() {
      return this.R;
   }

   public void b(String var1) {
      this.R = var1;
   }

   public static void A(int var0) {
      l = var0;
   }

   public static int C() {
      return l;
   }

   public static int L() {
      int var0 = C();
      return var0 == 0 ? 51 : 0;
   }

   static {
      if (C() == 0) {
         A(108);
      }
   }
}





