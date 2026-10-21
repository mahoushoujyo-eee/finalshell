package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

class Bf_2 implements Iterable {
   private final List D = new ArrayList();
   private int e = 0;

   private Bf_2() {
   }

   public void n(com.lu_4 var1) {
      boolean var2 = j_2.g();
      boolean var10000 = var1.v().Y();
      label34:
      if (var2) {
         if (!var10000) {
            for (com.lu_4 var4 : this.D) {
               label27: {
                  j_2 var5 = var4.v();
                  if (var2) {
                     var10000 = var5.Y();
                     if (!var2) {
                        break label34;
                     }

                     if (!var10000) {
                        break label27;
                     }

                     var5 = var4.v();
                  }

                  var5.D();
               }

               if (!var2) {
                  break;
               }
            }
         }

         this.D.add(var1);
      }

      this.e = this.e + var1.s();
   }

   private List m() {
      return this.D;
   }

   @NotNull
   @Override
   public Iterator iterator() {
      return this.D.iterator();
   }

   public int o() {
      return this.e;
   }

   public void e() {
      this.D.clear();
      this.e = 0;
   }

   Bf_2(com.B2 var1) {
      this();
   }

   static int h(com.Bf_2 var0) {
      return var0.e;
   }

   static List T(com.Bf_2 var0) {
      return var0.m();
   }

   static List I(com.Bf_2 var0) {
      return var0.D;
   }
}





