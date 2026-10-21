package com;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

public class zO implements com.ak_2 {
   public static final com.zO g = new com.zO();
   private DecimalFormat m = null;

   public zO() {
   }

   public zO(DecimalFormat var1) {
      this.m = var1;
   }

   public zO(String var1) {
      this(new DecimalFormat(var1));
   }

   @Override
   public void u(nL_3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/nv_4.o ()Ljava/lang/String;
      // 03: aload 1
      // 04: getfield com/nL_3.w Lcom/yM_3;
      // 07: astore 7
      // 09: astore 6
      // 0b: aload 2
      // 0c: aload 6
      // 0e: ifnull 29
      // 11: ifnonnull 28
      // 14: goto 1b
      // 17: invokestatic com/zO.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1a: athrow
      // 1b: aload 7
      // 1d: getstatic com/EP.WriteNullNumberAsZero Lcom/EP;
      // 20: invokevirtual com/yM_3.x (Lcom/EP;)V
      // 23: return
      // 24: invokestatic com/zO.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 27: athrow
      // 28: aload 2
      // 29: checkcast java/lang/Double
      // 2c: invokevirtual java/lang/Double.doubleValue ()D
      // 2f: dstore 8
      // 31: aload 6
      // 33: ifnull 60
      // 36: dload 8
      // 38: invokestatic java/lang/Double.isNaN (D)Z
      // 3b: ifne 54
      // 3e: goto 45
      // 41: invokestatic com/zO.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 44: athrow
      // 45: dload 8
      // 47: invokestatic java/lang/Double.isInfinite (D)Z
      // 4a: ifeq 65
      // 4d: goto 54
      // 50: invokestatic com/zO.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 53: athrow
      // 54: aload 7
      // 56: invokevirtual com/yM_3.Y ()V
      // 59: goto 60
      // 5c: invokestatic com/zO.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 5f: athrow
      // 60: aload 6
      // 62: ifnonnull ac
      // 65: aload 0
      // 66: getfield com/zO.m Ljava/text/DecimalFormat;
      // 69: aload 6
      // 6b: ifnull 9e
      // 6e: goto 75
      // 71: invokestatic com/zO.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 74: athrow
      // 75: ifnonnull 93
      // 78: goto 7f
      // 7b: invokestatic com/zO.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 7e: athrow
      // 7f: aload 7
      // 81: dload 8
      // 83: bipush 1
      // 84: invokevirtual com/yM_3.B (DZ)V
      // 87: aload 6
      // 89: ifnonnull ac
      // 8c: goto 93
      // 8f: invokestatic com/zO.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 92: athrow
      // 93: aload 0
      // 94: getfield com/zO.m Ljava/text/DecimalFormat;
      // 97: goto 9e
      // 9a: invokestatic com/zO.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 9d: athrow
      // 9e: dload 8
      // a0: invokevirtual java/text/DecimalFormat.format (D)Ljava/lang/String;
      // a3: astore 10
      // a5: aload 7
      // a7: aload 10
      // a9: invokevirtual com/yM_3.write (Ljava/lang/String;)V
      // ac: return
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





