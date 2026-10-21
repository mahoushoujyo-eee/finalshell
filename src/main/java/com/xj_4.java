package com;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class xj_4 {
   private Charset e = S7.v;
   private En_2 i = En_2.p();
   private IG n;
   private com.Fc_2 z;
   private EP[] O;
   private wr_4[] t;
   private com.Ks_2[] F;
   private Map s;
   private String f;
   private boolean D;
   private static boolean k;

   public xj_4() {
      boolean var10000 = m();
      this.n = IG.G();
      this.O = new EP[]{EP.BrowserSecure};
      this.t = new wr_4[0];
      this.F = new com.Ks_2[0];
      boolean var1 = var10000;
      this.D = true;
      if (!var1) {
         com.ky_4.K(new String[2]);
      }
   }

   public En_2 J() {
      return this.i;
   }

   public void e(En_2 var1) {
      this.i = var1;
   }

   public IG A() {
      return this.n;
   }

   public void X(IG var1) {
      this.n = var1;
   }

   public EP[] g() {
      return this.O;
   }

   public void o(EP[] var1) {
      this.O = var1;
   }

   public wr_4[] y() {
      return this.t;
   }

   public void a(wr_4[] var1) {
      this.t = var1;
   }

   public com.Ks_2[] J$comKs_2() {
      return this.F;
   }

   public void v(com.Ks_2[] var1) {
      this.F = var1;
   }

   public Map B() {
      return this.s;
   }

   public void f(Map var1) {
      boolean var2 = g();
      Map var10000 = var1;
      if (!var2) {
         if (var1 == null) {
            return;
         }

         var10000 = var1;
      }

      Iterator var3 = var10000.entrySet().iterator();

      while (true) {
         if (var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            this.i.I((Class)var4.getKey(), (wr_4)var4.getValue());
            if (var2) {
               break;
            }

            if (!var2) {
               continue;
            }
         }

         this.s = var1;
         break;
      }
   }

   public String r() {
      return this.f;
   }

   public void p(String var1) {
      this.f = var1;
   }

   public Charset b() {
      return this.e;
   }

   public void r(Charset var1) {
      this.e = var1;
   }

   public boolean i() {
      return this.D;
   }

   public void b(boolean var1) {
      this.D = var1;
   }

   public com.Fc_2 u() {
      return this.z;
   }

   public void Q(com.Fc_2 var1) {
      this.z = var1;
   }

   public static void p(boolean var0) {
      k = var0;
   }

   public static boolean m() {
      return k;
   }

   public static boolean g$boolean() {
      boolean var0 = m();
      return !var0;
   }

   static {
      if (!m()) {
         p(true);
      }
   }
}





