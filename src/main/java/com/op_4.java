package com;

import com.google.common.collect.ArrayListMultimap;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;

public class op_4 implements com.ak_2, X4 {
   public static com.op_4 K = new com.op_4();

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
      // 0e: ifnull 26
      // 11: instanceof com/google/common/collect/Multimap
      // 14: ifeq 36
      // 17: goto 1e
      // 1a: invokestatic com/op_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1d: athrow
      // 1e: aload 2
      // 1f: goto 26
      // 22: invokestatic com/op_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 25: athrow
      // 26: checkcast com/google/common/collect/Multimap
      // 29: astore 8
      // 2b: aload 1
      // 2c: aload 8
      // 2e: invokeinterface com/google/common/collect/Multimap.asMap ()Ljava/util/Map; 1
      // 33: invokevirtual com/nL_3.B (Ljava/lang/Object;)V
      // 36: return
   }

   @Override
   public Object z(com.yn_4 var1, Type var2, Object var3) {
      String var10000 = nv_4.o();
      Type var5 = var2;
      String var4 = var10000;
      Type var11 = var2;
      if (var4 != null) {
         if (var2 instanceof ParameterizedType) {
            var5 = ((ParameterizedType)var2).getRawType();
         }

         var11 = var5;
      }

      if (var11 != ArrayListMultimap.class) {
         return null;
      } else {
         ArrayListMultimap var6 = ArrayListMultimap.create();
         com.O0 var7 = var1.Q();

         for (Entry var9 : var7.entrySet()) {
            Object var10 = var9.getValue();
            boolean var12 = var10 instanceof Collection;
            label32:
            if (var4 != null) {
               if (var12) {
                  var6.putAll(var9.getKey(), (List)var10);
                  if (var4 != null) {
                     break label32;
                  }
               }

               var6.put(var9.getKey(), var10);
            }

            if (var4 == null) {
               break;
            }
         }

         return var6;
      }
   }

   @Override
   public int j() {
      return 0;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





