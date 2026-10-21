package com;

public enum D {
   CamelCase, PascalCase, SnakeCase, KebabCase, NoChange, NeverUseThisValueExceptDefaultValue;
   private static final D[] c;
   private static final long[] a;
   private static final Integer[] b;

   public String C(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 003: astore 2
      // 004: getstatic com/rH_3.v [I
      // 007: aload 0
      // 008: invokevirtual com/D.ordinal ()I
      // 00b: iaload
      // 00c: tableswitch 580 1 6 40 225 410 495 580 580
      // 034: new java/lang/StringBuilder
      // 037: dup
      // 038: invokespecial java/lang/StringBuilder.<init> ()V
      // 03b: astore 3
      // 03c: bipush 0
      // 03d: istore 4
      // 03f: iload 4
      // 041: aload 1
      // 042: invokevirtual java/lang/String.length ()I
      // 045: if_icmpge 0e8
      // 048: aload 1
      // 049: aload 2
      // 04a: ifnonnull 0ec
      // 04d: iload 4
      // 04f: invokevirtual java/lang/String.charAt (I)C
      // 052: istore 5
      // 054: iload 5
      // 056: sipush 5337
      // 059: ldc2_w 7913302071303221641
      // 05c: invokestatic com/D.a (IJ)I
      // 05f: aload 2
      // 060: ifnonnull 07f
      // 063: if_icmplt 0d3
      // 066: goto 06d
      // 069: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 06c: athrow
      // 06d: iload 5
      // 06f: sipush 6965
      // 072: ldc2_w 1904900952877284963
      // 075: invokestatic com/D.a (IJ)I
      // 078: goto 07f
      // 07b: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 07e: athrow
      // 07f: aload 2
      // 080: ifnonnull 09f
      // 083: if_icmpgt 0d3
      // 086: goto 08d
      // 089: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 08c: athrow
      // 08d: iload 5
      // 08f: sipush 19555
      // 092: ldc2_w 1439012326727313716
      // 095: invokestatic com/D.a (IJ)I
      // 098: goto 09f
      // 09b: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 09e: athrow
      // 09f: iadd
      // 0a0: i2c
      // 0a1: istore 6
      // 0a3: aload 2
      // 0a4: ifnonnull 0cf
      // 0a7: iload 4
      // 0a9: ifle 0c8
      // 0ac: goto 0b3
      // 0af: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0b2: athrow
      // 0b3: aload 3
      // 0b4: sipush 5855
      // 0b7: ldc2_w 6994252397260387210
      // 0ba: invokestatic com/D.a (IJ)I
      // 0bd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0c0: pop
      // 0c1: goto 0c8
      // 0c4: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0c7: athrow
      // 0c8: aload 3
      // 0c9: iload 6
      // 0cb: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0ce: pop
      // 0cf: aload 2
      // 0d0: ifnull 0e1
      // 0d3: aload 3
      // 0d4: iload 5
      // 0d6: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0d9: pop
      // 0da: goto 0e1
      // 0dd: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0e0: athrow
      // 0e1: iinc 4 1
      // 0e4: aload 2
      // 0e5: ifnull 03f
      // 0e8: aload 3
      // 0e9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ec: areturn
      // 0ed: new java/lang/StringBuilder
      // 0f0: dup
      // 0f1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f4: astore 3
      // 0f5: bipush 0
      // 0f6: istore 4
      // 0f8: iload 4
      // 0fa: aload 1
      // 0fb: invokevirtual java/lang/String.length ()I
      // 0fe: if_icmpge 1a1
      // 101: aload 1
      // 102: aload 2
      // 103: ifnonnull 1a5
      // 106: iload 4
      // 108: invokevirtual java/lang/String.charAt (I)C
      // 10b: istore 5
      // 10d: iload 5
      // 10f: sipush 1410
      // 112: ldc2_w 6148219698674049241
      // 115: invokestatic com/D.a (IJ)I
      // 118: aload 2
      // 119: ifnonnull 138
      // 11c: if_icmplt 18c
      // 11f: goto 126
      // 122: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 125: athrow
      // 126: iload 5
      // 128: sipush 24617
      // 12b: ldc2_w 3710020709208245619
      // 12e: invokestatic com/D.a (IJ)I
      // 131: goto 138
      // 134: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 137: athrow
      // 138: aload 2
      // 139: ifnonnull 158
      // 13c: if_icmpgt 18c
      // 13f: goto 146
      // 142: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 145: athrow
      // 146: iload 5
      // 148: sipush 2110
      // 14b: ldc2_w 7895739788951104877
      // 14e: invokestatic com/D.a (IJ)I
      // 151: goto 158
      // 154: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 157: athrow
      // 158: iadd
      // 159: i2c
      // 15a: istore 6
      // 15c: aload 2
      // 15d: ifnonnull 188
      // 160: iload 4
      // 162: ifle 181
      // 165: goto 16c
      // 168: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 16b: athrow
      // 16c: aload 3
      // 16d: sipush 20618
      // 170: ldc2_w 266157132853999067
      // 173: invokestatic com/D.a (IJ)I
      // 176: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 179: pop
      // 17a: goto 181
      // 17d: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 180: athrow
      // 181: aload 3
      // 182: iload 6
      // 184: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 187: pop
      // 188: aload 2
      // 189: ifnull 19a
      // 18c: aload 3
      // 18d: iload 5
      // 18f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 192: pop
      // 193: goto 19a
      // 196: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 199: athrow
      // 19a: iinc 4 1
      // 19d: aload 2
      // 19e: ifnull 0f8
      // 1a1: aload 3
      // 1a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a5: areturn
      // 1a6: aload 1
      // 1a7: bipush 0
      // 1a8: invokevirtual java/lang/String.charAt (I)C
      // 1ab: istore 3
      // 1ac: iload 3
      // 1ad: sipush 27384
      // 1b0: ldc2_w 3748293927315328940
      // 1b3: invokestatic com/D.a (IJ)I
      // 1b6: aload 2
      // 1b7: ifnonnull 1d5
      // 1ba: if_icmplt 1f9
      // 1bd: goto 1c4
      // 1c0: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 1c3: athrow
      // 1c4: iload 3
      // 1c5: sipush 27046
      // 1c8: ldc2_w 5250387992546004212
      // 1cb: invokestatic com/D.a (IJ)I
      // 1ce: goto 1d5
      // 1d1: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 1d4: athrow
      // 1d5: if_icmpgt 1f9
      // 1d8: aload 1
      // 1d9: invokevirtual java/lang/String.toCharArray ()[C
      // 1dc: astore 4
      // 1de: aload 4
      // 1e0: bipush 0
      // 1e1: dup2
      // 1e2: caload
      // 1e3: sipush 2110
      // 1e6: ldc2_w 7895739788951104877
      // 1e9: invokestatic com/D.a (IJ)I
      // 1ec: isub
      // 1ed: i2c
      // 1ee: castore
      // 1ef: new java/lang/String
      // 1f2: dup
      // 1f3: aload 4
      // 1f5: invokespecial java/lang/String.<init> ([C)V
      // 1f8: areturn
      // 1f9: aload 1
      // 1fa: areturn
      // 1fb: aload 1
      // 1fc: bipush 0
      // 1fd: invokevirtual java/lang/String.charAt (I)C
      // 200: istore 3
      // 201: iload 3
      // 202: sipush 1410
      // 205: ldc2_w 6148219698674049241
      // 208: invokestatic com/D.a (IJ)I
      // 20b: aload 2
      // 20c: ifnonnull 22a
      // 20f: if_icmplt 24e
      // 212: goto 219
      // 215: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 218: athrow
      // 219: iload 3
      // 21a: sipush 24617
      // 21d: ldc2_w 3710020709208245619
      // 220: invokestatic com/D.a (IJ)I
      // 223: goto 22a
      // 226: invokestatic com/D.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 229: athrow
      // 22a: if_icmpgt 24e
      // 22d: aload 1
      // 22e: invokevirtual java/lang/String.toCharArray ()[C
      // 231: astore 4
      // 233: aload 4
      // 235: bipush 0
      // 236: dup2
      // 237: caload
      // 238: sipush 2110
      // 23b: ldc2_w 7895739788951104877
      // 23e: invokestatic com/D.a (IJ)I
      // 241: iadd
      // 242: i2c
      // 243: castore
      // 244: new java/lang/String
      // 247: dup
      // 248: aload 4
      // 24a: invokespecial java/lang/String.<init> ([C)V
      // 24d: areturn
      // 24e: aload 1
      // 24f: areturn
      // 250: aload 1
      // 251: areturn
   }

