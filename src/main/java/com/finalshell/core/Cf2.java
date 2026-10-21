package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.BS;
import com.finalshell.ui.panel.Ky4;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Random;

public class Cf2 {
   static long T;
   static int S;
   public static Gs2_2 U;
   static ArrayList t;
   static long Q;
   static Random R;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long[] e;
   public static Long[] f;

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static XB_2 C(String var0, int var1, String var2, int var3, Lv4_2 var4, int var5) throws Exception {
      int var10000 = BS.s();
      int var7 = Registry.lookupField(585559697342324666L).getInt(null);
      ServerSocket var8 = null;
      int var6 = var10000;
      byte var9 = 0;
      int var10 = 0;

      label147: {
         while (true) {
            try {
               var10000 = var10;
               if (var6 == 0) {
                  break label147;
               }

               if (var10 >= a(19308, 7161391060087373820L)) {
                  break;
               }
            } catch (IOException var25) {
               throw a(var25);
            }

            boolean var20 = false /* VF: Semaphore variable */;

            label156: {
               try {
                  var20 = true;
                  var8 = new ServerSocket(var7);
                  var10000 = 1;
                  if (var6 == 0) {
                     var20 = false;
                     break label147;
                  }

                  var9 = 1;
                  var20 = false;
                  break label156;
               } catch (IOException var26) {
                  var26.printStackTrace();
                  var7++;
                  var20 = false;
               } finally {
                  if (var20) {
      ServerSocket var34;
                     label108: {
                        label107: {
                           try {
                              var34 = var8;
                              if (var6 == 0) {
                                 break label107;
                              }

                              if (var8 == null) {
                                 break label108;
                              }
                           } catch (IOException var22) {
                              throw a(var22);
                           }

                           var34 = var8;
                        }

                        var34.close();
                     }
                  }
               }

               if (var6 != 0) {
                  try {
                     if (var8 != null) {
                        var8.close();
                     }
                  } catch (IOException var24) {
                     throw a(var24);
                  }

                  var10++;
               }

               if (var6 != 0) {
                  continue;
               }
               break;
            }

            try {
               if (var8 != null) {
                  var8.close();
               }
               break;
            } catch (IOException var21) {
               throw a(var21);
            }
         }

         var10000 = var9;
      }

      try {
         if (var10000 == 0) {
            return null;
         }
      } catch (IOException var23) {
         throw a(var23);
      }

      XB_2 var28 = new XB_2(var7, var0, var1, var2, var3, var4, var5);
      Registry.lookupField(585559697342324666L).setInt(null, Registry.lookupField(585559697342324666L).getInt(null) + 1);
      return var28;
   }

