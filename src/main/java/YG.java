import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class YG implements Enumeration {
   List c = new LinkedList();
   Iterator b;

   YG() {
      com.ky_4[] var10000 = xA.P();
      Iterator var2 = L2.X().values().iterator();
      com.ky_4[] var1 = var10000;

      while (true) {
         if (var2.hasNext()) {
            L2 var3 = (L2)var2.next();
            var7 = this.c;
            if (var1 == null) {
               break;
            }

            this.c.add(var3);
            if (var1 != null) {
               continue;
            }
         }

         var7 = jtermios.j.Y();
         break;
      }

      List var5 = var7;
      if (var1 != null) {
         if (var5 != null) {
            for (String var4 : var5) {
               this.c.add(new L2(var4, 1, null, null));
               if (var1 == null) {
                  return;
               }

               if (var1 == null) {
                  break;
               }
            }
         }

         this.b = this.c.iterator();
      }
   }

   @Override
   public boolean hasMoreElements() {
      com.ky_4[] var1 = xA.P();
      Iterator var10000 = this.b;
      if (var1 != null) {
         if (this.b == null) {
            return false;
         }

         var10000 = this.b;
      }

      return var10000.hasNext();
   }

   @Override
   public Object nextElement() {
      return this.b.next();
   }
}





