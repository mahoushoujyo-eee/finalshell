package com.finalshell.core;

import com.finalshell.crypto.PingMessageR;
import java.io.InputStream;
import java.io.OutputStream;

public class Cm2 {
   public int l = -1;
   public boolean Q = false;
   public byte[] w;
   public int o;
   public static long a;

   public void g(InputStream param1, BR3 param2, int param3, Cm2 param4) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 03: bipush 0
      // 04: istore 6
      // 06: astore 5
      // 08: iload 3
      // 09: newarray 8
      // 0b: astore 7
      // 0d: bipush 0
      // 0e: istore 8
      // 10: bipush 0
      // 11: istore 9
      // 13: aload 5
      // 15: ifnonnull 3a
      // 18: aload 0
      // 19: bipush 1
      // 1a: putfield com/finalshell/core/Cm2.Q Z
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/Cm2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: iload 9
      // 26: aload 5
      // 28: ifnull 2f
      // 2b: ifne 31
      // 2e: bipush 1
      // 2f: istore 9
      // 31: aload 2
      // 32: aload 7
      // 34: bipush 0
      // 35: iload 6
      // 37: invokevirtual com/finalshell/core/BR3.t ([BII)V
      // 3a: aload 1
      // 3b: aload 7
      // 3d: invokevirtual java/io/InputStream.read ([B)I
      // 40: dup
      // 41: istore 6
      // 43: ifgt 18
      // 46: aload 5
      // 48: ifnull 24
      // 4b: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void u(long var1, int var3, int var4) {
      long var14;
      String[] var10000 = PingMessageR.N();
      long var6 = (long)(1000.0F * (float)var4 / (float)var3);
      String[] var5 = var10000;
      long var8 = System.currentTimeMillis() - var1;

      label30: {
         long var10001;
         label29: {
            try {
               var14 = var8;
               var10001 = var6;
               if (var5 == null) {
                  break label29;
               }

               if (var8 >= var6) {
                  return;
               }
            } catch (InterruptedException var13) {
               throw a(var13);
            }

            try {
               var14 = var6;
               var10001 = var8;
            } catch (InterruptedException var12) {
               var15 = var12;
               boolean var16 = false;
               break label30;
            }
         }

         try {
            Thread.sleep(var14 - var10001);
            return;
         } catch (InterruptedException var11) {
            var15 = var11;
            boolean var17 = false;
         }
      }

      InterruptedException var10 = var15;
      var10.printStackTrace();
   }

   public void H(Br4 param1, OutputStream param2, UR param3) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 5
      // 03: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 06: getstatic com/finalshell/core/Cm2.a J
      // 09: l2i
      // 0a: newarray 8
      // 0c: astore 6
      // 0e: bipush 0
      // 0f: istore 7
      // 11: astore 4
      // 13: bipush 0
      // 14: istore 8
      // 16: aload 4
      // 18: ifnonnull 4b
      // 1b: iload 8
      // 1d: aload 4
      // 1f: ifnull 40
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Cm2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: ifne 42
      // 2c: aload 0
      // 2d: aload 6
      // 2f: putfield com/finalshell/core/Cm2.w [B
      // 32: aload 0
      // 33: iload 5
      // 35: putfield com/finalshell/core/Cm2.o I
      // 38: bipush 1
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/Cm2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: istore 8
      // 42: aload 2
      // 43: aload 6
      // 45: bipush 0
      // 46: iload 5
      // 48: invokevirtual java/io/OutputStream.write ([BII)V
      // 4b: aload 1
      // 4c: aload 6
      // 4e: bipush 0
      // 4f: aload 6
      // 51: arraylength
      // 52: invokevirtual com/finalshell/core/Br4.Z ([BII)I
      // 55: dup
      // 56: istore 5
      // 58: ifgt 1b
      // 5b: aload 4
      // 5d: ifnull 42
      // 60: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7080321076139620390L;
      long var10002 = 851728747219615734L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





