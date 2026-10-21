package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

public class Y__2_2 {
   public static void v(ArrayList param0, ConnectHost param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YE.n ()[I
      // 003: aload 0
      // 004: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 007: astore 3
      // 008: astore 2
      // 009: aload 3
      // 00a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 00f: ifeq 2b6
      // 012: aload 3
      // 013: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 018: checkcast com/finalshell/core/YE
      // 01b: astore 4
      // 01d: aconst_null
      // 01e: astore 5
      // 020: aload 4
      // 022: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 025: ldc2_w 406140209836756951
      // 028: astore 8
      // 02a: astore 7
      // 02c: ldc2_w 406140209836756951
      // 02f: aload 7
      // 031: aload 8
      // 033: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 036: checkcast java/lang/String
      // 039: goto 040
      // 03c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03f: athrow
      // 040: aload 2
      // 041: ifnonnull 092
      // 044: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 047: ldc2_w 330094358428833085
      // 04a: astore 9
      // 04c: ldc2_w 330094358428833085
      // 04f: aload 9
      // 051: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 054: checkcast java/lang/Boolean
      // 057: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05a: goto 061
      // 05d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 060: athrow
      // 061: ifne 094
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/Y__2_2.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 06a: athrow
      // 06b: aload 4
      // 06d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 070: ldc2_w 406140209836756951
      // 073: astore 12
      // 075: astore 11
      // 077: ldc2_w 406140209836756951
      // 07a: aload 11
      // 07c: aload 12
      // 07e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 081: checkcast java/lang/String
      // 084: goto 08b
      // 087: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: goto 092
      // 08e: invokestatic com/finalshell/core/Y__2_2.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 091: athrow
      // 092: astore 5
      // 094: aload 4
      // 096: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 099: ldc2_w 471582560640574154
      // 09c: astore 14
      // 09e: astore 13
      // 0a0: ldc2_w 471582560640574154
      // 0a3: aload 13
      // 0a5: aload 14
      // 0a7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0aa: checkcast java/lang/Integer
      // 0ad: invokevirtual java/lang/Integer.intValue ()I
      // 0b0: goto 0b7
      // 0b3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: ldc2_w 314583299194608155
      // 0ba: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0bd: aconst_null
      // 0be: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0c1: aload 2
      // 0c2: ifnonnull 17a
      // 0c5: if_icmpne 146
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/Y__2_2.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 0ce: athrow
      // 0cf: aload 1
      // 0d0: aload 5
      // 0d2: aload 4
      // 0d4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0d7: ldc2_w 437259655987883724
      // 0da: astore 16
      // 0dc: astore 15
      // 0de: ldc2_w 437259655987883724
      // 0e1: aload 15
      // 0e3: aload 16
      // 0e5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e8: checkcast java/lang/Integer
      // 0eb: invokevirtual java/lang/Integer.intValue ()I
      // 0ee: goto 0f5
      // 0f1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: aload 4
      // 0f7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0fa: ldc2_w 531077488409752038
      // 0fd: astore 18
      // 0ff: astore 17
      // 101: ldc2_w 531077488409752038
      // 104: aload 17
      // 106: aload 18
      // 108: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 10b: checkcast java/lang/String
      // 10e: goto 115
      // 111: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 114: athrow
      // 115: aload 4
      // 117: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 11a: ldc2_w 595134275840130239
      // 11d: astore 20
      // 11f: astore 19
      // 121: ldc2_w 595134275840130239
      // 124: aload 19
      // 126: aload 20
      // 128: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 12b: checkcast java/lang/Integer
      // 12e: invokevirtual java/lang/Integer.intValue ()I
      // 131: goto 138
      // 134: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 137: athrow
      // 138: bipush 0
      // 139: invokevirtual com/finalshell/crypto/ConnectHost.O (Ljava/lang/String;ILjava/lang/String;IZ)I
      // 13c: pop
      // 13d: goto 2b2
      // 140: astore 6
      // 142: aload 2
      // 143: ifnull 2b2
      // 146: aload 4
      // 148: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 14b: ldc2_w 471582560640574154
      // 14e: astore 22
      // 150: astore 21
      // 152: ldc2_w 471582560640574154
      // 155: aload 21
      // 157: aload 22
      // 159: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 15c: checkcast java/lang/Integer
      // 15f: invokevirtual java/lang/Integer.intValue ()I
      // 162: goto 169
      // 165: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 168: athrow
      // 169: ldc2_w 343042688357189616
      // 16c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 16f: aconst_null
      // 170: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 173: goto 17a
      // 176: invokestatic com/finalshell/core/Y__2_2.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 179: athrow
      // 17a: aload 2
      // 17b: ifnonnull 23c
      // 17e: if_icmpne 1fd
      // 181: goto 188
      // 184: invokestatic com/finalshell/core/Y__2_2.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 187: athrow
      // 188: aload 1
      // 189: aload 5
      // 18b: aload 4
      // 18d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 190: ldc2_w 437259655987883724
      // 193: astore 24
      // 195: astore 23
      // 197: ldc2_w 437259655987883724
      // 19a: aload 23
      // 19c: aload 24
      // 19e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1a1: checkcast java/lang/Integer
      // 1a4: invokevirtual java/lang/Integer.intValue ()I
      // 1a7: goto 1ae
      // 1aa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ad: athrow
      // 1ae: aload 4
      // 1b0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1b3: ldc2_w 531077488409752038
      // 1b6: astore 26
      // 1b8: astore 25
      // 1ba: ldc2_w 531077488409752038
      // 1bd: aload 25
      // 1bf: aload 26
      // 1c1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c4: checkcast java/lang/String
      // 1c7: goto 1ce
      // 1ca: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1cd: athrow
      // 1ce: aload 4
      // 1d0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1d3: ldc2_w 595134275840130239
      // 1d6: astore 28
      // 1d8: astore 27
      // 1da: ldc2_w 595134275840130239
      // 1dd: aload 27
      // 1df: aload 28
      // 1e1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e4: checkcast java/lang/Integer
      // 1e7: invokevirtual java/lang/Integer.intValue ()I
      // 1ea: goto 1f1
      // 1ed: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f0: athrow
      // 1f1: invokevirtual com/finalshell/crypto/ConnectHost.E (Ljava/lang/String;ILjava/lang/String;I)V
      // 1f4: goto 2b2
      // 1f7: astore 6
      // 1f9: aload 2
      // 1fa: ifnull 2b2
      // 1fd: aload 4
      // 1ff: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 202: ldc2_w 471582560640574154
      // 205: astore 30
      // 207: astore 29
      // 209: ldc2_w 471582560640574154
      // 20c: aload 29
      // 20e: aload 30
      // 210: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 213: checkcast java/lang/Integer
      // 216: invokevirtual java/lang/Integer.intValue ()I
      // 219: goto 220
      // 21c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 21f: athrow
      // 220: aload 2
      // 221: ifnonnull 2ac
      // 224: goto 22b
      // 227: invokestatic com/finalshell/core/Y__2_2.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 22a: athrow
      // 22b: ldc2_w 297191265528158022
      // 22e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 231: aconst_null
      // 232: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 235: goto 23c
      // 238: invokestatic com/finalshell/core/Y__2_2.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 23b: athrow
      // 23c: if_icmpne 2b2
      // 23f: aload 1
      // 240: aload 5
      // 242: aload 4
      // 244: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 247: ldc2_w 437259655987883724
      // 24a: astore 32
      // 24c: astore 31
      // 24e: ldc2_w 437259655987883724
      // 251: aload 31
      // 253: aload 32
      // 255: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 258: checkcast java/lang/Integer
      // 25b: invokevirtual java/lang/Integer.intValue ()I
      // 25e: goto 265
      // 261: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 264: athrow
      // 265: aload 4
      // 267: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 26a: ldc2_w 531077488409752038
      // 26d: astore 34
      // 26f: astore 33
      // 271: ldc2_w 531077488409752038
      // 274: aload 33
      // 276: aload 34
      // 278: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 27b: checkcast java/lang/String
      // 27e: goto 285
      // 281: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 284: athrow
      // 285: aload 4
      // 287: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 28a: ldc2_w 595134275840130239
      // 28d: astore 36
      // 28f: astore 35
      // 291: ldc2_w 595134275840130239
      // 294: aload 35
      // 296: aload 36
      // 298: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 29b: checkcast java/lang/Integer
      // 29e: invokevirtual java/lang/Integer.intValue ()I
      // 2a1: goto 2a8
      // 2a4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a7: athrow
      // 2a8: bipush 1
      // 2a9: invokevirtual com/finalshell/crypto/ConnectHost.O (Ljava/lang/String;ILjava/lang/String;IZ)I
      // 2ac: pop
      // 2ad: goto 2b2
      // 2b0: astore 6
      // 2b2: aload 2
      // 2b3: ifnull 009
      // 2b6: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 2b9: ifnull 2c9
      // 2bc: bipush 2
      // 2bd: newarray 10
      // 2bf: invokestatic com/finalshell/core/YE.W ([I)V
      // 2c2: goto 2c9
      // 2c5: invokestatic com/finalshell/core/Y__2_2.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 2c8: athrow
      // 2c9: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static void j(ArrayList var0, ConnectHost var1) {
      int[] var10000 = YE.n();
      Iterator var3 = var0.iterator();
      int[] var2 = var10000;

      while (var3.hasNext()) {
         YE var4 = (YE)var3.next();

         label154: {
            YE var35;
            int var10002;
            label143: {
               label132: {
                  try {
                     Object[] var10001 = Registry.emptyArgs();
                     long var7 = 471582560640574154L;
                     Object[] var6 = var10001;
                     var35 = (YE)Ref.h(471582560640574154L, var6, var7);

                     try {
                        var35 = (Integer)var35;
                     } catch (InvocationTargetException var24) {
                        throw var24.getTargetException();
                     }

                     var10002 = Registry.lookupField(314583299194608155L).getInt(null);
                     if (var2 != null) {
                        break label143;
                     }

                     if (var35 != var10002) {
                        break label132;
                     }
                  } catch (Pc2 var31) {
                     throw a(var31);
                  }

                  try {
                     Object[] var10003 = Registry.emptyArgs();
                     long var9 = 437259655987883724L;
                     Object[] var8 = var10003;
                     var10003 = Ref.h(437259655987883724L, var8, var9);

                     try {
                        var43 = (Integer)var10003;
                     } catch (InvocationTargetException var23) {
                        throw var23.getTargetException();
                     }

                     var4.Z(var43);
                     break label154;
                  } catch (Pc2 var30) {
                     Pc2 var5 = var30;

                     try {
                        var5.printStackTrace();
                        if (var2 == null) {
                           break label154;
                        }

                        Ky4.K(new String[3]);
                     } catch (Pc2 var25) {
                        throw a(var25);
                     }
                  }
               }

               var35 = var4;
               Object[] var38 = Registry.emptyArgs();
               long var11 = 471582560640574154L;
               Object[] var10 = var38;
               Object var39 = Ref.h(471582560640574154L, var10, var11);

               try {
                  var10002 = (Integer)var39;
               } catch (InvocationTargetException var22) {
                  throw var22.getTargetException();
               }

               Registry.lookupField(343042688357189616L).getInt(null);
            }

            label120: {
               label146: {
                  try {
                     if (var2 != null) {
                        break label120;
                     }

                     if (var35 != var10002) {
                        break label146;
                     }
                  } catch (Pc2 var29) {
                     throw a(var29);
                  }

                  Pc2 var32;
                  try {
                     Object[] var44 = Registry.emptyArgs();
                     long var13 = 437259655987883724L;
                     Object[] var12 = var44;
                     var44 = Ref.h(437259655987883724L, var12, var13);

                     try {
                        var46 = (Integer)var44;
                     } catch (InvocationTargetException var21) {
                        throw var21.getTargetException();
                     }

                     var4.u(var46);
                     break label154;
                  } catch (Pc2 var26) {
                     var32 = var26;
                  }

                  try {
                     var32.printStackTrace();
                     if (var2 == null) {
                        break label154;
                     }
                  } catch (Pc2 var28) {
                     boolean var36 = false;
                     throw a(var28);
                  }
               }

               try {
                  var35 = var4;
                  Object[] var40 = Registry.emptyArgs();
                  long var15 = 471582560640574154L;
                  Object[] var14 = var40;
                  Object var41 = Ref.h(471582560640574154L, var14, var15);

                  try {
                     var10002 = (Integer)var41;
                  } catch (InvocationTargetException var20) {
                     throw var20.getTargetException();
                  }

                  Registry.lookupField(297191265528158022L).getInt(null);
               } catch (Pc2 var27) {
                  boolean var37 = false;
                  throw a(var27);
               }
            }

            if (var35 == var10002) {
               try {
                  Object[] var47 = Registry.emptyArgs();
                  long var17 = 437259655987883724L;
                  Object[] var16 = var47;
                  var47 = Ref.h(437259655987883724L, var16, var17);

                  try {
                     var49 = (Integer)var47;
                  } catch (InvocationTargetException var18) {
                     throw var18.getTargetException();
                  }

                  var4.Z(var49);
               } catch (Pc2 var19) {
                  var19.printStackTrace();
               }
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public static Pc2 a(Pc2 var0) {
      return var0;
   }
}





