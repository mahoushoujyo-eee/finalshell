package org;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

public abstract class c_2 extends org.f implements org.p_2 {
   private static final String b;

   @Override
   public final void d(InputStream[] var1) throws b_2, IOException {
      this.R(new String[var1.length], var1);
   }

   @Override
   public final void b(String[] var1) throws b_2 {
      this.E(new String[var1.length], var1);
   }

   @Override
   public final void R(String[] var1, InputStream[] var2) throws b_2, IOException {
      this.L(var1, var2, new String[var1.length]);
   }

   @Override
   public final void Q(InputStream[] var1, String[] var2) throws b_2, IOException {
      this.L(new String[var1.length], var1, var2);
   }

   @Override
   public final void L(String[] param1, InputStream[] param2, String[] param3) throws b_2, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/d_2.b ()[Lcom/ky_4;
      // 03: aload 1
      // 04: arraylength
      // 05: istore 5
      // 07: astore 4
      // 09: iload 5
      // 0b: anewarray 43
      // 0e: astore 6
      // 10: bipush 0
      // 11: istore 7
      // 13: iload 7
      // 15: iload 5
      // 17: if_icmpge 5b
      // 1a: aload 4
      // 1c: ifnull 62
      // 1f: aload 6
      // 21: iload 7
      // 23: aload 3
      // 24: iload 7
      // 26: aaload
      // 27: ifnonnull 43
      // 2a: goto 31
      // 2d: invokestatic org/c_2.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: new java/io/InputStreamReader
      // 34: dup
      // 35: aload 2
      // 36: iload 7
      // 38: aaload
      // 39: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 3c: goto 52
      // 3f: invokestatic org/c_2.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: new java/io/InputStreamReader
      // 46: dup
      // 47: aload 2
      // 48: iload 7
      // 4a: aaload
      // 4b: aload 3
      // 4c: iload 7
      // 4e: aaload
      // 4f: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 52: aastore
      // 53: iinc 7 1
      // 56: aload 4
      // 58: ifnonnull 13
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 6
      // 5f: invokevirtual org/c_2.a ([Ljava/lang/String;[Ljava/io/Reader;)V
      // 62: return
   }

   @Override
   public final void E(String[] var1, String[] var2) throws b_2 {
      int var4 = var1.length;
      com.ky_4[] var10000 = d_2.b();
      Reader[] var5 = new Reader[var4];
      com.ky_4[] var3 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < var4) {
            try {
               var5[var6] = new StringReader(var2[var6]);
               var6++;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            } catch (IOException var8) {
               throw c(var8);
            }
         }

