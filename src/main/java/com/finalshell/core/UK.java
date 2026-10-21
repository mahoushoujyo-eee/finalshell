package com.finalshell.core;

public class UK extends Ub2 {
   public com.finalshell.ui.model.X9 N;
   public byte[] n = new byte[0];
   public static String a;
   public static long b;

   public static UK v(Ky2 var0, Tr4 var1) {
      byte[] var2 = new byte[var0.l() - var1.i() - 1];
      var0.A(var2);
      com.finalshell.ui.model.X9 var3 = com.finalshell.ui.model.X9.X(var0.c());
      byte[] var4 = new byte[var1.i()];

      try {
         var0.A(var4);
         if (!DF.K(var4, var1.h())) {
            throw new VL();
         }
      } catch (VL var5) {
         throw a(var5);
      }

      return new UK(var3, var2);
   }

   public UK(com.finalshell.ui.model.X9 var1) {
      this.N = var1;
   }

   public UK(com.finalshell.ui.model.X9 var1, byte[] var2) {
      this(var1);
      this.n = var2;
   }

   public com.finalshell.ui.model.X9 e() {
      return this.N;
   }

   public byte[] c() {
      return this.n;
   }

   public void B(byte[] var1) {
      this.n = var1;
   }

   public void m(byte[] var1) {
      this.n = DF.s(var1, var1.length);
   }

   @Override
   public Ky2 R() {
      Kk2 var2 = Kk2.v(this.n.length * 2 + (int)b);
      Tr4 var3 = new Tr4(com.finalshell.ui.model.DZ.CRC16);
      K5 var1 = new K5(this.n);
      var3.z(this.n);
      var2.A(var1.n(), 0, var1.e());
      var2.c(com.finalshell.ui.model.X9.ZDLE.r());
      var3.x(this.N.r());
      var2.c(this.N.r());
      var3.finalize();
      var1 = new K5(var3.h());
      var2.A(var1.n(), 0, var1.e());
      var2.a();
      return var2;
   }

   @Override
   public String toString() {
      return this.N + ":" + this.n.length + a;
   }

   public static VL a(VL var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0017i[0!I".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 78;
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
         var10007 = 78;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 121;
               break;
            case 1:
               var21 = 69;
               break;
            case 2:
               var21 = 108;
               break;
            case 3:
               var21 = 10;
               break;
            case 4:
               var21 = 10;
               break;
            case 5:
               var21 = 116;
               break;
            default:
               var21 = 39;
         }
      } else {
         var13 = 78;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 7762788559431115372L;
            long var12 = 2522146456435663404L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 78;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 121;
               break;
            case 1:
               var21 = 69;
               break;
            case 2:
               var21 = 108;
               break;
            case 3:
               var21 = 10;
               break;
            case 4:
               var21 = 10;
               break;
            case 5:
               var21 = 116;
               break;
            default:
               var21 = 39;
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
                  var21 = 121;
                  break;
               case 1:
                  var21 = 69;
                  break;
               case 2:
                  var21 = 108;
                  break;
               case 3:
                  var21 = 10;
                  break;
               case 4:
                  var21 = 10;
                  break;
               case 5:
                  var21 = 116;
                  break;
               default:
                  var21 = 39;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 7762788559431115372L;
               long var11 = 2522146456435663404L ^ var0;
               var6 = -1;
               b = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 121;
                  break;
               case 1:
                  var21 = 69;
                  break;
               case 2:
                  var21 = 108;
                  break;
               case 3:
                  var21 = 10;
                  break;
               case 4:
                  var21 = 10;
                  break;
               case 5:
                  var21 = 116;
                  break;
               default:
                  var21 = 39;
            }
         }
      }
   }
}





