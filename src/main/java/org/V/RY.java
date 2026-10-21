package org.v;

public final class RY extends R8 {
   public final NV h;
   private static final String d;
   private static final long[] e;
   private static final Integer[] f;

   public RY(NV param1) throws org.b_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/v/RG.C ()[Ljava/lang/String;
      // 03: aload 0
      // 04: aload 1
      // 05: invokevirtual org/v/NV.Q ()Lorg/I;
      // 08: invokespecial org/v/R8.<init> (Lorg/I;)V
      // 0b: astore 2
      // 0c: aload 1
      // 0d: aload 2
      // 0e: ifnull d5
      // 11: instanceof org/v/NN
      // 14: ifne cf
      // 17: goto 1e
      // 1a: invokestatic org/v/RY.a (Lorg/b_2;)Lorg/b_2;
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 2
      // 20: ifnull d5
      // 23: goto 2a
      // 26: invokestatic org/v/RY.a (Lorg/b_2;)Lorg/b_2;
      // 29: athrow
      // 2a: instanceof org/v/Nu_2
      // 2d: ifne cf
      // 30: goto 37
      // 33: invokestatic org/v/RY.a (Lorg/b_2;)Lorg/b_2;
      // 36: athrow
      // 37: aload 1
      // 38: aload 2
      // 39: ifnull d5
      // 3c: goto 43
      // 3f: invokestatic org/v/RY.a (Lorg/b_2;)Lorg/b_2;
      // 42: athrow
      // 43: instanceof org/v/No_2
      // 46: ifne cf
      // 49: goto 50
      // 4c: invokestatic org/v/RY.a (Lorg/b_2;)Lorg/b_2;
      // 4f: athrow
      // 50: aload 1
      // 51: aload 2
      // 52: ifnull d5
      // 55: goto 5c
      // 58: invokestatic org/v/RY.a (Lorg/b_2;)Lorg/b_2;
      // 5b: athrow
      // 5c: instanceof org/v/NY
      // 5f: ifne cf
      // 62: goto 69
      // 65: invokestatic org/v/RY.a (Lorg/b_2;)Lorg/b_2;
      // 68: athrow
      // 69: aload 1
      // 6a: aload 2
      // 6b: ifnull d5
      // 6e: goto 75
      // 71: invokestatic org/v/RY.a (Lorg/b_2;)Lorg/b_2;
      // 74: athrow
      // 75: instanceof org/v/NE
      // 78: ifne cf
      // 7b: goto 82
      // 7e: invokestatic org/v/RY.a (Lorg/b_2;)Lorg/b_2;
      // 81: athrow
      // 82: aload 1
      // 83: aload 2
      // 84: ifnull d5
      // 87: goto 8e
      // 8a: invokestatic org/v/RY.a (Lorg/b_2;)Lorg/b_2;
      // 8d: athrow
      // 8e: instanceof org/v/Nj_2
      // 91: ifne cf
      // 94: goto 9b
      // 97: invokestatic org/v/RY.a (Lorg/b_2;)Lorg/b_2;
      // 9a: athrow
      // 9b: aload 1
      // 9c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 9f: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // a2: astore 3
      // a3: aload 3
      // a4: aload 3
      // a5: sipush 16319
      // a8: ldc2_w 4037023579765679244
      // ab: invokestatic org/v/RY.a (IJ)I
      // ae: invokevirtual java/lang/String.lastIndexOf (I)I
      // b1: bipush 1
      // b2: iadd
      // b3: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // b6: astore 3
      // b7: aload 0
      // b8: new java/lang/StringBuilder
      // bb: dup
      // bc: invokespecial java/lang/StringBuilder.<init> ()V
      // bf: aload 3
      // c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c3: getstatic org/v/RY.d Ljava/lang/String;
      // c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // cc: invokevirtual org/v/RY.M (Ljava/lang/String;)V
      // cf: aload 0
      // d0: aload 1
      // d1: dup_x1
      // d2: putfield org/v/RY.h Lorg/v/NV;
      // d5: aload 0
      // d6: invokevirtual org/v/NV.d (Lorg/v/x_3;)V
      // d9: return
   }

   @Override
   public String toString() {
      return this.h.toString() + a(16395, 4719997911753874233L);
   }

   @org.F.c
   @Override
   public Object R(h_4 var1) throws Throwable {
      return var1.i(this);
   }

   private static org.b_2 a(org.b_2 var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "2\u0010,\n\u0015\"72\u00183F\u0014:&vY>Y[,-2\u001c'Z\t(0a\u00100D[>7s\r:G\u001e#7<Y\u001aR\u000b?&a\n6E\u0015>ca\r>^\u001e &|\r,\n\u001680fY=O[\"-wY0L[,0a\u00108D\u0016(-f\ns\n\u0016(7z\u0016;\n\u0012#5}\u001a>^\u0012\"-aU\u007fE\tm,p\u0013:I\u000fm\"~\u00150I\u001a9*}\u0017,\u0004"
         .toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 11;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 11;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 25;
               break;
            case 1:
               var37 = 114;
               break;
            case 2:
               var37 = 84;
               break;
            case 3:
               var37 = 33;
               break;
            case 4:
               var37 = 112;
               break;
            case 5:
               var37 = 70;
               break;
            default:
               var37 = 72;
         }
      } else {
         var25 = 11;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            d = var29;
            long var9 = 4172126949120165849L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "¡ |J.\u0088\u009cÛ\tõÂÞ}ëc{";
            int var13 = "¡ |J.\u0088\u009cÛ\tõÂÞ}ëc{".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            e = var14;
            f = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 11;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 25;
               break;
            case 1:
               var37 = 114;
               break;
            case 2:
               var37 = 84;
               break;
            case 3:
               var37 = 33;
               break;
            case 4:
               var37 = 112;
               break;
            case 5:
               var37 = 70;
               break;
            default:
               var37 = 72;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 25;
                  break;
               case 1:
                  var37 = 114;
                  break;
               case 2:
                  var37 = 84;
                  break;
               case 3:
                  var37 = 33;
                  break;
               case 4:
                  var37 = 112;
                  break;
               case 5:
                  var37 = 70;
                  break;
               default:
                  var37 = 72;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               d = var27;
               long var0 = 4172126949120165849L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "¡ |J.\u0088\u009cÛ\tõÂÞ}ëc{";
               int var5 = "¡ |J.\u0088\u009cÛ\tõÂÞ}ëc{".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
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
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               e = var6;
               f = new Integer[2];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 25;
                  break;
               case 1:
                  var37 = 114;
                  break;
               case 2:
                  var37 = 84;
                  break;
               case 3:
                  var37 = 33;
                  break;
               case 4:
                  var37 = 112;
                  break;
               case 5:
                  var37 = 70;
                  break;
               default:
                  var37 = 72;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6962;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }
}





