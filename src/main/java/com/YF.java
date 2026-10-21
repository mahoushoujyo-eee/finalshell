package com;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;

public class YF extends ReflectionConverter {
   public YF(Mapper var1, ReflectionProvider var2) {
      super(var1, var2);
   }

   @Override
   public boolean canConvert(Class var1) {
      return u0.class.getCanonicalName().equals(var1.getCanonicalName());
   }

   @Override
   public void marshal(Object var1, HierarchicalStreamWriter var2, MarshallingContext var3) {
      u0 var5 = (u0)var1;
      String[] var10000 = u0.P();
      int var6 = 0;
      String[] var4 = var10000;

      while (var6 < var5.v()) {
         Object var7 = var5.K(var6);
         var2.startNode(this.mapper.serializedClass(var7.getClass()));
         var3.convertAnother(var7);
         var2.endNode();
         Object var8 = var5.o(var6);
         var2.startNode(this.mapper.serializedClass(var8.getClass()));
         var3.convertAnother(var8);
         var2.endNode();
         var6++;
         if (var4 == null) {
            break;
         }
      }
   }

   @Override
   public Object unmarshal(HierarchicalStreamReader var1, UnmarshallingContext var2) {
      String[] var10000 = u0.P();
      u0 var4 = new u0();
      String[] var3 = var10000;
      int var5 = 0;
      Object var6 = null;

      while (var1.hasMoreChildren()) {
         label23: {
            Class var7;
            label22: {
               var1.moveDown();
               var7 = this.mapper.realClass(var1.getNodeName());
               if (var3 != null) {
                  if (var5 % 2 != 0) {
                     break label22;
                  }

                  var6 = var2.convertAnother(var4, var7);
               }

               if (var3 != null) {
                  break label23;
               }
            }

            var4.A(var6, var2.convertAnother(var4, var7));
         }

         var1.moveUp();
         var5++;
         if (var3 == null) {
            break;
         }
      }

      return var4;
   }
}





