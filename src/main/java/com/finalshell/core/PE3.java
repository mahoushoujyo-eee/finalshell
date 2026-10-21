package com.finalshell.core;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class PE3 {
   final ArrayList Q;
   final int h;
   final int L;
   final int Y;

   public PE3(ArrayList var1, int var2, int var3, int var4) {
      this.Q = new ArrayList(var1);
      this.h = var2;
      this.L = var3;
      this.Y = var4;
   }

   @NotNull
   public String O() {
      String var1;
      StringBuilder var2;
      label37: {
         String var10000 = Dx4.g();
         var2 = new StringBuilder();
         var1 = var10000;
         int var7 = this.Q.size();
         if (var1 == null) {
            if (var7 > 1) {
               KB var3 = KB.Z(this.h, ((Ko2)this.Q.get(0)).G.length());
               var2.append((CharSequence)((Ko2)this.Q.get(0)).G.D(var3));
               if (var1 == null) {
                  break label37;
               }
            }

            var7 = this.h;
         }

         KB var4 = KB.Z(var7, this.L + 1);
         var2.append((CharSequence)((Ko2)this.Q.get(0)).G.D(var4));
      }

      int var5 = 1;

      while (true) {
         if (var5 < this.Q.size() - 1) {
            var2.append((CharSequence)((Ko2)this.Q.get(var5)).G);
            var5++;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         int var8 = this.Q.size();
         if (var1 == null) {
            if (var8 <= 1) {
               break;
            }

            var8 = 0;
         }

         KB var6 = KB.Z(var8, this.L + 1);
         var2.append((CharSequence)((Ko2)this.Q.get(this.Q.size() - 1)).G.D(var6));
         break;
      }

      return var2.toString();
   }

   @Override
   public String toString() {
      return this.O();
   }

   public int A() {
      return this.Y;
   }

   public XE s() {
      return new XE(((Ko2)this.Q.get(0)).v + this.h, ((Ko2)this.Q.get(0)).E);
   }

   public XE E() {
      return new XE(((Ko2)this.Q.get(this.Q.size() - 1)).v + this.L, ((Ko2)this.Q.get(this.Q.size() - 1)).E);
   }

   PE3(ArrayList var1, int var2, int var3, int var4, L7 var5) {
      this(var1, var2, var3, var4);
   }
}





