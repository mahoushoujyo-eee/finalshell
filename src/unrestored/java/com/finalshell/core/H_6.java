package com.finalshell.core;

import java.io.InputStream;
import java.security.AccessControlException;
import java.util.Collections;
import java.util.Map;

public class H_6 extends ClassLoader {
   public final Map T;
   public Map y = Collections.emptyMap();
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public H_6(Map var1) {
      this.T = var1;
   }

   public H_6(Map var1, ClassLoader var2) {
      super(var2);
      this.T = var1;
   }

   public void H(Map var1) {
      this.y = var1;
   }

   @Override
   public java.lang.Class findClass(@C_9 String param1) throws ClassNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D_8.q ()[I
      // 03: astore 2
      // 04: getstatic com/finalshell/core/H_6.W Z
      // 07: ifne 2c
      // 0a: aload 1
      // 0b: aload 2
      // 0c: ifnonnull 36
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/H_6.a (Ljava/security/AccessControlException;)Ljava/security/AccessControlException;
      // 15: athrow
      // 16: ifnonnull 2c
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/H_6.a (Ljava/security/AccessControlException;)Ljava/security/AccessControlException;
      // 1f: athrow
      // 20: new java/lang/AssertionError
      // 23: dup
      // 24: invokespecial java/lang/AssertionError.<init> ()V
      // 27: athrow
      // 28: invokestatic com/finalshell/core/H_6.a (Ljava/security/AccessControlException;)Ljava/security/AccessControlException;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/H_6.T Ljava/util/Map;
      // 30: aload 1
      // 31: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 36: checkcast [B
      // 39: astore 3
      // 3a: aload 3
      // 3b: aload 2
      // 3c: ifnonnull 8b
      // 3f: ifnonnull 9b
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/H_6.a (Ljava/security/AccessControlException;)Ljava/security/AccessControlException;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 2
      // 4b: ifnonnull 9c
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/H_6.a (Ljava/security/AccessControlException;)Ljava/security/AccessControlException;
      // 54: athrow
      // 55: getfield com/finalshell/core/H_6.T Ljava/util/Map;
      // 58: new java/lang/StringBuilder
      // 5b: dup
      // 5c: invokespecial java/lang/StringBuilder.<init> ()V
      // 5f: aload 1
      // 60: sipush 3414
      // 63: ldc2_w 5971586045051774321
      // 66: invokestatic com/finalshell/core/H_6.a (IJ)I
      // 69: sipush 19625
      // 6c: ldc2_w 5800405406072661135
      // 6f: invokestatic com/finalshell/core/H_6.a (IJ)I
      // 72: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 75: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 78: getstatic com/finalshell/core/H_6.a Ljava/lang/String;
      // 7b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 81: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 86: checkcast [B
      // 89: astore 3
      // 8a: aload 3
      // 8b: ifnonnull 9b
      // 8e: new java/lang/ClassNotFoundException
      // 91: dup
      // 92: aload 1
      // 93: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;)V
      // 96: athrow
      // 97: invokestatic com/finalshell/core/H_6.a (Ljava/security/AccessControlException;)Ljava/security/AccessControlException;
      // 9a: athrow
      // 9b: aload 0
      // 9c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 9f: invokevirtual java/lang/Class.getProtectionDomain ()Ljava/security/ProtectionDomain;
      // a2: astore 4
      // a4: goto ac
      // a7: astore 5
      // a9: aconst_null
      // aa: astore 4
      // ac: aload 0
      // ad: aload 1
      // ae: aload 3
      // af: bipush 0
      // b0: aload 3
      // b1: arraylength
      // b2: aload 4
      // b4: invokespecial java/lang/ClassLoader.defineClass (Ljava/lang/String;[BIILjava/security/ProtectionDomain;)Ljava/lang/Class;
      // b7: areturn
   }

