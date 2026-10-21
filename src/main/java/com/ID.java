package com;

import org.bouncycastle.crypto.generators.SCrypt;

public class ID implements com.Qb_2 {
   private Class A;
   private byte[] P;
   private int x;
   private int s;
   private int C;
   private static final String a;

   @Override
   public void k(byte[] var1, int var2, int var3, int var4) throws Exception {
      try {
         this.A = SCrypt.class;
         this.P = var1;
         this.x = var2;
         this.s = var3;
         this.C = var4;
      } catch (NoClassDefFoundError var6) {
         throw new Pc_2(a, var6);
      }
   }

   @Override
   public byte[] m(byte[] var1, int var2) {
      return SCrypt.generate(var1, this.P, this.x, this.s, this.C, var2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "8\u007f\u0018\u0015\u0013w\u0018>r\u000b\u001a\u0002jT*~\u0006\t".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 49;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 49;
         var10006 = var0;
      } else {
         var6 = 49;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 49;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 122;
               break;
            case 1:
               var23 = 45;
               break;
            case 2:
               var23 = 91;
               break;
            case 3:
               var23 = 93;
               break;
            case 4:
               var23 = 82;
               break;
            case 5:
               var23 = 50;
               break;
            default:
               var23 = 9;
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





