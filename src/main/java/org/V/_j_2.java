package org.v;

import org.I;

public class _j_2 extends _D implements RW, f2 {
   private static final String f;
   private static final long i;

   public _j_2(I var1, @org.F.c String var2, fu_2[] var3, String var4, @org.F.c _U[] var5, @org.F.c Nt_2 var6, Nt_2[] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public _S Q() {
      return RG.N(this.D());
   }

   @Override
   public void C(K_2 var1) {
      this.r(var1);
   }

   @Override
   public K_2 H() {
      return (K_2)this.y();
   }

   @Override
   public String R() {
      return this.H().R() + (int)i + this.j();
   }

   @org.F.c
   @Override
   public Object J(fq_2 var1) throws Throwable {
      return var1.M(this);
   }

   @org.F.c
   @Override
   public Object i(hL var1) throws Throwable {
      return var1.F(this);
   }

   public boolean D() {
      return RG.G(this.D(), new String[]{f});
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "]\u0017b5\u001a\u0006".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 127;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 127;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 81;
               break;
            case 1:
               var21 = 28;
               break;
            case 2:
               var21 = 124;
               break;
            case 3:
               var21 = 62;
               break;
            case 4:
               var21 = 12;
               break;
            case 5:
               var21 = 26;
               break;
            default:
               var21 = 26;
         }
      } else {
         var13 = 127;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            f = var16;
            long var3 = 2835915388319133265L;
            long var12 = -1848319168972886411L ^ var3;
            var8 = -1;
            i = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 127;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 81;
               break;
            case 1:
               var21 = 28;
               break;
            case 2:
               var21 = 124;
               break;
            case 3:
               var21 = 62;
               break;
            case 4:
               var21 = 12;
               break;
            case 5:
               var21 = 26;
               break;
            default:
               var21 = 26;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 81;
                  break;
               case 1:
                  var21 = 28;
                  break;
               case 2:
                  var21 = 124;
                  break;
               case 3:
                  var21 = 62;
                  break;
               case 4:
                  var21 = 12;
                  break;
               case 5:
                  var21 = 26;
                  break;
               default:
                  var21 = 26;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               f = var15;
               long var0 = 2835915388319133265L;
               long var11 = -1848319168972886411L ^ var0;
               var6 = -1;
               i = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 81;
                  break;
               case 1:
                  var21 = 28;
                  break;
               case 2:
                  var21 = 124;
                  break;
               case 3:
                  var21 = 62;
                  break;
               case 4:
                  var21 = 12;
                  break;
               case 5:
                  var21 = 26;
                  break;
               default:
                  var21 = 26;
            }
         }
      }
   }
}