   public static Ow4_2 Q(String param0, int param1, int param2, QT param3) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new com/finalshell/core/Ow4_2
      // 003: dup
      // 004: invokespecial com/finalshell/core/Ow4_2.<init> ()V
      // 007: astore 5
      // 009: aconst_null
      // 00a: astore 6
      // 00c: invokestatic com/finalshell/ui/model/BS.t ()I
      // 00f: aconst_null
      // 010: astore 7
      // 012: aconst_null
      // 013: astore 8
      // 015: bipush 0
      // 016: istore 9
      // 018: istore 4
      // 01a: bipush 0
      // 01b: istore 10
      // 01d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 020: ldc2_w 452351916487440010
      // 023: astore 26
      // 025: ldc2_w 452351916487440010
      // 028: aload 26
      // 02a: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 02d: checkcast com/finalshell/core/Gs2_2
      // 030: goto 037
      // 033: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 036: athrow
      // 037: astore 11
      // 039: aload 11
      // 03b: ifnonnull 058
      // 03e: iload 4
      // 040: ifne 0d5
      // 043: new java/lang/Exception
      // 046: dup
      // 047: sipush 11842
      // 04a: sipush -23119
      // 04d: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 050: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 053: athrow
      // 054: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: new java/net/Socket
      // 05b: dup
      // 05c: aload 11
      // 05e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 061: ldc2_w 131701021086056440
      // 064: astore 29
      // 066: astore 28
      // 068: ldc2_w 131701021086056440
      // 06b: aload 28
      // 06d: aload 29
      // 06f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 072: checkcast java/lang/String
      // 075: goto 07c
      // 078: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: aload 11
      // 07e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 081: ldc2_w 169644311579186530
      // 084: astore 31
      // 086: astore 30
      // 088: ldc2_w 169644311579186530
      // 08b: aload 30
      // 08d: aload 31
      // 08f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 092: checkcast java/lang/Integer
      // 095: invokevirtual java/lang/Integer.intValue ()I
      // 098: goto 09f
      // 09b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: invokespecial java/net/Socket.<init> (Ljava/lang/String;I)V
      // 0a2: astore 6
      // 0a4: aload 6
      // 0a6: ldc2_w 512261197150171295
      // 0a9: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0ac: aconst_null
      // 0ad: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0b0: invokevirtual java/net/Socket.setSoTimeout (I)V
      // 0b3: aload 6
      // 0b5: bipush 1
      // 0b6: invokevirtual java/net/Socket.setTcpNoDelay (Z)V
      // 0b9: new java/io/DataInputStream
      // 0bc: dup
      // 0bd: aload 6
      // 0bf: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 0c2: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 0c5: astore 7
      // 0c7: new java/io/DataOutputStream
      // 0ca: dup
      // 0cb: aload 6
      // 0cd: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 0d0: invokespecial java/io/DataOutputStream.<init> (Ljava/io/OutputStream;)V
      // 0d3: astore 8
      // 0d5: aload 11
      // 0d7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0da: ldc2_w 169644311579186530
      // 0dd: astore 33
      // 0df: astore 32
      // 0e1: ldc2_w 169644311579186530
      // 0e4: aload 32
      // 0e6: aload 33
      // 0e8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0eb: checkcast java/lang/Integer
      // 0ee: invokevirtual java/lang/Integer.intValue ()I
      // 0f1: goto 0f8
      // 0f4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 0fb: ldc2_w 524838104252860713
      // 0fe: astore 34
      // 100: ldc2_w 524838104252860713
      // 103: aload 34
      // 105: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 108: checkcast [B
      // 10b: goto 112
      // 10e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 111: athrow
      // 112: astore 12
      // 114: aload 8
      // 116: aload 12
      // 118: invokevirtual java/io/DataOutputStream.write ([B)V
      // 11b: aload 8
      // 11d: ldc2_w 476905874216232788
      // 120: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 123: aconst_null
      // 124: invokevirtual java/lang/reflect/Field.getLong (Ljava/lang/Object;)J
      // 127: lconst_1
      // 128: ladd
      // 129: l2i
      // 12a: invokevirtual java/io/DataOutputStream.write (I)V
      // 12d: bipush 0
      // 12e: istore 13
      // 130: new java/io/ByteArrayOutputStream
      // 133: dup
      // 134: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 137: astore 14
      // 139: bipush 0
      // 13a: istore 15
      // 13c: bipush 0
      // 13d: istore 16
      // 13f: iload 16
      // 141: sipush 17883
      // 144: ldc2_w 3106107496560128322
      // 147: invokestatic com/finalshell/core/Cf2.a (IJ)I
      // 14a: if_icmpge 246
      // 14d: aload 7
      // 14f: invokevirtual java/io/DataInputStream.read ()I
      // 152: istore 17
      // 154: aload 14
      // 156: iload 17
      // 158: invokevirtual java/io/ByteArrayOutputStream.write (I)V
      // 15b: aload 14
      // 15d: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 160: astore 18
      // 162: new java/lang/String
      // 165: dup
      // 166: aload 18
      // 168: sipush 11840
      // 16b: sipush 27903
      // 16e: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 171: invokespecial java/lang/String.<init> ([BLjava/lang/String;)V
      // 174: astore 19
      // 176: aload 19
      // 178: sipush 11881
      // 17b: sipush -30089
      // 17e: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 181: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 184: iload 4
      // 186: ifne 248
      // 189: iload 4
      // 18b: ifne 1d4
      // 18e: goto 195
      // 191: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 194: athrow
      // 195: ifeq 1cb
      // 198: goto 19f
      // 19b: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19e: athrow
      // 19f: aload 7
      // 1a1: invokevirtual java/io/DataInputStream.read ()I
      // 1a4: istore 17
      // 1a6: iload 17
      // 1a8: i2l
      // 1a9: ldc2_w 476905874216232788
      // 1ac: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1af: aconst_null
      // 1b0: invokevirtual java/lang/reflect/Field.getLong (Ljava/lang/Object;)J
      // 1b3: lcmp
      // 1b4: iload 4
      // 1b6: ifne 248
      // 1b9: ifne 246
      // 1bc: goto 1c3
      // 1bf: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c2: athrow
      // 1c3: bipush 1
      // 1c4: istore 13
      // 1c6: iload 4
      // 1c8: ifeq 246
      // 1cb: iload 16
      // 1cd: goto 1d4
      // 1d0: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d3: athrow
      // 1d4: iload 4
      // 1d6: ifne 1f5
      // 1d9: sipush 10381
      // 1dc: ldc2_w 6659382902339738646
      // 1df: invokestatic com/finalshell/core/Cf2.a (IJ)I
      // 1e2: if_icmple 23e
      // 1e5: goto 1ec
      // 1e8: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1eb: athrow
      // 1ec: iload 15
      // 1ee: goto 1f5
      // 1f1: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f4: athrow
      // 1f5: iload 4
      // 1f7: ifne 219
      // 1fa: ifne 23e
      // 1fd: goto 204
      // 200: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 203: athrow
      // 204: aload 19
      // 206: sipush 11882
      // 209: sipush 26019
      // 20c: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 20f: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 212: goto 219
      // 215: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 218: athrow
      // 219: iload 4
      // 21b: ifne 23c
      // 21e: ifne 234
      // 221: goto 228
      // 224: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 227: athrow
      // 228: iload 4
      // 22a: ifeq 246
      // 22d: goto 234
      // 230: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 233: athrow
      // 234: bipush 1
      // 235: goto 23c
      // 238: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23b: athrow
      // 23c: istore 15
      // 23e: iinc 16 1
      // 241: iload 4
      // 243: ifeq 13f
      // 246: iload 13
      // 248: ifeq 3e8
      // 24b: new com/finalshell/ui/model/O0
      // 24e: dup
      // 24f: invokespecial com/finalshell/ui/model/O0.<init> ()V
      // 252: astore 16
      // 254: aload 16
      // 256: sipush 11847
      // 259: sipush 4991
      // 25c: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 25f: aload 0
      // 260: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 263: pop
      // 264: aload 16
      // 266: sipush 11858
      // 269: sipush 19793
      // 26c: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 26f: iload 1
      // 270: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 273: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 276: pop
      // 277: aload 16
      // 279: invokevirtual com/finalshell/ui/model/O0.toString ()Ljava/lang/String;
      // 27c: sipush 11840
      // 27f: sipush 27903
      // 282: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 285: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 288: astore 17
      // 28a: aload 8
      // 28c: aload 17
      // 28e: arraylength
      // 28f: invokevirtual java/io/DataOutputStream.writeInt (I)V
      // 292: aload 8
      // 294: aload 17
      // 296: invokevirtual java/io/DataOutputStream.write ([B)V
      // 299: aload 7
      // 29b: invokevirtual java/io/DataInputStream.readInt ()I
      // 29e: istore 18
      // 2a0: iload 18
      // 2a2: newarray 8
      // 2a4: astore 19
      // 2a6: aload 7
      // 2a8: aload 19
      // 2aa: invokevirtual java/io/DataInputStream.readFully ([B)V
      // 2ad: new java/lang/String
      // 2b0: dup
      // 2b1: aload 19
      // 2b3: sipush 11840
      // 2b6: sipush 27903
      // 2b9: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 2bc: invokespecial java/lang/String.<init> ([BLjava/lang/String;)V
      // 2bf: invokestatic com/finalshell/ui/model/O0.y (Ljava/lang/String;)Lcom/finalshell/ui/model/O0;
      // 2c2: astore 20
      // 2c4: aload 20
      // 2c6: sipush 11855
      // 2c9: sipush 10275
      // 2cc: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 2cf: invokevirtual com/finalshell/ui/model/O0.b (Ljava/lang/String;)I
      // 2d2: istore 21
      // 2d4: aload 20
      // 2d6: sipush 11870
      // 2d9: sipush -32528
      // 2dc: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 2df: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 2e2: astore 22
      // 2e4: iload 4
      // 2e6: ifne 31d
      // 2e9: iload 21
      // 2eb: bipush 1
      // 2ec: if_icmpne 384
      // 2ef: goto 2f6
      // 2f2: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f5: athrow
      // 2f6: aload 5
      // 2f8: aload 6
      // 2fa: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2fd: ldc2_w 517494441991473529
      // 300: astore 37
      // 302: astore 36
      // 304: ldc2_w 517494441991473529
      // 307: aload 36
      // 309: aload 37
      // 30b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 30e: pop
      // 30f: goto 316
      // 312: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 315: athrow
      // 316: goto 31d
      // 319: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31c: athrow
      // 31d: aload 7
      // 31f: iload 2
      // 320: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;I)[Ljava/lang/Object;
      // 323: ldc2_w 329484132574134898
      // 326: astore 38
      // 328: ldc2_w 329484132574134898
      // 32b: aload 38
      // 32d: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 330: checkcast java/io/PipedInputStream
      // 333: goto 33a
      // 336: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 339: athrow
      // 33a: astore 23
      // 33c: aload 5
      // 33e: aload 23
      // 340: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 343: ldc2_w 627470510676475603
      // 346: astore 41
      // 348: astore 40
      // 34a: ldc2_w 627470510676475603
      // 34d: aload 40
      // 34f: aload 41
      // 351: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 354: pop
      // 355: goto 35c
      // 358: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 35b: athrow
      // 35c: aload 5
      // 35e: aload 8
      // 360: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 363: ldc2_w 266893842541540368
      // 366: astore 43
      // 368: astore 42
      // 36a: ldc2_w 266893842541540368
      // 36d: aload 42
      // 36f: aload 43
      // 371: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 374: pop
      // 375: goto 37c
      // 378: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 37b: athrow
      // 37c: bipush 1
      // 37d: istore 9
      // 37f: iload 4
      // 381: ifeq 3e5
      // 384: aload 3
      // 385: iload 4
      // 387: ifne 3b2
      // 38a: goto 391
      // 38d: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 390: athrow
      // 391: ifnull 3b7
      // 394: goto 39b
      // 397: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39a: athrow
      // 39b: aload 3
      // 39c: sipush 11843
      // 39f: sipush -4494
      // 3a2: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 3a5: invokeinterface com/finalshell/core/QT.a (Ljava/lang/String;)V 2
      // 3aa: aload 3
      // 3ab: goto 3b2
      // 3ae: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b1: athrow
      // 3b2: invokeinterface com/finalshell/core/QT.K ()V 1
      // 3b7: new java/lang/Exception
      // 3ba: dup
      // 3bb: new java/lang/StringBuilder
      // 3be: dup
      // 3bf: invokespecial java/lang/StringBuilder.<init> ()V
      // 3c2: sipush 11880
      // 3c5: sipush -12567
      // 3c8: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 3cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ce: iload 21
      // 3d0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3d3: ldc_w " "
      // 3d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d9: aload 22
      // 3db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3de: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3e1: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 3e4: athrow
      // 3e5: goto 3f9
      // 3e8: new java/lang/Exception
      // 3eb: dup
      // 3ec: sipush 11849
      // 3ef: sipush 3577
      // 3f2: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 3f5: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 3f8: athrow
      // 3f9: iload 9
      // 3fb: iload 4
      // 3fd: ifne 562
      // 400: ifne 560
      // 403: goto 40a
      // 406: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 409: athrow
      // 40a: aload 6
      // 40c: iload 4
      // 40e: ifne 424
      // 411: goto 418
      // 414: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 417: athrow
      // 418: ifnull 431
      // 41b: goto 422
      // 41e: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 421: athrow
      // 422: aload 6
      // 424: invokevirtual java/net/Socket.close ()V
      // 427: goto 431
      // 42a: astore 12
      // 42c: aload 12
      // 42e: invokevirtual java/io/IOException.printStackTrace ()V
      // 431: aload 7
      // 433: iload 4
      // 435: ifne 444
      // 438: ifnull 451
      // 43b: goto 442
      // 43e: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 441: athrow
      // 442: aload 7
      // 444: invokevirtual java/io/DataInputStream.close ()V
      // 447: goto 451
      // 44a: astore 12
      // 44c: aload 12
      // 44e: invokevirtual java/io/IOException.printStackTrace ()V
      // 451: aload 8
      // 453: iload 4
      // 455: ifne 464
      // 458: ifnull 560
      // 45b: goto 462
      // 45e: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 461: athrow
      // 462: aload 8
      // 464: invokevirtual java/io/DataOutputStream.close ()V
      // 467: goto 560
      // 46a: astore 12
      // 46c: aload 12
      // 46e: invokevirtual java/io/IOException.printStackTrace ()V
      // 471: goto 560
      // 474: astore 12
      // 476: aload 12
      // 478: invokevirtual java/lang/Exception.printStackTrace ()V
      // 47b: iload 9
      // 47d: iload 4
      // 47f: ifne 562
      // 482: ifne 560
      // 485: aload 6
      // 487: iload 4
      // 489: ifne 49f
      // 48c: goto 493
      // 48f: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 492: athrow
      // 493: ifnull 4ac
      // 496: goto 49d
      // 499: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49c: athrow
      // 49d: aload 6
      // 49f: invokevirtual java/net/Socket.close ()V
      // 4a2: goto 4ac
      // 4a5: astore 12
      // 4a7: aload 12
      // 4a9: invokevirtual java/io/IOException.printStackTrace ()V
      // 4ac: aload 7
      // 4ae: iload 4
      // 4b0: ifne 4bf
      // 4b3: ifnull 4cc
      // 4b6: goto 4bd
      // 4b9: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4bc: athrow
      // 4bd: aload 7
      // 4bf: invokevirtual java/io/DataInputStream.close ()V
      // 4c2: goto 4cc
      // 4c5: astore 12
      // 4c7: aload 12
      // 4c9: invokevirtual java/io/IOException.printStackTrace ()V
      // 4cc: aload 8
      // 4ce: iload 4
      // 4d0: ifne 4df
      // 4d3: ifnull 560
      // 4d6: goto 4dd
      // 4d9: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4dc: athrow
      // 4dd: aload 8
      // 4df: invokevirtual java/io/DataOutputStream.close ()V
      // 4e2: goto 560
      // 4e5: astore 12
      // 4e7: aload 12
      // 4e9: invokevirtual java/io/IOException.printStackTrace ()V
      // 4ec: goto 560
      // 4ef: astore 24
      // 4f1: iload 9
      // 4f3: ifne 55d
      // 4f6: aload 6
      // 4f8: iload 4
      // 4fa: ifne 510
      // 4fd: goto 504
      // 500: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 503: athrow
      // 504: ifnull 51d
      // 507: goto 50e
      // 50a: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50d: athrow
      // 50e: aload 6
      // 510: invokevirtual java/net/Socket.close ()V
      // 513: goto 51d
      // 516: astore 25
      // 518: aload 25
      // 51a: invokevirtual java/io/IOException.printStackTrace ()V
      // 51d: aload 7
      // 51f: iload 4
      // 521: ifne 530
      // 524: ifnull 53d
      // 527: goto 52e
      // 52a: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52d: athrow
      // 52e: aload 7
      // 530: invokevirtual java/io/DataInputStream.close ()V
      // 533: goto 53d
      // 536: astore 25
      // 538: aload 25
      // 53a: invokevirtual java/io/IOException.printStackTrace ()V
      // 53d: aload 8
      // 53f: iload 4
      // 541: ifne 550
      // 544: ifnull 55d
      // 547: goto 54e
      // 54a: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54d: athrow
      // 54e: aload 8
      // 550: invokevirtual java/io/DataOutputStream.close ()V
      // 553: goto 55d
      // 556: astore 25
      // 558: aload 25
      // 55a: invokevirtual java/io/IOException.printStackTrace ()V
      // 55d: aload 24
      // 55f: athrow
      // 560: iload 9
      // 562: iload 4
      // 564: ifne 586
      // 567: ifeq 57d
      // 56a: goto 571
      // 56d: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 570: athrow
      // 571: iload 4
      // 573: ifeq 5cb
      // 576: goto 57d
      // 579: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57c: athrow
      // 57d: iload 10
      // 57f: goto 586
      // 582: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 585: athrow
      // 586: bipush 1
      // 587: if_icmpge 5ae
      // 58a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 58d: ldc2_w 608262520382253818
      // 590: astore 44
      // 592: ldc2_w 608262520382253818
      // 595: aload 44
      // 597: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 59a: pop
      // 59b: goto 5a2
      // 59e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5a1: athrow
      // 5a2: iload 4
      // 5a4: ifeq 5c3
      // 5a7: goto 5ae
      // 5aa: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ad: athrow
      // 5ae: new java/lang/Exception
      // 5b1: dup
      // 5b2: sipush 11863
      // 5b5: sipush -24563
      // 5b8: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 5bb: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 5be: athrow
      // 5bf: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c2: athrow
      // 5c3: iinc 10 1
      // 5c6: iload 4
      // 5c8: ifeq 01d
      // 5cb: aload 5
      // 5cd: areturn
   }

   public static synchronized Gs2_2 K() {
      if ((Gs2_2)Registry.lookupField(216466484514828378L).get(null) == null
         || System.currentTimeMillis() - Registry.lookupField(300244682022475077L).getLong(null) > b(4801, 6804444288997570672L)) {
         Registry.emptyArgs();
         long var0 = 608262520382253818L;
         Ref.h2(608262520382253818L, var0);

         try {
            ;
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      }

      return (Gs2_2)Registry.lookupField(216466484514828378L).get(null);
   }

   public static void S() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/model/BS.t ()I
      // 003: ldc2_w 446994926428474059
      // 006: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 009: aconst_null
      // 00a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 00d: checkcast java/lang/String
      // 010: astore 1
      // 011: istore 0
      // 012: aload 1
      // 013: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 016: ldc2_w 563931051603221209
      // 019: astore 11
      // 01b: ldc2_w 563931051603221209
      // 01e: aload 11
      // 020: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 023: checkcast [B
      // 026: goto 02d
      // 029: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: astore 2
      // 02e: new java/lang/String
      // 031: dup
      // 032: aload 2
      // 033: sipush 11866
      // 036: sipush 27333
      // 039: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 03c: invokespecial java/lang/String.<init> ([BLjava/lang/String;)V
      // 03f: astore 3
      // 040: aload 3
      // 041: invokestatic com/finalshell/ui/model/O0.y (Ljava/lang/String;)Lcom/finalshell/ui/model/O0;
      // 044: astore 4
      // 046: aload 4
      // 048: sipush 11868
      // 04b: sipush 27545
      // 04e: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 051: invokevirtual com/finalshell/ui/model/O0.J (Ljava/lang/String;)Lcom/finalshell/ui/model/Oc2;
      // 054: astore 5
      // 056: new java/util/ArrayList
      // 059: dup
      // 05a: invokespecial java/util/ArrayList.<init> ()V
      // 05d: astore 6
      // 05f: bipush 0
      // 060: istore 7
      // 062: iload 7
      // 064: aload 5
      // 066: invokevirtual com/finalshell/ui/model/Oc2.size ()I
      // 069: if_icmpge 0c2
      // 06c: aload 5
      // 06e: iload 7
      // 070: invokevirtual com/finalshell/ui/model/Oc2.V (I)Lcom/finalshell/ui/model/O0;
      // 073: astore 8
      // 075: new com/finalshell/core/Gs2_2
      // 078: dup
      // 079: aload 8
      // 07b: sipush 11871
      // 07e: sipush -11999
      // 081: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 084: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 087: aload 8
      // 089: sipush 11850
      // 08c: sipush -13786
      // 08f: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 092: invokevirtual com/finalshell/ui/model/O0.b (Ljava/lang/String;)I
      // 095: aload 8
      // 097: sipush 11857
      // 09a: sipush 21457
      // 09d: invokestatic com/finalshell/core/Cf2.a (II)Ljava/lang/String;
      // 0a0: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 0a3: invokespecial com/finalshell/core/Gs2_2.<init> (Ljava/lang/String;ILjava/lang/String;)V
      // 0a6: astore 9
      // 0a8: aload 6
      // 0aa: aload 9
      // 0ac: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0af: pop
      // 0b0: iinc 7 1
      // 0b3: iload 0
      // 0b4: ifne 0df
      // 0b7: iload 0
      // 0b8: ifeq 062
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c1: athrow
      // 0c2: aload 6
      // 0c4: ldc2_w 438344830618821847
      // 0c7: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0ca: aconst_null
      // 0cb: dup2_x1
      // 0cc: pop2
      // 0cd: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0d0: invokestatic java/lang/System.currentTimeMillis ()J
      // 0d3: ldc2_w 300244682022475077
      // 0d6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0d9: aconst_null
      // 0da: dup2_x2
      // 0db: pop2
      // 0dc: invokevirtual java/lang/reflect/Field.setLong (Ljava/lang/Object;J)V
      // 0df: invokestatic java/util/concurrent/Executors.newCachedThreadPool ()Ljava/util/concurrent/ExecutorService;
      // 0e2: astore 7
      // 0e4: bipush 0
      // 0e5: istore 8
      // 0e7: iload 8
      // 0e9: ldc2_w 438344830618821847
      // 0ec: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0ef: aconst_null
      // 0f0: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f3: checkcast java/util/ArrayList
      // 0f6: invokevirtual java/util/ArrayList.size ()I
      // 0f9: if_icmpge 13a
      // 0fc: ldc2_w 438344830618821847
      // 0ff: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 102: aconst_null
      // 103: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 106: checkcast java/util/ArrayList
      // 109: iload 8
      // 10b: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 10e: checkcast com/finalshell/core/Gs2_2
      // 111: astore 9
      // 113: new com/finalshell/task/LS3
      // 116: dup
      // 117: aload 9
      // 119: invokespecial com/finalshell/task/LS3.<init> (Lcom/finalshell/core/Gs2_2;)V
      // 11c: astore 10
      // 11e: aload 7
      // 120: aload 10
      // 122: invokeinterface java/util/concurrent/ExecutorService.submit (Ljava/lang/Runnable;)Ljava/util/concurrent/Future; 2
      // 127: pop
      // 128: iinc 8 1
      // 12b: iload 0
      // 12c: ifne 155
      // 12f: iload 0
      // 130: ifeq 0e7
      // 133: goto 13a
      // 136: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 139: athrow
      // 13a: aload 7
      // 13c: sipush 12131
      // 13f: ldc2_w 3772689252854105552
      // 142: invokestatic com/finalshell/core/Cf2.b (IJ)J
      // 145: getstatic java/util/concurrent/TimeUnit.SECONDS Ljava/util/concurrent/TimeUnit;
      // 148: invokeinterface java/util/concurrent/ExecutorService.awaitTermination (JLjava/util/concurrent/TimeUnit;)Z 4
      // 14d: pop
      // 14e: aload 7
      // 150: invokeinterface java/util/concurrent/ExecutorService.shutdown ()V 1
      // 155: bipush 0
      // 156: istore 8
      // 158: iload 8
      // 15a: ldc2_w 438344830618821847
      // 15d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 160: aconst_null
      // 161: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 164: checkcast java/util/ArrayList
      // 167: invokevirtual java/util/ArrayList.size ()I
      // 16a: if_icmpge 196
      // 16d: ldc2_w 438344830618821847
      // 170: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 173: aconst_null
      // 174: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 177: checkcast java/util/ArrayList
      // 17a: iload 8
      // 17c: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 17f: checkcast com/finalshell/core/Gs2_2
      // 182: astore 9
      // 184: iinc 8 1
      // 187: iload 0
      // 188: ifne 19a
      // 18b: iload 0
      // 18c: ifeq 158
      // 18f: goto 196
      // 192: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 195: athrow
      // 196: goto 19a
      // 199: astore 3
      // 19a: ldc2_w 438344830618821847
      // 19d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1a0: aconst_null
      // 1a1: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1a4: checkcast java/util/ArrayList
      // 1a7: invokevirtual java/util/ArrayList.size ()I
      // 1aa: iload 0
      // 1ab: ifne 1b9
      // 1ae: ifle 45d
      // 1b1: goto 1b8
      // 1b4: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b7: athrow
      // 1b8: bipush 0
      // 1b9: istore 3
      // 1ba: iload 3
      // 1bb: sipush 23735
      // 1be: ldc2_w 7972887903114848303
      // 1c1: invokestatic com/finalshell/core/Cf2.a (IJ)I
      // 1c4: if_icmpge 306
      // 1c7: new java/util/Random
      // 1ca: dup
      // 1cb: invokespecial java/util/Random.<init> ()V
      // 1ce: ldc2_w 438344830618821847
      // 1d1: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1d4: aconst_null
      // 1d5: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1d8: checkcast java/util/ArrayList
      // 1db: invokevirtual java/util/ArrayList.size ()I
      // 1de: invokevirtual java/util/Random.nextInt (I)I
      // 1e1: istore 4
      // 1e3: ldc2_w 438344830618821847
      // 1e6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1e9: aconst_null
      // 1ea: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1ed: checkcast java/util/ArrayList
      // 1f0: iload 4
      // 1f2: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 1f5: checkcast com/finalshell/core/Gs2_2
      // 1f8: astore 5
      // 1fa: ldc2_w 216466484514828378
      // 1fd: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 200: aconst_null
      // 201: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 204: checkcast com/finalshell/core/Gs2_2
      // 207: iload 0
      // 208: ifne 313
      // 20b: iload 0
      // 20c: ifne 242
      // 20f: goto 216
      // 212: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 215: athrow
      // 216: ifnonnull 239
      // 219: goto 220
      // 21c: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21f: athrow
      // 220: aload 5
      // 222: ldc2_w 216466484514828378
      // 225: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 228: aconst_null
      // 229: dup2_x1
      // 22a: pop2
      // 22b: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 22e: iload 0
      // 22f: ifeq 306
      // 232: goto 239
      // 235: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 238: athrow
      // 239: aload 5
      // 23b: goto 242
      // 23e: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 241: athrow
      // 242: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 245: ldc2_w 439765346288828068
      // 248: astore 14
      // 24a: astore 13
      // 24c: ldc2_w 439765346288828068
      // 24f: aload 13
      // 251: aload 14
      // 253: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 256: checkcast java/lang/Integer
      // 259: invokevirtual java/lang/Integer.intValue ()I
      // 25c: goto 263
      // 25f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 262: athrow
      // 263: iload 0
      // 264: ifne 2d1
      // 267: ldc2_w 216466484514828378
      // 26a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 26d: aconst_null
      // 26e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 271: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 274: ldc2_w 439765346288828068
      // 277: astore 16
      // 279: astore 15
      // 27b: ldc2_w 439765346288828068
      // 27e: aload 15
      // 280: aload 16
      // 282: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 285: checkcast java/lang/Integer
      // 288: invokevirtual java/lang/Integer.intValue ()I
      // 28b: goto 292
      // 28e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 291: athrow
      // 292: if_icmpeq 2f8
      // 295: goto 29c
      // 298: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29b: athrow
      // 29c: aload 5
      // 29e: iload 0
      // 29f: ifne 2e8
      // 2a2: goto 2a9
      // 2a5: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a8: athrow
      // 2a9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2ac: ldc2_w 448663095691912943
      // 2af: astore 18
      // 2b1: astore 17
      // 2b3: ldc2_w 448663095691912943
      // 2b6: aload 17
      // 2b8: aload 18
      // 2ba: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2bd: checkcast java/lang/Boolean
      // 2c0: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2c3: goto 2ca
      // 2c6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2c9: athrow
      // 2ca: goto 2d1
      // 2cd: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d0: athrow
      // 2d1: ifne 2df
      // 2d4: iload 0
      // 2d5: ifeq 2f8
      // 2d8: goto 2df
      // 2db: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2de: athrow
      // 2df: aload 5
      // 2e1: goto 2e8
      // 2e4: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e7: athrow
      // 2e8: ldc2_w 216466484514828378
      // 2eb: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2ee: aconst_null
      // 2ef: dup2_x1
      // 2f0: pop2
      // 2f1: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 2f4: iload 0
      // 2f5: ifeq 306
      // 2f8: iinc 3 1
      // 2fb: iload 0
      // 2fc: ifeq 1ba
      // 2ff: goto 306
      // 302: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 305: athrow
      // 306: ldc2_w 216466484514828378
      // 309: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 30c: aconst_null
      // 30d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 310: checkcast com/finalshell/core/Gs2_2
      // 313: iload 0
      // 314: ifne 444
      // 317: ifnonnull 437
      // 31a: goto 321
      // 31d: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 320: athrow
      // 321: bipush 0
      // 322: istore 3
      // 323: iload 3
      // 324: sipush 20822
      // 327: ldc2_w 1959913612749596108
      // 32a: invokestatic com/finalshell/core/Cf2.a (IJ)I
      // 32d: if_icmpge 437
      // 330: new java/util/Random
      // 333: dup
      // 334: invokespecial java/util/Random.<init> ()V
      // 337: ldc2_w 438344830618821847
      // 33a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 33d: aconst_null
      // 33e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 341: checkcast java/util/ArrayList
      // 344: invokevirtual java/util/ArrayList.size ()I
      // 347: invokevirtual java/util/Random.nextInt (I)I
      // 34a: istore 4
      // 34c: ldc2_w 438344830618821847
      // 34f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 352: aconst_null
      // 353: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 356: checkcast java/util/ArrayList
      // 359: iload 4
      // 35b: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 35e: checkcast com/finalshell/core/Gs2_2
      // 361: astore 5
      // 363: ldc2_w 216466484514828378
      // 366: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 369: aconst_null
      // 36a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 36d: checkcast com/finalshell/core/Gs2_2
      // 370: iload 0
      // 371: ifne 444
      // 374: iload 0
      // 375: ifne 3ab
      // 378: goto 37f
      // 37b: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37e: athrow
      // 37f: ifnonnull 3a2
      // 382: goto 389
      // 385: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 388: athrow
      // 389: aload 5
      // 38b: ldc2_w 216466484514828378
      // 38e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 391: aconst_null
      // 392: dup2_x1
      // 393: pop2
      // 394: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 397: iload 0
      // 398: ifeq 437
      // 39b: goto 3a2
      // 39e: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a1: athrow
      // 3a2: aload 5
      // 3a4: goto 3ab
      // 3a7: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3aa: athrow
      // 3ab: iload 0
      // 3ac: ifne 419
      // 3af: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3b2: ldc2_w 439765346288828068
      // 3b5: astore 20
      // 3b7: astore 19
      // 3b9: ldc2_w 439765346288828068
      // 3bc: aload 19
      // 3be: aload 20
      // 3c0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3c3: checkcast java/lang/Integer
      // 3c6: invokevirtual java/lang/Integer.intValue ()I
      // 3c9: goto 3d0
      // 3cc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3cf: athrow
      // 3d0: ldc2_w 216466484514828378
      // 3d3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3d6: aconst_null
      // 3d7: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3da: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3dd: ldc2_w 439765346288828068
      // 3e0: astore 22
      // 3e2: astore 21
      // 3e4: ldc2_w 439765346288828068
      // 3e7: aload 21
      // 3e9: aload 22
      // 3eb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3ee: checkcast java/lang/Integer
      // 3f1: invokevirtual java/lang/Integer.intValue ()I
      // 3f4: goto 3fb
      // 3f7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3fa: athrow
      // 3fb: if_icmpne 410
      // 3fe: goto 405
      // 401: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 404: athrow
      // 405: iload 0
      // 406: ifeq 429
      // 409: goto 410
      // 40c: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40f: athrow
      // 410: aload 5
      // 412: goto 419
      // 415: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 418: athrow
      // 419: ldc2_w 216466484514828378
      // 41c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 41f: aconst_null
      // 420: dup2_x1
      // 421: pop2
      // 422: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 425: iload 0
      // 426: ifeq 437
      // 429: iinc 3 1
      // 42c: iload 0
      // 42d: ifeq 323
      // 430: goto 437
      // 433: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 436: athrow
      // 437: ldc2_w 216466484514828378
      // 43a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 43d: aconst_null
      // 43e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 441: checkcast com/finalshell/core/Gs2_2
      // 444: ifnull 45d
      // 447: invokestatic java/lang/System.currentTimeMillis ()J
      // 44a: ldc2_w 300244682022475077
      // 44d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 450: aconst_null
      // 451: dup2_x2
      // 452: pop2
      // 453: invokevirtual java/lang/reflect/Field.setLong (Ljava/lang/Object;J)V
      // 456: goto 45d
      // 459: invokestatic com/finalshell/core/Cf2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45c: athrow
      // 45d: return
   }

   static PipedInputStream g(InputStream var0, int var1) {
      PipedOutputStream var2 = new PipedOutputStream();
      PipedInputStream var3 = null;

      try {
         var3 = new PipedInputStream(var2);
         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10001 = Registry.packArgs(new com.finalshell.task.Yc4(var0, var1, var2));
         long var6 = 434592463220957006L;
         Object[] var5 = var10001;
         Ref.h(434592463220957006L, var5, var6);

         try {
            ;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      } catch (IOException var8) {
         var8.printStackTrace();
      }

      return var3;
   }

   public static byte[] m() {
      StringBuffer var1 = new StringBuffer();
      var1.append(a(11860, 8744));
      var1.append(a(11861, -11359));
      var1.append(a(11853, 10157));
      var1.append(a(11864, -13200) + Math.abs(((Random)Registry.lookupField(627307116923973904L).get(null)).nextInt()) + a(11852, -16722));
      int var10000 = BS.s();
      var1.append(a(11854, -5256));
      var1.append(a(11859, 31884));
      var1.append(a(11852, -16722));
      String var2 = var1.toString();
      int var0 = var10000;
      byte[] var3 = var2.getBytes();
      int var4 = var3.length;
      if (Ky4.F$arrString() != null) {
         BS.q(++var0);
      }

      return var3;
   }

   public static byte[] v(int var0) {
      StringBuffer var2 = new StringBuffer();
      new StringBuilder();
      Object[] var10001 = Registry.packArgs(5 + ((Random)Registry.lookupField(627307116923973904L).get(null)).nextInt(a(1612, 3269765134917874385L)));
      long var6 = 464590328393221700L;
      Object var10002 = Ref.h2(464590328393221700L, var6);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      String var3 = var10001.append((String)var10002).append(a(11851, -26114)).toString();
      new StringBuilder().append(a(11846, -3882));
      Object[] var10003 = Registry.packArgs(
         a(31289, 2273142890505424550L) + ((Random)Registry.lookupField(627307116923973904L).get(null)).nextInt(a(21049, 3191785575528982181L))
      );
      long var8 = 464590328393221700L;
      Object var10004 = Ref.h2(464590328393221700L, var8);

      try {
         var10004 = (String)var10004;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      StringBuilder var16 = var10003.append((String)var10004).append(".");
      var10004 = Registry.packArgs(2 + ((Random)Registry.lookupField(627307116923973904L).get(null)).nextInt(5));
      long var10 = 464590328393221700L;
      Object var10005 = Ref.h2(464590328393221700L, var10);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      var16.append(var10004.append((String)var10005).append(a(11844, 14077)).toString());
      var2.append(a(11862, -4852));
      int var17 = BS.t();
      var2.append(a(11865, 316));
      var2.append(a(11841, -15008));
      var2.append(a(11869, 4468));
      var2.append(a(11867, 27614) + var3 + a(11848, -31303));
      int var1 = var17;
      var2.append(a(11845, 2284));
      var2.append(a(11852, -16722));
      String var4 = var2.toString();
      byte[] var5 = var4.getBytes();
      if (var1 != 0) {
         Ky4.K(new String[1]);
      }

      return var5;
   }

   public static String A(int var0) {
      String var2 = a(11856, 25347);
      int var10000 = BS.s();
      Random var3 = new Random();
      int var1 = var10000;
      StringBuffer var4 = new StringBuffer();
      int var5 = 0;

      while (true) {
         if (var5 < var0) {
            int var6 = var3.nextInt(var2.length());
            var7 = var4.append(var2.charAt(var6));
            if (var1 == 0) {
               break;
            }

            var5++;
            if (var1 != 0) {
      int var7;
               continue;
            }
         }

         var7 = var4;
         break;
      }

      return var7.toString();
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 11848) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 220;
               break;
            case 1:
               var10000 = 253;
               break;
            case 2:
               var10000 = 247;
               break;
            case 3:
               var10000 = 179;
               break;
            case 4:
               var10000 = 174;
               break;
            case 5:
               var10000 = 64;
               break;
            case 6:
               var10000 = 110;
               break;
            case 7:
               var10000 = 159;
               break;
            case 8:
               var10000 = 36;
               break;
            case 9:
               var10000 = 252;
               break;
            case 10:
               var10000 = 152;
               break;
            case 11:
               var10000 = 91;
               break;
            case 12:
               var10000 = 81;
               break;
            case 13:
               var10000 = 67;
               break;
            case 14:
               var10000 = 162;
               break;
            case 15:
               var10000 = 160;
               break;
            case 16:
               var10000 = 96;
               break;
            case 17:
               var10000 = 49;
               break;
            case 18:
               var10000 = 50;
               break;
            case 19:
               var10000 = 32;
               break;
            case 20:
               var10000 = 201;
               break;
            case 21:
               var10000 = 132;
               break;
            case 22:
               var10000 = 35;
               break;
            case 23:
               var10000 = 150;
               break;
            case 24:
               var10000 = 127;
               break;
            case 25:
               var10000 = 85;
               break;
            case 26:
               var10000 = 0;
               break;
            case 27:
               var10000 = 62;
               break;
            case 28:
               var10000 = 144;
               break;
            case 29:
               var10000 = 195;
               break;
            case 30:
               var10000 = 207;
               break;
            case 31:
               var10000 = 4;
               break;
            case 32:
               var10000 = 153;
               break;
            case 33:
               var10000 = 241;
               break;
            case 34:
               var10000 = 58;
               break;
            case 35:
               var10000 = 54;
               break;
            case 36:
               var10000 = 88;
               break;
            case 37:
               var10000 = 108;
               break;
            case 38:
               var10000 = 208;
               break;
            case 39:
               var10000 = 52;
               break;
            case 40:
               var10000 = 13;
               break;
            case 41:
               var10000 = 66;
               break;
            case 42:
               var10000 = 176;
               break;
            case 43:
               var10000 = 237;
               break;
            case 44:
               var10000 = 180;
               break;
            case 45:
               var10000 = 56;
               break;
            case 46:
               var10000 = 175;
               break;
            case 47:
               var10000 = 173;
               break;
            case 48:
               var10000 = 184;
               break;
            case 49:
               var10000 = 189;
               break;
            case 50:
               var10000 = 255;
               break;
            case 51:
               var10000 = 171;
               break;
            case 52:
               var10000 = 248;
               break;
            case 53:
               var10000 = 37;
               break;
            case 54:
               var10000 = 242;
               break;
            case 55:
               var10000 = 77;
               break;
            case 56:
               var10000 = 240;
               break;
            case 57:
               var10000 = 183;
               break;
            case 58:
               var10000 = 68;
               break;
            case 59:
               var10000 = 39;
               break;
            case 60:
               var10000 = 121;
               break;
            case 61:
               var10000 = 217;
               break;
            case 62:
               var10000 = 46;
               break;
            case 63:
               var10000 = 163;
               break;
            case 64:
               var10000 = 118;
               break;
            case 65:
               var10000 = 202;
               break;
            case 66:
               var10000 = 143;
               break;
            case 67:
               var10000 = 29;
               break;
            case 68:
               var10000 = 210;
               break;
            case 69:
               var10000 = 111;
               break;
            case 70:
               var10000 = 224;
               break;
            case 71:
               var10000 = 223;
               break;
            case 72:
               var10000 = 19;
               break;
            case 73:
               var10000 = 71;
               break;
            case 74:
               var10000 = 164;
               break;
            case 75:
               var10000 = 86;
               break;
            case 76:
               var10000 = 231;
               break;
            case 77:
               var10000 = 72;
               break;
            case 78:
               var10000 = 42;
               break;
            case 79:
               var10000 = 63;
               break;
            case 80:
               var10000 = 161;
               break;
            case 81:
               var10000 = 65;
               break;
            case 82:
               var10000 = 41;
               break;
            case 83:
               var10000 = 181;
               break;
            case 84:
               var10000 = 2;
               break;
            case 85:
               var10000 = 97;
               break;
            case 86:
               var10000 = 5;
               break;
            case 87:
               var10000 = 244;
               break;
            case 88:
               var10000 = 232;
               break;
            case 89:
               var10000 = 89;
               break;
            case 90:
               var10000 = 14;
               break;
            case 91:
               var10000 = 105;
               break;
            case 92:
               var10000 = 84;
               break;
            case 93:
               var10000 = 165;
               break;
            case 94:
               var10000 = 6;
               break;
            case 95:
               var10000 = 23;
               break;
            case 96:
               var10000 = 128;
               break;
            case 97:
               var10000 = 182;
               break;
            case 98:
               var10000 = 55;
               break;
            case 99:
               var10000 = 155;
               break;
            case 100:
               var10000 = 126;
               break;
            case 101:
               var10000 = 239;
               break;
            case 102:
               var10000 = 47;
               break;
            case 103:
               var10000 = 92;
               break;
            case 104:
               var10000 = 69;
               break;
            case 105:
               var10000 = 27;
               break;
            case 106:
               var10000 = 234;
               break;
            case 107:
               var10000 = 137;
               break;
            case 108:
               var10000 = 16;
               break;
            case 109:
               var10000 = 78;
               break;
            case 110:
               var10000 = 133;
               break;
            case 111:
               var10000 = 70;
               break;
            case 112:
               var10000 = 73;
               break;
            case 113:
               var10000 = 212;
               break;
            case 114:
               var10000 = 199;
               break;
            case 115:
               var10000 = 113;
               break;
            case 116:
               var10000 = 192;
               break;
            case 117:
               var10000 = 134;
               break;
            case 118:
               var10000 = 130;
               break;
            case 119:
               var10000 = 197;
               break;
            case 120:
               var10000 = 219;
               break;
            case 121:
               var10000 = 3;
               break;
            case 122:
               var10000 = 193;
               break;
            case 123:
               var10000 = 229;
               break;
            case 124:
               var10000 = 20;
               break;
            case 125:
               var10000 = 102;
               break;
            case 126:
               var10000 = 214;
               break;
            case 127:
               var10000 = 198;
               break;
            case 128:
               var10000 = 222;
               break;
            case 129:
               var10000 = 120;
               break;
            case 130:
               var10000 = 95;
               break;
            case 131:
               var10000 = 18;
               break;
            case 132:
               var10000 = 124;
               break;
            case 133:
               var10000 = 38;
               break;
            case 134:
               var10000 = 235;
               break;
            case 135:
               var10000 = 53;
               break;
            case 136:
               var10000 = 221;
               break;
            case 137:
               var10000 = 246;
               break;
            case 138:
               var10000 = 12;
               break;
            case 139:
               var10000 = 21;
               break;
            case 140:
               var10000 = 216;
               break;
            case 141:
               var10000 = 139;
               break;
            case 142:
               var10000 = 129;
               break;
            case 143:
               var10000 = 147;
               break;
            case 144:
               var10000 = 48;
               break;
            case 145:
               var10000 = 249;
               break;
            case 146:
               var10000 = 103;
               break;
            case 147:
               var10000 = 9;
               break;
            case 148:
               var10000 = 8;
               break;
            case 149:
               var10000 = 131;
               break;
            case 150:
               var10000 = 169;
               break;
            case 151:
               var10000 = 125;
               break;
            case 152:
               var10000 = 177;
               break;
            case 153:
               var10000 = 228;
               break;
            case 154:
               var10000 = 254;
               break;
            case 155:
               var10000 = 140;
               break;
            case 156:
               var10000 = 10;
               break;
            case 157:
               var10000 = 138;
               break;
            case 158:
               var10000 = 100;
               break;
            case 159:
               var10000 = 34;
               break;
            case 160:
               var10000 = 188;
               break;
            case 161:
               var10000 = 44;
               break;
            case 162:
               var10000 = 114;
               break;
            case 163:
               var10000 = 40;
               break;
            case 164:
               var10000 = 123;
               break;
            case 165:
               var10000 = 43;
               break;
            case 166:
               var10000 = 30;
               break;
            case 167:
               var10000 = 211;
               break;
            case 168:
               var10000 = 31;
               break;
            case 169:
               var10000 = 196;
               break;
            case 170:
               var10000 = 83;
               break;
            case 171:
               var10000 = 33;
               break;
            case 172:
               var10000 = 82;
               break;
            case 173:
               var10000 = 251;
               break;
            case 174:
               var10000 = 205;
               break;
            case 175:
               var10000 = 112;
               break;
            case 176:
               var10000 = 218;
               break;
            case 177:
               var10000 = 51;
               break;
            case 178:
               var10000 = 119;
               break;
            case 179:
               var10000 = 106;
               break;
            case 180:
               var10000 = 178;
               break;
            case 181:
               var10000 = 225;
               break;
            case 182:
               var10000 = 17;
               break;
            case 183:
               var10000 = 28;
               break;
            case 184:
               var10000 = 203;
               break;
            case 185:
               var10000 = 250;
               break;
            case 186:
               var10000 = 227;
               break;
            case 187:
               var10000 = 76;
               break;
            case 188:
               var10000 = 60;
               break;
            case 189:
               var10000 = 213;
               break;
            case 190:
               var10000 = 25;
               break;
            case 191:
               var10000 = 142;
               break;
            case 192:
               var10000 = 135;
               break;
            case 193:
               var10000 = 148;
               break;
            case 194:
               var10000 = 166;
               break;
            case 195:
               var10000 = 24;
               break;
            case 196:
               var10000 = 94;
               break;
            case 197:
               var10000 = 116;
               break;
            case 198:
               var10000 = 80;
               break;
            case 199:
               var10000 = 99;
               break;
            case 200:
               var10000 = 209;
               break;
            case 201:
               var10000 = 59;
               break;
            case 202:
               var10000 = 141;
               break;
            case 203:
               var10000 = 194;
               break;
            case 204:
               var10000 = 109;
               break;
            case 205:
               var10000 = 122;
               break;
            case 206:
               var10000 = 98;
               break;
            case 207:
               var10000 = 170;
               break;
            case 208:
               var10000 = 190;
               break;
            case 209:
               var10000 = 233;
               break;
            case 210:
               var10000 = 1;
               break;
            case 211:
               var10000 = 75;
               break;
            case 212:
               var10000 = 236;
               break;
            case 213:
               var10000 = 154;
               break;
            case 214:
               var10000 = 115;
               break;
            case 215:
               var10000 = 158;
               break;
            case 216:
               var10000 = 167;
               break;
            case 217:
               var10000 = 226;
               break;
            case 218:
               var10000 = 172;
               break;
            case 219:
               var10000 = 104;
               break;
            case 220:
               var10000 = 145;
               break;
            case 221:
               var10000 = 11;
               break;
            case 222:
               var10000 = 79;
               break;
            case 223:
               var10000 = 151;
               break;
            case 224:
               var10000 = 168;
               break;
            case 225:
               var10000 = 191;
               break;
            case 226:
               var10000 = 7;
               break;
            case 227:
               var10000 = 243;
               break;
            case 228:
               var10000 = 74;
               break;
            case 229:
               var10000 = 146;
               break;
            case 230:
               var10000 = 136;
               break;
            case 231:
               var10000 = 107;
               break;
            case 232:
               var10000 = 45;
               break;
            case 233:
               var10000 = 186;
               break;
            case 234:
               var10000 = 204;
               break;
            case 235:
               var10000 = 57;
               break;
            case 236:
               var10000 = 22;
               break;
            case 237:
               var10000 = 93;
               break;
            case 238:
               var10000 = 26;
               break;
            case 239:
               var10000 = 61;
               break;
            case 240:
               var10000 = 206;
               break;
            case 241:
               var10000 = 187;
               break;
            case 242:
               var10000 = 90;
               break;
            case 243:
               var10000 = 215;
               break;
            case 244:
               var10000 = 87;
               break;
            case 245:
               var10000 = 157;
               break;
            case 246:
               var10000 = 156;
               break;
            case 247:
               var10000 = 149;
               break;
            case 248:
               var10000 = 185;
               break;
            case 249:
               var10000 = 200;
               break;
            case 250:
               var10000 = 117;
               break;
            case 251:
               var10000 = 101;
               break;
            case 252:
               var10000 = 245;
               break;
            case 253:
               var10000 = 15;
               break;
            case 254:
               var10000 = 230;
               break;
            default:
               var10000 = 238;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13464;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 10931) & 32767;
      if (f[var3] == null) {
         f[var3] = e[var3] ^ var1;
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[35];
      int var19 = 0;
      String var18 = "\u0006v\u0005南让锘诮\u0090\u0004nÆ\u008ca\u0004¼g^Á\u0002ê\u0096\u0016Jé\u000e\u00186\u0017>=²\u009c3Ý7ã¬ÿ\u0085ê\u000b}\u000eÏ\u0018Eÿ \\Zâ]M¢Î£Òë°M3\u0000\u0016lk±;\u001fé\u0004\u000bwGF\u0005øgïtç \u0018TD¯\u007fá\u0017ô\u0098]\u0090HP$^\u0081-esç\u0080ãÒüT\u0099\u0086S2ÞüW\t茨华助邕芋灞夹贗\u008d\t辝捱剛遯杚则嘤姰赘\u000bG}Õõ¼æWOPBX\u0018\u008d\u008e¹ry'9õ.Ù20Ùì\u000b¸ÈguE\u0092þ{Q\u0005Fq~¬¶\u000bL$X\u0089\u0018H\u0081ä!\u009eÑ\u0010;°o¯£Èbàf¼(±{~Ø\u0016\u0018\u0001ãgY\u001b?\u009b&\u0006\"¥\u001a÷T¡§\u0090¼Ö&WuPn\u0005C&\u0098\\\t\u0006ÏV\u0086s\u007f\u001d\tô£ýQg$\u009c4èV\u0018\u0090Ô2ö\u0092\u009a)*Õ\u0093èëý\u0094È\u0086~Ø¨È\u0086&V\u00951_^¼\u009bEÍ\u0099Cè¸iP£RêêA+õ£ýO:ÌÝ_¿\u0018\u009ej²\u009aZÐaÓ®½³¿?XI¦x^\u0013É\u0016±3ç(\u001c\u000e÷\u0013\u0095ó\u0012\u0007§\u0014\nwµ=5\u0004\u0096j\u0089ô\u0017\u0097?\u0091âÐ{\u001fÚ\u009f\u001eÔäàÄg(é\"9AL¿\u0018\u0004ê`Þk\b;#¶iÔ_=j(Ëüq&`ù\u001aÆqdÏ7\u0014¤é\\MÖ6ñH2±\u009eSö\u000fÜ`mÏ\u0006ø\u0095ÛZº¢X\u0016\u0011jg\u0015-Ûg4½Ñßa7\u00934j±( ^\u00adÍEhËU\u0012\n[\u0006þL\u001e´¤?\u009dª_ «#_c&x\u0083ÑcC%|§\u00ad³\u0090\u0081\u0006ßm{´\u001d\f\u001d¨ñòW\u0084H\u0094y\u0002©ö\u0097*£Ó\u0011ñíTN\u0007÷½Ìy\u0016îNÑ\u0096\u0002<µM\u0006ç\u001c¨\u009agÉR\u0010\u0018åjfïÈ\u008dÅ7ÔB\u008bÂÁÃeõª\u0013[á¸\u000eùcßO\u0090×«\u0010\u0012.RÎ3\u00072Je(SOä³QÛøôý(_\u0091\u0084\u0081Àªáòe\u0088däx\u000b\u0007é\r\u0006劏遈夹趟\u008aû\u0006劅逜奸贕¡ª";
      int var20 = "\u0006v\u0005南让锘诮\u0090\u0004nÆ\u008ca\u0004¼g^Á\u0002ê\u0096\u0016Jé\u000e\u00186\u0017>=²\u009c3Ý7ã¬ÿ\u0085ê\u000b}\u000eÏ\u0018Eÿ \\Zâ]M¢Î£Òë°M3\u0000\u0016lk±;\u001fé\u0004\u000bwGF\u0005øgïtç \u0018TD¯\u007fá\u0017ô\u0098]\u0090HP$^\u0081-esç\u0080ãÒüT\u0099\u0086S2ÞüW\t茨华助邕芋灞夹贗\u008d\t辝捱剛遯杚则嘤姰赘\u000bG}Õõ¼æWOPBX\u0018\u008d\u008e¹ry'9õ.Ù20Ùì\u000b¸ÈguE\u0092þ{Q\u0005Fq~¬¶\u000bL$X\u0089\u0018H\u0081ä!\u009eÑ\u0010;°o¯£Èbàf¼(±{~Ø\u0016\u0018\u0001ãgY\u001b?\u009b&\u0006\"¥\u001a÷T¡§\u0090¼Ö&WuPn\u0005C&\u0098\\\t\u0006ÏV\u0086s\u007f\u001d\tô£ýQg$\u009c4èV\u0018\u0090Ô2ö\u0092\u009a)*Õ\u0093èëý\u0094È\u0086~Ø¨È\u0086&V\u00951_^¼\u009bEÍ\u0099Cè¸iP£RêêA+õ£ýO:ÌÝ_¿\u0018\u009ej²\u009aZÐaÓ®½³¿?XI¦x^\u0013É\u0016±3ç(\u001c\u000e÷\u0013\u0095ó\u0012\u0007§\u0014\nwµ=5\u0004\u0096j\u0089ô\u0017\u0097?\u0091âÐ{\u001fÚ\u009f\u001eÔäàÄg(é\"9AL¿\u0018\u0004ê`Þk\b;#¶iÔ_=j(Ëüq&`ù\u001aÆqdÏ7\u0014¤é\\MÖ6ñH2±\u009eSö\u000fÜ`mÏ\u0006ø\u0095ÛZº¢X\u0016\u0011jg\u0015-Ûg4½Ñßa7\u00934j±( ^\u00adÍEhËU\u0012\n[\u0006þL\u001e´¤?\u009dª_ «#_c&x\u0083ÑcC%|§\u00ad³\u0090\u0081\u0006ßm{´\u001d\f\u001d¨ñòW\u0084H\u0094y\u0002©ö\u0097*£Ó\u0011ñíTN\u0007÷½Ìy\u0016îNÑ\u0096\u0002<µM\u0006ç\u001c¨\u009agÉR\u0010\u0018åjfïÈ\u008dÅ7ÔB\u008bÂÁÃeõª\u0013[á¸\u000eùcßO\u0090×«\u0010\u0012.RÎ3\u00072Je(SOä³QÛøôý(_\u0091\u0084\u0081Àªáòe\u0088däx\u000b\u0007é\r\u0006劏遈夹趟\u008aû\u0006劅逜奸贕¡ª"
         .length();
      char var17 = 2;
      int var25 = -1;

      label79:
      while (true) {
         byte var10000 = 73;
         String var10001 = var18.substring(++var25, var25 + var17);
         byte var10002 = -1;

         while (true) {
            label74: {
               char[] var49 = var10001.toCharArray();
               int var10004 = var49.length;
               int var22 = 0;
               byte var52 = var10000;
               var43 = var49;
               int var32 = var10004;
               byte var60;
               char[] var67;
               int var10006;
               if (var10004 <= 1) {
                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               } else {
                  var52 = var10000;
                  var32 = var10004;
                  if (var10004 <= var22) {
                     break label74;
                  }

                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var76 = var67[var10006];
                  byte var77;
                  switch (var22 % 7) {
                     case 0:
                        var77 = 26;
                        break;
                     case 1:
                        var77 = 17;
                        break;
                     case 2:
                        var77 = 110;
                        break;
                     case 3:
                        var77 = 13;
                        break;
                     case 4:
                        var77 = 37;
                        break;
                     case 5:
                        var77 = 104;
                        break;
                     default:
                        var77 = 111;
                  }

                  var67[var10006] = (char)(var76 ^ var60 ^ var77);
                  var22++;
                  if (var52 == 0) {
                     var10006 = var52;
                     var67 = var43;
                     var60 = var52;
                  } else {
                     if (var32 <= var22) {
                        break;
                     }

                     var67 = var43;
                     var60 = var52;
                     var10006 = var22;
                  }
               }
            }

            String var54 = new String(var43).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var54;
                  if ((var25 += var17) >= var20) {
                     a = var21;
                     b = new String[35];
                     long var8 = 2903250936718110196L;
                     long[] var14 = new long[9];
                     int var11 = 0;
                     String var12 = "\u0014<â\u0090\u000bÌEÅh3\u009b\u001bæCØ¶KAô?¾\u0083H&\\+Õ\\5¢1ä)o3\f¼yË[ý»if½[\u009f/\u000bðß\u0092)º? ";
                     int var13 = "\u0014<â\u0090\u000bÌEÅh3\u009b\u001bæCØ¶KAô?¾\u0083H&\\+Õ\\5¢1ä)o3\f¼yË[ý»if½[\u009f/\u000bðß\u0092)º? ".length();
                     byte var10 = 0;

                     label53:
                     while (true) {
                        byte var34 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var34, var10).getBytes("ISO-8859-1");
                        long[] var27 = var14;
                        int var35 = var11++;
                        long var47 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var55 = -1;

                        while (true) {
                           long var65 = var47 ^ var8;
                           switch (var55) {
                              case 0:
                                 var27[var35] = var65;
                                 if (var10 >= var13) {
                                    c = var14;
                                    d = new Integer[9];
                                    long var0 = 6049596472976560850L;
                                    long[] var6 = new long[3];
                                    int var3 = 0;
                                    String var4 = "g¯3\u0013ªt×\u0001;Üë\u0000ð\u0017\u0091\u008b\r\u009aE÷%?!\"";
                                    int var5 = "g¯3\u0013ªt×\u0001;Üë\u0000ð\u0017\u0091\u008b\r\u009aE÷%?!\"".length();
                                    byte var2 = 0;

                                    do {
                                       byte var37 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                                       int var38 = var3++;
                                       var65 = (
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
                                       byte var57 = -1;
                                       var6[var38] = var65;
                                    } while (var2 < var5);

                                    e = var6;
                                    f = new Long[3];
                                    Registry.lookupField(476905874216232788L).setLong(null, b(27015, 7505408140925387573L));
                                    Registry.lookupField(585559697342324666L).setInt(null, a(6346, 953542548765092948L));
                                    Registry.lookupField(438344830618821847L).set(null, new ArrayList());
                                    Registry.lookupField(300244682022475077L).setLong(null, 0L);
                                    Registry.lookupField(627307116923973904L).set(null, new Random());
                                    return;
                                 }
                                 break;
                              default:
                                 var27[var35] = var65;
                                 if (var10 < var13) {
                                    continue label53;
                                 }

                                 var12 = "@m\u0002Z\u0018 ãZ\u0007ñ;ä²ÍR\u001c";
                                 var13 = "@m\u0002Z\u0018 ãZ\u0007ñ;ä²ÍR\u001c".length();
                                 var10 = 0;
                           }

                           byte var36 = var10;
                           var10 += 8;
                           var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                           var27 = var14;
                           var35 = var11++;
                           var47 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var55 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var25);
                  break;
               default:
                  var21[var19++] = var54;
                  if ((var25 += var17) < var20) {
                     var17 = var18.charAt(var25);
                     continue label79;
                  }

                  var18 = "'Ø¤¹\u0005w\"\u001a)\u0096";
                  var20 = "'Ø¤¹\u0005w\"\u001a)\u0096".length();
                  var17 = 4;
                  var25 = -1;
            }

            var10000 = 68;
            var10001 = var18.substring(++var25, var25 + var17);
            var10002 = 0;
         }
      }
   }
}






