package com;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class Nj_2 {
   public static final String l;
   public static final boolean S;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   public static boolean m(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnonnull 0a
      // 04: bipush 0
      // 05: ireturn
      // 06: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09: athrow
      // 0a: aload 0
      // 0b: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 0e: astore 1
      // 0f: aload 1
      // 10: sipush 26320
      // 13: sipush 20300
      // 16: invokestatic com/Nj_2.a (II)Ljava/lang/String;
      // 19: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1c: ifne 36
      // 1f: aload 1
      // 20: sipush 26326
      // 23: sipush -10070
      // 26: invokestatic com/Nj_2.a (II)Ljava/lang/String;
      // 29: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 2c: ifeq 3e
      // 2f: goto 36
      // 32: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: bipush 1
      // 37: goto 3f
      // 3a: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: bipush 0
      // 3f: ireturn
   }

   public static String y(Method var0) {
      Class[] var2 = var0.getParameterTypes();
      int var10000 = Ph_2.w();
      StringBuilder var3 = new StringBuilder(var2.length + 1 << 4);
      var3.append((char)a(9304, 103282200219751570L));
      int var1 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var2.length) {
            try {
               var3.append(M(var2[var4]));
               var4++;
               if (var1 == 0) {
                  break;
               }

               if (var1 != 0) {
                  continue;
               }
            } catch (IllegalStateException var5) {
               throw a(var5);
            }
         }

         var3.append((char)a(29085, 2656782158504575316L));
         var3.append(M(var0.getReturnType()));
         break;
      }

      return var3.toString();
   }

   public static String M(Class var0) {
      try {
         if (var0.isPrimitive()) {
            return v(var0);
         }
      } catch (IllegalStateException var1) {
         throw a(var1);
      }

      try {
         if (var0.isArray()) {
            return "[" + M(var0.getComponentType());
         }
      } catch (IllegalStateException var2) {
         throw a(var2);
      }

      return "L" + k(var0) + ";";
   }

   public static String k(Class var0) {
      try {
         if (var0.isArray()) {
            return "[" + M(var0.getComponentType());
         }
      } catch (IllegalStateException var2) {
         throw a(var2);
      }

      if (!var0.isPrimitive()) {
         String var1 = var0.getName();
         return var1.replace((char)a(4234, 8744888189223182402L), (char)a(4882, 5012355853772596190L));
      } else {
         return v(var0);
      }
   }

   public static String v(Class var0) {
      try {
         if (int.class == var0) {
            return "I";
         }
      } catch (IllegalStateException var9) {
         throw a(var9);
      }

      try {
         if (void.class == var0) {
            return "V";
         }
      } catch (IllegalStateException var4) {
         throw a(var4);
      }

      try {
         if (boolean.class == var0) {
            return "Z";
         }
      } catch (IllegalStateException var8) {
         throw a(var8);
      }

      try {
         if (char.class == var0) {
            return "C";
         }
      } catch (IllegalStateException var3) {
         throw a(var3);
      }

      try {
         if (byte.class == var0) {
            return "B";
         }
      } catch (IllegalStateException var7) {
         throw a(var7);
      }

      try {
         if (short.class == var0) {
            return "S";
         }
      } catch (IllegalStateException var2) {
         throw a(var2);
      }

      try {
         if (float.class == var0) {
            return "F";
         }
      } catch (IllegalStateException var6) {
         throw a(var6);
      }

      try {
         if (long.class == var0) {
            return "J";
         }
      } catch (IllegalStateException var1) {
         throw a(var1);
      }

      try {
         if (double.class == var0) {
            return "D";
         }
      } catch (IllegalStateException var5) {
         throw a(var5);
      }

      throw new IllegalStateException(a(26322, -15682) + var0.getCanonicalName() + a(26321, -29954));
   }

   public static Type G(Class var0, String var1) {
      try {
         Method var2 = var0.getMethod(var1);
         return var2.getGenericReturnType();
      } catch (Exception var3) {
         return null;
      }
   }

   public static boolean J(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Ph_2.u ()I
      // 03: bipush 0
      // 04: istore 2
      // 05: istore 1
      // 06: iload 2
      // 07: aload 0
      // 08: invokevirtual java/lang/String.length ()I
      // 0b: if_icmpge 7d
      // 0e: aload 0
      // 0f: iload 2
      // 10: invokevirtual java/lang/String.charAt (I)C
      // 13: istore 3
      // 14: iload 3
      // 15: iload 1
      // 16: ifne 7e
      // 19: iload 1
      // 1a: ifne 75
      // 1d: goto 24
      // 20: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: bipush 1
      // 25: if_icmplt 6d
      // 28: goto 2f
      // 2b: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: iload 3
      // 30: iload 1
      // 31: ifne 75
      // 34: goto 3b
      // 37: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: sipush 4635
      // 3e: ldc2_w 3065269163111391958
      // 41: invokestatic com/Nj_2.a (IJ)I
      // 44: if_icmpgt 6d
      // 47: goto 4e
      // 4a: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: iload 3
      // 4f: iload 1
      // 50: ifne 75
      // 53: goto 5a
      // 56: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: sipush 24940
      // 5d: ldc2_w 520490965228474787
      // 60: invokestatic com/Nj_2.a (IJ)I
      // 63: if_icmpne 76
      // 66: goto 6d
      // 69: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: bipush 0
      // 6e: goto 75
      // 71: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: ireturn
      // 76: iinc 2 1
      // 79: iload 1
      // 7a: ifeq 06
      // 7d: bipush 1
      // 7e: ireturn
   }

   public static String[] x(AccessibleObject param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/Ph_2.u ()I
      // 003: istore 1
      // 004: getstatic com/Nj_2.S Z
      // 007: iload 1
      // 008: ifne 02d
      // 00b: ifeq 01e
      // 00e: goto 015
      // 011: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: bipush 0
      // 016: anewarray 29
      // 019: areturn
      // 01a: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: aload 0
      // 01f: iload 1
      // 020: ifne 05c
      // 023: instanceof java/lang/reflect/Method
      // 026: goto 02d
      // 029: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02c: athrow
      // 02d: ifeq 054
      // 030: aload 0
      // 031: checkcast java/lang/reflect/Method
      // 034: astore 6
      // 036: aload 6
      // 038: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 03b: astore 2
      // 03c: aload 6
      // 03e: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 041: astore 4
      // 043: aload 6
      // 045: invokevirtual java/lang/reflect/Method.getDeclaringClass ()Ljava/lang/Class;
      // 048: astore 3
      // 049: aload 6
      // 04b: invokestatic com/B8.v (Ljava/lang/reflect/Method;)[[Ljava/lang/annotation/Annotation;
      // 04e: astore 5
      // 050: iload 1
      // 051: ifeq 07f
      // 054: aload 0
      // 055: goto 05c
      // 058: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: checkcast java/lang/reflect/Constructor
      // 05f: astore 6
      // 061: sipush 26325
      // 064: aload 6
      // 066: invokevirtual java/lang/reflect/Constructor.getParameterTypes ()[Ljava/lang/Class;
      // 069: astore 2
      // 06a: sipush -2037
      // 06d: aload 6
      // 06f: invokevirtual java/lang/reflect/Constructor.getDeclaringClass ()Ljava/lang/Class;
      // 072: astore 3
      // 073: invokestatic com/Nj_2.a (II)Ljava/lang/String;
      // 076: astore 4
      // 078: aload 6
      // 07a: invokestatic com/B8.R (Ljava/lang/reflect/Constructor;)[[Ljava/lang/annotation/Annotation;
      // 07d: astore 5
      // 07f: aload 2
      // 080: arraylength
      // 081: iload 1
      // 082: ifne 090
      // 085: ifne 094
      // 088: goto 08f
      // 08b: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: bipush 0
      // 090: anewarray 29
      // 093: areturn
      // 094: aload 3
      // 095: invokevirtual java/lang/Class.getClassLoader ()Ljava/lang/ClassLoader;
      // 098: astore 6
      // 09a: aload 6
      // 09c: iload 1
      // 09d: ifne 0ad
      // 0a0: ifnonnull 0af
      // 0a3: goto 0aa
      // 0a6: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9: athrow
      // 0aa: invokestatic java/lang/ClassLoader.getSystemClassLoader ()Ljava/lang/ClassLoader;
      // 0ad: astore 6
      // 0af: aload 3
      // 0b0: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 0b3: astore 7
      // 0b5: new java/lang/StringBuilder
      // 0b8: dup
      // 0b9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0bc: aload 7
      // 0be: sipush 24940
      // 0c1: ldc2_w 520490965228474787
      // 0c4: invokestatic com/Nj_2.a (IJ)I
      // 0c7: sipush 12486
      // 0ca: ldc2_w 7512288288971423752
      // 0cd: invokestatic com/Nj_2.a (IJ)I
      // 0d0: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d6: sipush 26327
      // 0d9: sipush -14565
      // 0dc: invokestatic com/Nj_2.a (II)Ljava/lang/String;
      // 0df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e5: astore 8
      // 0e7: aload 6
      // 0e9: aload 8
      // 0eb: invokevirtual java/lang/ClassLoader.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 0ee: astore 9
      // 0f0: aload 9
      // 0f2: ifnonnull 0fe
      // 0f5: bipush 0
      // 0f6: anewarray 29
      // 0f9: areturn
      // 0fa: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: new com/Rx_2
      // 101: dup
      // 102: aload 9
      // 104: bipush 0
      // 105: invokespecial com/Rx_2.<init> (Ljava/io/InputStream;Z)V
      // 108: astore 10
      // 10a: new com/Lx_2
      // 10d: dup
      // 10e: aload 4
      // 110: aload 2
      // 111: invokespecial com/Lx_2.<init> (Ljava/lang/String;[Ljava/lang/Class;)V
      // 114: astore 11
      // 116: aload 10
      // 118: aload 11
      // 11a: invokevirtual com/Rx_2.C (Lcom/Lx_2;)V
      // 11d: aload 11
      // 11f: invokevirtual com/Lx_2.N ()[Ljava/lang/String;
      // 122: astore 12
      // 124: bipush 0
      // 125: istore 13
      // 127: iload 13
      // 129: aload 12
      // 12b: arraylength
      // 12c: if_icmpge 1c0
      // 12f: aload 5
      // 131: iload 13
      // 133: aaload
      // 134: astore 14
      // 136: iload 1
      // 137: ifne 1bc
      // 13a: aload 14
      // 13c: ifnull 1b9
      // 13f: goto 146
      // 142: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 145: athrow
      // 146: bipush 0
      // 147: istore 15
      // 149: iload 15
      // 14b: aload 14
      // 14d: arraylength
      // 14e: if_icmpge 1b9
      // 151: aload 14
      // 153: iload 15
      // 155: aaload
      // 156: iload 1
      // 157: ifne 177
      // 15a: instanceof com/E6
      // 15d: iload 1
      // 15e: ifne 129
      // 161: goto 168
      // 164: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 167: athrow
      // 168: ifeq 1b2
      // 16b: aload 14
      // 16d: iload 15
      // 16f: aaload
      // 170: goto 177
      // 173: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 176: athrow
      // 177: checkcast com/E6
      // 17a: astore 16
      // 17c: aload 16
      // 17e: invokeinterface com/E6.W ()Ljava/lang/String; 1
      // 183: astore 17
      // 185: iload 1
      // 186: ifne 1b5
      // 189: aload 17
      // 18b: ifnull 1b2
      // 18e: goto 195
      // 191: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 194: athrow
      // 195: aload 17
      // 197: invokevirtual java/lang/String.length ()I
      // 19a: ifle 1b2
      // 19d: goto 1a4
      // 1a0: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a3: athrow
      // 1a4: aload 12
      // 1a6: iload 13
      // 1a8: aload 17
      // 1aa: aastore
      // 1ab: goto 1b2
      // 1ae: invokestatic com/Nj_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b1: athrow
      // 1b2: iinc 15 1
      // 1b5: iload 1
      // 1b6: ifeq 149
      // 1b9: iinc 13 1
      // 1bc: iload 1
      // 1bd: ifeq 127
      // 1c0: aload 12
      // 1c2: astore 13
      // 1c4: aload 9
      // 1c6: invokestatic com/S7.o (Ljava/io/Closeable;)V
      // 1c9: aload 13
      // 1cb: areturn
      // 1cc: astore 10
      // 1ce: bipush 0
      // 1cf: anewarray 29
      // 1d2: astore 11
      // 1d4: aload 9
      // 1d6: invokestatic com/S7.o (Ljava/io/Closeable;)V
      // 1d9: aload 11
      // 1db: areturn
      // 1dc: astore 18
      // 1de: aload 9
      // 1e0: invokestatic com/S7.o (Ljava/io/Closeable;)V
      // 1e3: aload 18
      // 1e5: athrow
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[7];
      int var11 = 0;
      String var10 = "jÐ½\u0019n\u001b\u0005Ï¾Ò6=\u0006²¥\"¶Ü¯\u0005Ý\t\u0096²/\u0006\u0086°öW\u0003×\u0006<\u0019¢7\u00936";
      int var12 = "jÐ½\u0019n\u001b\u0005Ï¾Ò6=\u0006²¥\"¶Ü¯\u0005Ý\t\u0096²/\u0006\u0086°öW\u0003×\u0006<\u0019¢7\u00936".length();
      char var9 = '\f';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 81;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 15;
                        break;
                     case 1:
                        var65 = 32;
                        break;
                     case 2:
                        var65 = 59;
                        break;
                     case 3:
                        var65 = 80;
                        break;
                     case 4:
                        var65 = 83;
                        break;
                     case 5:
                        var65 = 114;
                        break;
                     default:
                        var65 = 95;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[7];
                     long var0 = 670655281347994659L;
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "¿\u0019´°t\u008b\u0087Ò\u0017Ûx\u0010ëJ\u0006\u008av\"¢Aq\u0004¤\u0004H\u001e¤Û Bõ®Á¡\\W\u0014T\u0084O";
                     int var5 = "¿\u0019´°t\u008b\u0087Ò\u0017Ûx\u0010ëJ\u0006\u008av\"¢Aq\u0004¤\u0004H\u001e¤Û Bõ®Á¡\\W\u0014T\u0084O".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    c = var6;
                                    d = new Integer[7];
                                    l = System.getProperty(a(26324, -3954));
                                    S = m(l);
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "æÌªåÐ>e^IQ\u0006ÞôÄ°\u0099";
                                 var5 = "æÌªåÐ>e^IQ\u0006ÞôÄ°\u0099".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "\u009fe\"À_wUQ¦¨á+\u000f]Ñ\u0088\u0091\u0095{\u000e»\u0081j\u0085\u0006Y_\u0003ÐL×";
                  var12 = "\u009fe\"À_wUQ¦¨á+\u000f]Ñ\u0088\u0091\u0095{\u000e»\u0081j\u0085\u0006Y_\u0003ÐL×".length();
                  var9 = 24;
                  var17 = -1;
            }

            var10000 = 59;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 26324) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 1;
               break;
            case 1:
               var10000 = 21;
               break;
            case 2:
               var10000 = 240;
               break;
            case 3:
               var10000 = 92;
               break;
            case 4:
               var10000 = 244;
               break;
            case 5:
               var10000 = 224;
               break;
            case 6:
               var10000 = 158;
               break;
            case 7:
               var10000 = 149;
               break;
            case 8:
               var10000 = 139;
               break;
            case 9:
               var10000 = 98;
               break;
            case 10:
               var10000 = 30;
               break;
            case 11:
               var10000 = 161;
               break;
            case 12:
               var10000 = 201;
               break;
            case 13:
               var10000 = 104;
               break;
            case 14:
               var10000 = 57;
               break;
            case 15:
               var10000 = 66;
               break;
            case 16:
               var10000 = 79;
               break;
            case 17:
               var10000 = 95;
               break;
            case 18:
               var10000 = 225;
               break;
            case 19:
               var10000 = 209;
               break;
            case 20:
               var10000 = 242;
               break;
            case 21:
               var10000 = 219;
               break;
            case 22:
               var10000 = 15;
               break;
            case 23:
               var10000 = 243;
               break;
            case 24:
               var10000 = 178;
               break;
            case 25:
               var10000 = 69;
               break;
            case 26:
               var10000 = 49;
               break;
            case 27:
               var10000 = 22;
               break;
            case 28:
               var10000 = 94;
               break;
            case 29:
               var10000 = 29;
               break;
            case 30:
               var10000 = 179;
               break;
            case 31:
               var10000 = 246;
               break;
            case 32:
               var10000 = 202;
               break;
            case 33:
               var10000 = 218;
               break;
            case 34:
               var10000 = 191;
               break;
            case 35:
               var10000 = 122;
               break;
            case 36:
               var10000 = 34;
               break;
            case 37:
               var10000 = 85;
               break;
            case 38:
               var10000 = 216;
               break;
            case 39:
               var10000 = 143;
               break;
            case 40:
               var10000 = 227;
               break;
            case 41:
               var10000 = 180;
               break;
            case 42:
               var10000 = 255;
               break;
            case 43:
               var10000 = 131;
               break;
            case 44:
               var10000 = 239;
               break;
            case 45:
               var10000 = 228;
               break;
            case 46:
               var10000 = 116;
               break;
            case 47:
               var10000 = 215;
               break;
            case 48:
               var10000 = 160;
               break;
            case 49:
               var10000 = 190;
               break;
            case 50:
               var10000 = 8;
               break;
            case 51:
               var10000 = 211;
               break;
            case 52:
               var10000 = 48;
               break;
            case 53:
               var10000 = 93;
               break;
            case 54:
               var10000 = 54;
               break;
            case 55:
               var10000 = 84;
               break;
            case 56:
               var10000 = 174;
               break;
            case 57:
               var10000 = 47;
               break;
            case 58:
               var10000 = 245;
               break;
            case 59:
               var10000 = 172;
               break;
            case 60:
               var10000 = 204;
               break;
            case 61:
               var10000 = 114;
               break;
            case 62:
               var10000 = 35;
               break;
            case 63:
               var10000 = 249;
               break;
            case 64:
               var10000 = 16;
               break;
            case 65:
               var10000 = 146;
               break;
            case 66:
               var10000 = 171;
               break;
            case 67:
               var10000 = 7;
               break;
            case 68:
               var10000 = 199;
               break;
            case 69:
               var10000 = 222;
               break;
            case 70:
               var10000 = 197;
               break;
            case 71:
               var10000 = 20;
               break;
            case 72:
               var10000 = 212;
               break;
            case 73:
               var10000 = 137;
               break;
            case 74:
               var10000 = 31;
               break;
            case 75:
               var10000 = 175;
               break;
            case 76:
               var10000 = 140;
               break;
            case 77:
               var10000 = 106;
               break;
            case 78:
               var10000 = 89;
               break;
            case 79:
               var10000 = 223;
               break;
            case 80:
               var10000 = 195;
               break;
            case 81:
               var10000 = 147;
               break;
            case 82:
               var10000 = 42;
               break;
            case 83:
               var10000 = 44;
               break;
            case 84:
               var10000 = 154;
               break;
            case 85:
               var10000 = 71;
               break;
            case 86:
               var10000 = 142;
               break;
            case 87:
               var10000 = 60;
               break;
            case 88:
               var10000 = 210;
               break;
            case 89:
               var10000 = 27;
               break;
            case 90:
               var10000 = 91;
               break;
            case 91:
               var10000 = 207;
               break;
            case 92:
               var10000 = 109;
               break;
            case 93:
               var10000 = 38;
               break;
            case 94:
               var10000 = 102;
               break;
            case 95:
               var10000 = 182;
               break;
            case 96:
               var10000 = 61;
               break;
            case 97:
               var10000 = 107;
               break;
            case 98:
               var10000 = 70;
               break;
            case 99:
               var10000 = 145;
               break;
            case 100:
               var10000 = 32;
               break;
            case 101:
               var10000 = 67;
               break;
            case 102:
               var10000 = 52;
               break;
            case 103:
               var10000 = 186;
               break;
            case 104:
               var10000 = 136;
               break;
            case 105:
               var10000 = 63;
               break;
            case 106:
               var10000 = 11;
               break;
            case 107:
               var10000 = 151;
               break;
            case 108:
               var10000 = 72;
               break;
            case 109:
               var10000 = 133;
               break;
            case 110:
               var10000 = 53;
               break;
            case 111:
               var10000 = 26;
               break;
            case 112:
               var10000 = 81;
               break;
            case 113:
               var10000 = 80;
               break;
            case 114:
               var10000 = 155;
               break;
            case 115:
               var10000 = 17;
               break;
            case 116:
               var10000 = 203;
               break;
            case 117:
               var10000 = 45;
               break;
            case 118:
               var10000 = 46;
               break;
            case 119:
               var10000 = 141;
               break;
            case 120:
               var10000 = 33;
               break;
            case 121:
               var10000 = 6;
               break;
            case 122:
               var10000 = 241;
               break;
            case 123:
               var10000 = 13;
               break;
            case 124:
               var10000 = 24;
               break;
            case 125:
               var10000 = 238;
               break;
            case 126:
               var10000 = 163;
               break;
            case 127:
               var10000 = 100;
               break;
            case 128:
               var10000 = 55;
               break;
            case 129:
               var10000 = 112;
               break;
            case 130:
               var10000 = 138;
               break;
            case 131:
               var10000 = 187;
               break;
            case 132:
               var10000 = 169;
               break;
            case 133:
               var10000 = 250;
               break;
            case 134:
               var10000 = 144;
               break;
            case 135:
               var10000 = 127;
               break;
            case 136:
               var10000 = 220;
               break;
            case 137:
               var10000 = 9;
               break;
            case 138:
               var10000 = 101;
               break;
            case 139:
               var10000 = 78;
               break;
            case 140:
               var10000 = 165;
               break;
            case 141:
               var10000 = 166;
               break;
            case 142:
               var10000 = 153;
               break;
            case 143:
               var10000 = 206;
               break;
            case 144:
               var10000 = 173;
               break;
            case 145:
               var10000 = 39;
               break;
            case 146:
               var10000 = 56;
               break;
            case 147:
               var10000 = 75;
               break;
            case 148:
               var10000 = 226;
               break;
            case 149:
               var10000 = 87;
               break;
            case 150:
               var10000 = 4;
               break;
            case 151:
               var10000 = 170;
               break;
            case 152:
               var10000 = 252;
               break;
            case 153:
               var10000 = 159;
               break;
            case 154:
               var10000 = 196;
               break;
            case 155:
               var10000 = 217;
               break;
            case 156:
               var10000 = 214;
               break;
            case 157:
               var10000 = 193;
               break;
            case 158:
               var10000 = 185;
               break;
            case 159:
               var10000 = 248;
               break;
            case 160:
               var10000 = 18;
               break;
            case 161:
               var10000 = 113;
               break;
            case 162:
               var10000 = 68;
               break;
            case 163:
               var10000 = 167;
               break;
            case 164:
               var10000 = 90;
               break;
            case 165:
               var10000 = 82;
               break;
            case 166:
               var10000 = 10;
               break;
            case 167:
               var10000 = 183;
               break;
            case 168:
               var10000 = 41;
               break;
            case 169:
               var10000 = 126;
               break;
            case 170:
               var10000 = 108;
               break;
            case 171:
               var10000 = 115;
               break;
            case 172:
               var10000 = 36;
               break;
            case 173:
               var10000 = 162;
               break;
            case 174:
               var10000 = 97;
               break;
            case 175:
               var10000 = 64;
               break;
            case 176:
               var10000 = 205;
               break;
            case 177:
               var10000 = 23;
               break;
            case 178:
               var10000 = 120;
               break;
            case 179:
               var10000 = 150;
               break;
            case 180:
               var10000 = 192;
               break;
            case 181:
               var10000 = 198;
               break;
            case 182:
               var10000 = 74;
               break;
            case 183:
               var10000 = 65;
               break;
            case 184:
               var10000 = 103;
               break;
            case 185:
               var10000 = 194;
               break;
            case 186:
               var10000 = 251;
               break;
            case 187:
               var10000 = 76;
               break;
            case 188:
               var10000 = 123;
               break;
            case 189:
               var10000 = 221;
               break;
            case 190:
               var10000 = 73;
               break;
            case 191:
               var10000 = 51;
               break;
            case 192:
               var10000 = 119;
               break;
            case 193:
               var10000 = 181;
               break;
            case 194:
               var10000 = 83;
               break;
            case 195:
               var10000 = 247;
               break;
            case 196:
               var10000 = 231;
               break;
            case 197:
               var10000 = 2;
               break;
            case 198:
               var10000 = 237;
               break;
            case 199:
               var10000 = 236;
               break;
            case 200:
               var10000 = 152;
               break;
            case 201:
               var10000 = 125;
               break;
            case 202:
               var10000 = 121;
               break;
            case 203:
               var10000 = 118;
               break;
            case 204:
               var10000 = 86;
               break;
            case 205:
               var10000 = 134;
               break;
            case 206:
               var10000 = 188;
               break;
            case 207:
               var10000 = 235;
               break;
            case 208:
               var10000 = 177;
               break;
            case 209:
               var10000 = 19;
               break;
            case 210:
               var10000 = 0;
               break;
            case 211:
               var10000 = 88;
               break;
            case 212:
               var10000 = 128;
               break;
            case 213:
               var10000 = 189;
               break;
            case 214:
               var10000 = 184;
               break;
            case 215:
               var10000 = 254;
               break;
            case 216:
               var10000 = 37;
               break;
            case 217:
               var10000 = 157;
               break;
            case 218:
               var10000 = 129;
               break;
            case 219:
               var10000 = 164;
               break;
            case 220:
               var10000 = 105;
               break;
            case 221:
               var10000 = 99;
               break;
            case 222:
               var10000 = 132;
               break;
            case 223:
               var10000 = 25;
               break;
            case 224:
               var10000 = 58;
               break;
            case 225:
               var10000 = 77;
               break;
            case 226:
               var10000 = 5;
               break;
            case 227:
               var10000 = 168;
               break;
            case 228:
               var10000 = 148;
               break;
            case 229:
               var10000 = 124;
               break;
            case 230:
               var10000 = 229;
               break;
            case 231:
               var10000 = 110;
               break;
            case 232:
               var10000 = 130;
               break;
            case 233:
               var10000 = 111;
               break;
            case 234:
               var10000 = 200;
               break;
            case 235:
               var10000 = 117;
               break;
            case 236:
               var10000 = 59;
               break;
            case 237:
               var10000 = 135;
               break;
            case 238:
               var10000 = 253;
               break;
            case 239:
               var10000 = 156;
               break;
            case 240:
               var10000 = 176;
               break;
            case 241:
               var10000 = 230;
               break;
            case 242:
               var10000 = 12;
               break;
            case 243:
               var10000 = 233;
               break;
            case 244:
               var10000 = 232;
               break;
            case 245:
               var10000 = 62;
               break;
            case 246:
               var10000 = 50;
               break;
            case 247:
               var10000 = 28;
               break;
            case 248:
               var10000 = 40;
               break;
            case 249:
               var10000 = 213;
               break;
            case 250:
               var10000 = 14;
               break;
            case 251:
               var10000 = 208;
               break;
            case 252:
               var10000 = 96;
               break;
            case 253:
               var10000 = 3;
               break;
            case 254:
               var10000 = 234;
               break;
            default:
               var10000 = 43;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12492;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