         try {
            this.a(var1, var5);
            break;
         } catch (IOException var7) {
            throw new org.P(b, var7);
         }
      }
   }

   @Override
   public abstract void a(String[] var1, Reader[] var2) throws b_2, IOException;

   @Override
   public final void W(File[] var1) throws b_2, IOException {
      this.W(var1, new String[var1.length]);
   }

   @Override
   public final void W(File[] param1, String[] param2) throws b_2, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: arraylength
      // 002: istore 4
      // 004: iload 4
      // 006: anewarray 21
      // 009: astore 5
      // 00b: invokestatic org/d_2.b ()[Lcom/ky_4;
      // 00e: iload 4
      // 010: anewarray 88
      // 013: astore 6
      // 015: astore 3
      // 016: bipush 0
      // 017: istore 7
      // 019: iload 7
      // 01b: iload 4
      // 01d: if_icmpge 050
      // 020: aload 1
      // 021: iload 7
      // 023: aaload
      // 024: astore 8
      // 026: aload 5
      // 028: iload 7
      // 02a: aload 8
      // 02c: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // 02f: aastore
      // 030: aload 6
      // 032: iload 7
      // 034: new java/io/FileInputStream
      // 037: dup
      // 038: aload 8
      // 03a: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 03d: aastore
      // 03e: iinc 7 1
      // 041: aload 3
      // 042: ifnull 057
      // 045: aload 3
      // 046: ifnonnull 019
      // 049: goto 050
      // 04c: invokestatic org/c_2.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04f: athrow
      // 050: aload 0
      // 051: aload 6
      // 053: aload 2
      // 054: invokevirtual org/c_2.Q ([Ljava/io/InputStream;[Ljava/lang/String;)V
      // 057: bipush 0
      // 058: istore 7
      // 05a: iload 7
      // 05c: iload 4
      // 05e: if_icmpge 07b
      // 061: aload 6
      // 063: iload 7
      // 065: aaload
      // 066: invokevirtual java/io/InputStream.close ()V
      // 069: iinc 7 1
      // 06c: aload 3
      // 06d: ifnull 07e
      // 070: aload 3
      // 071: ifnonnull 05a
      // 074: goto 07b
      // 077: invokestatic org/c_2.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: bipush 0
      // 07c: istore 7
      // 07e: iload 7
      // 080: iload 4
      // 082: if_icmpge 0b8
      // 085: aload 6
      // 087: iload 7
      // 089: aaload
      // 08a: astore 8
      // 08c: aload 3
      // 08d: ifnull 0f2
      // 090: aload 3
      // 091: ifnull 0b4
      // 094: goto 09b
      // 097: invokestatic org/c_2.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: aload 8
      // 09d: ifnull 0b1
      // 0a0: goto 0a7
      // 0a3: invokestatic org/c_2.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: aload 8
      // 0a9: invokevirtual java/io/InputStream.close ()V
      // 0ac: goto 0b1
      // 0af: astore 9
      // 0b1: iinc 7 1
      // 0b4: aload 3
      // 0b5: ifnonnull 07e
      // 0b8: goto 0f2
      // 0bb: astore 10
      // 0bd: bipush 0
      // 0be: istore 11
      // 0c0: iload 11
      // 0c2: iload 4
      // 0c4: if_icmpge 0ef
      // 0c7: aload 6
      // 0c9: iload 11
      // 0cb: aaload
      // 0cc: astore 12
      // 0ce: aload 3
      // 0cf: ifnull 0eb
      // 0d2: aload 12
      // 0d4: ifnull 0e8
      // 0d7: goto 0de
      // 0da: invokestatic org/c_2.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dd: athrow
      // 0de: aload 12
      // 0e0: invokevirtual java/io/InputStream.close ()V
      // 0e3: goto 0e8
      // 0e6: astore 13
      // 0e8: iinc 11 1
      // 0eb: aload 3
      // 0ec: ifnonnull 0c0
      // 0ef: aload 10
      // 0f1: athrow
      // 0f2: invokestatic com/ky_4.F ()[Ljava/lang/String;
      // 0f5: ifnull 106
      // 0f8: bipush 1
      // 0f9: anewarray 110
      // 0fc: invokestatic org/d_2.N ([Lcom/ky_4;)V
      // 0ff: goto 106
      // 102: invokestatic org/c_2.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: return
   }

   @Override
   public final void p(String[] var1) throws b_2, IOException {
      this.E(var1, new String[var1.length]);
   }

   @Override
   public final void I(String[] var1, String[] var2) throws b_2, IOException {
      int var4 = var1.length;
      File[] var5 = new File[var4];
      com.ky_4[] var10000 = d_2.b();
      int var6 = 0;
      com.ky_4[] var3 = var10000;

      while (true) {
         if (var6 < var4) {
            try {
               var5[var6] = new File(var1[var6]);
               var6++;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            } catch (b_2 var7) {
               throw c(var7);
            }
         }

         this.W(var5, var2);
         break;
      }
   }

   @Override
   public final void g(Reader[] var1) throws b_2, IOException {
      this.a(new String[var1.length], var1);
   }

   private static Exception c(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "7a@d\u0014?~!Wl;D\u0002X\u000bA/:Q\u0005A\r[j~g\u0002C\rAh\fQ\u0017U\u0001]".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 125;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 125;
         var10006 = var0;
      } else {
         var6 = 125;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 125;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 25;
               break;
            case 1:
               var23 = 82;
               break;
            case 2:
               var23 = 114;
               break;
            case 3:
               var23 = 35;
               break;
            case 4:
               var23 = 73;
               break;
            case 5:
               var23 = 11;
               break;
            default:
               var23 = 76;
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
               b = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





