import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class li_4 extends ln_4 {
   static Random H;
   ArrayList z;

   public li_4() {
      com.c.c(343117406904829554L).set(this, new ArrayList());
   }

   public void w(lj_4 var1) {
      int[] var10000 = yB_3.Y();
      Iterator var3 = ((ArrayList)com.c.c(343117406904829554L).get(this)).iterator();
      int[] var2 = var10000;

      while (var3.hasNext()) {
         label20: {
            lj_4 var4 = (lj_4)var3.next();
            boolean var5 = var1.equals(var4);
            if (var2 == null) {
               if (!var5) {
                  break label20;
               }

               ((ArrayList)com.c.c(343117406904829554L).get(this)).remove(var1);
            }

            if (var2 == null) {
               break;
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public ArrayList Z() {
      return (ArrayList)com.c.c(343117406904829554L).get(this);
   }

   public void m(ArrayList var1) {
      com.c.c(343117406904829554L).set(this, var1);
   }

   @Override
   public ln_4 B() {
      return new li_4();
   }

   static {
      com.c.c(269890579608723922L).set(null, new Random());
   }
}





