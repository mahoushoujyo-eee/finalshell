package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.io.Serializable;
import java.util.List;

@XStreamAlias("PluginInformation")
public class _0 implements Serializable {
   private String i;
   private String d;
   private String n;
   private boolean t;
   private String T;
   private String c;
   private String u;
   private com.lO_3 k;
   @XStreamImplicit
   private List m;
   @XStreamImplicit
   private List j;

   public _0() {
   }

   public _0(String var1, boolean var2, String var3, String var4, String var5) {
      this(var1, null, null, var2, var3, var4, var5, com.lO_3.L, null, null);
   }

   public _0(String var1, boolean var2, String var3, String var4, String var5, com.lO_3 var6) {
      this(var1, null, null, var2, var3, var4, var5, var6, null, null);
   }

   public _0(String var1, String var2, String var3, boolean var4, String var5, String var6, String var7, com.lO_3 var8, List var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, null);
   }

   public _0(String var1, String var2, String var3, boolean var4, String var5, String var6, String var7, com.lO_3 var8, List var9, List var10) {
      com.ky_4[] var10000 = com.kZ_3.W();
      super();
      this.i = var1;
      this.d = var2;
      this.n = var3;
      this.t = var4;
      com.ky_4[] var11 = var10000;
      this.T = var5;
      this.c = var6;
      this.u = var7;
      this.k = var8;
      this.m = var9;
      this.j = var10;
      if (var11 != null) {
         com.ky_4.K(new String[1]);
      }
   }

   public String B() {
      return this.i;
   }

   public void o(String var1) {
      this.i = var1;
   }

   public String e() {
      return this.d;
   }

   public void U(String var1) {
      this.d = var1;
   }

   public String r() {
      return this.n;
   }

   public List h() {
      return NE.D(this.n, ",");
   }

   public void R(String var1) {
      this.n = var1;
   }

   public void H(List var1) {
      this.n = NE.I(var1, ",");
   }

   public boolean m() {
      return this.t;
   }

   public void B(boolean var1) {
      this.t = var1;
   }

   public String X() {
      return this.T;
   }

   public void D(String var1) {
      this.T = var1;
   }

   public String v() {
      return this.c;
   }

   public void F(String var1) {
      this.c = var1;
   }

   public String t() {
      return this.u;
   }

   public void v(String var1) {
      this.u = var1;
   }

   public com.lO_3 w() {
      return this.k;
   }

   public void W(com.lO_3 var1) {
      this.k = var1;
   }

   public List b() {
      return this.m;
   }

   public void M(List var1) {
      this.m = var1;
   }

   public boolean O() {
      com.ky_4[] var1 = com.kZ_3.W();
      List var10000 = this.m;
      if (var1 == null) {
         if (this.m == null) {
            return (boolean)0;
         }

         var10000 = this.m;
      }

      int var2 = var10000.size();
      if (var1 != null) {
         return (boolean)var2;
      } else {
         return (boolean)(var2 > 0 ? 1 : 0);
      }
   }

   public int l() {
      com.ky_4[] var1 = com.kZ_3.W();
      List var10000 = this.m;
      if (var1 == null) {
         if (this.m == null) {
            return 0;
         }

         var10000 = this.m;
      }

      int var2 = var10000.size();
      if (var1 != null) {
         return var2;
      } else {
         return var2 > 0 ? this.m.size() : 0;
      }
   }

   public List N() {
      return this.j;
   }

   public void D(List var1) {
      this.j = var1;
   }

   public boolean i() {
      com.ky_4[] var1 = com.kZ_3.W();
      List var10000 = this.j;
      if (var1 == null) {
         if (this.j == null) {
            return (boolean)0;
         }

         var10000 = this.j;
      }

      int var2 = var10000.size();
      if (var1 != null) {
         return (boolean)var2;
      } else {
         return (boolean)(var2 > 0 ? 1 : 0);
      }
   }

   public int c() {
      com.ky_4[] var1 = com.kZ_3.W();
      List var10000 = this.j;
      if (var1 == null) {
         if (this.j == null) {
            return 0;
         }

         var10000 = this.j;
      }

      int var2 = var10000.size();
      if (var1 != null) {
         return var2;
      } else {
         return var2 > 0 ? this.j.size() : 0;
      }
   }

   @Override
   public String toString() {
      return this.c + " " + this.k;
   }
}





