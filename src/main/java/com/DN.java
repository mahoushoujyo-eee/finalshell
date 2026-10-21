package com;

import java.awt.Component;
import java.lang.ref.WeakReference;
import javax.swing.JComponent;

public class DN {
   private String t = null;
   private boolean j = false;
   private WeakReference x = null;
   private WeakReference K;
   private com.Cs_2 O;
   private com.WF p;
   private com.Wc_2 J;
   private static final String a;

   public DN() {
      GR.I();
      this.K = null;
      this.O = null;
      this.p = null;
      this.J = null;
      if (com.ky_4.F() != null) {
         GR.O(new String[2]);
      }
   }

   public String k() {
      String[] var1 = GR.I();
      String var10000 = this.t;
      if (var1 != null) {
         if (this.t == null) {
            this.C();
         }

         var10000 = this.t;
      }

      return var10000;
   }

   public void b(String var1) {
      this.t = var1;
   }

   public void C() {
      this.t = NE.E(a);
   }

   public boolean o() {
      return this.j;
   }

   public com.DN s(boolean var1) {
      this.j = var1;
      return this;
   }

   public Component R() {
      String[] var1 = GR.I();
      Object var10000 = this.x;
      if (var1 != null) {
         if (this.x == null) {
            return null;
         }

         var10000 = this.x.get();
      }

      return (Component)var10000;
   }

   public com.DN p(Component var1) {
      this.x = new WeakReference(var1);
      return this;
   }

   public JComponent j() {
      String[] var1 = GR.I();
      Object var10000 = this.K;
      if (var1 != null) {
         if (this.K == null) {
            return null;
         }

         var10000 = this.K.get();
      }

      return (JComponent)var10000;
   }

   public com.DN u(JComponent var1) {
      this.K = new WeakReference(var1);
      return this;
   }

   public com.Cs_2 x() {
      return this.O;
   }

   public com.DN M(com.Cs_2 var1) {
      this.O = var1;
      return this;
   }

   public com.WF O() {
      return this.p;
   }

   public com.DN T(com.WF var1) {
      this.p = var1;
      return this;
   }

   public com.Wc_2 t() {
      return this.J;
   }

   public com.DN v(com.Wc_2 var1) {
      this.J = var1;
      return this;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "V_".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 20;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 20;
         var10006 = var0;
      } else {
         var6 = 20;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 20;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 10;
               break;
            case 1:
               var23 = 2;
               break;
            case 2:
               var23 = 4;
               break;
            case 3:
               var23 = 111;
               break;
            case 4:
               var23 = 29;
               break;
            case 5:
               var23 = 99;
               break;
            default:
               var23 = 124;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





