package com.finalshell.core;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.Icon;

public class At2 {
   public transient List q = new ArrayList(1);
   public String m;
   public Icon Q;
   public String N;
   public Color E;
   public Color i;
   public boolean j;
   public boolean f;
   public Component d;

   public At2(String var1, String var2, Component var3) {
      this(var1, null, var2, null, var3);
   }

   public At2(String var1, Icon var2, Component var3) {
      this(var1, var2, null, null, var3);
   }

   public At2(String var1, Icon var2, String var3, Component var4) {
      this(var1, var2, var3, null, var4);
   }

   public At2(String var1, Icon var2, String var3, Color var4, Component var5) {
      this(var1, var2, var3, var4, true, var5);
   }

   public At2(String var1, Icon var2, String var3, Color var4, boolean var5, Component var6) {
      this(var1, var2, var3, var4, var5, true, var6);
   }

   public At2(String var1, Icon var2, String var3, Color var4, boolean var5, boolean var6, Component var7) {
      this(var1, var2, var3, Color.BLACK, var4, var5, var6, var7);
   }

   public At2(String var1, Icon var2, String var3, Color var4, Color var5, boolean var6, boolean var7, Component var8) {
      this.m = var1;
      this.Q = var2;
      this.N = var3;
      this.E = var4;
      this.i = var5;
      this.j = var6;
      this.f = var7;
      this.d = var8;
   }

   public String B() {
      return this.m;
   }

   public void d(String var1) {
      this.m = var1;
   }

   public Icon I() {
      return this.Q;
   }

   public void T(Icon var1) {
      this.Q = var1;
      this.j();
   }

   public String T() {
      return this.N;
   }

   public String V() {
      String[] var1 = BX.B$arrString();
      String var10000 = this.N;
      if (var1 == null) {
         if (this.N != null) {
            return this.N;
         }

         var10000 = this.m;
      }

      return Cf4_2.X(var10000);
   }

   public void f(String var1) {
      this.N = var1;
      this.j();
   }

   public Color Y() {
      return this.E;
   }

   public void T(Color var1) {
      this.E = var1;
      this.j();
   }

   public Color d() {
      return this.i;
   }

   public void q(Color var1) {
      Color var2 = this.i;
      this.i = var1;
      this.p(var2, var1);
   }

   public boolean J() {
      return this.j;
   }

   public void d(boolean var1) {
      this.j = var1;
      this.j();
   }

   public boolean K() {
      return this.f;
   }

   public void u(boolean var1) {
      this.f = var1;
   }

   public Component c() {
      return this.d;
   }

   public void y(Component var1) {
      Component var2 = this.d;
      this.d = var1;
      this.U(var2, var1);
   }

   public List U() {
      return AL_2.J((Collection)this.q);
   }

   public void f(K__2 var1) {
      this.q.add(var1);
   }

   public void m(K__2 var1) {
      this.q.remove(var1);
   }

   public void j() {
      String[] var10000 = BX.B$arrString();
      Iterator var2 = AL_2.J((Collection)this.q).iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         K__2 var3 = (K__2)var2.next();
         var3.k(this);
         if (var1 != null) {
            break;
         }
      }
   }

   public void p(Color var1, Color var2) {
      String[] var10000 = BX.B$arrString();
      Iterator var4 = AL_2.J((Collection)this.q).iterator();
      String[] var3 = var10000;

      while (var4.hasNext()) {
         K__2 var5 = (K__2)var4.next();
         var5.K(this, var1, var2);
         if (var3 != null) {
            break;
         }
      }
   }

   public void U(Component var1, Component var2) {
      String[] var10000 = BX.B$arrString();
      Iterator var4 = AL_2.J((Collection)this.q).iterator();
      String[] var3 = var10000;

      while (var4.hasNext()) {
         K__2 var5 = (K__2)var4.next();
         var5.V(this, var1, var2);
         if (var3 != null) {
            break;
         }
      }
   }
}