   private static D[] q() {
      D[] var10000 = new D[a(24464, 4072187404589890249L)];
      var10000[0] = CamelCase;
      var10000[1] = PascalCase;
      var10000[2] = SnakeCase;
      var10000[3] = KebabCase;
      var10000[4] = NoChange;
      var10000[5] = NeverUseThisValueExceptDefaultValue;
      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var8 = new String[6];
      int var12 = 0;
      String var11 = "\b\u0017v6>\u001e*9\u0005`#\u0016\u0013s0-'\u001a=\"m<,$\b4\u0003`\u0010'\u0011\f(\u0002A09\u0013\u001c4\u0002S43\u0007\f\t\u0013\u0013g4=1\b+\u0013\t\u001b\u0017h031\b+\u0013";
      int var13 = "\b\u0017v6>\u001e*9\u0005`#\u0016\u0013s0-'\u001a=\"m<,$\b4\u0003`\u0010'\u0011\f(\u0002A09\u0013\u001c4\u0002S43\u0007\f\t\u0013\u0013g4=1\b+\u0013\t\u001b\u0017h031\b+\u0013"
         .length();
      char var10 = '\n';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 35;
         String var10001 = var11.substring(++var17, var17 + var10);
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
                        var65 = 123;
                        break;
                     case 1:
                        var65 = 85;
                        break;
                     case 2:
                        var65 = 38;
                        break;
                     case 3:
                        var65 = 118;
                        break;
                     case 4:
                        var65 = 124;
                        break;
                     case 5:
                        var65 = 81;
                        break;
                     default:
                        var65 = 74;
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
                  var8[var12++] = var44;
                  if ((var17 += var10) >= var13) {
                     long var0 = 5250573959898731854L;
                     long[] var6 = new long[11];
                     int var3 = 0;
                     String var4 = "XõÓ¶\u008d÷8\u0003\u007fùîg\u001e\u0000YÀÜ±à\u009a,\u009cà¸\u0099x³%\u0012Ê$\u0086\u0000ð\u0010\u0090ãS|Z\u009bîßÊV#«w\u0010\u0098Õ8*\u008f&\u009b¦9:\u009e\u0011ÌZ\u0083Èmò\u0080f(µÖ";
                     int var5 = "XõÓ¶\u008d÷8\u0003\u007fùîg\u001e\u0000YÀÜ±à\u009a,\u009cà¸\u0099x³%\u0012Ê$\u0086\u0000ð\u0010\u0090ãS|Z\u009bîßÊV#«w\u0010\u0098Õ8*\u008f&\u009b¦9:\u009e\u0011ÌZ\u0083Èmò\u0080f(µÖ"
                        .length();
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
                                    a = var6;
                                    b = new Integer[11];
                                    c = q();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u009dØÐ\u0086\u0013\u001dPg½·Ð'ßÈo\u0081";
                                 var5 = "\u009dØÐ\u0086\u0013\u001dPg½·Ð'ßÈo\u0081".length();
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

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var8[var12++] = var44;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label70;
                  }

                  var11 = "/ \u007f\u0004\u0007%7\u0004\t2!]\u0007\u0003\b1\u0012*";
                  var13 = "/ \u007f\u0004\u0007%7\u0004\t2!]\u0007\u0003\b1\u0012*".length();
                  var10 = '\b';
                  var17 = -1;
            }

            var10000 = 26;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }

   private static Hi_2 a(Hi_2 var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9555;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}






