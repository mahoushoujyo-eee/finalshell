package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import org.jetbrains.annotations.NotNull;

public class KB {
   public final Object X;
   public final Object S;
   public static KB j;
   public static long a;

   @NotNull
   public static KB Z(Object var0, Object var1) {
      return new KB(var0, var1);
   }

   public static Object K(KB var0) {
      Ky4[] var1 = Sd2.t();
      Object var10000 = var0;
      if (var1 != null) {
         var10000 = var0 != null ? var0.X : null;
      }

      return var10000;
   }

   public static Object B(KB var0) {
      Ky4[] var1 = Sd2.t();
      Object var10000 = var0;
      if (var1 != null) {
         var10000 = var0 != null ? var0.S : null;
      }

      return var10000;
   }

   public static KB w() {
      return j;
   }

   public KB(Object var1, Object var2) {
      this.X = var1;
      this.S = var2;
   }

   public final Object F() {
      return this.X;
   }

   public final Object e() {
      return this.S;
   }

   @Override
   public boolean equals(Object var1) {
      Ky4[] var2 = Sd2.t();
      Object var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var10000 != null) {
         var10000 = this.getClass();
         if (var2 != null) {
            if (var10000 != var1.getClass()) {
               return false;
            }

            var10000 = var1;
         }

         KB var3;
         label65: {
            label81: {
               var3 = (KB)var10000;
               var10000 = this.X;
               if (var2 != null) {
                  if (this.X != null) {
                     var10000 = this.X;
                     if (var2 == null) {
                        break label65;
                     }

                     if (!this.X.equals(var3.X)) {
                        return false;
                     }
                     break label81;
                  }

                  var10000 = var3.X;
               }

               if (var2 == null) {
                  break label65;
               }

               if (var10000 != null) {
                  return false;
               }
            }

            var10000 = this.S;
         }

         if (var2 != null) {
            if (var10000 != null) {
               boolean var6 = this.S.equals(var3.S);
               if (var2 == null) {
                  return var6;
               }

               if (!var6) {
                  return false;
               }

               return true;
            }

            var10000 = var3.S;
         }

         return var10000 == null;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      Ky4[] var1;
      int var3;
      label25: {
         var1 = Sd2.t();
         Object var10000 = this.X;
         if (var1 != null) {
            if (this.X == null) {
               var3 = 0;
               break label25;
            }

            var10000 = this.X;
         }

         var3 = var10000.hashCode();
      }

      int var2 = var3;
      var3 = (int)a * var2;
      Object var10001 = this.S;
      if (var1 != null) {
         if (this.S == null) {
            return var3 + 0;
         }

         var10001 = this.S;
      }

      return var3 + var10001.hashCode();
   }

   @Override
   public String toString() {
      return "<" + this.X + "," + this.S + ">";
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5978068851461671251L;
      long var10002 = -6619391731778238132L ^ var0;
      byte var10001 = -1;
      a = var10002;
      j = Z(null, null);
   }
}





