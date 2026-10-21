package com.finalshell.ui.model;

import com.finalshell.core.Ax2;
import com.finalshell.ui.panel.Ky4;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;

@XStreamAlias("ResourceFile")
public class F2 implements Serializable {
   @XStreamAsAttribute
   public Zo2 B;
   @XStreamAsAttribute
   public String u;
   @XStreamAsAttribute
   public String h;
   public static int[] I;

   public F2(Zo2 var1, String var2) {
      this(var1, var2, (String)null);
   }

   public F2(Zo2 var1, String var2, Class var3) {
      this(var1, var2, var3.getCanonicalName());
   }

   public F2(Zo2 var1, String var2, String var3) {
      T();
      this.u(var1);
      this.f(var2);
      this.G(var3);
      if (Ky4.F$arrString() != null) {
         Q(new int[3]);
      }
   }

   public Zo2 G() {
      return this.B;
   }

   public void u(Zo2 var1) {
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

      boolean var4 = var10000 instanceof F2;
      if (var2 == null) {
         return var4;
      } else if (var4) {
         F2 var3 = (F2)var1;
         var10000 = var3;
         if (var2 != null) {
            if (var3.B != this.B) {
               return false;
            }

            var10000 = var3;
         }

         boolean var6 = Ax2.Z(((F2)var10000).u, new Object[]{this.u});
         if (var2 != null) {
            if (!var6) {
               return false;
            }

            var6 = Ax2.Z(var3.h, new Object[]{this.h});
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
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (T() == null) {
         Q(new int[4]);
      }
   }
}





