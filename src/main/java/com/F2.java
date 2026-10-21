package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;

@XStreamAlias("ResourceFile")
public class F2 implements Serializable {
   @XStreamAsAttribute
   private com.zo_2 B;
   @XStreamAsAttribute
   private String u;
   @XStreamAsAttribute
   private String h;
   private static int[] I;

   public F2(com.zo_2 var1, String var2) {
      this(var1, var2, (String)null);
   }

   public F2(com.zo_2 var1, String var2, Class var3) {
      this(var1, var2, var3.getCanonicalName());
   }

   public F2(com.zo_2 var1, String var2, String var3) {
      T();
      this.u(var1);
      this.f(var2);
      this.G(var3);
      if (com.ky_4.F() != null) {
         Q(new int[3]);
      }
   }

   public com.zo_2 G() {
      return this.B;
   }

   public void u(com.zo_2 var1) {
      this.B = var1;
   }

   public String b() {
      return this.u;
   }

   public void f(String var1) {
      this.u = var1;
   }

   public String D() {
      return this.h;
   }

   public void G(String var1) {
      this.h = var1;
   }

   @Override
   public boolean equals(Object var1) {
      int[] var2 = T();
      Object var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return false;
         }

         var10000 = var1;
      }

      boolean var4 = var10000 instanceof com.F2;
      if (var2 == null) {
         return var4;
      } else if (var4) {
         com.F2 var3 = (com.F2)var1;
         var10000 = var3;
         if (var2 != null) {
            if (var3.B != this.B) {
               return false;
            }

            var10000 = var3;
         }

         boolean var6 = com.ax_2.Z(((com.F2)var10000).u, new Object[]{this.u});
         if (var2 != null) {
            if (!var6) {
               return false;
            }

            var6 = com.ax_2.Z(var3.h, new Object[]{this.h});
         }

         return var2 == null ? var6 : var6;
      } else {
         return false;
      }
   }

   public static void Q(int[] var0) {
      I = var0;
   }

   public static int[] T() {
      return I;
   }

   static {
      if (T() == null) {
         Q(new int[4]);
      }
   }
}





