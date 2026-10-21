package org.v;

import org.I;

public class _E extends _D implements _9 {
   private static final String i;
   private static final long n;

   public _E(I var1, @org.F.c String var2, fu_2[] var3, String var4, @org.F.c _U[] var5, @org.F.c Nt_2 var6, Nt_2[] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void l(RD var1) {
      this.r(var1);
   }

   @Override
   public RD U() {
      return (RD)this.y();
   }

   @Override
   public _S Z() {
      return RG.N(this.D());
   }

   @Override
   public String R() {
      String var1 = this.j();
      RD var2 = (RD)this.y();
      Rs_2 var3 = var2.V;
      if (var3 != null) {
         var1 = var3.E + (int)n + var1;
      }

      return var1;
   }

   @org.F.c
   @Override
   public Object J(fq_2 var1) throws Throwable {
      return var1.y(this);
   }

   public boolean F() {
      return RG.G(this.D(), new String[]{i});
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u001c6\u00118oU".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 55;
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
         var10007 = 55;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 88;
               break;
            case 1:
               var21 = 117;
               break;
            case 2:
               var21 = 71;
               break;
            case 3:
               var21 = 123;
               break;
            case 4:
               var21 = 49;
               break;
            case 5:
               var21 = 1;
               break;
            default:
               var21 = 29;
         }
      } else {
         var13 = 55;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            i = var16;
            long var3 = 820353087823397019L;
            long var12 = -8273272604109061963L ^ var3;
            var8 = -1;
            n = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 55;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 88;
               break;
            case 1:
               var21 = 117;
               break;
            case 2:
               var21 = 71;
               break;
            case 3:
               var21 = 123;
               break;
            case 4:
               var21 = 49;
               break;
            case 5:
               var21 = 1;
               break;
            default:
               var21 = 29;
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
                  var21 = 88;
                  break;
               case 1:
                  var21 = 117;
                  break;
               case 2:
                  var21 = 71;
                  break;
               case 3:
                  var21 = 123;
                  break;
               case 4:
                  var21 = 49;
                  break;
               case 5:
                  var21 = 1;
                  break;
               default:
                  var21 = 29;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               i = var15;
               long var0 = 820353087823397019L;
               long var11 = -8273272604109061963L ^ var0;
               var6 = -1;
               n = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 88;
                  break;
               case 1:
                  var21 = 117;
                  break;
               case 2:
                  var21 = 71;
                  break;
               case 3:
                  var21 = 123;
                  break;
               case 4:
                  var21 = 49;
                  break;
               case 5:
                  var21 = 1;
                  break;
               default:
                  var21 = 29;
            }
         }
      }
   }
}





