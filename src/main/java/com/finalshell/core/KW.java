package com.finalshell.core;

import com.finalshell.io.YM3;
import com.finalshell.ui.model.EP;
import com.finalshell.ui.model.Ks2_2;
import com.finalshell.ui.model.O0;
import com.finalshell.ui.model.Oc2;
import java.security.AccessController;
import java.security.ProtectionDomain;
import java.util.HashMap;
import java.util.Map;

public class KW extends ClassLoader {
   public static ProtectionDomain n;
   public static Map G;

   public KW() {
      super(q());
   }

   public KW(ClassLoader var1) {
      super(var1);
   }

   public static ClassLoader q() {
      ClassLoader var0 = Thread.currentThread().getContextClassLoader();

      try {
         if (var0 != null) {
            try {
               var0.loadClass(Ok2.class.getName());
               return var0;
            } catch (ClassNotFoundException var2) {
            }
         }
      } catch (Hi2 var3) {
         throw a(var3);
      }

      return Ok2.class.getClassLoader();
   }

   @Override
   public java.lang.Class loadClass(String param1, boolean param2) throws ClassNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: getstatic com/finalshell/core/KW.G Ljava/util/Map;
      // 06: aload 1
      // 07: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0c: checkcast java/lang/Class
      // 0f: astore 4
      // 11: istore 3
      // 12: aload 4
      // 14: iload 3
      // 15: ifeq 2f
      // 18: ifnull 29
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/KW.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 4
      // 24: areturn
      // 25: invokestatic com/finalshell/core/KW.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 0
      // 2a: aload 1
      // 2b: iload 2
      // 2c: invokespecial java/lang/ClassLoader.loadClass (Ljava/lang/String;Z)Ljava/lang/Class;
      // 2f: areturn
      // 30: astore 5
      // 32: aload 5
      // 34: athrow
   }

   public java.lang.Class F(String var1, byte[] var2, int var3, int var4) throws ClassFormatError {
      return this.defineClass(var1, var2, var3, var4, n);
   }

   public boolean W(java.lang.Class param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: aload 1
      // 04: invokevirtual java/lang/Class.getClassLoader ()Ljava/lang/ClassLoader;
      // 07: astore 3
      // 08: istore 2
      // 09: aload 3
      // 0a: ifnonnull 13
      // 0d: bipush 0
      // 0e: ireturn
      // 0f: invokestatic com/finalshell/core/KW.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: astore 4
      // 16: aload 4
      // 18: ifnull 3d
      // 1b: aload 4
      // 1d: iload 2
      // 1e: ifeq 37
      // 21: aload 3
      // 22: if_acmpne 32
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/KW.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic com/finalshell/core/KW.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 4
      // 34: invokevirtual java/lang/ClassLoader.getParent ()Ljava/lang/ClassLoader;
      // 37: astore 4
      // 39: iload 2
      // 3a: ifne 16
      // 3d: bipush 1
      // 3e: ireturn
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static void __vfClinit__() {
      long var1 = 4290589594971281358L;
      long[] var0 = new long[51];
      int var4 = 0;
      String var5 = "ðs\bn\r@\u0017ÄWl¾\u000f\r@\u0017ÒS\u008e\u001b'\r@\u0017Ôw%\u000bg\r@\u0017ÉwP:¤\r@\u0017Ç*,\u000fY\r@\u0017åÔe\u009b \r@\u0017Ý\u0088CVI\r@\u0017ÿôÿ\u0087\u0089\r@\u0017à\u007f/n\u0005\r@\u0017Æv\bP\u0018\r@\u0017ØÈ¯àG\r@\u0017×\u001e\u009a~^\r@\u0017ç©%\u0012b\r@\u0017öQ»\u0081ë\r@\u0017ü\u0018¢ñÈ\r@\u0017ÂÂE5*\r@\u0017êT\u009dtn\r@\u0017æÙ\u0012h\\\r@\u0017ûé\u0019:ú\r@\u0017øu^·ó\r@\u0017áRy¡_\r@\u0017þm*{Ö\r@\u0017Ñ\u00ad@C<\r@\u0017îe½-Ç\r@\u0017ë\u000e÷·#\r@\u0017ã@\u0012§×\r@\u0017úUÃ\u000eþ\r@\u0017íúº\u009aL\r@\u0017ÃI/\u0002O\r@\u0017éål\u0097%\r@\u0017Áì¸íV\r@\u0017Ü!üL¶\r@\u0017ÕË§Kk\r@\u0017ï\u0017g&\u0081\r@\u0017Þ%¦¦Ù\r@\u0017ùÂf7þ\r@\u0017äÄißÊ\r@\u0017ÙãÛ\u001a¯\r@\u0017è\r\u001a G\r@\u0017ýHÏ\u009b\f\r@\u0017âºÜ§\u001d\r@\u0017Óá ü\b\r@\u0017ÛÈ\u009co¬\r@\u0017À\u0098\u00824\u0006\r@\u0017Ú²ZD\u0092\r@\u0017Öi3\u000e\u008b\r@\u0017ÐqZ.á\r@\u0017Å\u001e\u001cw\u0095\r@\u0017ì";
      int var6 = "ðs\bn\r@\u0017ÄWl¾\u000f\r@\u0017ÒS\u008e\u001b'\r@\u0017Ôw%\u000bg\r@\u0017ÉwP:¤\r@\u0017Ç*,\u000fY\r@\u0017åÔe\u009b \r@\u0017Ý\u0088CVI\r@\u0017ÿôÿ\u0087\u0089\r@\u0017à\u007f/n\u0005\r@\u0017Æv\bP\u0018\r@\u0017ØÈ¯àG\r@\u0017×\u001e\u009a~^\r@\u0017ç©%\u0012b\r@\u0017öQ»\u0081ë\r@\u0017ü\u0018¢ñÈ\r@\u0017ÂÂE5*\r@\u0017êT\u009dtn\r@\u0017æÙ\u0012h\\\r@\u0017ûé\u0019:ú\r@\u0017øu^·ó\r@\u0017áRy¡_\r@\u0017þm*{Ö\r@\u0017Ñ\u00ad@C<\r@\u0017îe½-Ç\r@\u0017ë\u000e÷·#\r@\u0017ã@\u0012§×\r@\u0017úUÃ\u000eþ\r@\u0017íúº\u009aL\r@\u0017ÃI/\u0002O\r@\u0017éål\u0097%\r@\u0017Áì¸íV\r@\u0017Ü!üL¶\r@\u0017ÕË§Kk\r@\u0017ï\u0017g&\u0081\r@\u0017Þ%¦¦Ù\r@\u0017ùÂf7þ\r@\u0017äÄißÊ\r@\u0017ÙãÛ\u001a¯\r@\u0017è\r\u001a G\r@\u0017ýHÏ\u009b\f\r@\u0017âºÜ§\u001d\r@\u0017Óá ü\b\r@\u0017ÛÈ\u009co¬\r@\u0017À\u0098\u00824\u0006\r@\u0017Ú²ZD\u0092\r@\u0017Öi3\u000e\u008b\r@\u0017ÐqZ.á\r@\u0017Å\u001e\u001cw\u0095\r@\u0017ì"
         .length();
      byte var3 = 0;

      label30:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var10000 = var0;
         var10001 = var4++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var19 = var10002 ^ var1;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var19;
                  if (var3 >= var6) {
                     G = new HashMap();
                     n = AccessController.doPrivileged(new Xw4());
                     java.lang.Class[] var14 = new java.lang.Class[(int)var0[13]];
                     var14[0] = Ok2.class;
                     var14[1] = O0.class;
                     var14[2] = Oc2.class;
                     var14[3] = Ph4.class;
                     var14[4] = Xd4.class;
                     var14[5] = Hi2.class;
                     var14[(int)var0[50]] = Hf2.class;
                     var14[(int)var0[3]] = Df4.class;
                     var14[(int)var0[9]] = CA3_2.class;
                     var14[(int)var0[4]] = ON3.class;
                     var14[(int)var0[0]] = HI.class;
                     var14[(int)var0[47]] = Ph2.class;
                     var14[(int)var0[15]] = B8_2.class;
                     var14[(int)var0[28]] = S7.class;
                     var14[(int)var0[43]] = GT.class;
                     var14[(int)var0[30]] = HK.class;
                     var14[(int)var0[34]] = ZzzzF6BeanInfo.class;
                     var14[(int)var0[49]] = Ak2.class;
                     var14[(int)var0[31]] = Nj4.class;
                     var14[(int)var0[6]] = Nv4.class;
                     var14[(int)var0[44]] = Zzzzd4BeanInfo.class;
                     var14[(int)var0[42]] = NL3.class;
                     var14[(int)var0[10]] = YM3.class;
                     var14[(int)var0[37]] = Wr4.class;
                     var14[(int)var0[45]] = BY.class;
                     var14[(int)var0[11]] = Wy4.class;
                     var14[(int)var0[2]] = K2_2.class;
                     var14[(int)var0[32]] = H2.class;
                     var14[(int)var0[1]] = IK.class;
                     var14[(int)var0[41]] = WX_2.class;
                     var14[(int)var0[46]] = KK_2.class;
                     var14[(int)var0[22]] = CW3.class;
                     var14[(int)var0[23]] = N9.class;
                     var14[(int)var0[33]] = EP.class;
                     var14[(int)var0[48]] = FW.class;
                     var14[(int)var0[27]] = Uh2_2.class;
                     var14[(int)var0[16]] = En2.class;
                     var14[(int)var0[24]] = Ep4.class;
                     var14[(int)var0[38]] = IG.class;
                     var14[(int)var0[29]] = Yn4.class;
                     var14[(int)var0[17]] = P7.class;
                     var14[(int)var0[12]] = U9.class;
                     var14[(int)var0[36]] = XM3.class;
                     var14[(int)var0[5]] = Ge2.class;
                     var14[(int)var0[40]] = O12.class;
                     var14[(int)var0[25]] = Ks2_2.class;
                     var14[(int)var0[8]] = Uy2_2.class;
                     var14[(int)var0[20]] = U7.class;
                     var14[(int)var0[21]] = Sw2.class;
                     var14[(int)var0[7]] = X4.class;
                     var14[(int)var0[14]] = GV.class;
                     var14[(int)var0[39]] = GU.class;
                     var14[(int)var0[26]] = Da2.class;
                     var14[(int)var0[18]] = DL3.class;
                     var14[(int)var0[19]] = UT_2.class;
                     var14[(int)var0[35]] = Ub2_2.class;
                     java.lang.Class[] var8 = var14;

                     for (java.lang.Class var12 : var8) {
                        G.put(var12.getName(), var12);
                     }

                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var19;
                  if (var3 < var6) {
                     continue label30;
                  }

                  var5 = "\u0004-\u001aÖ\r@\u0017ß\u0095L·\u0003\r@\u0017È";
                  var6 = "\u0004-\u001aÖ\r@\u0017ß\u0095L·\u0003\r@\u0017È".length();
                  var3 = 0;
            }

            byte var16 = var3;
            var3 += 8;
            var7 = var5.substring(var16, var3).getBytes("ISO-8859-1");
            var10000 = var0;
            var10001 = var4++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





