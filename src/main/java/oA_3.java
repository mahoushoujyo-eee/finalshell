import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class oA_3 implements FY {
   File p;
   private static String[] z;
   private static final String a;

   public oA_3(File var1) {
      String[] var10000 = j();
      this.p = null;
      String[] var2 = var10000;
      this.p = var1;
      if (var2 != null) {
         com.ky_4.K(new String[4]);
      }
   }

   @Override
   public String T() {
      return this.p.getName();
   }

   @Override
   public InputStream g() throws IOException {
      return new FileInputStream(this.p);
   }

   @Override
   public OutputStream D() throws IOException {
      return new FileOutputStream(this.p);
   }

   @Override
   public OutputStream M(boolean var1) throws IOException {
      return new FileOutputStream(this.p, var1);
   }

   @Override
   public FY Y(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic oA_3.j ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 0
      // 06: getfield oA_3.p Ljava/io/File;
      // 09: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 0c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f: aload 2
      // 10: ifnonnull 35
      // 13: ifeq 23
      // 16: goto 1d
      // 19: invokestatic oA_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1c: athrow
      // 1d: aload 0
      // 1e: areturn
      // 1f: invokestatic oA_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 22: athrow
      // 23: aload 0
      // 24: getfield oA_3.p Ljava/io/File;
      // 27: aload 2
      // 28: ifnonnull 64
      // 2b: invokevirtual java/io/File.isDirectory ()Z
      // 2e: goto 35
      // 31: invokestatic oA_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 34: athrow
      // 35: ifeq 96
      // 38: new java/io/File
      // 3b: dup
      // 3c: new java/lang/StringBuilder
      // 3f: dup
      // 40: invokespecial java/lang/StringBuilder.<init> ()V
      // 43: aload 0
      // 44: getfield oA_3.p Ljava/io/File;
      // 47: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 4a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d: getstatic java/io/File.separator Ljava/lang/String;
      // 50: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53: aload 1
      // 54: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 57: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5a: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 5d: goto 64
      // 60: invokestatic oA_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 63: athrow
      // 64: astore 3
      // 65: aload 3
      // 66: invokevirtual java/io/File.createNewFile ()Z
      // 69: pop
      // 6a: goto 8d
      // 6d: astore 4
      // 6f: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 72: new java/lang/StringBuilder
      // 75: dup
      // 76: invokespecial java/lang/StringBuilder.<init> ()V
      // 79: getstatic oA_3.a Ljava/lang/String;
      // 7c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7f: aload 4
      // 81: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 84: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 87: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8a: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 8d: new oA_3
      // 90: dup
      // 91: aload 3
      // 92: invokespecial oA_3.<init> (Ljava/io/File;)V
      // 95: areturn
      // 96: aconst_null
      // 97: invokestatic com/ky_4.F ()[Ljava/lang/String;
      // 9a: ifnull ab
      // 9d: bipush 3
      // 9e: anewarray 26
      // a1: invokestatic oA_3.G ([Ljava/lang/String;)V
      // a4: goto ab
      // a7: invokestatic oA_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // aa: athrow
      // ab: areturn
   }

   @Override
   public long F() {
      return this.p.length();
   }

   @Override
   public boolean u() {
      return this.p.isDirectory();
   }

   @Override
   public boolean B() {
      return this.p.exists();
   }

   public static void G(String[] var0) {
      z = var0;
   }

   public static String[] j() {
      return z;
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      if (j() != null) {
         G(new String[5]);
      }

      char[] var10003 = "`\u001d\u0003\u007fL*hm\n\u0011>~&$FO#lJ :\u0019".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 45;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 45;
         var10006 = var0;
      } else {
         var6 = 45;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 45;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 14;
               break;
            case 1:
               var23 = 66;
               break;
            case 2:
               var23 = 75;
               break;
            case 3:
               var23 = 51;
               break;
            case 4:
               var23 = 21;
               break;
            case 5:
               var23 = 98;
               break;
            default:
               var23 = 101;
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
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





