package com.finalshell.core;

import com.finalshell.ui.model.EP;
import com.finalshell.ui.model.Ks2_2;
import com.finalshell.ui.panel.Ky4;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Xj4 {
   public Charset e = S7.v;
   public En2 i = En2.p();
   public IG n;
   public Fc2_2 z;
   public EP[] O;
   public Wr4[] t;
   public Ks2_2[] F;
   public Map s;
   public String f;
   public boolean D;
   public static boolean k;

   public Xj4() {
      boolean var10000 = m();
      this.n = IG.G();
      this.O = new EP[]{EP.BrowserSecure};
      this.t = new Wr4[0];
      this.F = new Ks2_2[0];
      boolean var1 = var10000;
      this.D = true;
      if (!var1) {
         Ky4.K(new String[2]);
      }
   }

   public En2 J$En_2() {
      return this.i;
   }

   public void e(En2 var1) {
      this.i = var1;
   }

   public IG A() {
      return this.n;
   }

   public void X(IG var1) {
      this.n = var1;
   }

   public EP[] g$arrEP() {
      return this.O;
   }

   public void o(EP[] var1) {
      this.O = var1;
   }

   public Wr4[] y() {
      return this.t;
   }

   public void a(Wr4[] var1) {
      this.t = var1;
   }

   public Ks2_2[] J$arrKs_2() {
      return this.F;
   }

   public void v(Ks2_2[] var1) {
      this.F = var1;
   }

   public Map B() {
      return this.s;
   }

   public void f(Map var1) {
      boolean var2 = g$boolean();
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
            this.i.I((java.lang.Class)var4.getKey(), (Wr4)var4.getValue());
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

   public Fc2_2 u() {
      return this.z;
   }

   public void Q(Fc2_2 var1) {
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
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (!m()) {
         p(true);
      }
   }
}





