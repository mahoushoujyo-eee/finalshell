import com.Pc_2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class y__2 {
   public static void v(ArrayList param0, com.DI param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic YE.n ()[I
      // 003: aload 0
      // 004: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 007: astore 3
      // 008: astore 2
      // 009: aload 3
      // 00a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 00f: ifeq 261
      // 012: aload 3
      // 013: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 018: checkcast YE
      // 01b: astore 4
      // 01d: aconst_null
      // 01e: astore 5
      // 020: aload 4
      // 022: invokestatic com/c.f ()[Ljava/lang/Object;
      // 025: ldc2_w 406140209836756951
      // 028: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 02b: dup_x2
      // 02c: pop
      // 02d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 030: checkcast java/lang/String
      // 033: goto 03a
      // 036: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 2
      // 03b: ifnonnull 085
      // 03e: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 041: ldc2_w 330094358428833085
      // 044: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 047: swap
      // 048: aconst_null
      // 049: swap
      // 04a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 04d: checkcast java/lang/Boolean
      // 050: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 053: goto 05a
      // 056: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 059: athrow
      // 05a: ifne 087
      // 05d: goto 064
      // 060: invokestatic y__2.a (Lcom/Pc_2;)Lcom/Pc_2;
      // 063: athrow
      // 064: aload 4
      // 066: invokestatic com/c.f ()[Ljava/lang/Object;
      // 069: ldc2_w 406140209836756951
      // 06c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 06f: dup_x2
      // 070: pop
      // 071: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 074: checkcast java/lang/String
      // 077: goto 07e
      // 07a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: goto 085
      // 081: invokestatic y__2.a (Lcom/Pc_2;)Lcom/Pc_2;
      // 084: athrow
      // 085: astore 5
      // 087: aload 4
      // 089: invokestatic com/c.f ()[Ljava/lang/Object;
      // 08c: ldc2_w 471582560640574154
      // 08f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 092: dup_x2
      // 093: pop
      // 094: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 097: checkcast java/lang/Integer
      // 09a: invokevirtual java/lang/Integer.intValue ()I
      // 09d: goto 0a4
      // 0a0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a3: athrow
      // 0a4: ldc2_w 314583299194608155
      // 0a7: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0aa: aconst_null
      // 0ab: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0ae: aload 2
      // 0af: ifnonnull 14f
      // 0b2: if_icmpne 121
      // 0b5: goto 0bc
      // 0b8: invokestatic y__2.a (Lcom/Pc_2;)Lcom/Pc_2;
      // 0bb: athrow
      // 0bc: aload 1
      // 0bd: aload 5
      // 0bf: aload 4
      // 0c1: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0c4: ldc2_w 437259655987883724
      // 0c7: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0ca: dup_x2
      // 0cb: pop
      // 0cc: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0cf: checkcast java/lang/Integer
      // 0d2: invokevirtual java/lang/Integer.intValue ()I
      // 0d5: goto 0dc
      // 0d8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: aload 4
      // 0de: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0e1: ldc2_w 531077488409752038
      // 0e4: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0e7: dup_x2
      // 0e8: pop
      // 0e9: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0ec: checkcast java/lang/String
      // 0ef: goto 0f6
      // 0f2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: aload 4
      // 0f8: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0fb: ldc2_w 595134275840130239
      // 0fe: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 101: dup_x2
      // 102: pop
      // 103: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 106: checkcast java/lang/Integer
      // 109: invokevirtual java/lang/Integer.intValue ()I
      // 10c: goto 113
      // 10f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 112: athrow
      // 113: bipush 0
      // 114: invokevirtual com/DI.O (Ljava/lang/String;ILjava/lang/String;IZ)I
      // 117: pop
      // 118: goto 25d
      // 11b: astore 6
      // 11d: aload 2
      // 11e: ifnull 25d
      // 121: aload 4
      // 123: invokestatic com/c.f ()[Ljava/lang/Object;
      // 126: ldc2_w 471582560640574154
      // 129: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 12c: dup_x2
      // 12d: pop
      // 12e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 131: checkcast java/lang/Integer
      // 134: invokevirtual java/lang/Integer.intValue ()I
      // 137: goto 13e
      // 13a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: ldc2_w 343042688357189616
      // 141: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 144: aconst_null
      // 145: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 148: goto 14f
      // 14b: invokestatic y__2.a (Lcom/Pc_2;)Lcom/Pc_2;
      // 14e: athrow
      // 14f: aload 2
      // 150: ifnonnull 1f9
      // 153: if_icmpne 1c0
      // 156: goto 15d
      // 159: invokestatic y__2.a (Lcom/Pc_2;)Lcom/Pc_2;
      // 15c: athrow
      // 15d: aload 1
      // 15e: aload 5
      // 160: aload 4
      // 162: invokestatic com/c.f ()[Ljava/lang/Object;
      // 165: ldc2_w 437259655987883724
      // 168: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 16b: dup_x2
      // 16c: pop
      // 16d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 170: checkcast java/lang/Integer
      // 173: invokevirtual java/lang/Integer.intValue ()I
      // 176: goto 17d
      // 179: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17c: athrow
      // 17d: aload 4
      // 17f: invokestatic com/c.f ()[Ljava/lang/Object;
      // 182: ldc2_w 531077488409752038
      // 185: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 188: dup_x2
      // 189: pop
      // 18a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 18d: checkcast java/lang/String
      // 190: goto 197
      // 193: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 196: athrow
      // 197: aload 4
      // 199: invokestatic com/c.f ()[Ljava/lang/Object;
      // 19c: ldc2_w 595134275840130239
      // 19f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1a2: dup_x2
      // 1a3: pop
      // 1a4: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1a7: checkcast java/lang/Integer
      // 1aa: invokevirtual java/lang/Integer.intValue ()I
      // 1ad: goto 1b4
      // 1b0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b3: athrow
      // 1b4: invokevirtual com/DI.E (Ljava/lang/String;ILjava/lang/String;I)V
      // 1b7: goto 25d
      // 1ba: astore 6
      // 1bc: aload 2
      // 1bd: ifnull 25d
      // 1c0: aload 4
      // 1c2: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1c5: ldc2_w 471582560640574154
      // 1c8: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1cb: dup_x2
      // 1cc: pop
      // 1cd: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1d0: checkcast java/lang/Integer
      // 1d3: invokevirtual java/lang/Integer.intValue ()I
      // 1d6: goto 1dd
      // 1d9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1dc: athrow
      // 1dd: aload 2
      // 1de: ifnonnull 257
      // 1e1: goto 1e8
      // 1e4: invokestatic y__2.a (Lcom/Pc_2;)Lcom/Pc_2;
      // 1e7: athrow
      // 1e8: ldc2_w 297191265528158022
      // 1eb: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1ee: aconst_null
      // 1ef: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 1f2: goto 1f9
      // 1f5: invokestatic y__2.a (Lcom/Pc_2;)Lcom/Pc_2;
      // 1f8: athrow
      // 1f9: if_icmpne 25d
      // 1fc: aload 1
      // 1fd: aload 5
      // 1ff: aload 4
      // 201: invokestatic com/c.f ()[Ljava/lang/Object;
      // 204: ldc2_w 437259655987883724
      // 207: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 20a: dup_x2
      // 20b: pop
      // 20c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 20f: checkcast java/lang/Integer
      // 212: invokevirtual java/lang/Integer.intValue ()I
      // 215: goto 21c
      // 218: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 21b: athrow
      // 21c: aload 4
      // 21e: invokestatic com/c.f ()[Ljava/lang/Object;
      // 221: ldc2_w 531077488409752038
      // 224: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 227: dup_x2
      // 228: pop
      // 229: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 22c: checkcast java/lang/String
      // 22f: goto 236
      // 232: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 235: athrow
      // 236: aload 4
      // 238: invokestatic com/c.f ()[Ljava/lang/Object;
      // 23b: ldc2_w 595134275840130239
      // 23e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 241: dup_x2
      // 242: pop
      // 243: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 246: checkcast java/lang/Integer
      // 249: invokevirtual java/lang/Integer.intValue ()I
      // 24c: goto 253
      // 24f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 252: athrow
      // 253: bipush 1
      // 254: invokevirtual com/DI.O (Ljava/lang/String;ILjava/lang/String;IZ)I
      // 257: pop
      // 258: goto 25d
      // 25b: astore 6
      // 25d: aload 2
      // 25e: ifnull 009
      // 261: invokestatic com/ky_4.F ()[Ljava/lang/String;
      // 264: ifnull 274
      // 267: bipush 2
      // 268: newarray 10
      // 26a: invokestatic YE.W ([I)V
      // 26d: goto 274
      // 270: invokestatic y__2.a (Lcom/Pc_2;)Lcom/Pc_2;
      // 273: athrow
      // 274: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static void j(ArrayList var0, com.DI var1) {
      int[] var10000 = YE.n();
      Iterator var3 = var0.iterator();
      int[] var2 = var10000;

      while (var3.hasNext()) {
         YE var4 = (YE)var3.next();

         label154: {
            int var27;
            label143: {
               label132: {
                  try {
                     Object[] var10001 = com.c.f();
                     Method var10003 = com.c.d(471582560640574154L);
                     Object[] var10002 = var10001;
                     YE var26 = var4;
                     Method var21 = var10003;

                     try {
                        var22 = (Integer)var21.invoke(var26, var10002);
                     } catch (InvocationTargetException var12) {
                        throw var12.getTargetException();
                     }

                     var27 = com.c.c(314583299194608155L).getInt(null);
                     if (var2 != null) {
                        break label143;
                     }

                     if (var22 != var27) {
                        break label132;
                     }
                  } catch (Pc_2 var19) {
                     throw a(var19);
                  }

                  try {
                     Object[] var40 = com.c.f();
                     Method var10004 = com.c.d(437259655987883724L);
                     Object[] var48 = var40;
                     YE var41 = var4;
                     Method var28 = var10004;

                     try {
                        var27 = (Integer)var28.invoke(var41, var48);
                     } catch (InvocationTargetException var11) {
                        throw var11.getTargetException();
                     }

                     var1.Z(var27);
                     break label154;
                  } catch (Pc_2 var18) {
                     Pc_2 var5 = var18;

                     try {
                        var5.printStackTrace();
                        if (var2 == null) {
                           break label154;
                        }

                        com.ky_4.K(new String[3]);
                     } catch (Pc_2 var13) {
                        throw a(var13);
                     }
                  }
               }

               Object[] var30 = com.c.f();
               Method var49 = com.c.d(471582560640574154L);
               Object[] var42 = var30;
               YE var31 = var4;
               Method var23 = var49;

               try {
                  var22 = (Integer)var23.invoke(var31, var42);
               } catch (InvocationTargetException var10) {
                  throw var10.getTargetException();
               }

               var27 = com.c.c(343042688357189616L).getInt(null);
            }

            label120: {
               label146: {
                  try {
                     if (var2 != null) {
                        break label120;
                     }

                     if (var22 != var27) {
                        break label146;
                     }
                  } catch (Pc_2 var17) {
                     throw a(var17);
                  }

                  Pc_2 var20;
                  try {
                     Object[] var43 = com.c.f();
                     Method var53 = com.c.d(437259655987883724L);
                     Object[] var50 = var43;
                     YE var44 = var4;
                     Method var33 = var53;

                     try {
                        var27 = (Integer)var33.invoke(var44, var50);
                     } catch (InvocationTargetException var9) {
                        throw var9.getTargetException();
                     }

                     var1.u(var27);
                     break label154;
                  } catch (Pc_2 var14) {
                     var20 = var14;
                  }

                  try {
                     var20.printStackTrace();
                     if (var2 == null) {
                        break label154;
                     }
                  } catch (Pc_2 var16) {
                     boolean var32 = false;
                     throw a(var16);
                  }
               }

               try {
                  Object[] var36 = com.c.f();
                  Method var51 = com.c.d(471582560640574154L);
                  Object[] var45 = var36;
                  YE var37 = var4;
                  Method var25 = var51;

                  try {
                     var22 = (Integer)var25.invoke(var37, var45);
                  } catch (InvocationTargetException var8) {
                     throw var8.getTargetException();
                  }

                  var27 = com.c.c(297191265528158022L).getInt(null);
               } catch (Pc_2 var15) {
                  boolean var35 = false;
                  throw a(var15);
               }
            }

            if (var22 == var27) {
               try {
                  Object[] var46 = com.c.f();
                  Method var54 = com.c.d(437259655987883724L);
                  Object[] var52 = var46;
                  YE var47 = var4;
                  Method var38 = var54;

                  try {
                     var27 = (Integer)var38.invoke(var47, var52);
                  } catch (InvocationTargetException var6) {
                     throw var6.getTargetException();
                  }

                  var1.Z(var27);
               } catch (Pc_2 var7) {
                  var7.printStackTrace();
               }
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   private static Pc_2 a(Pc_2 var0) {
      return var0;
   }
}