   @Override
   public InputStream getResourceAsStream(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D_8.q ()[I
      // 03: aload 0
      // 04: aload 1
      // 05: invokespecial java/lang/ClassLoader.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 08: astore 3
      // 09: astore 2
      // 0a: aload 3
      // 0b: aload 2
      // 0c: ifnonnull 29
      // 0f: ifnull 1f
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/H_6.a (Ljava/security/AccessControlException;)Ljava/security/AccessControlException;
      // 18: athrow
      // 19: aload 3
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/H_6.a (Ljava/security/AccessControlException;)Ljava/security/AccessControlException;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield com/finalshell/core/H_6.y Ljava/util/Map;
      // 23: aload 1
      // 24: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 29: checkcast [B
      // 2c: astore 4
      // 2e: aload 4
      // 30: ifnonnull 3b
      // 33: aconst_null
      // 34: goto 44
      // 37: invokestatic com/finalshell/core/H_6.a (Ljava/security/AccessControlException;)Ljava/security/AccessControlException;
      // 3a: athrow
      // 3b: new java/io/ByteArrayInputStream
      // 3e: dup
      // 3f: aload 4
      // 41: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
      // 44: areturn
   }

   static {
      __vfClinit__();
   }

   public static AccessControlException a(AccessControlException var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10279;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      boolean W;
      char[] var10003 = "EKoou\u0003".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var28 = 126;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var34;
      byte var40;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var34 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 126;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var40 = 21;
               break;
            case 1:
               var40 = 86;
               break;
            case 2:
               var40 = 125;
               break;
            case 3:
               var40 = 112;
               break;
            case 4:
               var40 = 120;
               break;
            case 5:
               var40 = 14;
               break;
            default:
               var40 = 92;
         }
      } else {
         var28 = 126;
         var19 = var10004;
         if (var10004 <= var8) {
            String var32 = new String(var10003).intern();
            int var24 = -1;
            a = var32;
            long var11 = 8275381478105837456L;
            long[] var16 = new long[2];
            int var13 = 0;
            String var14 = "\u0014ãQÚ\u0087¥ÊÏ¸8\u0080\u009b!o\u000b0";
            int var15 = "\u0014ãQÚ\u0087¥ÊÏ¸8\u0080\u009b!o\u000b0".length();
            byte var12 = 0;

            do {
               var24 = var12;
               var12 += 8;
               byte[] var17 = var14.substring(var24, var12).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               var24 = var13++;
               long var38 = (
                     ((long)var17[0] & 255L) << 56
                        | ((long)var17[1] & 255L) << 48
                        | ((long)var17[2] & 255L) << 40
                        | ((long)var17[3] & 255L) << 32
                        | ((long)var17[4] & 255L) << 24
                        | ((long)var17[5] & 255L) << 16
                        | ((long)var17[6] & 255L) << 8
                        | (long)var17[7] & 255L
                  )
                  ^ var11;
               byte var33 = -1;
               var16[var24] = var38;
            } while (var12 < var15);

            b = var16;
            c = new Integer[2];

            boolean var18;
            label85: {
               try {
                  if (!H_6.class.desiredAssertionStatus()) {
                     var18 = true;
                     break label85;
                  }
               } catch (AccessControlException var10) {
                  throw new RuntimeException(a(var10));
               }

               var18 = false;
            }

            W = var18;
            return;
         }

         var34 = var10003;
         var10005 = var8;
         char var41 = var10003[var8];
         var10007 = 126;
         var10006 = var41;
         switch (var8 % 7) {
            case 0:
               var40 = 21;
               break;
            case 1:
               var40 = 86;
               break;
            case 2:
               var40 = 125;
               break;
            case 3:
               var40 = 112;
               break;
            case 4:
               var40 = 120;
               break;
            case 5:
               var40 = 14;
               break;
            default:
               var40 = 92;
         }
      }

      while (true) {
         var34[var10005] = (char)(var10006 ^ var10007 ^ var40);
         var8++;
         if (var28 == 0) {
            var34 = var10002;
            var10005 = var28;
            char var43 = var10002[var28];
            var10007 = var28;
            var10006 = var43;
            switch (var8 % 7) {
               case 0:
                  var40 = 21;
                  break;
               case 1:
                  var40 = 86;
                  break;
               case 2:
                  var40 = 125;
                  break;
               case 3:
                  var40 = 112;
                  break;
               case 4:
                  var40 = 120;
                  break;
               case 5:
                  var40 = 14;
                  break;
               default:
                  var40 = 92;
            }
         } else {
            if (var19 <= var8) {
               String var30 = new String(var10002).intern();
               int var21 = -1;
               a = var30;
               long var0 = 8275381478105837456L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "\u0014ãQÚ\u0087¥ÊÏ¸8\u0080\u009b!o\u000b0";
               int var5 = "\u0014ãQÚ\u0087¥ÊÏ¸8\u0080\u009b!o\u000b0".length();
               byte var2 = 0;

               do {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var21 = var3++;
                  long var37 = (
                        ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L
                     )
                     ^ var0;
                  byte var31 = -1;
                  var6[var21] = var37;
               } while (var2 < var5);

               b = var6;
               c = new Integer[2];

               boolean var10000;
               label38: {
                  try {
                     if (!H_6.class.desiredAssertionStatus()) {
                        var10000 = true;
                        break label38;
                     }
                  } catch (AccessControlException var9) {
                     throw new RuntimeException(a(var9));
                  }

                  var10000 = false;
               }

               W = var10000;
               return;
            }

            var34 = var10002;
            var10005 = var8;
            char var42 = var10002[var8];
            var10007 = var28;
            var10006 = var42;
            switch (var8 % 7) {
               case 0:
                  var40 = 21;
                  break;
               case 1:
                  var40 = 86;
                  break;
               case 2:
                  var40 = 125;
                  break;
               case 3:
                  var40 = 112;
                  break;
               case 4:
                  var40 = 120;
                  break;
               case 5:
                  var40 = 14;
                  break;
               default:
                  var40 = 92;
            }
         }
      }
   }
}





