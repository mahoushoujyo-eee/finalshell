package com.finalshell.ui.model;

import com.finalshell.core.Lu4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class Bf2 implements Iterable {
   public final List D = new ArrayList();
   public int e = 0;

   public Bf2() {
   }

   public void n(Lu4 var1) {
      boolean var2 = J2.g();
      boolean var10000 = var1.v().Y();
      label34:
      if (var2) {
         if (!var10000) {
            for (Lu4 var4 : this.D) {
               label27: {
                  J2 var5 = var4.v();
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

   public List m() {
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

   Bf2(com.finalshell.core.B2_2 var1) {
      this();
   }

   static int h(Bf2 var0) {
      return var0.e;
   }

   static List T(Bf2 var0) {
      return var0.m();
   }

   static List I(Bf2 var0) {
      return var0.D;
   }
}





