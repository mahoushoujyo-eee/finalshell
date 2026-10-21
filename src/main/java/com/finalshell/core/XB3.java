package com.finalshell.core;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class XB3 implements CO3 {
   byte[] Q;
   byte[] N;
   byte[] v;
   byte[] r;
   byte[] C;
   byte[] t;
   byte[] H;
   byte[] Z;
   public static String a;

   @Override
   public void D(int var1) throws Exception {
      KeyPairGenerator var2 = KeyPairGenerator.getInstance(a);
      var2.initialize(var1, new SecureRandom());
      KeyPair var3 = var2.generateKeyPair();
      PublicKey var4 = var3.getPublic();
      PrivateKey var5 = var3.getPrivate();
      this.Q = ((RSAPrivateKey)var5).getPrivateExponent().toByteArray();
      this.N = ((RSAPublicKey)var4).getPublicExponent().toByteArray();
      this.v = ((RSAPrivateKey)var5).getModulus().toByteArray();
      this.r = ((RSAPrivateCrtKey)var5).getCrtCoefficient().toByteArray();
      this.C = ((RSAPrivateCrtKey)var5).getPrimeExponentP().toByteArray();
      this.t = ((RSAPrivateCrtKey)var5).getPrimeExponentQ().toByteArray();
      this.H = ((RSAPrivateCrtKey)var5).getPrimeP().toByteArray();
      this.Z = ((RSAPrivateCrtKey)var5).getPrimeQ().toByteArray();
   }

   @Override
   public byte[] S() {
      return this.Q;
   }

   @Override
   public byte[] l() {
      return this.N;
   }

   @Override
   public byte[] w() {
      return this.v;
   }

   @Override
   public byte[] g() {
      return this.r;
   }

   @Override
   public byte[] h() {
      return this.C;
   }

   @Override
   public byte[] C() {
      return this.t;
   }

   @Override
   public byte[] R() {
      return this.H;
   }

   @Override
   public byte[] M() {
      return this.Z;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = ".L~".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 10;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 10;
         var10006 = var0;
      } else {
         var6 = 10;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 10;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 118;
               break;
            case 1:
               var23 = 21;
               break;
            case 2:
               var23 = 53;
               break;
            case 3:
               var23 = 30;
               break;
            case 4:
               var23 = 1;
               break;
            case 5:
               var23 = 17;
               break;
            default:
               var23 = 109;
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





