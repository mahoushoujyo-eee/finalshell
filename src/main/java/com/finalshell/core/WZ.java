package com.finalshell.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class WZ {
   public final List o = new ArrayList();
   public final Map r = new HashMap();
   public int B = 0;
   public static String a;

   public List E(com.finalshell.ui.model.J2 var1) {
      String var2 = Dx4.g();
      Object var10000 = var1;
      if (var2 == null) {
         if (var1 instanceof com.finalshell.ui.model.Q2) {
            com.finalshell.ui.model.Q2 var3 = (com.finalshell.ui.model.Q2)var1;
            List var4 = (List)this.r.get(var3.V());
            if (var4 == null) {
               return null;
            }

            ArrayList var5 = new ArrayList();

            for (KB var7 : var4) {
               KB var8 = this.B(var7, var3.p(), var3.p() + var3.length());
               if (var8 != null) {
                  var5.add(KB.Z((Integer)var8.X - var3.p(), (Integer)var8.S - var3.p()));
               }

               if (var2 != null) {
                  break;
               }
            }

            return var5;
         }

         var10000 = this.r.get(var1);
      }

      return (List)var10000;
   }

   @Nullable
   public KB B(@NotNull KB var1, int var2, int var3) {
      int var5 = Math.max((Integer)var1.X, var2);
      String var10000 = Dx4.g();
      int var6 = Math.min((Integer)var1.S, var3);
      String var4 = var10000;
      int var7 = var5;
      if (var4 == null) {
         if (var5 >= var6) {
            return null;
         }

         var7 = var5;
      }

      return KB.Z(var7, var6);
   }

   public void I(ArrayList var1, int var2, int var3) {
      String var4;
      label37: {
         var4 = Dx4.g();
         int var10000 = var1.size();
         if (var4 == null) {
            if (var10000 > 1) {
               KB var5 = KB.Z(var2, ((Ko2)var1.get(0)).G.length());
               this.Z(((Ko2)var1.get(0)).G, var5);
               if (var4 == null) {
                  break label37;
               }
            }

            var10000 = var2;
         }

         KB var6 = KB.Z(var10000, var3 + 1);
         this.Z(((Ko2)var1.get(0)).G, var6);
      }

      int var7 = 1;

      while (true) {
         if (var7 < var1.size() - 1) {
            this.Z(((Ko2)var1.get(var7)).G, KB.Z(0, ((Ko2)var1.get(var7)).G.length()));
            var7++;
            if (var4 != null) {
               break;
            }

            if (var4 == null) {
               continue;
            }
         }

         int var9 = var1.size();
         if (var4 == null) {
            if (var9 > 1) {
               KB var8 = KB.Z(0, var3 + 1);
               this.Z(((Ko2)var1.get(var1.size() - 1)).G, var8);
            }

            this.o.add(new PE3(var1, var2, var3, this.o.size() + 1, null));
         }
         break;
      }
   }

   public void Z(com.finalshell.ui.model.J2 var1, KB var2) {
      String var3 = Dx4.g();
      Map var10000 = this.r;
      com.finalshell.ui.model.J2 var10001 = var1;
      if (var3 == null) {
         if (this.r.containsKey(var1)) {
            ((List)this.r.get(var1)).add(var2);
            if (var3 == null) {
               return;
            }
         }

         var10000 = this.r;
         var10001 = var1;
      }

      var10000.put(var10001, new ArrayList<>(List.of(var2)));
   }

   @NotNull
   public List B() {
      return this.o;
   }

   @NotNull
   public PE3 G() {
      this.q();
      return (PE3)this.o.get(this.B);
   }

   @NotNull
   public PE3 T() {
      this.q();
      this.B = (this.B + 1) % this.o.size();
      return this.G();
   }

   @NotNull
   public PE3 U() {
      this.q();
      this.B = (this.B + this.o.size() - 1) % this.o.size();
      return this.G();
   }

   public void q() {
      if (this.o.isEmpty()) {
         throw new AssertionError(a);
      }
   }

   public void Y() {
      this.r.clear();
      this.o.clear();
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "V`y\f\u0012\nIk".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 123;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 123;
         var10006 = var0;
      } else {
         var6 = 123;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 123;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 99;
               break;
            case 1:
               var23 = 116;
               break;
            case 2:
               var23 = 34;
               break;
            case 3:
               var23 = 30;
               break;
            case 4:
               var23 = 29;
               break;
            case 5:
               var23 = 20;
               break;
            default:
               var23 = 95;
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





