package com.finalshell.task;

import com.finalshell.core.KV;
import com.finalshell.core.UI3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

public class VW implements Runnable {
   final KV C;

   VW(KV var1) {
      this.C = var1;
   }

   @Override
   public void run() {
      KV.b$arrString();
      Object var5 = 142803273519455900L;
      Object var10002 = Ref.g(142803273519455900L, var5);
      Object var7 = 561219037117570651L;
      Object var10004 = var7;
      ArrayList var2 = (ArrayList)((ArrayList)Ref.g(561219037117570651L, var7)).clone();
      Object var1 = var10002;
      Iterator var3 = var2.iterator();

      label53: {
         while (true) {
            if (var3.hasNext()) {
               UI3 var4 = (UI3)var3.next();
               if (var1 != null) {
                  break;
               }

               if (var1 != null || var4 != null) {
                  Object[] var10003 = Registry.emptyArgs();
                  long var10 = 467072645301573589L;
                  Object[] var9 = var10003;
                  var10004 = var9;
                  Ref.h(467072645301573589L, var9, var10);

                  try {
                     ;
                  } catch (InvocationTargetException var26) {
                     throw var26.getTargetException();
                  }
               }

               if (var1 == null) {
                  continue;
               }
            }

            Object var11 = 142803273519455900L;
            KV var27 = (KV)Ref.g(142803273519455900L, var11);
            if (var1 != null) {
               break label53;
            }

            Object var13 = 284667866022471457L;
            var10004 = (UI3)Ref.g(284667866022471457L, var13);
            break;
         }

         if (var10004 != null) {
            Object var15 = 142803273519455900L;
            Ref.g(142803273519455900L, var15);
            Object var17 = 284667866022471457L;
            Ref.g(284667866022471457L, var17);
            Object[] var10007 = Registry.emptyArgs();
            long var20 = 467072645301573589L;
            Object[] var19 = var10007;
            Ref.h(467072645301573589L, var19, var20);

            try {
               ;
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }
         }

         Object var21 = 142803273519455900L;
         KV var10005 = (KV)Ref.g(142803273519455900L, var21);
      }

      Object var23 = 561219037117570651L;
      ((ArrayList)Ref.g(561219037117570651L, var23)).clear();
   }
}





