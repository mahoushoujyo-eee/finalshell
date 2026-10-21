package com.finalshell.core;

import org.bouncycastle.crypto.digests.RIPEMD160Digest;

public class K4 extends KF {
   public static String G;
   public static String b;
   public static long e;

   public K4() {
      this.Z = b;
      this.N = (int)e;
      this.M = new RIPEMD160Digest();
   }

   @Override
   public boolean P() {
      return super.P();
   }

   @Override
   public String k() {
      return super.k();
   }

   @Override
   public void U(byte[] var1, int var2) {
      super.U(var1, var2);
   }

   @Override
   public void o(byte[] var1, int var2, int var3) {
      super.o(var1, var2, var3);
   }

   @Override
   public void H(int var1) {
      super.H(var1);
   }

   @Override
   public void L(byte[] var1) throws Exception {
      super.L(var1);
   }

   @Override
   public int h() {
      return super.h();
   }

   public static void Y(String var0) {
      G = var0;
   }

   public static String z() {
      return G;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (z() != null) {
         Y("D4nod");
      }

      char[] var10003 = "\u000fA|=Vl+\u0017Ip:J(r".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 85;
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
         var10007 = 85;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 50;
               break;
            case 1:
               var21 = 121;
               break;
            case 2:
               var21 = 72;
               break;
            case 3:
               var21 = 11;
               break;
            case 4:
               var21 = 46;
               break;
            case 5:
               var21 = 75;
               break;
            default:
               var21 = 23;
         }
      } else {
         var13 = 85;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            b = var16;
            long var3 = 8283999924223748808L;
            long var12 = 3970515611166452444L ^ var3;
            var8 = -1;
            e = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 85;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 50;
               break;
            case 1:
               var21 = 121;
               break;
            case 2:
               var21 = 72;
               break;
            case 3:
               var21 = 11;
               break;
            case 4:
               var21 = 46;
               break;
            case 5:
               var21 = 75;
               break;
            default:
               var21 = 23;
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
                  var21 = 50;
                  break;
               case 1:
                  var21 = 121;
                  break;
               case 2:
                  var21 = 72;
                  break;
               case 3:
                  var21 = 11;
                  break;
               case 4:
                  var21 = 46;
                  break;
               case 5:
                  var21 = 75;
                  break;
               default:
                  var21 = 23;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               b = var15;
               long var0 = 8283999924223748808L;
               long var11 = 3970515611166452444L ^ var0;
               var6 = -1;
               e = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 50;
                  break;
               case 1:
                  var21 = 121;
                  break;
               case 2:
                  var21 = 72;
                  break;
               case 3:
                  var21 = 11;
                  break;
               case 4:
                  var21 = 46;
                  break;
               case 5:
                  var21 = 75;
                  break;
               default:
                  var21 = 23;
            }
         }
      }
   }
}





