package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@XStreamAlias("style")
@XStreamConverter(Ru_2.class)
public final class BN implements Serializable {
   private com.KH i;
   private String R;
   private String n;
   private Map B;
   private Map w;
   private List p;
   private static com.ky_4[] K;

   public com.KH j() {
      return this.i;
   }

   public void H(com.KH var1) {
      this.i = var1;
   }

   public String H() {
      return this.R;
   }

   public void A(String var1) {
      this.R = var1;
   }

   public String E() {
      return this.n;
   }

   public void o(String var1) {
      this.n = var1;
   }

   public Map G() {
      return this.B;
   }

   public void K(Map var1) {
      this.B = var1;
   }

   public Map Y() {
      return this.w;
   }

   public void T(Map var1) {
      this.w = var1;
   }

   public List X() {
      return this.p;
   }

   public void Y(List var1) {
      this.p = var1;
   }

   public XS T() {
      com.ky_4[] var1 = A();
      List var10000 = this.p;
      if (var1 != null) {
         if (this.p.size() == 1) {
            return (XS)this.p.get(0);
         }

         var10000 = this.p;
      }

      Iterator var2 = var10000.iterator();

      while (true) {
         if (var2.hasNext()) {
            XS var3 = (XS)var2.next();
            var4 = var3;
            if (var1 == null) {
               break;
            }

            if (var3.p()) {
               var4 = var3;
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         return null;
      }

      return var4;
   }

   public static void k(com.ky_4[] var0) {
      K = var0;
   }

   public static com.ky_4[] A() {
      return K;
   }

   static {
      if (A() == null) {
         k(new com.ky_4[1]);
      }
   }
}





