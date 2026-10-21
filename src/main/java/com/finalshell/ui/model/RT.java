package com.finalshell.ui.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.awt.Dimension;
import java.awt.Insets;
import java.io.Serializable;
import java.util.List;

@XStreamAlias("NinePatchInfo")
public class RT implements Serializable {
   @XStreamAsAttribute
   public Dimension f;
   @XStreamAsAttribute
   public Insets n;
   @XStreamImplicit(
      itemFieldName = "hor"
   )
   public List M;
   @XStreamImplicit(
      itemFieldName = "ver"
   )
   public List W;

   public Dimension g() {
      return this.f;
   }

   public void x(Dimension var1) {
      this.f = var1;
   }

   public Insets W() {
      return this.n;
   }

   public void Y(Insets var1) {
      this.n = var1;
   }

   public List k() {
      return this.M;
   }

   public void S(List var1) {
      this.M = var1;
   }

   public List o() {
      return this.W;
   }

   public void V(List var1) {
      this.W = var1;
   }

   @Override
   public boolean equals(Object var1) {
      boolean var5;
      int[] var2 = com.finalshell.ui.panel.KD3.u();
      Object var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return false;
         }

         var10000 = var1;
      }

      boolean var4 = var10000 instanceof RT;
      if (var2 != null) {
         return var4;
      } else if (var4) {
         RT var3 = (RT)var1;
         var5 = this.W().equals(var3.W());
         if (var2 == null) {
            if (!var5) {
               return false;
            }

            var5 = g(this.k(), var3.k());
         }

         if (var2 == null) {
            if (!var5) {
               return false;
            }

            var5 = g(this.o(), var3.o());
         }

         return var2 != null ? var5 : var5;
      } else {
         return false;
      }
   }

   public static boolean g(List var0, List var1) {
      boolean var5;
      int[] var2;
      List var10000;
      var2 = com.finalshell.ui.panel.KD3.u();
      var10000 = var0;
      label68:
      if (var2 == null) {
         if (var0 == null) {
            var10000 = var1;
            if (var2 != null) {
               break label68;
            }

            if (var1 == null) {
               return true;
            }
         }

         var10000 = var0;
      }

      if (var2 == null) {
         if (var10000 == null) {
            return false;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (var10000 == null) {
            return false;
         }

         var10000 = var0;
      }

      int var4 = var10000.size();
      if (var2 == null) {
         if (var4 != var1.size()) {
            return false;
         }

         var4 = 0;
      }

      int var3 = var4;

      while (true) {
         if (var3 < var0.size()) {
            var5 = ((EZ)var0.get(var3)).equals(var1.get(var3));
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var5;
            }

            if (!var5) {
               return false;
            }

            var3++;
            if (var2 == null) {
               continue;
            }
         }

         var5 = true;
         break;
      }

      return var5;
   }
}





