package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.ArrayList;

public class ND_2 {
   public ArrayList I = new ArrayList();
   public A6 F;
   public B22 k;
   public static String a;

   public void D(A6 var1) {
      this.I.add(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void X(Bc2 var1) {
      A6 var12;
      B22 var3 = new B22();
      Ky4[] var10000 = A6.P();
      var3.t = 0;
      var3.g = 1.0F;
      Ky4[] var2 = var10000;
      if (var2 == null) {
         this.k = var3;
      } else {
         if (this.I.size() > 0) {
            label38: {
               A6 var4 = (A6)this.I.get(0);
               B22 var5 = var4.g;
               var3.t = var3.t + var5.t;
               var3.g = var3.g * var5.g;
               int var6 = 0;
               if (var2 == null) {
                  var12 = (A6)this.I.get(var6);
               } else if (var6 >= this.I.size() - 1) {
                  var12 = (A6)this.I.get(this.I.size() - 1);
                  if (var2 != null) {
                     break label38;
                  }
               } else {
                  var12 = (A6)this.I.get(var6);
               }

               while (true) {
                  A6 var7 = var12;
                  A6 var8 = (A6)this.I.get(var6 + 1);
                  B22 var9 = var1.q(var7.m, var8.m);
                  var3.t = var3.t + var9.t;
                  var3.g = var3.g * var9.g;
                  if (++var6 >= this.I.size() - 1) {
                     var12 = (A6)this.I.get(this.I.size() - 1);
                     if (var2 != null) {
                        break;
                     }
                  } else {
                     var12 = (A6)this.I.get(var6);
                  }
               }
            }

            A6 var10 = var12;
            this.I.size();
            B22 var11 = var1.q(var10.m, this.F.m);
            if (var2 == null) {
               return;
            }

            if (!var10.B.equals(this.F.B) && !var10.j.equals(this.F.j)) {
               var3.t = var3.t + var11.t;
               var3.g = var3.g * var11.g;
            }
         }

         this.k = var3;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public String toString() {
      String var2 = "";
      Ky4[] var10000 = A6.P();
      int var3 = 0;
      Ky4[] var1 = var10000;
      if (var1 == null) {
         var10000 = (Ky4[])this.I.get(var3);
      } else if (var3 >= this.I.size()) {
         var10000 = (Ky4[])(var2);
         if (var1 != null) {
            return var2;
         }
      } else {
         var10000 = (Ky4[])this.I.get(var3);
      }

      while (true) {
         A6 var4 = (A6)var10000;
         var2 = var2 + var4.B + a;
         if (++var3 >= this.I.size()) {
            var10000 = (Ky4[])(var2);
            if (var1 != null) {
               return var2;
            }
         } else {
            var10000 = (Ky4[])this.I.get(var3);
         }
      }
   }

   public B22 B() {
      return this.k;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "@V".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 18;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 18;
         var10006 = var0;
      } else {
         var6 = 18;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 18;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 127;
               break;
            case 1:
               var23 = 122;
               break;
            case 2:
               var23 = 47;
               break;
            case 3:
               var23 = 123;
               break;
            case 4:
               var23 = 112;
               break;
            case 5:
               var23 = 8;
               break;
            default:
               var23 = 21;
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





