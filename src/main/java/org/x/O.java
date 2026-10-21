package org.x;

import java.io.IOException;
import java.io.PrintStream;
import java.text.FieldPosition;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Map;

public final class O {
   private static String J;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   private O() {
   }

   public static void main(String[] param0) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic org/x/O.f ()Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: aload 1
      // 006: ifnull 025
      // 009: arraylength
      // 00a: ifne 024
      // 00d: goto 014
      // 010: invokestatic org/x/O.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 013: athrow
      // 014: sipush -6596
      // 017: sipush 9015
      // 01a: invokestatic org/x/O.a (II)Ljava/lang/String;
      // 01d: goto 027
      // 020: invokestatic org/x/O.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 023: athrow
      // 024: aload 0
      // 025: bipush 0
      // 026: aaload
      // 027: astore 2
      // 028: new java/io/BufferedReader
      // 02b: dup
      // 02c: new java/io/FileReader
      // 02f: dup
      // 030: aload 2
      // 031: invokespecial java/io/FileReader.<init> (Ljava/lang/String;)V
      // 034: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 037: astore 3
      // 038: new java/util/HashMap
      // 03b: dup
      // 03c: invokespecial java/util/HashMap.<init> ()V
      // 03f: astore 4
      // 041: new java/util/ArrayList
      // 044: dup
      // 045: invokespecial java/util/ArrayList.<init> ()V
      // 048: astore 5
      // 04a: new java/util/ArrayList
      // 04d: dup
      // 04e: invokespecial java/util/ArrayList.<init> ()V
      // 051: astore 6
      // 053: aload 3
      // 054: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 057: astore 7
      // 059: aload 7
      // 05b: ifnull 264
      // 05e: aload 1
      // 05f: ifnull 29a
      // 062: goto 069
      // 065: invokestatic org/x/O.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 068: athrow
      // 069: aload 7
      // 06b: sipush -6607
      // 06e: sipush 25275
      // 071: invokestatic org/x/O.a (II)Ljava/lang/String;
      // 074: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 077: aload 1
      // 078: ifnull 11e
      // 07b: goto 082
      // 07e: invokestatic org/x/O.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 081: athrow
      // 082: ifeq 110
      // 085: goto 08c
      // 088: invokestatic org/x/O.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 08b: athrow
      // 08c: aload 3
      // 08d: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 090: pop
      // 091: aload 3
      // 092: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 095: pop
      // 096: goto 09d
      // 099: invokestatic org/x/O.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 09c: athrow
      // 09d: aload 3
      // 09e: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 0a1: astore 7
      // 0a3: aload 7
      // 0a5: sipush -6599
      // 0a8: sipush -13292
      // 0ab: invokestatic org/x/O.a (II)Ljava/lang/String;
      // 0ae: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0b1: ifeq 0b7
      // 0b4: goto 059
      // 0b7: new java/util/StringTokenizer
      // 0ba: dup
      // 0bb: aload 7
      // 0bd: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;)V
      // 0c0: astore 8
      // 0c2: aload 8
      // 0c4: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0c7: pop
      // 0c8: aload 8
      // 0ca: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0cd: pop
      // 0ce: aload 8
      // 0d0: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0d3: pop
      // 0d4: aload 8
      // 0d6: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0d9: pop
      // 0da: aload 8
      // 0dc: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0df: pop
      // 0e0: aload 5
      // 0e2: new org/x/V
      // 0e5: dup
      // 0e6: aload 8
      // 0e8: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0eb: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0ee: aload 8
      // 0f0: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0f3: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0f6: aload 8
      // 0f8: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0fb: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0fe: aload 8
      // 100: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 103: invokespecial org/x/V.<init> (IIILjava/lang/String;)V
      // 106: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 10b: pop
      // 10c: aload 1
      // 10d: ifnonnull 09d
      // 110: aload 7
      // 112: sipush -6606
      // 115: sipush 12423
      // 118: invokestatic org/x/O.a (II)Ljava/lang/String;
      // 11b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 11e: aload 1
      // 11f: ifnull 1d2
      // 122: ifeq 1b9
      // 125: goto 12c
      // 128: invokestatic org/x/O.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 12b: athrow
      // 12c: aload 7
      // 12e: ldc ":"
      // 130: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 133: aload 1
      // 134: ifnull 1d2
      // 137: goto 13e
      // 13a: invokestatic org/x/O.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 13d: athrow
      // 13e: ifeq 1b9
      // 141: goto 148
      // 144: invokestatic org/x/O.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 147: athrow
      // 148: aload 7
      // 14a: sipush 18820
      // 14d: ldc2_w 1918085704644726924
      // 150: invokestatic org/x/O.a (IJ)I
      // 153: aload 7
      // 155: invokevirtual java/lang/String.length ()I
      // 158: bipush 1
      // 159: isub
      // 15a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 15d: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 160: istore 8
      // 162: new java/util/ArrayList
      // 165: dup
      // 166: invokespecial java/util/ArrayList.<init> ()V
      // 169: astore 9
      // 16b: aload 3
      // 16c: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 16f: astore 7
      // 171: aload 7
      // 173: ldc "\t"
      // 175: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 178: ifne 17e
      // 17b: goto 190
      // 17e: aload 9
      // 180: aload 7
      // 182: bipush 1
      // 183: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 186: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 18b: pop
      // 18c: aload 1
      // 18d: ifnonnull 16b
      // 190: aload 4
      // 192: new java/lang/Integer
      // 195: dup
      // 196: iload 8
      // 198: invokespecial java/lang/Integer.<init> (I)V
      // 19b: aload 9
      // 19d: aload 9
      // 19f: invokeinterface java/util/List.size ()I 1
      // 1a4: anewarray 31
      // 1a7: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 1ac: checkcast [Ljava/lang/String;
      // 1af: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1b4: pop
      // 1b5: aload 1
      // 1b6: ifnonnull 059
      // 1b9: aload 7
      // 1bb: aload 1
      // 1bc: ifnull 25e
      // 1bf: sipush -6603
      // 1c2: sipush -8520
      // 1c5: invokestatic org/x/O.a (II)Ljava/lang/String;
      // 1c8: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1cb: goto 1d2
      // 1ce: invokestatic org/x/O.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1d1: athrow
      // 1d2: ifeq 25a
      // 1d5: aload 3
      // 1d6: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 1d9: pop
      // 1da: goto 1e1
      // 1dd: invokestatic org/x/O.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1e0: athrow
      // 1e1: aload 3
      // 1e2: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 1e5: astore 7
      // 1e7: aload 7
      // 1e9: sipush -6600
      // 1ec: sipush -23155
      // 1ef: invokestatic org/x/O.a (II)Ljava/lang/String;
      // 1f2: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1f5: ifeq 1ff
      // 1f8: goto 059
      // 1fb: invokestatic org/x/O.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1fe: athrow
      // 1ff: new java/util/StringTokenizer
      // 202: dup
      // 203: aload 7
      // 205: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;)V
      // 208: astore 8
      // 20a: aload 8
      // 20c: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 20f: pop
      // 210: aload 8
      // 212: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 215: pop
      // 216: aload 8
      // 218: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 21b: pop
      // 21c: aload 8
      // 21e: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 221: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 224: istore 9
      // 226: iload 9
      // 228: aload 1
      // 229: ifnull 241
      // 22c: ifne 239
      // 22f: goto 236
      // 232: invokestatic org/x/O.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 235: athrow
      // 236: goto 1e1
      // 239: aload 8
      // 23b: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 23e: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 241: istore 10
      // 243: aload 6
      // 245: new org/x/i
      // 248: dup
      // 249: iload 9
      // 24b: iload 10
      // 24d: invokespecial org/x/i.<init> (II)V
      // 250: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 255: pop
      // 256: aload 1
      // 257: ifnonnull 1e1
      // 25a: aload 3
      // 25b: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 25e: astore 7
      // 260: aload 1
      // 261: ifnonnull 059
      // 264: aload 5
      // 266: aload 5
      // 268: invokeinterface java/util/List.size ()I 1
      // 26d: anewarray 68
      // 270: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 275: checkcast [Lorg/x/V;
      // 278: aload 4
      // 27a: invokestatic org/x/O.W ([Lorg/x/V;Ljava/util/Map;)V
      // 27d: aload 6
      // 27f: aload 6
      // 281: invokeinterface java/util/List.size ()I 1
      // 286: anewarray 123
      // 289: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 28e: checkcast [Lorg/x/i;
      // 291: aload 4
      // 293: invokestatic org/x/O.a ([Lorg/x/i;Ljava/util/Map;)V
      // 296: aload 3
      // 297: invokevirtual java/io/BufferedReader.close ()V
      // 29a: goto 2b0
      // 29d: astore 4
      // 29f: goto 2b0
      // 2a2: astore 11
      // 2a4: aload 3
      // 2a5: invokevirtual java/io/BufferedReader.close ()V
      // 2a8: goto 2ad
      // 2ab: astore 12
      // 2ad: aload 11
      // 2af: athrow
      // 2b0: return
   }

   private static void W(V[] var0, Map var1) {
      String var10000 = f();
      Arrays.sort(var0, new l());
      int var3 = 0;
      String var2 = var10000;
      int var4 = 0;
      V[] var5 = var0;
      int var6 = var0.length;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            V var8 = var5[var7];
            var3 += var8.F;
            var4 += var8.J;
            var7++;
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         System.out.println(a(-6595, -31006));
         System.out.println(a(-6597, -16228));
         System.out.println(a(-6608, 12781) + var3 + a(-6623, 12165) + var4);
         break;
      }

      double var17 = 0.0;
      MessageFormat var18 = new MessageFormat(a(-6593, -14477));
      int var19 = 0;

      while (var19 < var0.length) {
         V var9 = var0[var19];
         double var10 = 100.0 * ((double)var9.F / (double)var3);
         var17 += var10;
         PrintStream var20 = System.out;
         Object[] var10002 = new Object[a(24585, 8128070144929773824L)];
         var10002[0] = new Integer(var19 + 1);
         var10002[1] = new Double(var10);
         var10002[2] = new Double(var17);
         var10002[3] = new Integer(var9.F);
         var10002[4] = new Integer(var9.J);
         var10002[5] = var9.Z;
         var20.println(var18.format(var10002, new StringBuffer(), new FieldPosition(0)));
         String[] var12 = (String[])var1.get(new Integer(var9.d));
         label34:
         if (var2 != null) {
            if (var12 != null) {
               String[] var13 = var12;
               int var14 = var12.length;
               int var15 = 0;

               while (var15 < var14) {
                  String var16 = var13[var15];
                  System.out.println(a(-6605, -12986) + var16);
                  var15++;
                  if (var2 == null) {
                     break label34;
                  }

                  if (var2 == null) {
                     break;
                  }
               }
            }

            var19++;
         }

         if (var2 == null) {
            break;
         }
      }
   }

   private static void a(org.x.i[] var0, Map var1) {
      int var3 = 0;
      String var10000 = f();
      org.x.i[] var4 = var0;
      int var5 = var0.length;
      String var2 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            org.x.i var7 = var4[var6];
            var3 += var7.a;
            var6++;
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         System.out.println(a(-6601, 8924));
         System.out.println(a(-6598, 3776));
         System.out.println(a(-6604, 18072) + var3);
         break;
      }

      double var16 = 0.0;
      MessageFormat var17 = new MessageFormat(a(-6602, 1437));
      int var18 = 0;

      while (var18 < var0.length) {
         org.x.i var8 = var0[var18];
         double var9 = 100.0 * ((double)var8.a / (double)var3);
         var16 += var9;
         System.out
            .println(
               var17.format(
                  new Object[]{new Integer(var18 + 1), new Double(var9), new Double(var16), new Integer(var8.a)}, new StringBuffer(), new FieldPosition(0)
               )
            );
         String[] var11 = (String[])var1.get(new Integer(var8.Q));
         label34:
         if (var2 != null) {
            if (var11 != null) {
               String[] var12 = var11;
               int var13 = var11.length;
               int var14 = 0;

               while (var14 < var13) {
                  String var15 = var12[var14];
                  System.out.println(a(-6594, 21377) + var15);
                  var14++;
                  if (var2 == null) {
                     break label34;
                  }

                  if (var2 == null) {
                     break;
                  }
               }
            }

            var18++;
         }

         if (var2 == null) {
            break;
         }
      }
   }

   public static void s(String var0) {
      J = var0;
   }

   public static String f() {
      return J;
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[17];
      int var11 = 0;
      String var10 = "\u0010;ÍöèL\u009cO\u0016ï\u0097\u0014»\u000e\u007f\u0096¥ú\u008f¥=\u0012\u0017\u009a¹\u00ad\u0094y4\u009f^¨\u001bb±ê\u0086\u0085\u008bNÒ\u0005ü\u0010GY\u0016\u0088\u000e·q.u;\r«\u0007Å8ã\u00063Æ[7\u009b²\u0011ru\u0092`\"6ÊX9¶\u0005Ç\u0084cz\u0000\f\u0014=ú¯\b¿)ÌßU]\u001as\u0018\u0090 Þ²k\u008e6\u0011\u008c\u00807 >O9Jëï\u009d`à\\â\"CIE,2iF¼\u008b\u0095åõ\u0004ûÙ\u0083\u009aóçc5\u000b%\u001a¢XE\u008b\u0012\u0087| +kò!Vy\u0014µ,¶\u0014\u0095\u0080&W|¯È\te¢\u001d\u0012\u0085\nrÝZ×F\u0083ËoÒ¼þ%\u0005ý\\\u001eE*\t\u001d5l7Üt\u001dCÂ\u000f\u00989Ïé\u0089\u0007¿~\u0097rÐ_9{)2\u0010uò<\u0001þÞ/R6QÛÿÄ\u001f~;\u0019@\u009cö0\u0012 °\u0095\u0013{LN\u00166XqºÍ\"g*\r]\u0013b8Ð\u008eµË\u0082ö\u001d\u0082- 7K\u009f\u0097\u0003{³tk[Ò\u008b¼©A\u0012\u0097¼Q[\u008c\u0098\u00066ÖÎ#¿\u0011Q\u0092ò\t \u0082ØöûC,8{®pâ\b\u0007ÿC3ÎÖ\u0001\u0081\u009fß\u001a×u\u0083\u009b-\u000eÍpJ\u0096\u0003¨\u0001¥ùL'\u008b(\u0005bjÇ×\u0014ú\u0013\u001c`\u0017KZ,\u0012yã¬È\u0088Ðv\u0099µ5\u00ad·5LP·ÚR4ÝÊ³\u0004¨\u001a»Cæ+Þñ\u009c\u0086Ö\u0097&\u008eG`®*\u009d\u0087/ä\u0089\u0091H1\u0016\u008d\u0093\u0015ÀxAó\u0089°Ø´nÙ\u000f@õd³õu¡\u0005e\u0004\u001eZ\u009a·ò8·¥\u0083úã";
      int var12 = "\u0010;ÍöèL\u009cO\u0016ï\u0097\u0014»\u000e\u007f\u0096¥ú\u008f¥=\u0012\u0017\u009a¹\u00ad\u0094y4\u009f^¨\u001bb±ê\u0086\u0085\u008bNÒ\u0005ü\u0010GY\u0016\u0088\u000e·q.u;\r«\u0007Å8ã\u00063Æ[7\u009b²\u0011ru\u0092`\"6ÊX9¶\u0005Ç\u0084cz\u0000\f\u0014=ú¯\b¿)ÌßU]\u001as\u0018\u0090 Þ²k\u008e6\u0011\u008c\u00807 >O9Jëï\u009d`à\\â\"CIE,2iF¼\u008b\u0095åõ\u0004ûÙ\u0083\u009aóçc5\u000b%\u001a¢XE\u008b\u0012\u0087| +kò!Vy\u0014µ,¶\u0014\u0095\u0080&W|¯È\te¢\u001d\u0012\u0085\nrÝZ×F\u0083ËoÒ¼þ%\u0005ý\\\u001eE*\t\u001d5l7Üt\u001dCÂ\u000f\u00989Ïé\u0089\u0007¿~\u0097rÐ_9{)2\u0010uò<\u0001þÞ/R6QÛÿÄ\u001f~;\u0019@\u009cö0\u0012 °\u0095\u0013{LN\u00166XqºÍ\"g*\r]\u0013b8Ð\u008eµË\u0082ö\u001d\u0082- 7K\u009f\u0097\u0003{³tk[Ò\u008b¼©A\u0012\u0097¼Q[\u008c\u0098\u00066ÖÎ#¿\u0011Q\u0092ò\t \u0082ØöûC,8{®pâ\b\u0007ÿC3ÎÖ\u0001\u0081\u009fß\u001a×u\u0083\u009b-\u000eÍpJ\u0096\u0003¨\u0001¥ùL'\u008b(\u0005bjÇ×\u0014ú\u0013\u001c`\u0017KZ,\u0012yã¬È\u0088Ðv\u0099µ5\u00ad·5LP·ÚR4ÝÊ³\u0004¨\u001a»Cæ+Þñ\u009c\u0086Ö\u0097&\u008eG`®*\u009d\u0087/ä\u0089\u0091H1\u0016\u008d\u0093\u0015ÀxAó\u0089°Ø´nÙ\u000f@õd³õu¡\u0005e\u0004\u001eZ\u009a·ò8·¥\u0083úã"
         .length();
      char var9 = 11;
      int var16 = -1;
      s("aJLfC");

      label61:
      while (true) {
         byte var10000 = 92;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 113;
                        break;
                     case 1:
                        var58 = 59;
                        break;
                     case 2:
                        var58 = 91;
                        break;
                     case 3:
                        var58 = 4;
                        break;
                     case 4:
                        var58 = 96;
                        break;
                     case 5:
                        var58 = 8;
                        break;
                     default:
                        var58 = 33;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[17];
                     long var0 = 8308956590562522974L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = " \u000e|í\u0093a\u008eX\"\u007fzä \u0084'Ô";
                     int var5 = " \u000e|í\u0093a\u008eX\"\u007fzä \u0084'Ô".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     c = var6;
                     d = new Integer[2];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "ß«ýeÇW¦é¸;\u0007\u001f\u001b½`Û\nk9\u0096yÑC<xÿô\u0002\u009e\u0002";
                  var12 = "ß«ýeÇW¦é¸;\u0007\u001f\u001b½`Û\nk9\u0096yÑC<xÿô\u0002\u009e\u0002".length();
                  var9 = 27;
                  var16 = -1;
            }

            var10000 = 120;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -6607) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 97;
               break;
            case 1:
               var10000 = 94;
               break;
            case 2:
               var10000 = 8;
               break;
            case 3:
               var10000 = 245;
               break;
            case 4:
               var10000 = 34;
               break;
            case 5:
               var10000 = 148;
               break;
            case 6:
               var10000 = 87;
               break;
            case 7:
               var10000 = 213;
               break;
            case 8:
               var10000 = 89;
               break;
            case 9:
               var10000 = 46;
               break;
            case 10:
               var10000 = 51;
               break;
            case 11:
               var10000 = 92;
               break;
            case 12:
               var10000 = 110;
               break;
            case 13:
               var10000 = 90;
               break;
            case 14:
               var10000 = 221;
               break;
            case 15:
               var10000 = 253;
               break;
            case 16:
               var10000 = 84;
               break;
            case 17:
               var10000 = 204;
               break;
            case 18:
               var10000 = 195;
               break;
            case 19:
               var10000 = 184;
               break;
            case 20:
               var10000 = 100;
               break;
            case 21:
               var10000 = 72;
               break;
            case 22:
               var10000 = 137;
               break;
            case 23:
               var10000 = 73;
               break;
            case 24:
               var10000 = 69;
               break;
            case 25:
               var10000 = 101;
               break;
            case 26:
               var10000 = 158;
               break;
            case 27:
               var10000 = 79;
               break;
            case 28:
               var10000 = 182;
               break;
            case 29:
               var10000 = 175;
               break;
            case 30:
               var10000 = 61;
               break;
            case 31:
               var10000 = 111;
               break;
            case 32:
               var10000 = 31;
               break;
            case 33:
               var10000 = 140;
               break;
            case 34:
               var10000 = 236;
               break;
            case 35:
               var10000 = 78;
               break;
            case 36:
               var10000 = 114;
               break;
            case 37:
               var10000 = 250;
               break;
            case 38:
               var10000 = 127;
               break;
            case 39:
               var10000 = 170;
               break;
            case 40:
               var10000 = 189;
               break;
            case 41:
               var10000 = 198;
               break;
            case 42:
               var10000 = 107;
               break;
            case 43:
               var10000 = 196;
               break;
            case 44:
               var10000 = 254;
               break;
            case 45:
               var10000 = 99;
               break;
            case 46:
               var10000 = 207;
               break;
            case 47:
               var10000 = 211;
               break;
            case 48:
               var10000 = 177;
               break;
            case 49:
               var10000 = 88;
               break;
            case 50:
               var10000 = 220;
               break;
            case 51:
               var10000 = 47;
               break;
            case 52:
               var10000 = 82;
               break;
            case 53:
               var10000 = 68;
               break;
            case 54:
               var10000 = 141;
               break;
            case 55:
               var10000 = 132;
               break;
            case 56:
               var10000 = 136;
               break;
            case 57:
               var10000 = 152;
               break;
            case 58:
               var10000 = 109;
               break;
            case 59:
               var10000 = 249;
               break;
            case 60:
               var10000 = 169;
               break;
            case 61:
               var10000 = 77;
               break;
            case 62:
               var10000 = 104;
               break;
            case 63:
               var10000 = 124;
               break;
            case 64:
               var10000 = 96;
               break;
            case 65:
               var10000 = 115;
               break;
            case 66:
               var10000 = 95;
               break;
            case 67:
               var10000 = 102;
               break;
            case 68:
               var10000 = 224;
               break;
            case 69:
               var10000 = 146;
               break;
            case 70:
               var10000 = 21;
               break;
            case 71:
               var10000 = 55;
               break;
            case 72:
               var10000 = 57;
               break;
            case 73:
               var10000 = 202;
               break;
            case 74:
               var10000 = 155;
               break;
            case 75:
               var10000 = 222;
               break;
            case 76:
               var10000 = 178;
               break;
            case 77:
               var10000 = 20;
               break;
            case 78:
               var10000 = 119;
               break;
            case 79:
               var10000 = 215;
               break;
            case 80:
               var10000 = 0;
               break;
            case 81:
               var10000 = 251;
               break;
            case 82:
               var10000 = 201;
               break;
            case 83:
               var10000 = 181;
               break;
            case 84:
               var10000 = 113;
               break;
            case 85:
               var10000 = 171;
               break;
            case 86:
               var10000 = 108;
               break;
            case 87:
               var10000 = 67;
               break;
            case 88:
               var10000 = 168;
               break;
            case 89:
               var10000 = 25;
               break;
            case 90:
               var10000 = 121;
               break;
            case 91:
               var10000 = 185;
               break;
            case 92:
               var10000 = 192;
               break;
            case 93:
               var10000 = 232;
               break;
            case 94:
               var10000 = 44;
               break;
            case 95:
               var10000 = 156;
               break;
            case 96:
               var10000 = 143;
               break;
            case 97:
               var10000 = 216;
               break;
            case 98:
               var10000 = 12;
               break;
            case 99:
               var10000 = 142;
               break;
            case 100:
               var10000 = 66;
               break;
            case 101:
               var10000 = 16;
               break;
            case 102:
               var10000 = 18;
               break;
            case 103:
               var10000 = 172;
               break;
            case 104:
               var10000 = 138;
               break;
            case 105:
               var10000 = 10;
               break;
            case 106:
               var10000 = 183;
               break;
            case 107:
               var10000 = 180;
               break;
            case 108:
               var10000 = 234;
               break;
            case 109:
               var10000 = 80;
               break;
            case 110:
               var10000 = 5;
               break;
            case 111:
               var10000 = 228;
               break;
            case 112:
               var10000 = 86;
               break;
            case 113:
               var10000 = 70;
               break;
            case 114:
               var10000 = 103;
               break;
            case 115:
               var10000 = 83;
               break;
            case 116:
               var10000 = 33;
               break;
            case 117:
               var10000 = 15;
               break;
            case 118:
               var10000 = 106;
               break;
            case 119:
               var10000 = 19;
               break;
            case 120:
               var10000 = 238;
               break;
            case 121:
               var10000 = 210;
               break;
            case 122:
               var10000 = 45;
               break;
            case 123:
               var10000 = 35;
               break;
            case 124:
               var10000 = 7;
               break;
            case 125:
               var10000 = 81;
               break;
            case 126:
               var10000 = 193;
               break;
            case 127:
               var10000 = 9;
               break;
            case 128:
               var10000 = 120;
               break;
            case 129:
               var10000 = 133;
               break;
            case 130:
               var10000 = 98;
               break;
            case 131:
               var10000 = 53;
               break;
            case 132:
               var10000 = 166;
               break;
            case 133:
               var10000 = 29;
               break;
            case 134:
               var10000 = 200;
               break;
            case 135:
               var10000 = 188;
               break;
            case 136:
               var10000 = 149;
               break;
            case 137:
               var10000 = 32;
               break;
            case 138:
               var10000 = 65;
               break;
            case 139:
               var10000 = 145;
               break;
            case 140:
               var10000 = 176;
               break;
            case 141:
               var10000 = 129;
               break;
            case 142:
               var10000 = 56;
               break;
            case 143:
               var10000 = 225;
               break;
            case 144:
               var10000 = 74;
               break;
            case 145:
               var10000 = 255;
               break;
            case 146:
               var10000 = 48;
               break;
            case 147:
               var10000 = 59;
               break;
            case 148:
               var10000 = 54;
               break;
            case 149:
               var10000 = 144;
               break;
            case 150:
               var10000 = 43;
               break;
            case 151:
               var10000 = 206;
               break;
            case 152:
               var10000 = 39;
               break;
            case 153:
               var10000 = 150;
               break;
            case 154:
               var10000 = 161;
               break;
            case 155:
               var10000 = 60;
               break;
            case 156:
               var10000 = 40;
               break;
            case 157:
               var10000 = 208;
               break;
            case 158:
               var10000 = 36;
               break;
            case 159:
               var10000 = 230;
               break;
            case 160:
               var10000 = 22;
               break;
            case 161:
               var10000 = 91;
               break;
            case 162:
               var10000 = 244;
               break;
            case 163:
               var10000 = 62;
               break;
            case 164:
               var10000 = 147;
               break;
            case 165:
               var10000 = 159;
               break;
            case 166:
               var10000 = 229;
               break;
            case 167:
               var10000 = 6;
               break;
            case 168:
               var10000 = 14;
               break;
            case 169:
               var10000 = 76;
               break;
            case 170:
               var10000 = 2;
               break;
            case 171:
               var10000 = 252;
               break;
            case 172:
               var10000 = 4;
               break;
            case 173:
               var10000 = 217;
               break;
            case 174:
               var10000 = 30;
               break;
            case 175:
               var10000 = 227;
               break;
            case 176:
               var10000 = 174;
               break;
            case 177:
               var10000 = 134;
               break;
            case 178:
               var10000 = 223;
               break;
            case 179:
               var10000 = 75;
               break;
            case 180:
               var10000 = 199;
               break;
            case 181:
               var10000 = 151;
               break;
            case 182:
               var10000 = 11;
               break;
            case 183:
               var10000 = 205;
               break;
            case 184:
               var10000 = 63;
               break;
            case 185:
               var10000 = 231;
               break;
            case 186:
               var10000 = 164;
               break;
            case 187:
               var10000 = 123;
               break;
            case 188:
               var10000 = 24;
               break;
            case 189:
               var10000 = 17;
               break;
            case 190:
               var10000 = 1;
               break;
            case 191:
               var10000 = 160;
               break;
            case 192:
               var10000 = 235;
               break;
            case 193:
               var10000 = 165;
               break;
            case 194:
               var10000 = 125;
               break;
            case 195:
               var10000 = 154;
               break;
            case 196:
               var10000 = 126;
               break;
            case 197:
               var10000 = 248;
               break;
            case 198:
               var10000 = 131;
               break;
            case 199:
               var10000 = 246;
               break;
            case 200:
               var10000 = 163;
               break;
            case 201:
               var10000 = 242;
               break;
            case 202:
               var10000 = 162;
               break;
            case 203:
               var10000 = 214;
               break;
            case 204:
               var10000 = 241;
               break;
            case 205:
               var10000 = 197;
               break;
            case 206:
               var10000 = 116;
               break;
            case 207:
               var10000 = 190;
               break;
            case 208:
               var10000 = 212;
               break;
            case 209:
               var10000 = 122;
               break;
            case 210:
               var10000 = 112;
               break;
            case 211:
               var10000 = 85;
               break;
            case 212:
               var10000 = 41;
               break;
            case 213:
               var10000 = 167;
               break;
            case 214:
               var10000 = 139;
               break;
            case 215:
               var10000 = 187;
               break;
            case 216:
               var10000 = 52;
               break;
            case 217:
               var10000 = 243;
               break;
            case 218:
               var10000 = 233;
               break;
            case 219:
               var10000 = 13;
               break;
            case 220:
               var10000 = 209;
               break;
            case 221:
               var10000 = 28;
               break;
            case 222:
               var10000 = 179;
               break;
            case 223:
               var10000 = 105;
               break;
            case 224:
               var10000 = 173;
               break;
            case 225:
               var10000 = 239;
               break;
            case 226:
               var10000 = 128;
               break;
            case 227:
               var10000 = 118;
               break;
            case 228:
               var10000 = 27;
               break;
            case 229:
               var10000 = 194;
               break;
            case 230:
               var10000 = 3;
               break;
            case 231:
               var10000 = 186;
               break;
            case 232:
               var10000 = 135;
               break;
            case 233:
               var10000 = 23;
               break;
            case 234:
               var10000 = 153;
               break;
            case 235:
               var10000 = 50;
               break;
            case 236:
               var10000 = 42;
               break;
            case 237:
               var10000 = 237;
               break;
            case 238:
               var10000 = 130;
               break;
            case 239:
               var10000 = 38;
               break;
            case 240:
               var10000 = 37;
               break;
            case 241:
               var10000 = 240;
               break;
            case 242:
               var10000 = 247;
               break;
            case 243:
               var10000 = 219;
               break;
            case 244:
               var10000 = 58;
               break;
            case 245:
               var10000 = 218;
               break;
            case 246:
               var10000 = 49;
               break;
            case 247:
               var10000 = 93;
               break;
            case 248:
               var10000 = 71;
               break;
            case 249:
               var10000 = 117;
               break;
            case 250:
               var10000 = 64;
               break;
            case 251:
               var10000 = 157;
               break;
            case 252:
               var10000 = 226;
               break;
            case 253:
               var10000 = 191;
               break;
            case 254:
               var10000 = 26;
               break;
            default:
               var10000 = 203;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22793;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





