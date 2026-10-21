package com;

import java.util.HashSet;
import java.util.Set;

public class Qy_2 implements com.cW_3 {
   private final Class x;
   private final Set k;
   private final Set t;
   private int Z;

   public Qy_2(String[] var1) {
      this(null, var1);
   }

   public Qy_2(Class var1, String[] var2) {
      String var10000 = nv_4.o();
      super();
      String var3 = var10000;
      this.k = new HashSet();
      this.t = new HashSet();
      this.Z = 0;
      this.x = var1;
      String[] var4 = var2;
      int var5 = var2.length;
      int var6 = 0;

      while (var6 < var5) {
         String var7 = var4[var6];
         if (var3 != null) {
            if (var7 != null) {
               this.k.add(var7);
            }

            var6++;
         }

         if (var3 == null) {
            break;
         }
      }
   }

   public int T() {
      return this.Z;
   }

   public void i(int var1) {
      this.Z = var1;
   }

   public Class g() {
      return this.x;
   }

   public Set K() {
      return this.k;
   }

   public Set v() {
      return this.t;
   }

   @Override
   public boolean G(nL_3 var1, Object var2, String var3) {
      String var4 = nv_4.o();
      if (var2 == null) {
         return true;
      } else {
         int var7;
         label73: {
            com.Qy_2 var10000 = this;
            if (var4 != null) {
               if (this.x != null) {
                  var7 = this.x.isInstance(var2);
                  if (var4 == null) {
                     break label73;
                  }

                  if (var7 == 0) {
                     return true;
                  }
               }

               var10000 = this;
            }

            var7 = var10000.t.contains(var3);
         }

         if (var4 != null) {
            if (var7 != 0) {
               return false;
            }

            var7 = this.Z;
         }

         label64:
         if (var4 != null) {
            if (var7 > 0) {
               int var5 = 0;
               uh_2 var6 = var1.W;

               while (var6 != null) {
                  var5++;
                  if (var4 != null) {
                     var7 = var5;
                     if (var4 == null) {
                        break label64;
                     }

                     if (var5 > this.Z) {
                        return false;
                     }

                     var6 = var6.M;
                  }

                  if (var4 == null) {
                     break;
                  }
               }
            }

            var7 = this.k.size();
         }

         if (var4 != null) {
            if (var7 != 0) {
               byte var8 = this.k.contains(var3);
               if (var4 == null) {
                  return (boolean)var8;
               }

               if (var8 == 0) {
                  return (boolean)0;
               }
            }

            var7 = 1;
         }

         return (boolean)var7;
      }
   }
}





