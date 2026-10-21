package com;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.DSAKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;

public class Pw_2 implements NN {
   byte[] p;
   byte[] f;
   byte[] N;
   byte[] h;
   byte[] T;
   private static final String a;

   @Override
   public void E(int var1) throws Exception {
      KeyPairGenerator var2 = KeyPairGenerator.getInstance(a);
      var2.initialize(var1, new SecureRandom());
      KeyPair var3 = var2.generateKeyPair();
      PublicKey var4 = var3.getPublic();
      PrivateKey var5 = var3.getPrivate();
      this.p = ((DSAPrivateKey)var5).getX().toByteArray();
      this.f = ((DSAPublicKey)var4).getY().toByteArray();
      DSAParams var6 = ((DSAKey)var5).getParams();
      this.N = var6.getP().toByteArray();
      this.h = var6.getQ().toByteArray();
      this.T = var6.getG().toByteArray();
   }

   @Override
   public byte[] r() {
      return this.p;
   }

   @Override
   public byte[] Z() {
      return this.f;
   }

   @Override
   public byte[] I() {
      return this.N;
   }

   @Override
   public byte[] P() {
      return this.h;
   }

   @Override
   public byte[] z() {
      return this.T;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "1E^".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 30;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 30;
         var10006 = var0;
      } else {
         var6 = 30;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 30;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 107;
               break;
            case 1:
               var23 = 8;
               break;
            case 2:
               var23 = 1;
               break;
            case 3:
               var23 = 117;
               break;
            case 4:
               var23 = 87;
               break;
            case 5:
               var23 = 5;
               break;
            default:
               var23 = 27;
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





