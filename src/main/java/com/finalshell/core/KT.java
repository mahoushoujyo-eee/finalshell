package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.O0;
import com.finalshell.ui.panel.Ky4;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class KT {
   public static boolean M;
   public static String[] a;
   public static String[] b;
   public static long c;
   public static long[] d;
   public static Long[] e;

   public static void M(String param0, String param1, O0 param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/KT.F ()Z
      // 03: istore 3
      // 04: aload 2
      // 05: invokevirtual com/finalshell/ui/model/O0.toString ()Ljava/lang/String;
      // 08: aload 0
      // 09: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0c: ldc2_w 373871880855596298
      // 0f: astore 7
      // 11: ldc2_w 373871880855596298
      // 14: aload 7
      // 16: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 19: pop
      // 1a: goto 21
      // 1d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 2b
      // 24: astore 4
      // 26: aload 4
      // 28: invokevirtual java/lang/Exception.printStackTrace ()V
      // 2b: new java/lang/StringBuilder
      // 2e: dup
      // 2f: invokespecial java/lang/StringBuilder.<init> ()V
      // 32: ldc2_w 452023328242776550
      // 35: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 38: aconst_null
      // 39: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3c: checkcast java/lang/String
      // 3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42: aload 1
      // 43: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46: getstatic java/io/File.separator Ljava/lang/String;
      // 49: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c: invokestatic java/lang/System.currentTimeMillis ()J
      // 4f: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 52: sipush -9378
      // 55: sipush 1858
      // 58: invokestatic com/finalshell/core/KT.a (II)Ljava/lang/String;
      // 5b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 61: astore 4
      // 63: new java/io/File
      // 66: dup
      // 67: ldc2_w 452023328242776550
      // 6a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 6d: aconst_null
      // 6e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 71: checkcast java/lang/String
      // 74: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 77: astore 5
      // 79: iload 3
      // 7a: ifeq b7
      // 7d: aload 5
      // 7f: invokevirtual java/io/File.exists ()Z
      // 82: ifne 99
      // 85: goto 8c
      // 88: invokestatic com/finalshell/core/KT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8b: athrow
      // 8c: aload 5
      // 8e: invokevirtual java/io/File.mkdirs ()Z
      // 91: pop
      // 92: goto 99
      // 95: invokestatic com/finalshell/core/KT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98: athrow
      // 99: aload 2
      // 9a: invokevirtual com/finalshell/ui/model/O0.toString ()Ljava/lang/String;
      // 9d: aload 4
      // 9f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // a2: ldc2_w 373871880855596298
      // a5: astore 9
      // a7: ldc2_w 373871880855596298
      // aa: aload 9
      // ac: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // af: pop
      // b0: goto b7
      // b3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b6: athrow
      // b7: goto c1
      // ba: astore 6
      // bc: aload 6
      // be: invokevirtual java/lang/Exception.printStackTrace ()V
      // c1: aload 1
      // c2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // c5: ldc2_w 344118345850562877
      // c8: astore 11
      // ca: ldc2_w 344118345850562877
      // cd: aload 11
      // cf: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // d2: pop
      // d3: goto da
      // d6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // d9: athrow
      // da: return
   }

   public static void s(HashSet param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/KT.F ()Z
      // 03: new java/io/File
      // 06: dup
      // 07: ldc2_w 452023328242776550
      // 0a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0d: aconst_null
      // 0e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 11: checkcast java/lang/String
      // 14: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 17: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 1a: astore 2
      // 1b: istore 1
      // 1c: aload 2
      // 1d: iload 1
      // 1e: ifeq 2c
      // 21: ifnull d2
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/KT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 2
      // 2c: astore 3
      // 2d: aload 3
      // 2e: arraylength
      // 2f: istore 4
      // 31: bipush 0
      // 32: istore 5
      // 34: iload 5
      // 36: iload 4
      // 38: if_icmpge d2
      // 3b: aload 3
      // 3c: iload 5
      // 3e: aaload
      // 3f: astore 6
      // 41: aload 6
      // 43: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 46: astore 7
      // 48: aload 7
      // 4a: sipush -9377
      // 4d: sipush -27363
      // 50: invokestatic com/finalshell/core/KT.a (II)Ljava/lang/String;
      // 53: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 56: iload 1
      // 57: ifeq 94
      // 5a: ifne 87
      // 5d: goto 64
      // 60: invokestatic com/finalshell/core/KT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63: athrow
      // 64: aload 7
      // 66: sipush -9380
      // 69: sipush 15156
      // 6c: invokestatic com/finalshell/core/KT.a (II)Ljava/lang/String;
      // 6f: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 72: iload 1
      // 73: ifeq 94
      // 76: goto 7d
      // 79: invokestatic com/finalshell/core/KT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7c: athrow
      // 7d: ifeq cb
      // 80: goto 87
      // 83: invokestatic com/finalshell/core/KT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86: athrow
      // 87: aload 0
      // 88: aload 7
      // 8a: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 8d: goto 94
      // 90: invokestatic com/finalshell/core/KT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 93: athrow
      // 94: ifne aa
      // 97: aload 6
      // 99: invokestatic org/apache/commons/io/FileUtils.deleteDirectory (Ljava/io/File;)V
      // 9c: goto cb
      // 9f: astore 8
      // a1: aload 8
      // a3: invokevirtual java/io/IOException.printStackTrace ()V
      // a6: iload 1
      // a7: ifne cb
      // aa: aload 7
      // ac: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // af: ldc2_w 344118345850562877
      // b2: astore 9
      // b4: ldc2_w 344118345850562877
      // b7: aload 9
      // b9: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // bc: pop
      // bd: goto c4
      // c0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // c3: athrow
      // c4: goto cb
      // c7: invokestatic com/finalshell/core/KT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ca: athrow
      // cb: iinc 5 1
      // ce: iload 1
      // cf: ifne 34
      // d2: return
   }

   public static void K$void(String var0) {
      F();
      Object[] var10001 = Registry.packArgs(var0, false);
      long var10 = 218700499926690149L;
      Object var10002 = Ref.h2(218700499926690149L, var10);

      try {
         var10002 = (ArrayList)var10002;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      ArrayList var2 = (ArrayList)var10002;
      Object[] var1 = var10001;
      long var3 = System.currentTimeMillis();
      int var5 = var2.size();

      for (File var7 : var2) {
         Registry.packArgs(var7.getName());
         long var12 = 468568467042766421L;
         var10002 = Ref.h2(468568467042766421L, var12);

         try {
            var18 = (Long)var10002;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         label52: {
            long var8 = var18;
            int var19 = var5;
            if (var1 == null) {
               if (var5 <= 3) {
                  break label52;
               }

               long var20;
               var19 = (var20 = (var3 - var8) / a(29389, 662625468544069988L) - a(29714, 7756531679908411322L)) == 0L ? 0 : (var20 < 0L ? -1 : 1);
            }

            if (var1 == null) {
               if (var19 <= 0) {
                  break label52;
               }

               var7.delete();
            }

            var5--;
         }

         if (var1 == null) {
            break;
         }
      }
   }

   public static O0 b(String var0) {
      boolean var10000 = F();
      String var2 = new File(var0).getName();
      boolean var1 = var10000;
      String var3 = a(-9379, 10189) + var2.substring(0, (int)c);
      Registry.packArgs(var0, var3);
      long var4 = 486574746251697859L;
      O0 var10001 = (O0)Ref.h2(486574746251697859L, var4);

      try {
         var10001 = var10001;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      if (!var1) {
         Ky4.K(new String[3]);
      }

      return var10001;
   }

   public static O0 D(String var0) {
      boolean var10000 = A();
      String var2 = a(-9384, -6091) + new File(var0).getParentFile().getName();
      boolean var1 = var10000;
      Registry.packArgs(var0, var2);
      long var3 = 486574746251697859L;
      O0 var10001 = (O0)Ref.h2(486574746251697859L, var3);

      try {
         var10001 = var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      if (Ky4.F$arrString() != null) {
         N(!var1);
      }

      return var10001;
   }

   public static boolean u(String var0) {
      boolean var1 = false;
      Object var2 = null;

      try {
         Registry.packArgs(var0);
         long var4 = 340002508208074194L;
         Object var10001 = Ref.h2(340002508208074194L, var4);

         try {
            var10001 = (String)var10001;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         String var3 = (String)var10001;
         var2 = O0.y(var3);
         var1 = true;
      } catch (Exception var7) {
         var7.printStackTrace();
      }

      return var1;
   }

   public static O0 a(String param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/KT.F ()Z
      // 03: invokestatic java/lang/System.currentTimeMillis ()J
      // 06: lstore 3
      // 07: istore 2
      // 08: new com/finalshell/ui/model/O0
      // 0b: dup
      // 0c: invokespecial com/finalshell/ui/model/O0.<init> ()V
      // 0f: invokevirtual com/finalshell/ui/model/O0.V ()Ljava/lang/String;
      // 12: astore 5
      // 14: bipush 0
      // 15: istore 6
      // 17: aconst_null
      // 18: astore 7
      // 1a: aload 0
      // 1b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1e: ldc2_w 340002508208074194
      // 21: astore 12
      // 23: ldc2_w 340002508208074194
      // 26: aload 12
      // 28: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2b: checkcast java/lang/String
      // 2e: goto 35
      // 31: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 34: athrow
      // 35: astore 5
      // 37: aload 5
      // 39: invokestatic com/finalshell/ui/model/O0.y (Ljava/lang/String;)Lcom/finalshell/ui/model/O0;
      // 3c: astore 7
      // 3e: bipush 1
      // 3f: istore 6
      // 41: goto 4b
      // 44: astore 8
      // 46: aload 8
      // 48: invokevirtual java/lang/Exception.printStackTrace ()V
      // 4b: iload 6
      // 4d: ifne d6
      // 50: aload 1
      // 51: bipush 1
      // 52: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 55: ldc2_w 218700499926690149
      // 58: astore 14
      // 5a: ldc2_w 218700499926690149
      // 5d: aload 14
      // 5f: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 62: checkcast java/util/ArrayList
      // 65: goto 6c
      // 68: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: astore 8
      // 6e: aload 8
      // 70: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 73: astore 9
      // 75: aload 9
      // 77: iload 2
      // 78: ifeq 98
      // 7b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 80: ifeq d6
      // 83: goto 8a
      // 86: invokestatic com/finalshell/core/KT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89: athrow
      // 8a: aload 9
      // 8c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 91: goto 98
      // 94: invokestatic com/finalshell/core/KT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97: athrow
      // 98: checkcast java/io/File
      // 9b: astore 10
      // 9d: aload 10
      // 9f: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // a2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // a5: ldc2_w 340002508208074194
      // a8: astore 16
      // aa: ldc2_w 340002508208074194
      // ad: aload 16
      // af: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // b2: checkcast java/lang/String
      // b5: goto bc
      // b8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // bb: athrow
      // bc: astore 5
      // be: aload 5
      // c0: invokestatic com/finalshell/ui/model/O0.y (Ljava/lang/String;)Lcom/finalshell/ui/model/O0;
      // c3: astore 7
      // c5: bipush 1
      // c6: istore 6
      // c8: goto d6
      // cb: astore 11
      // cd: aload 11
      // cf: invokevirtual java/lang/Exception.printStackTrace ()V
      // d2: iload 2
      // d3: ifne 75
      // d6: aload 7
      // d8: areturn
   }

   public static ArrayList z(String var0, boolean var1) {
      boolean var10000 = F();
      File[] var3 = new File((String)Registry.lookupField(452023328242776550L).get(null) + var0).listFiles();
      boolean var2 = var10000;
      ArrayList var4 = new ArrayList();
      File[] var10 = var3;
      if (var2) {
         if (var3 == null) {
            return var4;
         }

         var10 = var3;
      }

      File[] var5 = var10;
      int var6 = var5.length;
      int var7 = 0;

      while (var7 < var6) {
         File var8 = var5[var7];
         if (!var2) {
            return var4;
         }

         label31:
         if (var2) {
            if (var8.isFile()) {
               String var9 = var8.getName();
               if (!var2) {
                  break label31;
               }

               if (var9.endsWith(a(-9383, -23590))) {
                  var4.add(var8);
               }
            }

            var7++;
         }

         if (!var2) {
            break;
         }
      }

      Collections.sort(var4, new com.finalshell.ui.model.Ab2(var1));
      return var4;
   }

   public static long K$long(String var0) {
      String var1 = var0.substring(0, var0.length() - 5);
      Long var2 = Long.parseLong(var1);
      return var2;
   }

   public static long i(String var0) {
      Registry.packArgs(var0);
      long var1 = 468568467042766421L;
      Object var10001 = Ref.h2(468568467042766421L, var1);

      try {
         return (Long)var10001;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public static void N(boolean var0) {
      M = var0;
   }

   public static boolean F() {
      return M;
   }

   public static boolean A() {
      boolean var0 = F();
      return !var0;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -9379) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 209;
               break;
            case 1:
               var10000 = 171;
               break;
            case 2:
               var10000 = 102;
               break;
            case 3:
               var10000 = 243;
               break;
            case 4:
               var10000 = 131;
               break;
            case 5:
               var10000 = 134;
               break;
            case 6:
               var10000 = 217;
               break;
            case 7:
               var10000 = 196;
               break;
            case 8:
               var10000 = 35;
               break;
            case 9:
               var10000 = 175;
               break;
            case 10:
               var10000 = 105;
               break;
            case 11:
               var10000 = 17;
               break;
            case 12:
               var10000 = 2;
               break;
            case 13:
               var10000 = 224;
               break;
            case 14:
               var10000 = 62;
               break;
            case 15:
               var10000 = 12;
               break;
            case 16:
               var10000 = 173;
               break;
            case 17:
               var10000 = 96;
               break;
            case 18:
               var10000 = 118;
               break;
            case 19:
               var10000 = 167;
               break;
            case 20:
               var10000 = 245;
               break;
            case 21:
               var10000 = 177;
               break;
            case 22:
               var10000 = 7;
               break;
            case 23:
               var10000 = 3;
               break;
            case 24:
               var10000 = 140;
               break;
            case 25:
               var10000 = 151;
               break;
            case 26:
               var10000 = 130;
               break;
            case 27:
               var10000 = 106;
               break;
            case 28:
               var10000 = 231;
               break;
            case 29:
               var10000 = 75;
               break;
            case 30:
               var10000 = 182;
               break;
            case 31:
               var10000 = 22;
               break;
            case 32:
               var10000 = 101;
               break;
            case 33:
               var10000 = 191;
               break;
            case 34:
               var10000 = 234;
               break;
            case 35:
               var10000 = 94;
               break;
            case 36:
               var10000 = 120;
               break;
            case 37:
               var10000 = 248;
               break;
            case 38:
               var10000 = 142;
               break;
            case 39:
               var10000 = 46;
               break;
            case 40:
               var10000 = 61;
               break;
            case 41:
               var10000 = 19;
               break;
            case 42:
               var10000 = 20;
               break;
            case 43:
               var10000 = 80;
               break;
            case 44:
               var10000 = 66;
               break;
            case 45:
               var10000 = 87;
               break;
            case 46:
               var10000 = 170;
               break;
            case 47:
               var10000 = 148;
               break;
            case 48:
               var10000 = 111;
               break;
            case 49:
               var10000 = 135;
               break;
            case 50:
               var10000 = 53;
               break;
            case 51:
               var10000 = 132;
               break;
            case 52:
               var10000 = 82;
               break;
            case 53:
               var10000 = 236;
               break;
            case 54:
               var10000 = 185;
               break;
            case 55:
               var10000 = 93;
               break;
            case 56:
               var10000 = 43;
               break;
            case 57:
               var10000 = 51;
               break;
            case 58:
               var10000 = 166;
               break;
            case 59:
               var10000 = 98;
               break;
            case 60:
               var10000 = 15;
               break;
            case 61:
               var10000 = 242;
               break;
            case 62:
               var10000 = 63;
               break;
            case 63:
               var10000 = 39;
               break;
            case 64:
               var10000 = 95;
               break;
            case 65:
               var10000 = 149;
               break;
            case 66:
               var10000 = 33;
               break;
            case 67:
               var10000 = 124;
               break;
            case 68:
               var10000 = 194;
               break;
            case 69:
               var10000 = 174;
               break;
            case 70:
               var10000 = 24;
               break;
            case 71:
               var10000 = 152;
               break;
            case 72:
               var10000 = 251;
               break;
            case 73:
               var10000 = 195;
               break;
            case 74:
               var10000 = 249;
               break;
            case 75:
               var10000 = 143;
               break;
            case 76:
               var10000 = 206;
               break;
            case 77:
               var10000 = 110;
               break;
            case 78:
               var10000 = 8;
               break;
            case 79:
               var10000 = 126;
               break;
            case 80:
               var10000 = 112;
               break;
            case 81:
               var10000 = 180;
               break;
            case 82:
               var10000 = 115;
               break;
            case 83:
               var10000 = 40;
               break;
            case 84:
               var10000 = 203;
               break;
            case 85:
               var10000 = 144;
               break;
            case 86:
               var10000 = 11;
               break;
            case 87:
               var10000 = 207;
               break;
            case 88:
               var10000 = 213;
               break;
            case 89:
               var10000 = 81;
               break;
            case 90:
               var10000 = 246;
               break;
            case 91:
               var10000 = 155;
               break;
            case 92:
               var10000 = 199;
               break;
            case 93:
               var10000 = 88;
               break;
            case 94:
               var10000 = 64;
               break;
            case 95:
               var10000 = 116;
               break;
            case 96:
               var10000 = 25;
               break;
            case 97:
               var10000 = 122;
               break;
            case 98:
               var10000 = 72;
               break;
            case 99:
               var10000 = 225;
               break;
            case 100:
               var10000 = 34;
               break;
            case 101:
               var10000 = 229;
               break;
            case 102:
               var10000 = 223;
               break;
            case 103:
               var10000 = 201;
               break;
            case 104:
               var10000 = 16;
               break;
            case 105:
               var10000 = 99;
               break;
            case 106:
               var10000 = 56;
               break;
            case 107:
               var10000 = 48;
               break;
            case 108:
               var10000 = 49;
               break;
            case 109:
               var10000 = 255;
               break;
            case 110:
               var10000 = 146;
               break;
            case 111:
               var10000 = 0;
               break;
            case 112:
               var10000 = 211;
               break;
            case 113:
               var10000 = 252;
               break;
            case 114:
               var10000 = 162;
               break;
            case 115:
               var10000 = 184;
               break;
            case 116:
               var10000 = 178;
               break;
            case 117:
               var10000 = 205;
               break;
            case 118:
               var10000 = 253;
               break;
            case 119:
               var10000 = 208;
               break;
            case 120:
               var10000 = 202;
               break;
            case 121:
               var10000 = 107;
               break;
            case 122:
               var10000 = 187;
               break;
            case 123:
               var10000 = 176;
               break;
            case 124:
               var10000 = 65;
               break;
            case 125:
               var10000 = 188;
               break;
            case 126:
               var10000 = 254;
               break;
            case 127:
               var10000 = 226;
               break;
            case 128:
               var10000 = 128;
               break;
            case 129:
               var10000 = 1;
               break;
            case 130:
               var10000 = 54;
               break;
            case 131:
               var10000 = 240;
               break;
            case 132:
               var10000 = 108;
               break;
            case 133:
               var10000 = 58;
               break;
            case 134:
               var10000 = 9;
               break;
            case 135:
               var10000 = 220;
               break;
            case 136:
               var10000 = 127;
               break;
            case 137:
               var10000 = 158;
               break;
            case 138:
               var10000 = 137;
               break;
            case 139:
               var10000 = 44;
               break;
            case 140:
               var10000 = 141;
               break;
            case 141:
               var10000 = 232;
               break;
            case 142:
               var10000 = 103;
               break;
            case 143:
               var10000 = 59;
               break;
            case 144:
               var10000 = 70;
               break;
            case 145:
               var10000 = 32;
               break;
            case 146:
               var10000 = 183;
               break;
            case 147:
               var10000 = 215;
               break;
            case 148:
               var10000 = 165;
               break;
            case 149:
               var10000 = 42;
               break;
            case 150:
               var10000 = 10;
               break;
            case 151:
               var10000 = 204;
               break;
            case 152:
               var10000 = 31;
               break;
            case 153:
               var10000 = 138;
               break;
            case 154:
               var10000 = 169;
               break;
            case 155:
               var10000 = 237;
               break;
            case 156:
               var10000 = 219;
               break;
            case 157:
               var10000 = 159;
               break;
            case 158:
               var10000 = 74;
               break;
            case 159:
               var10000 = 150;
               break;
            case 160:
               var10000 = 216;
               break;
            case 161:
               var10000 = 161;
               break;
            case 162:
               var10000 = 78;
               break;
            case 163:
               var10000 = 230;
               break;
            case 164:
               var10000 = 38;
               break;
            case 165:
               var10000 = 89;
               break;
            case 166:
               var10000 = 233;
               break;
            case 167:
               var10000 = 172;
               break;
            case 168:
               var10000 = 235;
               break;
            case 169:
               var10000 = 21;
               break;
            case 170:
               var10000 = 57;
               break;
            case 171:
               var10000 = 198;
               break;
            case 172:
               var10000 = 221;
               break;
            case 173:
               var10000 = 85;
               break;
            case 174:
               var10000 = 212;
               break;
            case 175:
               var10000 = 181;
               break;
            case 176:
               var10000 = 41;
               break;
            case 177:
               var10000 = 67;
               break;
            case 178:
               var10000 = 29;
               break;
            case 179:
               var10000 = 84;
               break;
            case 180:
               var10000 = 214;
               break;
            case 181:
               var10000 = 241;
               break;
            case 182:
               var10000 = 197;
               break;
            case 183:
               var10000 = 97;
               break;
            case 184:
               var10000 = 147;
               break;
            case 185:
               var10000 = 114;
               break;
            case 186:
               var10000 = 163;
               break;
            case 187:
               var10000 = 79;
               break;
            case 188:
               var10000 = 125;
               break;
            case 189:
               var10000 = 119;
               break;
            case 190:
               var10000 = 77;
               break;
            case 191:
               var10000 = 68;
               break;
            case 192:
               var10000 = 247;
               break;
            case 193:
               var10000 = 121;
               break;
            case 194:
               var10000 = 30;
               break;
            case 195:
               var10000 = 52;
               break;
            case 196:
               var10000 = 18;
               break;
            case 197:
               var10000 = 27;
               break;
            case 198:
               var10000 = 47;
               break;
            case 199:
               var10000 = 244;
               break;
            case 200:
               var10000 = 238;
               break;
            case 201:
               var10000 = 91;
               break;
            case 202:
               var10000 = 4;
               break;
            case 203:
               var10000 = 153;
               break;
            case 204:
               var10000 = 133;
               break;
            case 205:
               var10000 = 228;
               break;
            case 206:
               var10000 = 239;
               break;
            case 207:
               var10000 = 123;
               break;
            case 208:
               var10000 = 100;
               break;
            case 209:
               var10000 = 26;
               break;
            case 210:
               var10000 = 160;
               break;
            case 211:
               var10000 = 14;
               break;
            case 212:
               var10000 = 186;
               break;
            case 213:
               var10000 = 250;
               break;
            case 214:
               var10000 = 218;
               break;
            case 215:
               var10000 = 37;
               break;
            case 216:
               var10000 = 227;
               break;
            case 217:
               var10000 = 36;
               break;
            case 218:
               var10000 = 90;
               break;
            case 219:
               var10000 = 45;
               break;
            case 220:
               var10000 = 179;
               break;
            case 221:
               var10000 = 210;
               break;
            case 222:
               var10000 = 190;
               break;
            case 223:
               var10000 = 69;
               break;
            case 224:
               var10000 = 23;
               break;
            case 225:
               var10000 = 109;
               break;
            case 226:
               var10000 = 145;
               break;
            case 227:
               var10000 = 192;
               break;
            case 228:
               var10000 = 71;
               break;
            case 229:
               var10000 = 113;
               break;
            case 230:
               var10000 = 60;
               break;
            case 231:
               var10000 = 73;
               break;
            case 232:
               var10000 = 129;
               break;
            case 233:
               var10000 = 193;
               break;
            case 234:
               var10000 = 189;
               break;
            case 235:
               var10000 = 136;
               break;
            case 236:
               var10000 = 104;
               break;
            case 237:
               var10000 = 28;
               break;
            case 238:
               var10000 = 76;
               break;
            case 239:
               var10000 = 13;
               break;
            case 240:
               var10000 = 86;
               break;
            case 241:
               var10000 = 83;
               break;
            case 242:
               var10000 = 168;
               break;
            case 243:
               var10000 = 222;
               break;
            case 244:
               var10000 = 5;
               break;
            case 245:
               var10000 = 92;
               break;
            case 246:
               var10000 = 139;
               break;
            case 247:
               var10000 = 164;
               break;
            case 248:
               var10000 = 6;
               break;
            case 249:
               var10000 = 154;
               break;
            case 250:
               var10000 = 117;
               break;
            case 251:
               var10000 = 55;
               break;
            case 252:
               var10000 = 200;
               break;
            case 253:
               var10000 = 50;
               break;
            case 254:
               var10000 = 157;
               break;
            default:
               var10000 = 156;
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

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 17321) & 32767;
      if (e[var3] == null) {
         e[var3] = d[var3] ^ var1;
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var15 = new String[6];
      int var13 = 0;
      String var12 = "ÈÇ¸á\u0002ûE\f\u008d\u009a%diù\u0015\u000fã¯Ýì®ZÐ8?\u001cs´£ãL\u000eºrQ]}6\u0081ºWöûÇµ[\u0005æ°\u0084«0";
      int var14 = "ÈÇ¸á\u0002ûE\f\u008d\u009a%diù\u0015\u000fã¯Ýì®ZÐ8?\u001cs´£ãL\u000eºrQ]}6\u0081ºWöûÇµ[\u0005æ°\u0084«0".length();
      N(true);
      char var11 = 15;
      int var18 = -1;

      label64:
      while (true) {
         byte var10000 = 7;
         String var10001 = var12.substring(++var18, var18 + var11);
         byte var10002 = -1;

         while (true) {
      char[] var33;
            label59: {
               char[] var38 = var10001.toCharArray();
               int var10004 = var38.length;
               int var16 = 0;
               byte var41 = var10000;
               var33 = var38;
               int var24 = var10004;
               byte var47;
               char[] var52;
               int var10006;
               if (var10004 <= 1) {
                  var52 = var38;
                  var47 = var10000;
                  var10006 = var16;
               } else {
                  var41 = var10000;
                  var24 = var10004;
                  if (var10004 <= var16) {
                     break label59;
                  }

                  var52 = var38;
                  var47 = var10000;
                  var10006 = var16;
               }

               while (true) {
                  char var61 = var52[var10006];
                  byte var62;
                  switch (var16 % 7) {
                     case 0:
                        var62 = 40;
                        break;
                     case 1:
                        var62 = 113;
                        break;
                     case 2:
                        var62 = 34;
                        break;
                     case 3:
                        var62 = 60;
                        break;
                     case 4:
                        var62 = 112;
                        break;
                     case 5:
                        var62 = 103;
                        break;
                     default:
                        var62 = 81;
                  }

                  var52[var10006] = (char)(var61 ^ var47 ^ var62);
                  var16++;
                  if (var41 == 0) {
                     var10006 = var41;
                     var52 = var33;
                     var47 = var41;
                  } else {
                     if (var24 <= var16) {
                        break;
                     }

                     var52 = var33;
                     var47 = var41;
                     var10006 = var16;
                  }
               }
            }

            String var43 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var15[var13++] = var43;
                  if ((var18 += var11) >= var14) {
                     a = var15;
                     b = new String[6];
                     long var8 = 8285397328496692955L;
                     long var37 = -6346693007793451317L ^ var8;
                     byte var26 = -1;
                     c = var37;
                     long var0 = 889121602195692392L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "\u0005dÕ8º²)ägòw\u0015c\u0001.\u008a";
                     int var5 = "\u0005dÕ8º²)ägòw\u0015c\u0001.\u008a".length();
                     byte var2 = 0;

                     do {
                        byte var27 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        int var28 = var3++;
                        long var51 = (
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
                        byte var44 = -1;
                        var6[var28] = var51;
                     } while (var2 < var5);

                     d = var6;
                     e = new Long[2];
                     return;
                  }

                  var11 = var12.charAt(var18);
                  break;
               default:
                  var15[var13++] = var43;
                  if ((var18 += var11) < var14) {
                     var11 = var12.charAt(var18);
                     continue label64;
                  }

                  var12 = "X\u0092ëWe\u000e®+kÎ\u0082üÆ[\u0007rIï[æ";
                  var14 = "X\u0092ëWe\u000e®+kÎ\u0082üÆ[\u0007rIï[æ".length();
                  var11 = 5;
                  var18 = -1;
            }

            var10000 = 113;
            var10001 = var12.substring(++var18, var18 + var11);
            var10002 = 0;
         }
      }
   }
}





